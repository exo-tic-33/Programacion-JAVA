/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ayman.testingcondicionals;

import java.util.Scanner;

/**
 *
 * @author mhati
 */
public class TestingCondicionals {

    public static void main(String[] args) {
//        ejercicio();
//        LaNiut_Pub();
          djtiesto();
    }
    
    public static void ejercicio(){
//    hacer un programa que clasifique las notas por suspento -de 5, aprobado 5-7 y +7 es un excelente
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("ingresa tu nota:");
        
        double notaEx;
        notaEx = keyboard.nextInt();
        
        if (notaEx >=  5 && notaEx < 7){
            System.out.println("tu " + notaEx + " es una buena nota");
        } else if ( notaEx < 5) {
            System.out.println( "tu "+ notaEx + " es un suspenso" );
        } else {
            System.out.println( "tu "+ notaEx + " es un excelente" );
        }
    }
    
    public static void LaNiut_Pub(){
//    bienvenidos a la nuit pub, en este pub entran todos los mayores de edad y tengan una entrada, todo el que llega, se pone a bailar 
//    ademas los mayores de 21 cogen una borrachera impresionante y los que estan entre 20 y 21 esos son ludopatas 
//    los que se han quedado fuera del pub dicen vaya royo y si son menores de edad se van a tomarse un helado y el resto se van a coger 
//    el coche para ir al bonobo de motril, hayq que reguntar al usuario el nombre , la edad y si tiene entrada y apartir de ahi decirle que hacer
    
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("ingresa tu nombre:");
        String userName;
        userName = keyboard.next();
        
        System.out.println( userName + " ingresa tu edad:");
        int userAge;
        userAge = keyboard.nextInt();
        
        System.out.println( userName +" tienes entrada SI/NO:");      
        char ticket;
        ticket = keyboard.next().charAt(0);
        
        
        char s = 's' ;
        char S = 'S' ;
        
//      convertimos el char en bool
        boolean ticketsi = (ticket == s || ticket == S) ;
        
        if (!ticketsi){
            System.out.println( userName + " NO tienes ticket, ve a comprarte uno");
        }else {  
            if ( ticketsi == true && userAge >= 18){
                System.out.println( userName + " puedes entrar a bailar");
                
                if (userAge >=  20 && userAge <= 21){
                    System.out.println( userName + " eres un ludopata, entra a jugar a la tragaperras" );
                } else {
                    System.out.println( userName + " te vas a pegar una borrachera del copon");
                }   
                
            } else if ( userAge < 18) {
                System.out.println( userName + " tu edad es " + userAge + " eres menor de edad, ve a tomarte un helado");
            } else{
                System.out.println( userName + " pilla el coche y vete al bonobo de motril");
            }
        }     
    }
    
    public static void djtiesto(){
//    voy a la discoteca y soy mayor de edad entro y si tengo dinero me pido una cocacola,
//    ponen a dj tiesto y me pongo a bailar,
//    si no soy mayor me voy al cine, si esta avatar2, la veo y si no, me voy a la bolera
//    antes de irme del cine me tomo un helado
        
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("ingresa tu nombre:");
        String userName;
        userName = keyboard.next();
        
        System.out.println( userName + " ingresa tu edad:");
        int userAge;
        userAge = keyboard.nextInt();
        
        System.out.println( userName +"cuanto dinero tienes " + userName + "?");      
        double dinero;
        dinero = keyboard.nextDouble();
        
        double entrada = 15;
        
        if (dinero >= entrada && userAge >= 18){
            System.out.println( userName + " puedes entrar a la discoteca");
            
            double vueltaentr = dinero - entrada;
            dinero = vueltaentr;
            
            int cocacola = 3;
            
            System.out.println("quieres tomarte una cocacola?: SI/NO");
            char tomacocacola;
            tomacocacola = keyboard.next().charAt(0);

        //      convertimos el char en bool
        
            boolean tomacocacolasi = (tomacocacola == 's' || tomacocacola == 'S') ;
            
            if ( tomacocacolasi == true && dinero >= cocacola){
                System.out.println( userName + " puedes comprarte una cocacola");
                double vueltacc = dinero - cocacola;
                dinero = vueltacc;
                System.out.println("ahora tienes: " + dinero);
                
            }else {
                System.out.println( userName + " te quedas sin cocacola");
            }
            
            System.out.println( userName +" han puesto a DJtiesto? : SI/NO:");      
            char DJtiesto;
            DJtiesto = keyboard.next().charAt(0);

    //      convertimos el char en bool
            boolean DJtiestosi = (DJtiesto == 's' || DJtiesto == 'S') ;
            
            if (!DJtiestosi){
                System.out.println( userName + " vaya mierda de disco, no bailes");
            }else {
                System.out.println( userName + " te han puesto a DJtiestooo, ponte a bailar");
            }   
        }else {
            System.out.println("Nada, me voy al cine");
            double cine = 8;
            if (dinero >= cine){
                System.out.println( userName +" en el cine ponen Avatar2 ? : SI/NO:");      
                char avatar2;
                avatar2 = keyboard.next().charAt(0);

        //      convertimos el char en bool
        
                double helado = 3;
                boolean avatar2si = (avatar2 == 's' || avatar2 == 'S') ;
                if (!avatar2si){
                    
                    double bolera = 5;
                    System.out.println( userName + " vaya mierda de cine, vete a la bolera");
                    double vueltabol = dinero - bolera;
                    dinero = vueltabol;
                    System.out.println("ahora tienes: " + dinero);
                    
                    if (dinero >= helado ){
                        System.out.println("tienes dinero para tomarte un helado");
                        double vueltahel = dinero - helado;
                        dinero = vueltahel;
                        System.out.println("te has quedado con:" + dinero );
                    }else {
                        System.out.println("no tienes dinero, te quedas sin helado");
                    }
                       
                }else {
                    System.out.println( userName + " que bien!, entra a ver Avatar2");
                    double vueltacine = dinero - cine ;
                    dinero = vueltacine;
                    System.out.println("ahora tienes: " + dinero);
                    
                    
                    if (dinero >= helado ){
                        System.out.println("tienes dinero para tomarte un helado");
                        double vueltahel = dinero - helado;
                        dinero = vueltahel;
                        System.out.println("te has quedado con:" + dinero );
                    }else {
                        System.out.println("no tienes dinero, te quedas sin helado");
                    }
                } 
            }
        }
        
    }
}
