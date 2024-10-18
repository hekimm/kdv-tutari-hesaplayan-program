# KDV Calculation Program

## Overview
This is a simple Java console application that calculates the Value Added Tax (KDV) for a given product price. Depending on the price entered, different KDV rates are applied:
- For prices up to 1000 units, an 18% KDV rate is used.
- For prices over 1000 units, an 8% KDV rate is used.

The program takes user input for the product price, calculates the KDV, and displays the KDV-free price, the total price including KDV, and the KDV amount.

## Features
- User-friendly console interface to input product price.
- Applies different KDV rates based on the value of the product price.
- Displays the KDV-free price, KDV amount, and total price.

## How to Use
1. Run the program.
2. Enter the product price when prompted.
3. The program will calculate and display:
   - The price without KDV.
   - The KDV amount.
   - The price including KDV.

## Example
```
Enter the product price:
1500
KDV-free price: 1500.0
KDV amount: 120.0
Price including KDV: 1620.0
```

## Requirements
- Java JDK 8 or above

## Running the Project
To run the project, use the following command in your terminal:
```
javac KdvTutariHesaplayanProgram.java
java KdvTutariHesaplayanProgram
```

## Author
- Hekim Can Aktas

