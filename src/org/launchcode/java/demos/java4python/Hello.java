package org.launchcode.java.demos.java4python;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello, World");
    }
}

/*
word public - indicats this is a method anyone can call
word class - indicate's we are definig a class
Hello -  is the name of the class, and is up to the programmer
java progams must be inside a class
surround the contents of the class with {}
any section of code enclosed in a pair of {} is a block
public static void main(String....) is the name of the method.
indentation is not required but is encouraged for readability and consistency
th use of public indicates that the method can be called by anyone
static - tells java that the method is part of the class, but does not blong to any istance of the class
an object is an instance of the class.
the class is the blueprint for the type of object
an object is based on a class
with static method, the object to the left of the . i a class, not an instance of the class
void - says that the method main will not return a value. it will run to completion & exit, not returning a value
going fwd, will need to tell java whattype of object to return. in this case, void, means nothing will be rturned
main - is the proper name from the method. can contain _ letters and #s
string[] args - this is the parameter list for the method which takes one parameter named args. everything in java
must have a type so you have to tell the complier that the value of args is an array of strings.
System.out.println("Hello World");
System - is a class. within the class is an object named out. the out object is standard output stream for java
once locating the out obj, java will now call the method named println(Straing s) on the object.
println - metho prints a string and adds a newline char to the end.
anywhere in python where you used print fx, you will use System.out.println method in java
; - signifies the end of a statemnt
 */