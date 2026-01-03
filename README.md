# Overview
RestaurantOrderSystem is a console-based Java program that simulates a fast food restaurant ordering system.
Designed to be human-centered, it includes intuitive prompts, input validation, and clear presentation of information for easy interaction.
Users are able to select burger and fries sizes (dynamically priced) and various extras (fixed price) to add to their order.
The program calculates the user's total order cost and provides the user with a summary of their order at the conclusion of the interaction.

This project demonstrates object-oriented programming concepts, input handling, and human-centered design.

## Technologies Used
- Java 23 (OpenJDK)
- IntelliJ IDEA

## Features
- **User Selection and Input**
  - Select desired burger size (single or double)
  - Select desired fries size (small or large)
  - Input desired quantities of extras, including ketchup packets and dessert cookies
- **Dynamic and Fixed Pricing**
  - Burger and fries prices adjust based on user selection
  - Extras price stays at a fixed price per item
- **Input Handling**
  - User receives a warning message given invalid input
  - User is reprompted until valid input is entered
  - Enforces selection rules and prevents negative values
- **Objected-Oriented Programming**
  - Uses separate classes for Main and Order logic
  - Data encapsulation through getter and setter methods
- **Human-Centered Design**
  - Simple and intuitive console-based interface
  - Provides user with immediate feedback

## Sample Run
```
Hello! Welcome to the restaurant.

Do you want a single or double burger? single
Do you want small or large fries? large
If desired, please enter quantity of ketchup packets: 2
If desired, please enter quantity of dessert cookies: 1

ORDER SUMMARY:
Burger Size: single
Fries Size: large
Extras: 3

The price of your order is: $12.99

Thank you for visiting the restaurant!
```
