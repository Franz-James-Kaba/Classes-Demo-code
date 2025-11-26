# Demo Project - Car Class

A simple Java project demonstrating object-oriented programming concepts through a `Car` class with attributes, methods, and usage examples.

## Project Overview

This project contains a `Car` class that demonstrates fundamental OOP principles including:
- **Encapsulation**: Private attributes with public getters and setters
- **Methods**: Various operations that can be performed on a car object
- **Constructors**: Initialization of car objects with required parameters
- **toString() Method**: String representation of car objects

## Project Structure

```
Demo Project/
├── pom.xml                          # Maven build configuration
├── README.md                        # This file
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/lab/
    │   │       ├── Car.java        # Car class definition
    │   │       └── Main.java       # Main class with usage examples
    │   └── resources/
    └── test/
        └── java/
```

## Prerequisites

- **Java Development Kit (JDK)**: Java 23 or later
  - Download from: https://www.oracle.com/java/technologies/downloads/
  
- **Apache Maven**: 3.6.0 or later
  - Download from: https://maven.apache.org/download.cgi
  - Or use `choco install maven` (Windows with Chocolatey)

- **Git**: For version control
  - Download from: https://git-scm.com/

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/Franz-James-Kaba/Classes-Demo-code.git
cd Demo\ Project
```

### 2. Verify Prerequisites

Check that Java and Maven are installed:

```bash
java -version
mvn -version
```

### 3. Build the Project

Using Maven:

```bash
mvn clean compile
```

This command:
- `clean`: Removes any previously compiled files
- `compile`: Compiles the Java source files

### 4. Run the Project

```bash
java -cp target/classes com.lab.Main
```

Or use Maven to run:

```bash
mvn exec:java -Dexec.mainClass="com.lab.Main"
```

## Car Class Overview

### Attributes

| Attribute | Type | Description |
|-----------|------|-------------|
| `brandName` | String | The manufacturer of the car |
| `modelName` | String | The model name of the car |
| `numberOfTires` | Integer | Number of tires on the car |
| `color` | String | Current color of the car |
| `year` | Integer | Manufacturing year |
| `price` | Double | Price of the car |
| `fuelType` | String | Type of fuel (e.g., Gasoline, Hybrid) |
| `mileage` | Double | Total distance traveled in km |

### Constructor

```java
public Car(String brandName, String modelName, Integer numberOfTires, String color, Integer year)
```

Creates a new Car instance with the specified parameters.

**Example:**
```java
Car myCar = new Car("Toyota", "Corolla", 4, "Red", 2020);
```

### Methods

#### Getters

Retrieve current values of car attributes:
- `getBrandName()` - Returns the brand name
- `getModelName()` - Returns the model name
- `getNumberOfTires()` - Returns the number of tires
- `getColor()` - Returns the current color
- `getYear()` - Returns the manufacturing year
- `getPrice()` - Returns the price
- `getFuelType()` - Returns the fuel type
- `getMileage()` - Returns the total mileage

#### Setters

Update car attributes:
- `setBrandName(String brandName)`
- `setModelName(String modelName)`
- `setColor(String color)`
- `setPrice(Double price)` - Validates that price is not negative
- `setFuelType(String fuelType)`
- `setMileage(Double mileage)` - Validates that mileage is not negative

#### Action Methods

- **`drive(Double distance)`**
  - Adds the specified distance to the total mileage
  - Prints information about the drive
  - Example: `myCar.drive(150.5);`

- **`honk()`**
  - Outputs a honk message
  - Example: `myCar.honk();`

- **`displayInfo()`**
  - Displays all car information in a formatted way
  - Example: `myCar.displayInfo();`

- **`getCarDescription()`**
  - Returns a formatted description of the car
  - Format: "Year Brand Model (Color)"
  - Example: `"2020 Toyota Corolla (Red)"`

- **`repaint(String newColor)`**
  - Changes the car's color
  - Prints confirmation message
  - Example: `myCar.repaint("Blue");`

- **`toString()`**
  - Returns a complete string representation of the car object
  - Useful for debugging and logging

## Usage Example

```java
package com.lab;

