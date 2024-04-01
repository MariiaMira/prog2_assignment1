public abstract class Recording extends Item implements PriceableWithVAT25{
    private final String artist;
    private final int year;
    private int condition;
    private final double price;

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

    public String getArtist(){
        return this.artist;
    }

    public abstract String getType();

    public int getCondition(){
        return this.condition;
    }

    public double getPrice(){
        return Math.max((this.price * (this.condition / 10.0)), 10);
    } // TODO använd interface?

    public String toString(){
        return " ";
    } //TODO

    public int getYear(){
        return this.year;
    }

    protected double getOriginalPrice(){
        return this.price;
    }

}
