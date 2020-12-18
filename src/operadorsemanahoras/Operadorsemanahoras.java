
package operadorsemanahoras;

import java.util.Scanner;


public class Operadorsemanahoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horasingresadas, semanas, dias, horas;
        
        //  % ESTA MADRE SE LLAMA MOD, calcula el residuo de la división 
        
        Scanner entrada = new Scanner(System.in);             
        System.out.println("INGRESAR CANTIDAD DE HORAS");
        horasingresadas = entrada.nextInt();
        
        semanas = horasingresadas/168;
        dias = horasingresadas%168/24;
        horas = horasingresadas%24;
        
        System.out.println("Semanas " +semanas);
        System.out.println("Días    " +dias);
        System.out.println("Horas   " +horas);
        
                
                
        
        
       
    }
    
}
