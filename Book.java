public class Book
{
    //Instance Fields
    private int rating;
    private String title;
    private double price;  
    private boolean favorite;
    public Book()
    {
        title = "";
        rating = 0;   
        price = 0.0;
        favorite = true;
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
    public Book(String title, double price, boolean favorite, int rating) {
    this.title = title;
    this.price = price;
    this.favorite = favorite;
    this.rating = rating;
}

}