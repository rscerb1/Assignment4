public class Client {
    public static void main(String[] args){
        Menu myMenu = new Menu();
        myMenu.add("Lobster Dinner", Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, "24.00");
        myMenu.add("Burger", Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, "16.00");
        myMenu.add("Baked Salom", Menu.MAIN_DISH, Menu.HEART_HEALTHY, "22.00");
        myMenu.add("Apple Pie", Menu.DESSERT, Menu.NOT_HEART_HEALTHY, "6.00");
        myMenu.add("Fried Pickles", Menu.APPETIZERS, Menu.NOT_HEART_HEALTHY, "8.00");

        printMenu(myMenu.createMenuIterator());
    }

    public static void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.println(item.get_itemName());
        }
    }
}
