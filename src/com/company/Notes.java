package com.company;

public class Notes {
    // Singleton is a design pattern for creating an object that can be
    // constructed at most once, during the application's lifetime.

    /*
    Types of Singleton
    - Eager singleton - The instance for this singleton is
    created at application startup
    - Lazy singleton - The instance for this singleton is
    created at the first point an instance is required,
    afterwards, the same instance is used for the remainder of the application's life.


    Eager singleton implementation
    - Class-based implementation
    - Enum-based implementation
   N.B: Both implementations of the eager singleton are thread-safe.

   Lazy singleton implementation
   - lazy singleton (not thread-safe)
   - lazy double-checked singleton (thread-safe)

    * */


    // Builder
    // The builder design pattern is a way of creating objects
    // that's most often used when creating objects that have many
    // fields.

    // Implementations of the builder pattern
    // - Builder as a static class in the object (typically constructor is private)
    // - Builder as a class of its own

    // When implementing a builder, we need to add something called
    // "configuring" methods, these methods look and behave like setters
    // but they return the builder object each time, allowing you to chain
    // the operations on an instance of the builder object
    // as well as a build method, that compiles the values entered into
    // the builder object and creates an object of the specified type
    // the builder should work with.

    // Adapter
    // The adapter pattern is used to adapt a certain object to the
    // target interface. It can be thought of as a bridge between
    // two sometimes unrelated or it could be that they're related but
    // they don't fit what we need them to. We can create an adpater
    // class that implements the target interface while processing the
    // data from the source class(the object we're transforming)


    // Best Practices
    // Clean code is a term that refers to code that is:
    // - elegant - simple, straightforward and easy to read.
    // - organised -
    // - maintained regularly
    // - written such that it passes all necessary tests.
    // - no duplicated code
    // - no unused code, i.e unused classes, unused methods, unused variables.
    //

    // Some conventions
    // Naming
    // Classes - They should use camel casing but must start with a capital letter,
    // subsequent words in the class name will also start with a capital letter
    // e.g Car, CarEngine - correct
    // car, carengine, carEngine- wrong

    // Methods - They should start with a verb, and they should start with a small
    // letter or lowercase letter but still use camel casing.
    // e.g getWidth(), startEngine(), - correct
    // width() Width(), GetWidth() - wrong

    // Variables - They are similar to methods (in the sense that they also start
    // with lower case and use camel casing), but they don't need to start with a verb
    // since variables describe the state of a value, they are typically nouns.
    // e.g width, height, size, name, firstName, lastName - correct
    // Width, wiDth, - wrong

    // Methods
    // Your methods should only carry out one unit of an action, i.e
    // your methods should not do more than one thing, and they should only
    // have a small number of parameters. Ideally, it shouldn't be more than 20 lines.

    // Principles
    // DRY - Don't repeat yourself
    // KISS - Keep It Simple Stupid
    // YAGNI - You Aren't Gonna Need It.

    // Manifesto for software craftsmanship
    // Rules to note:
    // - You should build software that is not just working but als well-crafted.
    // - You should not just respond to change, but also build value.
    // - We are not just individuals but a community of professionals.
    // - We don't just engage in customer collaboration but also productive partnerships.

    // SOLID - is a set of software engineering principles that every good programmer should know
    // and follow when creating code.
    // S - Single Responsibility Principle
    // O - Open Closed Principle
    // L - Liskov's Substitution Principle
    // I - Interface Segregation Principle
    // D - Dependency Inversion Principle

    // Single Responsibility Principle - We don't want one class doing more than one thing, and we
    // don't want multiple classes doing the same thing.


    // Open Closed Principle - This is mostly talking about encapsulation, we want to be able to
    // decide what changes classes outside of the object can make to our object.

    // Liskov's Substitution Principle - This says that you should be able to substitute the type of an object
    // with it's derived type(s)

    // Interface Segragation Principle - This says, that your interface should not contain too many methods,
    // instead break the interface into smaller interfaces and group related methods in them.

    // Dependency Inversion Principle - This is referring to the ability to pass in dependencies, that your class
    // or object needs to function from outside the class.

}
