public interface PriceableWithVAT6 extends Priceable{
    default double getVat(){
        return 0.06;
    }
}
