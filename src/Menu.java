import java.util.ArrayList;

public class Menu{
    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    public static final boolean HEART_HEALTHY = true;
    public static final boolean NOT_HEART_HEALTHY = false;
    ArrayList<MenuItem> menuArray;

    public Menu(){
        menuArray = new ArrayList<>();
    }

    public void add(String itemName, int category, boolean heartHealthy, String price){
        MenuItem newItem = new MenuItem(itemName, category, heartHealthy, price);
        menuArray.add(newItem);
    }

    public Iterator createMenuIterator() {
        return new MenuIterator(menuArray);
    }

}
