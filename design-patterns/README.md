# **Design Patterns Examples (Java)**

## **Project Overview**
This project contains six small Java use-cases demonstrating common **design patterns**.  
It helps understand **Behavioral, Creational, and Structural** patterns through simple examples.

## **Patterns Demonstrated**

### **Behavioral**
1. **Observer** (`com.examples.behavioral.observer`) – Event notification between publisher and subscribers  
2. **Strategy** (`com.examples.behavioral.strategy`) – Flexible payment processing strategies  

### **Creational**
3. **Factory Method** (`com.examples.creational.factory`) – Dynamic object creation  
4. **Builder** (`com.examples.creational.builder`) – Step-by-step construction of complex objects  

### **Structural**
5. **Adapter** (`com.examples.structural.adapter`) – Converting incompatible interfaces  
6. **Decorator** (`com.examples.structural.decorator`) – Dynamically adding functionality to objects  

Each package contains a `Main.java` demonstrating the pattern in action.

## **Project Structure**

DesignPatternsDemo/
├─ src/
│ ├─ behavioral/
│ │ ├─ observer/
│ │ │ └─ Main.java
│ │ └─ strategy/
│ │ └─ Main.java
│ ├─ creational/
│ │ ├─ factory/
│ │ │ └─ Main.java
│ │ └─ builder/
│ │ └─ Main.java
│ └─ structural/
│ ├─ adapter/
│ │ └─ Main.java
│ └─ decorator/
│ └─ Main.java
├─ out/ # compiled classes
└─ README.md

pgsql
Copy code

## **How to Compile and Run**

### **Compile All Java Files**
```bash
# from project root (where README.md is)
javac -d out $(find src -name "*.java")
Run Examples (one at a time)
bash
Copy code
java -cp out com.examples.behavioral.observer.Main
java -cp out com.examples.behavioral.strategy.Main
java -cp out com.examples.creational.factory.Main
java -cp out com.examples.creational.builder.Main
java -cp out com.examples.structural.adapter.Main
java -cp out com.examples.structural.decorator.Main
The compiled classes will be placed in the out folder.
