
public class MediaLib
{
       public int duration;
    public  static double totalCost = 0.0;
    public  static int numSongs = 0;
    public static double testVal = 0.0;
    public static int totalRatings = 0;
    public double average = 0.0;
    public static double averagesongRating = 0.0;
    public static double numRatings = 0.0; 
    
        
    
    public static void main ()
    { System.out.println("Welcome to your Media Library");
      
       //Constructors
       Book book1 = new Book("Where the Red Fern Grows",.88,true,10);
       Book book2 = new Book("My Side of the Mountain",.78,false,8);
       Book book3 = new Book("The Hunger Games",.79,false,8);
       Book book4 = new Book("Percy Jackson",.76,false,7);
       
       Movie movie1 = new Movie ("Interstellar",.77,true,9);
       Movie movie2 = new Movie ("Jurassic Park",.84,false,8);
       Movie movie3 = new Movie ("Black Panther",.76,false,7);
       Movie movie4 = new Movie ("Treasure Planet",.99,true,10);
       
       Song song1 = new Song ("Stolen Dance",.99,true,8);
       Song song2 = new Song ("Stairway to Heaven",.99,true,8);
       Song song3 = new Song ("Ocean", .75, false, 7);
       Song song4 = new Song ("I like me better",.68,true,7);
       // Stuff to do with song class
      System.out.println(song1);
      System.out.println(song2);
      System.out.println(song3);
      System.out.println(song4);
      //Getters       
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        System.out.println(song1.getPrice());          
        System.out.println(song2.getTitle());
        System.out.println(song2.getRating());
        System.out.println(song2.getPrice());
        System.out.println(song3.getTitle());
        System.out.println(song3.getRating());
        System.out.println(song3.getPrice());
        System.out.println(song4.getTitle());
        System.out.println(song4.getRating());
        System.out.println(song4.getPrice());
        
              // Stuff to do with book class
      System.out.println(book1);
      System.out.println(book2);
      System.out.println(book3);
      System.out.println(book4);
      //Getters       
        System.out.println(book1.getTitle());
        System.out.println(book1.getRating());
        System.out.println(book1.getPrice());          
        System.out.println(book2.getTitle());
        System.out.println(book2.getRating());
        System.out.println(book2.getPrice());
        System.out.println(book3.getTitle());
        System.out.println(book3.getRating());
        System.out.println(book3.getPrice());
        System.out.println(book4.getTitle());
        System.out.println(book4.getRating());
        System.out.println(book4.getPrice());
         
               // Stuff to do with movie class
      System.out.println(movie1);
      System.out.println(movie2);
      System.out.println(movie3);
      System.out.println(movie4);
      //Getters       

      
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getRating());
        System.out.println(movie1.getPrice());          
        System.out.println(movie2.getTitle());
        System.out.println(movie2.getRating());
        System.out.println(movie2.getPrice());
        System.out.println(movie3.getTitle());
        System.out.println(movie3.getRating());
        System.out.println(movie3.getPrice());
        System.out.println(movie4.getTitle());
        System.out.println(movie4.getRating());
        System.out.println(song4.getPrice());
        
       
    }
}


