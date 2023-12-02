package Work3.Number;

import java.io.*;

import Work3.DuplicateModelNameException;
import Work3.NoSuchModelNameException;
import Work3.Car.Car;
import Work3.Motoricle.Motoricle;
import Work3.VehicleUtils.VehicleUtils;
import Work3.Vehicle.Vehicle;

public class Number {
    public static void main(String[] args) throws Exception{
        
        Vehicle c = new Car("Pezho", 5);

        c.setModelName(2, "Fiesta");
        c.setModelPrice("Fiesta",1000);
        c.setModelName(1, "Solyaris");
        c.setModelPrice("Solyaris",1000);
        c.setModelName(3, "Supra");
        c.setModelPrice("Supra",500);
        c.setModelName(0, "Skuline");
        c.setModelPrice("Skuline",4000);
        c.setModelName(4, "Astra");
        c.setModelPrice("Astra",100);

        Vehicle m = new Motoricle("BMW", 6);

        m.setModelName(2, "Granta");
        m.setModelPrice("Granta",1000);
        m.setModelName(1, "Kalina");
        m.setModelPrice("Kalina",3000);
        m.setModelName(3, "Vesta");
        m.setModelPrice("Vesta",500);
        m.setModelName(0, "Honda");
        m.setModelPrice("Honda",4000);
        m.setModelName(4, "Dio");
        m.setModelPrice("Dio",100);
        m.setModelName(5, "Dior");
        m.setModelPrice("Dior",100);
        
        System.out.println(m);
        System.out.println(c);

        System.out.println(c.equals(c));
        System.out.println(m.equals(c));

        System.out.println(c.hashCode());
        System.out.println(m.hashCode());

        System.out.println("\nCloning: ");
        Car cClone = (Car) c.clone();
        c.ModifName("Kia", "Supra");
        System.out.println(c);
        System.out.println(cClone);

        Motoricle mClone = (Motoricle) m.clone();
        m.ModifName("GTR", "Dio");
        System.out.println(m);
        System.out.println(mClone);
    }
}