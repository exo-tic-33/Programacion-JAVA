/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ayman.p2_testingentries;

import java.util.Scanner;

/**
 *
 * @author mhati
 */
public class P2_TestingEntries {
    

    public static void main(String[] args) {
        nameagesalary();
//        agesisters();
//        sexlector();
    }
 //    creo mi primer cajon   
    public static void nameagesalary() {
        //      nombramos una variable de tipo scanner y la llamamos keyboard
//      es para leer desde teclado o escanear teclado
        Scanner keyboard = new Scanner(System.in);       
        
        System.out.println("estamos probando como meter datos desde teclado");

//        voy a leer por teclado una edad
//      aqui pedimos la primera edad y nombre
        System.out.println("Please, type your age, your name and your salary in this order:");
        
//      otra forma de hacerlo seria:
//      int userAge = keyboard.nextint();
//      String userName = keyboard.next();
        
        int userAge;
        userAge = keyboard.nextInt();
        
        String userName;
        userName = keyboard.next();
        
        double salary;
        salary = keyboard.nextDouble();
        
        
//      aqui pedimos la segunda edad y nombre
        System.out.println("Please, type the second age that you want to sum with the name and salary of the second person:");
        
//      otra forma de hacerlo seria:
//      int user0Age = keyboard.nextByte();
//      String user0Name = keyboard.next();
        
        int user0Age;
        user0Age = keyboard.nextInt();
        
        String user0Name;
        user0Name = keyboard.next();
        
        double salary0;
        salary0 = keyboard.nextDouble();
        
//      aqui sumamos las dos edades y los salarios
        int ageSum = userAge + user0Age;
        double salarySum = (salary + salary0);
        
        
//      aqui damos el resulado de la suma de las dos edad
        System.out.println( userName +" You are " + userAge + " years old and you generate" + salary + "per month");
        System.out.println( user0Name + " is " + user0Age + " years old and you generate" + salary0 + "per month");
        
        System.out.println("the sum of "+userName+"'s and "+user0Name+"'s ages is: " + ageSum );
        System.out.println("the sum of "+userName+"'s and "+user0Name+"'s salaries is: " + salarySum );
        
        
        keyboard.close();
    }
//    creo mi segundo cajon
    public static void agesisters() {
//        pedir por teclado dos nombres, dos edades, y luego mostrar los nombres y la suma de las dos edades.
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Please, type your name and your age:");
        
        String userName;
        userName = keyboard.next();
        
        int userAge;
        userAge = keyboard.nextInt();
        
        System.out.println("Please, type the second name and age:");
        
        String user0Name;
        user0Name = keyboard.next();
        
        int user0Age;
        user0Age = keyboard.nextInt();
        
        int ageSum = (userAge + user0Age);
        
        System.out.println( userName +" You are " + userAge + " years old" );
        System.out.println( user0Name + " is " + user0Age + " years old");
        
        System.out.println("the sum of "+userName+"'s and "+user0Name+"'s ages is: " + ageSum );
        
    }
    
    public static void sexlector() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("which sex define you:");
//        leer un char
        char sex = keyboard.next().charAt(0);
        
        System.out.println("your sex is " + sex);
        
//        salida formateada
//        printf

        String userName;
        userName = keyboard.next();
        
        int userAge;
        userAge = keyboard.nextInt();
        
        String user0Name;
        user0Name = keyboard.next();
        
        int user0Age;
        user0Age = keyboard.nextInt();
        
        int ageSum = (userAge + user0Age);
        
        
        System.out.printf("the are 2 sisters whose names are %s and s%. "
                + "Their ages are %d and %d respectively and it addition is %", userName,user0Name,userAge,user0Age,ageSum);
    }
}
