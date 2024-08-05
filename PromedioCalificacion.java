import java.util.Scanner;
/** 
 * Esta clase llamada PromedioCalificacion tiene como objetivo tomar 4 calificaciones y calcular el promedio de las mismas
 * 
 * @since 2024-07-29
 * @author Erick Hernandez
 * @version 1.0
*/
public class PromedioCalificacion { 
    /**
     * El método principal que ejecuta la sumatoria para luego obtener el promedio de las calificaciones ingresadas
     * 
     * @param args los argumentos de línea de comandos (no se utilizan en este caso)
     */
    public static void main(String[] args) {
        /**    
         * Este método lee cuatro enteros desde la entrada, mismas que representan las calificaciones del estudiante, 
         * y luego calcula el promedio utilizando el resultado de la suma como base para dividirla en las cuatro calificaciones
         * . Finalmente, imprime el resultado en la salida.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su calificacion A");
        int notaA = scan.nextInt();   //calificacion 1
        System.out.println("Ingrese su calificacion B");
        int notaB = scan.nextInt(); //calificacion 2
        System.out.println("Ingrese su calificacion C");
        int notaC = scan.nextInt(); //calificacion 3
        System.out.println("Ingrese su calificacion D");
        int notaD = scan.nextInt();  //calificacion 4 
        int Suma = notaA +notaB + notaC + notaD;  /* se realiza la suma de los 4 resultados */
        float Promedio = Suma / 4; // esta linea realiza la division del resultado de la suma de las 4 calificaciones y nos dara el promedio
        System.out.println("El promedio obtenido es : "+Promedio);
    }
}