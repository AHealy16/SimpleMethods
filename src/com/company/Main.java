package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    //if between the class and the main method it is

    //global variables can be accessed anywhere in the program
//    public static int globalvariable = 7;

    //local variable:
//    public static void myMessage() {

//        System.out.println("here is an intro to methods");
//        int localvar = 5; //can only be accessed within scope

//    }

    public static void main(String[] args) {

        System.out.println("type in a min and a max number");
        System.out.println(getRandom(getIntInput(),getIntInput()));

    }

    public static int getIntInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }


    public static int getRandom(int min, int max)  { //
        Random random = new Random();
        return random.nextInt((max-min)+1)+min;


    }





}
/*
Why we use local variables over global variables:

1. Makes a subroutine self-contained
2. Releases storage when subroutine terminates
3. Able to test / debug subroutine independently
4. Easier to re-use subroutine in program
5. Local variable values cannot be inadvertently/accidentally altered by a subroutine call from the subroutine

Parameters

 - A parameter is used to pass data about between methods




*/