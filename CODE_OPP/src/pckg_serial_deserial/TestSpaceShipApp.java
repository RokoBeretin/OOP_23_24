package pckg_serial_deserial;

import primjervjezbA.AUX_CLS;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

public class TestSpaceShipApp {
    public static void main(String[] args) {
        SpaceShip spaceShip1 = new SpaceShip("Millenium Falcon");
        SpaceShip spaceShip2 = new SpaceShip("Enterprise");
        SpaceShip spaceShip3 = new SpaceShip("ES-100");
        System.out.println(spaceShip1);
        AUX_CLS_SER_DESR.saveObjToFile("space.bin", spaceShip2);
        List<SpaceShip> ships = new ArrayList<>();
        ships.add(spaceShip1);
        ships.add(spaceShip2);
        ships.add(spaceShip3);
        System.out.println(ships);
        AUX_CLS_SER_DESR.saveMultipleObjToFile("multiships.bin", ships);
        ships.clear();
        ships = AUX_CLS_SER_DESR.readObjectsFromFile("multiships.bin");
        System.out.println(ships);
    }
}
