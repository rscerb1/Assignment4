import java.util.ArrayList;

public class MenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public MenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        MenuItem current = items.get(position);
        position++;
        return current;
    }
}
