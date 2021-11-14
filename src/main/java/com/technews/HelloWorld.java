package com.technews;

// file must correspond to the name of the class in your code
// The public keyword (as opposed to private) signifies that a method or variable can be accessed by elements in other classes.
// you can use classes themselves similarly to how you use objects in JavaScript.
public class HelloWorld {
    // At least one class in every Java program needs a main() method, which serves as an entry point for the program and gets everything started
    // Though we aren’t calling this method, it does accept a string array of arguments when the program first starts.
    public static void main(String[] args){
        // Just like log() belongs to the window.console object in JavaScript, println() belongs to the System.out object in Java
        System.out.println("Hello, World!");
    }
}