public class Main {
    public static void main(String[] args) {
        // Create a Car instance
        Car myCar = new Car("Toyota", "Corolla", 4, "Red", 2020);

        // Display initial information
        myCar.displayInfo();

        // Drive the car
        myCar.drive(150.5);
        myCar.drive(75.2);

        // Make the car honk
        myCar.honk();

        // Update car properties
        myCar.setPrice(18500.00);
        myCar.setFuelType("Hybrid");

        // Get car description
        System.out.println("Car: " + myCar.getCarDescription());

        // Repaint the car
        myCar.repaint("Blue");

        // Display updated information
        myCar.displayInfo();

        // Print complete object representation
        System.out.println(myCar.toString());
    }
}
```

### Output

```
=== Car Information ===
Brand: Toyota
Model: Corolla
Year: 2020
Color: Red
Number of Tires: 4
Fuel Type: Gasoline
Price: $0.0
Mileage: 0.0 km

Toyota Corolla drove 150.5 km. Total mileage: 150.5 km
Toyota Corolla drove 75.2 km. Total mileage: 225.7 km

Toyota Corolla goes: Beep Beep!

Car: 2020 Toyota Corolla (Red)

Car repainted to Blue

=== Car Information ===
Brand: Toyota
Model: Corolla
Year: 2020
Color: Blue
Number of Tires: 4
Fuel Type: Hybrid
Price: $18500.0
Mileage: 225.7 km

toString(): Car{brandName='Toyota', modelName='Corolla', numberOfTires=4, color='Blue', year=2020, price=18500.0, fuelType='Hybrid', mileage=225.7}
```

## Maven Configuration

The project uses Maven for build management. Key configuration in `pom.xml`:

```xml
<properties>
    <maven.compiler.source>23</maven.compiler.source>
    <maven.compiler.target>23</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```

### Common Maven Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Remove the target directory |
| `mvn compile` | Compile the source code |
| `mvn test` | Run unit tests |
| `mvn package` | Create a JAR file |
| `mvn clean install` | Clean, compile, test, and install |
| `mvn help:active-profiles` | Show active profiles |

## Troubleshooting

### Issue: "Could not find or load main class"
**Solution**: Ensure the project is compiled using `mvn clean compile` before running.

### Issue: Java version mismatch
**Solution**: Verify your JDK version matches Java 23:
```bash
java -version
```

### Issue: Maven not found
**Solution**: Add Maven to your system PATH or use the full path to mvn executable.

### Issue: Files show compilation errors in IDE
**Solution**: 
1. Right-click on the project and select "Maven" → "Reload project"
2. Or run `mvn clean compile` in terminal

## Development Workflow

1. **Edit Code**: Modify Car.java or Main.java as needed
2. **Compile**: Run `mvn clean compile`
3. **Test**: Run `java -cp target/classes com.lab.Main`
4. **Commit**: Use Git to commit changes
5. **Push**: Push changes to the repository

## Git Workflow

```bash
# Check status
git status

# Add changes
git add .

# Commit changes
git commit -m "Description of changes"

# Push to remote
git push origin master
```

## Repository Information

- **Repository**: Classes-Demo-code
- **Owner**: Franz-James-Kaba
- **Current Branch**: master
- **Default Branch**: main

## Learning Objectives

This project demonstrates:
- Creating a well-structured Java class
- Proper encapsulation with getters and setters
- Input validation in setters
- Method implementation for object behavior
- toString() method override
- Object instantiation and usage
- Maven project management

## Future Enhancements

Possible improvements to the project:
- Add inheritance (e.g., SportsCar, ElectricCar extending Car)
- Implement interfaces (e.g., Drivable, Maintainable)
- Add unit tests using JUnit
- Implement comparable/comparable interfaces
- Add database persistence
- Create a REST API using Spring Boot

## License

This project is for educational purposes.

## Contact

For questions or suggestions, reach out to the project owner.

---

**Last Updated**: November 26, 2025
