/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3_alonsomedinareyes;
import java.util.Scanner;

/**
 *
 * @author acs
 */
public class Actividad3_AlonsoMedinaReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner num_entrada = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------\n");
        System.out.println("            Universidad Autónoma de Campeche            \n");
        System.out.println("                  Alonso Medina Reyes                   \n");
        System.out.println("                       I.S.C 2 A                        \n");
        System.out.println("             Docente: Ing. Edgar Caamal Dzul            \n");
        System.out.println("               Lenguaje de programación I               \n");
        System.out.println("                      Actividad 3                       \n");
        System.out.println("                      26/04/2021                        \n");
        System.out.println("--------------------------------------------------------\n");
        
        System.out.println("Actividades que conforman el trabajo:\n");
        System.out.println("Suma consecutiva del 0 al 10.........................(1)");
        System.out.println("Factorial del 1 al 10................................(2)");
        System.out.println("Factorial de número introducido por el usuario.......(3)");
        System.out.println("Media del 0 al número introducido por el usuario.....(4)");
        System.out.println("Promedio y más cosas de un número introducido........(5)");
        System.out.println("Arreglo días de la semana............................(6)");
        System.out.println("Arreglo modelo del juego gato........................(7)\n");
        System.out.println("--------------------------------------------------------\n");
 
        System.out.print("Introduzca un número de actividad para realizar: ");
        actividades (num_entrada.nextInt());
        System.out.println("--------------------------------------------------------\n");

    }
    
    public static void actividades (int numero){
        
        Scanner num_entrada = new Scanner(System.in);
        
        int num = numero;
        
        switch(num){
            
            case 1:
                
                System.out.println("            Suma consecutiva del 0 al 10            \n");
                sumaNums();
                break;
                
            case 2:
                
                System.out.println("               Factorial del 1 al 10                \n");
                factorial_1();
                break;
            case 3:

                System.out.println("   Factorial de número introducido por el usuario   \n");
                System.out.print("Introduzca un número para calcular el factorial: ");
                factorial_2(num_entrada.nextInt());
                break;
            case 4:
                
                System.out.println("  Media del 0 al número introducido por el usuario  \n");
                System.out.print("Introduzca un número para calcular la media: ");
                media(num_entrada.nextDouble());
                break;
            case 5:
                
                System.out.println("    Promedio y más cosas de un número introducido   \n");
                System.out.print("Introduzca el número deseado: ");
                sumaProm(num_entrada.nextInt());
                break;
            case 6:
                
                System.out.println("              Arreglo días de la semana             \n");
                diasSemana();
                break;
            case 7:
                
                System.out.println("            Arreglo modelo del juego gato           \n");
                juegoGato();
                break;
                
        }
        
    }
    
    public static void sumaNums(){
        
        int suma = 0;
        
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        
        System.out.println("La suma del 0 al 10 es de: " + suma);
        
    }
    
    public static void factorial_1(){
        
        int fact = 1;
        
        for (int i = 10; i >= 1; i--) {           
            fact *= i;           
        }
        
        System.out.println("El factorial del 1 al 10 es: " + fact);
        
    }
    
    public static void factorial_2(int numeroIntrod){
        
        int num = numeroIntrod;
        int fact = 1;
        
        for (int i = num; i >= 1; i--) {           
            fact *= i;           
        }

        System.out.println("El factorial de " + num + " es: " + fact);
        
    }
    
    public static void media (double numeroIntrod){
        
        double num = numeroIntrod, suma = 0;
        
        for (int i = 1; i <= num; i++) {           
            suma += i;           
        }
        
        double media = suma / num;
        
        System.out.println("La media de los números que están entre el 0 y el " + num + " es " + media);
        
    }
    
    public static void sumaProm(int numeroInt){
         
        Scanner entrada = new Scanner(System.in);
        
        int num = numeroInt;
        int suma = 0;
        double promedio;
        int diferencia;
        
        int array [] = new int[num];
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            array[i] = entrada.nextInt();
            
        }
        
        int numMayor;
        int numMenor;
        numMayor = numMenor = array [0];
        
        for (int i = 0; i < array.length; i++) {
            
            if(array [i] > numMayor){
                numMayor = array [i];
            } else if (array [i] < numMenor){
                numMenor = array [i];
            }
            
            suma += array[i];
            
        }
        
        promedio = (double)suma / (double)num;
        diferencia = numMayor - numMenor;
        
        System.out.println("La cantidad de números que se han introducido es: " + num);
        System.out.println("El promedio de los números que se han introducido es: " + promedio);
        System.out.println("El número mayor de lo introducido es: " + numMayor);
        System.out.println("El número menor de lo introducido es: " + numMenor);
        System.out.println("La diferencia entre el número mayor y el menor es: " + diferencia);
        
    }
    
    public static void diasSemana(){
        
        String dias [] = new String[7];
  
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sábado";
        dias[6] = "Domingo";
        
        for(String diaSem: dias){       
            System.out.println(diaSem); 
        }
        
    }
    
    public static void juegoGato(){
        
        String cat [][] = new String[3][3];
        
        for (String vertical[]: cat){
            for(String horizontal: vertical){
                System.out.print("X" + " ");
            }
            System.out.println("");
        }
        
        
        
        
        
    }
    
}
