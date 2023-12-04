
package actividad2pooep23;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

//Importamos el java.lang.Math.sqrt para calcular la raiz
import static java.lang.Math.sqrt;

//Importamos el java.lang.Math.sqrt para elevar una potencia
import static java.lang.Math.pow;

public class Main {

   
    public static void main(String[] args) {
        
        //Definimos variables
        double A, B, C, SOLUCIONA, SOLUCIONB;

        //Título y datos
        System.out.println("Ejercicio propuesto #23");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario los valores de A, B Y C
        System.out.print("Ingrese el valor de A: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        A = Double.parseDouble(entrada1);
        
        System.out.print("Ingrese el valor de B: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        B = Double.parseDouble(entrada2);
        
        System.out.print("Ingrese el valor de C: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada3 = scanner.nextLine();
        C = Double.parseDouble(entrada3);
        
        //Toma de decisiones
        if (A != 0) {
            SOLUCIONA = ((-1*B)+(sqrt(pow(B,2)-4*(A*C))))/(2*A);
            SOLUCIONB = ((-1*B)-(sqrt(pow(B,2)-4*(A*C))))/(2*A);
            System.out.println("Los dos valores posibles para X son X: " + SOLUCIONA + " y X: " + SOLUCIONB);
        } else{
            System.out.println("Error, el valor A debe der distinto de 0");
        }
    }
    
}
