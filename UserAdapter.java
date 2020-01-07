package e.margi.otpdynamicanotherone;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.viewholder>
{
    Context mcontext;
    ArrayList<Student>  users1;
   // ArrayList<Student> profiles;

    public UserAdapter(Context mcontext,ArrayList<Student> users1)
    {
        //this.mcontext=mcontext;
        //this.musers=musers;
       this.users1 = users1;
        this.mcontext=mcontext;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        //View view = LayoutInflater.from(mcontext).inflate(R.layout.user_item,parent,false);
        return new UserAdapter.viewholder(LayoutInflater.from(mcontext).inflate(R.layout.user_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder viewholder, int i) {

      //  final Student student = users1.get(i);
        viewholder.userlist.setText(users1.get(i).getUsername());
    }
    @Override
    public int getItemCount()
    {
        return  users1.size();
    }

    public  class viewholder extends RecyclerView.ViewHolder
    {
        public TextView userlist;
       // public ImageView profile_image;

        public viewholder(@NonNull View itemView)
        {
            super(itemView);
            userlist = itemView.findViewById(R.id.usernameitem);
           // profile_image=itemView.findViewById(R.id.profile_image);
        }

    }
}
