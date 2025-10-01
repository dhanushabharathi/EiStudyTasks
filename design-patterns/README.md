# Design Patterns Examples (Java)

This project contains six small Java use-cases demonstrating design patterns:

Behavioral:
1. Observer (com.examples.behavioral.observer)
2. Strategy (com.examples.behavioral.strategy)

Creational:
3. Factory Method (com.examples.creational.factory)
4. Builder (com.examples.creational.builder)

Structural:
5. Adapter (com.examples.structural.adapter)
6. Decorator (com.examples.structural.decorator)

Each package has a `Main.java` with a short demonstration. To compile and run:

```bash
# from project root (where README.md is)
javac -d out $(find src -name "*.java")

# Examples (run one at a time):
java -cp out com.examples.behavioral.observer.Main
java -cp out com.examples.behavioral.strategy.Main
java -cp out com.examples.creational.factory.Main
java -cp out com.examples.creational.builder.Main
java -cp out com.examples.structural.adapter.Main
java -cp out com.examples.structural.decorator.Main
```

The compiled classes will be placed in the `out` folder.
