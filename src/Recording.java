public abstract class Recording extends Item{
    private String name;
    private String artist;
    private int year;
    private int condition;
    private double price;

    protected Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;


        this.condition = condition; // värde mellan 0-10
        this.price = price;
    }





}
