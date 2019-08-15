package calculadora_aula01;

import java.util.Scanner;
/**
*
* @author Matheus Moretti
* RA: 18082974
*/
public class Calculadora_aula01 {

   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        float num1,num2,res = 0;
        char sinal;
        
        System.out.print("Digite o primeiro numero\n");
        num1 = leitor.nextInt();
        
        System.out.print("digite a operacao desejada\n");
        sinal = entrada.next().charAt(0);
        
        System.out.print("Digite o segundo numero\n");
        num2 = leitor.nextInt();
              
        switch (sinal)
        {
            case '+':
                res =num1+num2;       
                break;
                
            case '-':
                res =num1-num2;              
                break;
                
            case '*':
                res =num1*num2;              
                break;  
                
            case '/':
                if(num2 == 0)
                    System.out.print("Divisoes por 0 nao sao permitidas\n");
                else{
                   res =num1/num2;
                }                
                break;
        }
        
        System.out.print("Resposta"+res);
    }
    
}