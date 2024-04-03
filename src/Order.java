import java.util.ArrayList;
import java.util.List;

public class Order{
    private final long orderNumber;
    private static long counter;
    private final List<Item> items = new ArrayList<>();
    
    public Order(Item...items){ // Item...items
        counter = ++counter;
        orderNumber = counter;
        for(Item i: items){
            this.items.add(i);
        }
    }

    public String getReceipt(){
        String receipt = "Receipt for order #" + orderNumber + "\n-----------\n";
        for(Item i: items){
            receipt = receipt + i + "\n";
        }
        receipt = receipt + "Total excl. VAT: " + this.getTotalValue() + "\n";
        receipt = receipt + "Total incl. VAT: " + this.getTotalValuePlusVAT();
        return receipt;
    }

    public double getTotalValue(){
        double value = 0.00;
        for(Item i: items){
            value += i.getPrice();
        }
        return value;
    }

    public double getTotalValuePlusVAT(){
        double value = 0.00;
        for(Item i: items){
            value += i.getPriceWithVAT();
        }
        return value;

    }

}
