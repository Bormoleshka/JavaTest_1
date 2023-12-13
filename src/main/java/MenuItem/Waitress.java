package MenuItem;

public class Waitress {

    private final MenuComponent mainMenu;

    public Waitress(MenuComponent mainMenu) {
        this.mainMenu = mainMenu;
    }

    //Print all elements, bc we call top of the tree.
    public void getMenu() {
        mainMenu.print();
    }
}