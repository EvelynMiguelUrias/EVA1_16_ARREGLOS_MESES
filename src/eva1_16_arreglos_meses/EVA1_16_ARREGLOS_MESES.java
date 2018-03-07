/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_arreglos_meses;

import java.util.Scanner;

/**
 *
 * @author Evelyn
 */
public class EVA1_16_ARREGLOS_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] asMeses = {"Enero" , "Febrero" , "Marzo" , "Abril" , "Mayo",
            "Junio" , "Julio" , "Agosto" , "Septiembre" , "Ocutubre" ,
            "Noviembre" ,"Diciembre"};
        int[] aiDias ={31 , 28 , 31, 30 , 31, 30, 31,31 ,30 , 31,30,31};
        //EQUIVALENTE A:
        /* 
        String[] asMeses = new String[12];
        asMeses[0] = "Enero";
        ....
        */
        Scanner sscCaptu = new Scanner(System.in);
        System.out.println("Introduice el numero de mes [1 - 12]: ");
        int iMes = sscCaptu.nextInt();
        //IMPRIMIR EL MES (iMes va de 1 a 12, el arreglo de 0 a 11, por eso restamos 1)
        System.out.println("El mes es: " + asMeses[iMes -1] + " y tiene " + aiDias[iMes - 1] + " dias");
       
    }
    
}
