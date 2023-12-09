package org.max.home;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class MyGameTest {
    static List<Door> doors;
    @BeforeEach//предусловие
    void initDoors(){
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));

    }
    @Test// проверка на выигрыш если игрок не меняет дверь
    void testNotChanceWin(){
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        Door door = game.round(0);
        Assertions.assertTrue(door.isPrize());
    }
    @Test//проверка проигрыш если игрок если игрок меняет дверь
    void checkNotChanceLose() {

        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        Door door = game.round(1);
        Assertions.assertFalse(door.isPrize());
    }
    @Test//проверка на выигрыш если игрок меняет дверь
    void checkChanceWin () {

        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        Door door = game.round(1);
        Assertions.assertTrue(door.isPrize());
    }
    @Test//проверка на проигрыш если игрок не меняет дверь
    void checkChanceLose () {

        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);

        Door door = game.round(0);

        Assertions.assertFalse(door.isPrize());
    }

}


