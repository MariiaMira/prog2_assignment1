abstract class Item implements Priceable{
    private final String name;

    protected Item(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
}
