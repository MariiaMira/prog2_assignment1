public interface PriceableWithVAT25 extends Priceable{
    public default double getVat(){
        return 0.25;
    }
}
