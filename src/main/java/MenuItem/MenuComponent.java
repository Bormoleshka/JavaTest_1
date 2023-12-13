package MenuItem;

public abstract class MenuComponent {

    //Need in Menu and in MenuItem (dish)
    public String getName() {
        throw new UnsupportedOperationException();
    }

    //Need in Menu and in MenuItem (dish)
    public void print() {
        throw new UnsupportedOperationException();
    }

    //Need only in MenuItem (dish)
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    //Need only in Menu (for work with his elements)
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //Need only in Menu (for work with his elements)
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
}
