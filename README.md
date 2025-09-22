# Software Design & Architecture - Assignment 1

## Description

Group #: 18
Group Members: Ihsan Ismail (100915443), Khalid Badri (100917156), Titobi Odufuye (100928489)

## Structure

The general structure of this project is divided into the source folder for the classes and interface, the test folder that holds the test driver, and the README file for codebase information.  

![UML Diagram](images/AssignmentUML.jpg)

## Test Methods

We used a test driver class which contained main. The start of the test consists of making two new factories with the SmartDeviceFactory interface. Then two objects are created, a bulb from factory A and a lock from factory B. To test the interfaces creation of the correct objects we print out the power usage and battery consumption for the bulb and lock respectively. The bulb came from factory A which should yield a value of 20.0 (float) and the lock came from factory B which should yield a value of 450 (int). Below is a screen dump confirming that this test was succesful.

[Link to test file](test/FactoryTest.java)



![Image showing produced results in console](imgs/image-1.png)



