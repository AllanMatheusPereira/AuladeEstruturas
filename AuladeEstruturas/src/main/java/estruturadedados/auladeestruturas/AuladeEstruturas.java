/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estruturadedados.auladeestruturas;

import java.util.Scanner;

/**
 *
 * @author allan
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author allan
 */
public class AuladeEstruturas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeros [] = new int [20];
        String nome [] = new String [10];
        double numero [] = new double [5];
        
        
          for(int i=0; i<numeros.length; i++){
              System.out.println("Digite um numero:");
              numeros[i]= ler.nextInt();
              
          }
          System.out.println("Numeros Informados: ");
          for(int i=0; i<numeros.length; i++){
              System.out.println(numeros[i] + "-");
          }
       
      
        for(int i=0; i<10; i++){
           System.out.println("Digite um nome:");
           nome[i]= ler.nextLine();
           
          }
        System.out.println("Nomes Informados: ");
          for(int i=0; i<10; i++){
            System.out.println(nome[i] + "-");
         }

       
         for(int i=0; i<numeros.length; i++){
            System.out.println("Digite um numero:");
            numero[i]= ler.nextDouble();
            
         }
        System.out.println("Numeros Informados: ");
         for(int i=0; i<numeros.length; i++){
             System.out.println(numero[i] + "-");
          
         }
    }
}
