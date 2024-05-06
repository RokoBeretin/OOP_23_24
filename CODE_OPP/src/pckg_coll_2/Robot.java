package pckg_coll_2;

public class Robot {
    private int ID;
    private String description;
    private static int cntID = 100;

    public Robot(String desc){
        this.ID = cntID++;
        this.description = desc;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "ID=" + ID +
                ", description='" + description + '\'' +
                '}';
    }
}
