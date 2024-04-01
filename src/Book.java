public class Book extends Item implements PriceableWithVAT6{
    private final Double price;
    private final boolean bound;
    private final String author;

    public Book (String name, String author, Double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    public double getPrice(){
        return bound ? price * 1.3 : price;
    }


}
