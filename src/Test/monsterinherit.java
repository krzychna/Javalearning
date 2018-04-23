package Test;

public abstract class monsterinherit {
    protected double Hitpoints = 50.0;
    protected String name;
    protected double Speed =1;

    monsterinherit(double Hitpoints, String name, double Speed) {       // constructor
        this.Hitpoints = Hitpoints;
        this.name = name;
        this.Speed = Speed;
    }

    abstract void attack();                                     // training abstract methods
    @Override
    public abstract String toString();
}
