public class Song
{
    //Instance Fields
    private int rating;
    private String title;
    private double price;  
    private boolean favorite;
    private int duration;
    private int seconds;
    private int minutes;
    
    
    public Song()
    {
        title = "";
        rating = 0;   
        price = 0.0;
        favorite = true;
        duration = 0;
        seconds = 0;
        minutes = 0;
    }
    //For Title
    public String getTitle() {
        return title;
    }
    public void setTitle(String t)  {
        title = t;
    }
    //For Rating
    public int getRating()   {
        return rating;
    }
    public void setRating(int r){
          rating = r;
    }
    // For price
    public Double getPrice() {
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    //For Favorite
    public void addToFavorites (){
        favorite = true;
    }
    public Song(String title, double price, boolean favorite, int rating) {
    this.title = title;
    this.price = price;
    this.favorite = favorite;
    this.rating = rating;
}

}