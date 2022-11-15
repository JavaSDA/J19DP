package com.company;

import com.company.abstractFactory.Car;
import com.company.abstractFactory.CarFactory;
import com.company.abstractFactory.FactoryProvider;
import com.company.builder.Weapon;
import com.company.builder.WeaponBuilder;
import com.company.factory.Game;
import com.company.factory.GameFactory;
import com.company.factory.HaloGameCreator;
import com.company.factory.ScrabbleGameCreator;
import com.company.singleton.CountEnum;
import com.company.singleton.Counter;
import com.company.singleton.Database;
import com.company.singleton.exercises.Computer;
import com.company.singleton.exercises.Engine;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Class based eager singleton*/
//        Counter counter = Counter.getInstance();

        /* Enum based eager singleton*/
/*        CountEnum counter = CountEnum.INSTANCE;
        System.out.println(counter.getCount());
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount());*/

/*        Database database = Database.getInstance();
        database.addNumber(1);
        database.addNumber(2);
        database.addNumber(3);
        System.out.println(database.getNumbers().size());*/ // should return 3

        /*
        Engine engine = new Engine();
        engine.turnEngineOn();

        * */

//        Engine engine = Engine.getInstance();
//        engine.turnEngineOn();
//        System.out.println(engine.getEngineState());

//        Computer computer = Computer.getInstance();
//        System.out.println(computer.getComputerState());

/*        Weapon ak47 = new WeaponBuilder()
                .withType("Gun")
                .withName("AK-47")
                .withPerks(new ArrayList<>())
                .withDamage(10)
                .withDurability(100000)
                .build();

        System.out.println(ak47.getDamage());*/

//        String type = "yaoo";
//
//        GameFactory factory;
//        if (type.equals("PC")) {
//            factory = new HaloGameCreator();
//        } else if (type.equals("Board")) {
//            factory = new ScrabbleGameCreator();
//        } else {
//            throw new RuntimeException("Unknown game type");
//        }
//
//        Game game = factory.create();
//        System.out.println(game);

        String type = "Lexus";
        CarFactory factory = new FactoryProvider().createFactory(type);
        Car sedan = factory.createSedan();

        System.out.println(sedan);
    }

    // 40 mins.
    // Create a singleton called Students. This singleton will store
    // a list of students as String. Implement the following functionality
    // When adding a student to the list:
    // - we should have a method to add a student to the list, and this method
    // returns a boolean(If the addition is successful, it returns true,
    // else it returns false).
    // - In order to successfully add a student the student name
    // must be prefixed with
    // either 'senior' or 'junior' e.x senior James Dashboard
    // - Adding a duplicate name is not allowed.
    // - Add a method to retrieve all students with a prefix of 'senior'
    // - Add a method to retrieve all students with a prefix of 'junior'


}
