package ex_25_ENUM;

public class Lab200_Enum_Advance {
    public static void main(String[] args) {
        //this will automatically fetch the mass and radius of earth and can
        //execute the gravity formulae
        //we can do this using class
        //in class we need to write complex logic to achieve this
        //with enum it is super easy and convenient

        double earthGravity = Planet.Earth.surfaceGravity();
        System.out.println(earthGravity);

        double mercuryGravity = Planet.Mercury.surfaceGravity();
        System.out.println(mercuryGravity);
        System.out.println(Planet.valueOf("Earth").getMass());
        System.out.println(Planet.Earth.getMass());
    }

}

enum Planet{
    Mercury(3.303e23,2.4397e6),
    Venus(4.869e24,6.0518e6),
    Earth(5.976e24,6.37814e6),
    Mars(6.421e23,3.3972e6);

    private final double mass;
    private final double radius;

    Planet(double mass,double radius)
    {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass(){ return mass;}
    public double getRadius(){ return radius;}

    public double surfaceGravity()
    {
        final double G = 6.67300E-11;
        return G * mass/(radius*radius);
    }
}