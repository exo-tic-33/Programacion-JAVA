/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ayman.p2_testingoperators;

import java.util.Scanner;

/**
 *
 * @author mhati
 */
public class P2_TestingOperators {

    public static void main(String[] args) {
//        operators();
//        logicOperators();
        workingWithIfs();
    }
    
    public static void operators() {
//  + - * /
//  += -= *= /=
//  a+=b ==> (a = a + b)
//  a++ ==> a = a + 1 incremento en 1
//  a-- ==> a = a - 1 descenso en 1
        int a = 10;
        int b = 12;
        a += b;
//        System.out.printf("El valor de a es %d y de b es %d", a, b);
        
        a++;
        b++;
//        System.out.println("a = " + a + "b = " + b);
        
//      Post incremento combinado con asignacion
        a = 10;
        b = 10;
        b = ++a;
        System.out.println("a: " + a + " b = " + b);
    }
    
    public static void logicOperators (){
        // NOT ==> !
        
        // AND LOGICA ==> &&
        boolean haySol = false;
        boolean haceViento = false;
        boolean navegar = haySol && haceViento ;
        System.out.println("Navego? = " + navegar );
        
        // OR LOGICO ==> ||
        boolean esBizca = false;
        boolean estaRapada = true;
        boolean aLuisLeGusto = esBizca || !estaRapada;
        System.out.println("Le gusto a Luis? " + aLuisLeGusto );
        
        if (aLuisLeGusto = false){
            System.out.println("a luis no le gusto ");
        }
    }
    
    public static void workingWithIfs(){
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("escribe tu edad seguida por tu nombre:");
        
        int userAge;
        userAge = keyboard.nextInt();
        
        String userName;
        userName = keyboard.next();
        
        if (userAge >=  18){
            System.out.println( userName + " es mayor de edad");
        } else {
            System.out.println( userName + " es menor de edad");
        }
        
    }   
}
