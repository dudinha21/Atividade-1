import java.util.Scanner;

public class Programa_soma {

   
    public static void main(String[] args) 
    {
       int x = 0 , y = 0, soma;
      
       Scanner s = new Scanner(System.in);
       
       System.out.println("Introduza o 1 numero");
       x = s.nextInt();
       
       System.out.println("Introduza o 2 numero");
       y = s.nextInt();
             
       soma = x+y;
       
       System.out.println(" A soma é: " + soma);
             
       
           }
    
}