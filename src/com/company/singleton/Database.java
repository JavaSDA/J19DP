package com.company.singleton;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

// Lazy Singleton
// This type of singleton is created when it is first called, afterwards
// the same type of singleton is used for the rest of
// the application's lifetime
public class Database {
    private static Database instance;
    private List<Integer> numbers = new ArrayList<>();

    private Database() {}

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static Database getInstance() {
        // Check if the instance has been created,
        // if it hasn't then create a new instance and
        // pass it into the field.
        // Double checked
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) instance = new Database();
            }
        }
        return instance;
    }
}
