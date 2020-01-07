package e.margi.otpdynamicanotherone;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    //ImageView profile_image;
    //TextView username;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    DatabaseReference databaseReference;
    RecyclerView recyclerViewmain1;
    ArrayList<Student> list;
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      recyclerViewmain1 = (RecyclerView)findViewById(R.id.recyclerviewmain);
      list = new ArrayList<>();
       /* Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getSupportActionBar().setTitle(" ");*/
        //profile_image = findViewById(R.id.profile_image1);
       // username = findViewById(R.id.username);
        //firebaseUser = firebaseAuth.getInstance().getCurrentUser();
  //      String useri//d = firebaseUser.getUid();
        databaseReference = FirebaseDatabase.getInstance().getReference("Student");
        databaseReference.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                for (DataSnapshot snapshot : dataSnapshot.getChildren())
                {
                    String name=snapshot.child("").getValue().toString();
                    Student student1=new Student(name);
                    list.add(student1);
                    //Student s = snapshot.getValue(Student.class);

                    //list.add(s);
                    // username.setText(student.getUsername());}
                    // if(student1.getImageUrl().equals(" "))
                    //{
                    //  profile_image1.setImageResource(R.mipmap.ic_launcher1);

                    //}
                    //else
                    //{
                    //  Glide.with(MainActivity.this).load(student1.getImageUrl()).into(profile_image1);
                    //}

                }

                adapter = new UserAdapter(MainActivity.this,list);
                recyclerViewmain1.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {

            }
        });
    /*  TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.viewpager);



        MainActivity.ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //viewPagerAdapter.addFragments(new ChatFragment(),"Chat");
        viewPagerAdapter.addFragments(new UserFragment(),"Users");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter
    {
        private ArrayList<Fragment> fragments;
        private ArrayList<String> titles;


        public ViewPagerAdapter(FragmentManager fm)
        {
            super(fm);
            this.fragments = new ArrayList<>();
            this.titles=new ArrayList<>();

        }

        @Override
        public Fragment getItem(int i) {
            return fragments.get(i);
        }

        @Override
        public int getCount()
        {
            return fragments.size();

        }
        public void addFragments(Fragment fragment,String title)
        {
            fragments.add(fragment);
            titles.add(title);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position)
        {
            return titles.get(position);
        }*/
    }

    }

