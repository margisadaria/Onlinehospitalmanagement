package e.margi.otpdynamicanotherone;

class ImageUploadInfo 
{
    public String imageName;
    public String imageURL;

    public ImageUploadInfo(String name, String url)
    {
        this.imageName = name;
        this.imageURL= url;    }


    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

   }
