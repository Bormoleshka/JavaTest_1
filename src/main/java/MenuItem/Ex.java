package MenuItem;

import Menu.Menu;


public class Ex {

    public static void main(String[] args) {

        //Create Menus
        MenuComponent desertMenu1 = new Menu("Desert in haven menu");
        MenuComponent desertMenu2 = new Menu("Special propose menu");
        MenuComponent desertMenu3 = new Menu("Christmas menu");

        MenuComponent dinnerMenu = new Menu("Dinner for Gentlemen");

        //Adding item for mainMenu (on top of the tree)
        MenuComponent mainMenu = new Menu("Main menu : ");
        mainMenu.add(desertMenu1);
        mainMenu.add(dinnerMenu);
        Waitress waitress = new Waitress(mainMenu);

        //Adding item for another elements
        desertMenu1.add(new Dish("Waffles", 0.99));
        desertMenu1.add(new Dish("Desert", 2.90));
        desertMenu1.add(desertMenu2);

        desertMenu2.add(new Dish("Pancake with milk", 5.25));
        desertMenu2.add(desertMenu3);

        desertMenu3.add(new Dish("Santa sperm", 0.01));

        dinnerMenu.add(new Dish("HotDog", 3.99));
        dinnerMenu.add(new Dish("BLT", 10.99));
        dinnerMenu.add(new Dish("Soup", 7.99));

        waitress.getMenu();
    }
}