
public class Cake {
    private String name;
    private String flavour;
    private int sugar;
    private String origin;
    private int price;
    public Cake(String name, String flavour,int sugar, String origin, int price){
        this.name = name;
        this.flavour=flavour;
        this.sugar=sugar;
        this.origin=origin;
        this.price=price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
