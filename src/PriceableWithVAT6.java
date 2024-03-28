public interface PriceableWithVAT6 extends Priceable{
    public default double getVat(){
        return 0.06;
    }
}
