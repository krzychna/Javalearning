package Test;

public class skeleton extends monsterinherit {

    protected double Armor = 5;

    skeleton(double Hitpoints, String name, double Speed, double Armor) {
        super(Hitpoints, name, Speed);
        this.Armor = Armor;

    }
    skeleton(double Hitpoints, String name, double Speed) {
        super(Hitpoints, name, Speed);
    }

    @Override
    void attack() {
        System.out.println("Skeleton attacks");
    }

    @Override
    public String toString() {
        return "Name : " + this.name +" Hitpoints: " + this.Hitpoints +
                " Speed: " + this.Speed + " Armor: " + this.Armor;
    }
}
