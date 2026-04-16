# SmartPay Utility Bill Generator (Java)

## Project Overview

The **SmartPay Utility Bill Generator** is a simple Java console application developed as a student project.
It simulates a real-world electricity/water billing system using **slab-based pricing**, **input validation**, and **interface implementation**.

This project helps understand core Java concepts like:

* Conditional statements (`if-else`)
* Interfaces
* Loops
* User input handling

---

## Features

*  Slab-based billing system:

  1 0–100 units → $1 per unit
  2 101–300 units → $2 per unit
  3 Above 300 units → $5 per unit
   
*  Input validation (prevents incorrect meter readings)
*  Interface (`Billable`) implementation
*  Continuous input for multiple customers
*  Digital receipt generation in console
*  Tax calculation (10%)

---

## Technologies Used

* Java (Core Java)
* Scanner class for input

---

## How to Run

1. Open terminal / command prompt
2. Navigate to project folder
3. Compile the program:

```
javac SmartPay.java
```

4. Run the program:

```
java SmartPay
```

---

## Sample Output

```
===== SmartPay Utility Bill =====
Enter Customer Name (or type Exit): John
Enter Previous Meter Reading: 100
Enter Current Meter Reading: 350

----- Digital Receipt -----
Customer Name : John
Units Consumed: 250
Bill Amount   : $400.0
Tax (10%)     : $40.0
Final Total   : $440.0
---------------------------
```

---
