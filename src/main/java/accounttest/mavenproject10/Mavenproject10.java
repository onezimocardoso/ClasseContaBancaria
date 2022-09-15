/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package accounttest.mavenproject10;

import java.util.Scanner;

/**
 *
 * @author onezi
 */
public class Mavenproject10 {

    public static void main(String[] args) {
        
        ContaBancaria cliente1 = new ContaBancaria();
        Scanner teclado = new Scanner(System.in);
        int escolha;
      
            cliente1.setNome("Maria Ariana");
           cliente1.setBalanco(58000);
        
        do{
            System.out.println("Escolha a opcao: \n");      
            System.out.println("1. Receber o nome do cliente");
            System.out.println("2. Depositar R$100");
            System.out.println("3. Sacar R$100");
            System.out.println("4. Receber Balanco");
            System.out.println("5. Sair");
            escolha=teclado.nextInt();
            switch(escolha){
                case 1 : System.out.println(cliente1.getNome());;break;
                case 2 : cliente1.deposito(100); break;
                case 3 : cliente1.saque(100);break;
                case 4 : System.out.println(cliente1.getBalanco());break;
                default : System.out.println("Obrigado!");
            }
        }while(escolha!=5);
        
    
       
    }
}
