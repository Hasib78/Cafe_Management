# Cafe Management System

A Java Swing desktop application for managing café orders, calculating bills, generating receipts, and storing receipt information in MySQL.

The application is designed around a café point-of-sale workflow and supports burgers, drinks, and coffee items.

## Features

- Desktop GUI built with Java Swing
- Burger, drinks, and coffee item management
- Item name, price, and quantity input
- Automatic category-wise cost calculation
- Subtotal calculation
- Configurable tax-rate calculation
- Total cost calculation
- Payment amount input
- Change/return calculation
- Receipt generation
- Receipt preview in the application
- Receipt printing
- Reset order fields
- Exit application
- Receipt data storage in MySQL
- NetBeans project configuration
- Runnable JAR distribution

## Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- MySQL Connector/J
- Apache Ant / NetBeans project build system

## Application Structure

```text
Cafe_Management/
├── src/
│   ├── CoffeeAndBurgerPontManagementSystem.java
│   ├── CoffeeAndBurgerPontManagementSystem.form
│   └── desktop.ini
├── nbproject/
├── build.xml
├── manifest.mf
├── dist/
│   ├── CoffeeAndBurgerPointManagementSystem.jar
│   └── lib/
│       └── mysql-connector-java-5.1.35-bin.jar
└── README.md
```

## Main Workflow

1. Enter item names, prices, and quantities for burgers, drinks, and coffee.
2. Enter the tax rate.
3. Click **Total** to calculate:
   - Burger cost
   - Drinks cost
   - Coffee cost
   - Subtotal
   - Tax
   - Total cost
4. Enter the payment amount.
5. Generate a receipt using **Receipt**.
6. Print the receipt using **Print**.
7. The application can store receipt summary information in MySQL.

## MySQL Configuration

The source code uses JDBC to connect to a local MySQL server with the following configuration:

```text
Host: localhost
Port: 3306
Database: bcpmsdb18
Username: root
Password: empty
```

The application inserts receipt summary data into:

```text
data18
```

The current source code writes these fields:

```text
subTotal
taxRate
totalTax
totalCost
comment
```

### Create the Database

Before running the application, create the database:

```sql
CREATE DATABASE bcpmsdb18;
```

Create the receipt table:

```sql
CREATE TABLE data18 (
    id INT AUTO_INCREMENT PRIMARY KEY,
    subTotal DOUBLE,
    taxRate INT,
    totalTax DOUBLE,
    totalCost DOUBLE,
    comment VARCHAR(255)
);
```

> The exact MySQL configuration should match your local environment before running the application.

## Run the Project in NetBeans

1. Install **JDK 8** or another Java version compatible with the project configuration.
2. Install **NetBeans**.
3. Install **MySQL Server**.
4. Create the `bcpmsdb18` database and `data18` table.
5. Open the project in NetBeans.
6. Make sure the MySQL Connector/J library is available to the project.
7. Build and run the project.

The configured main class is:

```text
CoffeeAndBurgerPontManagementSystem
```

## Run the Built JAR

The project contains a distribution JAR:

```text
dist/CoffeeAndBurgerPointManagementSystem.jar
```

From the `dist` directory:

```bash
java -jar "CoffeeAndBurgerPointManagementSystem.jar"
```

The MySQL JDBC driver must also be available on the runtime classpath. The project distribution includes a `lib` directory for this purpose.

## Database Dependency

The database connection is used when generating/storing receipt information. The application expects MySQL to be running locally and uses JDBC for persistence.

The source currently uses the legacy MySQL JDBC driver class:

```java
com.mysql.jdbc.Driver
```

For modernization, this can be updated to the current MySQL Connector/J driver and connection approach.

## Project Notes

This project was created as a Java desktop café management / billing application using NetBeans GUI components.

The generated `build/` and compiled `.class` files are build artifacts and normally do not need to be committed to a source-control repository. For a cleaner GitHub repository, consider keeping only the source code, project configuration, required libraries/dependency configuration, and documentation.

## Future Improvements

- Replace hard-coded item fields with database-driven menus
- Add inventory management
- Add employee/user authentication
- Add sales history and reporting
- Add customer management
- Use `PreparedStatement` instead of dynamically constructed SQL
- Move database credentials to environment/configuration files
- Improve exception handling and logging
- Modernize the JDBC driver dependency
- Add Maven or Gradle dependency management
- Separate UI, business logic, and database layers using a cleaner architecture
