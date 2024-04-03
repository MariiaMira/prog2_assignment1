public class LongPlay extends Recording {

    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    public String getType(){
        return "LP";
    }

    public double getPrice(){
        return Math.max((getOriginalPrice() * (getCondition() / 10.0) + (2024-getYear())*5.0), 10);
    }

    public String toString(){
        return String.format("LP { name='%s', artist='%s', year=%d, condition=%d, original price=%.1f, price=%.1f, price+VAT=%.1f }",
                getName(), getArtist(), getYear(), getCondition(), getOriginalPrice(), getPrice(), getPriceWithVAT());
    }
    //name='Punisher', artist='Phoebe Bridgers', year=2021, condition=10, original price=200,0, price=215,0, price+VAT=268,8
    
}
