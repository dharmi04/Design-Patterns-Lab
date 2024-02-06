

# Meal Builder Application

## Overview

This Java application is a simple Meal Builder that allows users to choose between a Healthy Meal and a Junk Meal. Users can input their preferences for the main course and side dish, and the application constructs and displays the details of the selected meal. The application is built using the Factory Design Pattern to create different types of meals.


## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Java Swing library

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/dharmi04/meal-builder.git
   ```

2. Compile the Java files:

   ```bash
   javac *.java
   ```

3. Run the application:

   ```bash
   java Client
   ```

## Usage

1. Launch the application.
2. Click on either "Healthy Meal" or "Junk Meal" button.
3. Enter the main course and side dish when prompted.
4. The application will display the details of the selected meal.

## Code Structure

The code is structured as follows:

- `Client.java`: Contains the main method and GUI setup.
- `Meal.java`: Defines the `Meal` interface with methods for preparing, serving, and getting the main course and side dish.
- `MealBuilder.java`: Defines the `MealBuilder` interface with methods for building the main course, side dish, and getting the constructed meal.
- `MealDirector.java`: Implements the meal construction process.
- `HealthyMeal.java` and `JunkMeal.java`: Concrete implementations of the `Meal` interface.
- `HealthyMealBuilder.java` and `JunkMealBuilder.java`: Concrete implementations of the `MealBuilder` interface.

## Factory Design Pattern

The Factory Design Pattern is utilized in this application to create different types of meals without exposing the instantiation logic to the client. The `MealBuilder` interface serves as the factory, and the concrete classes (`HealthyMealBuilder` and `JunkMealBuilder`) implement the factory methods to create instances of `Meal` (specifically `HealthyMeal` and `JunkMeal`). This pattern promotes code flexibility and allows easy extension to accommodate new types of meals in the future.

