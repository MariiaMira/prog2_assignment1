public class Book extends Item implements PriceableWithVAT6{
    private final double price;
    private final boolean bound;
    private final String author;

    public Book (String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    public double getPrice(){
        return bound ? price * 1.3 : price;
    }

    @Override
    public String toString() {
        return String.format("Book { name='%s', author='%s', bound=%b, price=%.1f, price+vat=%.1f }",
                getName(), author, bound, getPrice(), getPriceWithVAT());
    }

}
