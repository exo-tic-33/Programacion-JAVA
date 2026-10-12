/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ayman.exr_conditionalstatments;

/**
 *
 * @author mhati
 */
import java.util.Scanner;

public class EXR_ConditionalStatments {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EXR_15();
        EXR_25();
        EXR_26();
    }

    public static void EXR_15() {
//      Escribe un programa que pinte una pirámide rellena con un carácter introducido
//      por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
//      etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
//      de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
//      hacia la derecha.

        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingresa el simbolo, numero o letra con la que quieras que se frme la piraimide:");
        char simbolChar = keyboard.next().charAt(0);

        System.out.println("menu de elexcoin de vertice:");
        System.out.println("hacia arriba = 1");
        System.out.println("hacia abajo  = 2");
        System.out.println("hacia la izq = 3");
        System.out.println("hacia la der = 4");
        int choice = keyboard.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println(" " + " " + " " + " " + " " + simbolChar);
                System.out.println(" " + " " + " " + " " + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
            }
            case 2 -> {
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + " " + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + " " + " " + simbolChar);
            }
            case 3 -> {
                System.out.println(" " + " " + " " + " " + " " + simbolChar);
                System.out.println(" " + " " + " " + " " + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar); // Centro
                System.out.println(" " + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + simbolChar + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + " " + simbolChar + simbolChar);
                System.out.println(" " + " " + " " + " " + " " + simbolChar);
            }
            default -> {
                System.out.println(simbolChar);
                System.out.println(simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar + simbolChar + simbolChar); // Centro
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar + simbolChar);
                System.out.println(simbolChar + simbolChar);
                System.out.println(simbolChar);
            }
        }
    }


    public static void EXR_25() {
//      La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
//      máxima calidad y nos ha pedido hacer un configurador que calcule el precio
//      según el alto y el ancho. El precio base de una bandera es de un céntimo de
//      euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
//      se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
//      son 3.25 €. El IVA ya está incluido en todas las tarifas.

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("introduzca la altura de la bandera en cm:");
        float height = keyboard.nextFloat();
        
        System.out.println("Ahora introduzca la anchura:");
        float width = keyboard.nextFloat();

        System.out.println("¿Quiere escudo bordado? (s/n):");
        char bordado = keyboard.next().charAt(0);
        
        boolean bordadoyes = (bordado == 's' || bordado == 'S');
        
        float cmBandera = height * width;
        float priceBandera = cmBandera * 0.01f;
        float precioEscudo = bordadoyes ? 2.50f : 0.0f;
        float gastosEnvio = 3.25f;
        
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.println("Bandera de " + cmBandera + " cm^2: " + priceBandera + " €");
        
        if (bordadoyes) {
            System.out.println("Con escudo: 2.50 €");
        } else {
            System.out.println("Sin escudo: 0.00 €");
        }
        
        System.out.println("Gastos de envío: " + gastosEnvio + " €");
        
        float total = priceBandera + precioEscudo + gastosEnvio;
        System.out.println("Total: " + total + " €");
    }

    public static void EXR_26() {
//      Realiza un programa que calcule el precio de unas entradas de cine en función
//      del número de personas y del día de la semana. El precio base de una entrada
//      son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
//      jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
//      Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
//      grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
//      que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
//      1 individual que son 41 euros (33 + 8).

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Introduce el número de personas:");
        int numPersonas = keyboard.nextInt();
        
        System.out.println("Introduce el día de la semana (lunes, martes, miercoles, jueves, viernes, sabado, domingo):");
        String dia = keyboard.next().toLowerCase();
        
        System.out.println("¿Tienes tarjeta CineCampa? (s/n):");
        char tarjeta = keyboard.next().charAt(0);
        boolean tieneTarjeta = (tarjeta == 's' || tarjeta == 'S');
        
        float total = 0;
        
        switch (dia) {
            case "miercoles", "miércoles" -> total = numPersonas * 5.0f;
            case "jueves" -> {
                int parejas = numPersonas / 2;
                int individuales = numPersonas % 2;
                total = (parejas * 11.0f) + (individuales * 8.0f);
            }
            default -> total = numPersonas * 8.0f;
        }
        
        if (tieneTarjeta) {
            total = total * 0.90f;
        }
        
        System.out.println("Aquí tiene el precio de sus entradas.");
        System.out.println("Total a pagar: " + total + " €");
    }
}
