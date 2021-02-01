package ListaDeExercicio01_Exercicio8;

import java.util.Scanner;

public class TesteException2 {

    public static void main() {

    	 @SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
         System.out.println("Eu sei dividir!");
         System.out.println("Informe o primeiro valor: ");

         int x = 0;
         boolean flag = true;
         while (flag) {
             if (teclado.hasNextInt()) {
                 x = teclado.nextInt();
                 flag = false;
             } else {
                 System.out.print("Digite um número inteiro: ");
                 teclado.next();
             }
         }

         System.out.println("Informe o segundo valor: ");

         int y = 0;
         flag = true;
         while (flag) {
             if (teclado.hasNextInt()) {
                 y = teclado.nextInt();
                 flag = false;
             } else {
                 System.out.print("Digite um número inteiro: ");
                 teclado.next();
             }
         }

         try {
             double r = (x / y);
             System.out.println("O resultado da divisão é " + r);
         } catch (ArithmeticException exception) {
             System.out.println("Erro: divisão por zero");
         }
     }
 }
