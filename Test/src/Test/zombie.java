package Test;

public class zombie extends monsterinherit {

    protected double Armor =10;

    zombie(double Hitpoints, String name, double Speed, double Armor) {
        super(Hitpoints, name, Speed);
        this.Armor = Armor;
    }
    zombie(double Hitpoints, String name, double Speed) {
        super(Hitpoints, name, Speed);
    }

    @Override
    void attack() {
        System.out.println("Zombie attacks");
    }

    @Override
    public String toString() {
        return "Name : " + this.name +" Hitpoints: " + this.Hitpoints +
                " Speed: " + this.Speed + " Armor: " + this.Armor;
    }

}
