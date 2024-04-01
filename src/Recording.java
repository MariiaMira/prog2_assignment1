public abstract class Recording extends Item{
    private String artist;
    private int year;
    private int condition;
    private double price;

    protected Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;

        if(condition >= 0 && condition <= 10){
            this.condition = condition; // värde mellan 0-10
        }else{
            throw new IllegalArgumentException();
        }

        this.price = price;
    }

}
