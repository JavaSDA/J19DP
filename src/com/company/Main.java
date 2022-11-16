package com.company;

import com.company.abstractFactory.Car;
import com.company.abstractFactory.CarFactory;
import com.company.abstractFactory.FactoryProvider;
import com.company.adapter.Pupil;
import com.company.adapter.PupilAdapter;
import com.company.adapter.Student;
import com.company.adapter.exercises.VideoGame;
import com.company.adapter.exercises.VideoGameAdapter;
import com.company.builder.Weapon;
import com.company.builder.WeaponBuilder;
import com.company.builder.exercises.User;
import com.company.builder.exercises.UserBuilder;
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
import java.util.Arrays;
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

//        String type = "Lexus";
//        CarFactory factory = new FactoryProvider().createFactory(type);
//        Car sedan = factory.createSedan();
//
//        System.out.println(sedan);
/*
        User fred = new User("Fred", "Bradley", 12, "fred@gmail.com", "+444-333-2233", "2, orange street");

        User barry = new UserBuilder()
                .withFirstName("Barry")
                .withLastName("Duval")
                .build();

        System.out.println(fred);
        System.out.println(barry);*/

//        Student ken = new PupilAdapter(new Pupil("Ken", "Derrick", "ken@gmail.com", 10, Arrays.asList(2, 4, 5)));
//
//        System.out.println(ken.getFullName());
//        System.out.println(ken.isAdult());

        Game uncharted = new VideoGameAdapter(new VideoGame("Uncharted 4", 18, 4, 200));

        System.out.println(uncharted.getName());
        System.out.println(uncharted.canBePlayedRemotely());

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



    // 40 mins.
    // Create a User class having the following fields:
    // firstName, lastName, age, email, phoneNumber, address

    // Use the builder pattern to create a class called UserBuilder
    // that will be used to make the process of creating a new user easier.


    // 30 mins
    // Create an class called VideoGame
    // getPegiName() - String
    // getAgeRating() - int
    // coresNeeded() - int
    // pingTime() - int

    // VideoGame -> In order for canBePlayedRemotely to be valid
    // it must have a ping less than 100ms.

    // Create an adpater to convert a Video Game object into a Game(PCGame) object.
}
