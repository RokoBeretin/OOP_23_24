package pckg_abs_cls;

public class Superhero extends Person implements FlyAbility, Strenght{
    private String superheroName;



    protected Superhero(String name, String sname, String superheroName) {
        super(name, sname);
        this.superheroName = superheroName;
    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + " superhero name: " + this.superheroName);


    }

    @Override
    public void flyAroundTown() {
        System.out.println(this.superheroName + " can fly...");
    }

    @Override
    public void haveEnormousStrenght(int level) {
        System.out.println(this.superheroName + " has super strenght: " + level);
    }
}
