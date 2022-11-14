package com.company;

import com.company.builder.Weapon;
import com.company.builder.WeaponBuilder;
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

        Weapon ak47 = new WeaponBuilder()
                .withType("Gun")
                .withName("AK-47")
                .withPerks(new ArrayList<>())
                .withDamage(10)
                .withDurability(100000)
                .build();

        System.out.println(ak47.getDamage());
    }

    // 30 mins.
    // Exercise: Create an eager singleton class called Engine
    // It should have a boolean field called isEngineWorking;

    // Exercise: Create a lazy double checked singleton called Computer
    // It should have a boolean field called startUp;
}
