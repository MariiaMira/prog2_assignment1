interface PriceableWithVAT25 extends Priceable{
    default double getVat(){
        return 0.25;
    }
}
