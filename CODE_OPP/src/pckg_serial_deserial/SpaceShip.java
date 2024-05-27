package pckg_serial_deserial;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class SpaceShip implements Serializable {

    private String spaceShipName;
    private int id;
    private static int cntId = 10;
    private LocalDate firstMissionDate;
    private int numMissions;
    private static final int STARTYEAR = 2000;
    private static final int MINI = 1;
    private static final int MAXI = 1000;

    public SpaceShip(String name){
        this.spaceShipName = name;
        this.id = cntId++;
        this.firstMissionDate = generateRandomFirstMissionDate();
        this.numMissions = ThreadLocalRandom.current().nextInt(MINI, MAXI);

    }
    private LocalDate generateRandomFirstMissionDate(){
        LocalDate startDate = LocalDate.of(STARTYEAR, 1,1);
        LocalDate endDate = LocalDate.now();
        long start = startDate.toEpochDay();
        long end = endDate.toEpochDay();
        long random = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();

        return LocalDate.ofEpochDay(random);
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "spaceShipName='" + spaceShipName + '\'' +
                ", id=" + id +
                ", firstMissionDate=" + firstMissionDate +
                ", numMissions=" + numMissions +
                '}';
    }
}
