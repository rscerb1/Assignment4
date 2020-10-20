
public class MenuItem{
    private final String itemName;
    private final int category;
    private final String price;
    private final boolean heartHealthy;

    public String get_itemName(){ return itemName; }
    public int get_category(){ return category; }
    public String get_price(){ return price; }
    public boolean get_heartHealthy(){ return heartHealthy; }

    public MenuItem(String itemName, int category, boolean heartHealthy, String price){
        this.itemName = itemName;
        this.category = category;
        this.heartHealthy = heartHealthy;
        this.price = price;
    }

}
