package com.mycompany.entradadedados;
import java.util.Locale;
import java.util.Scanner;
public class EntradaDeDados {
    public static void main(String[] args) {
        
        
        /*
        next() ou nextLine() - String (digitar texto)
        nextInt() - int (digitar número inteiro)
        nextFloat() - float (número com vírgula)
        nextDouble() - double (número com vírgula)
        */
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in); // inserir algum dado
        
        String x,y,z;
        int w;
        
        System.out.println("Pode digitar:");
        
        // System.out.println("Digite uma PALAVRA, um NÚMERO, UM NÚMERO COM PONTO e uma LETRA: ");
        
        /*String x = teclado.nextLine();
        int y = teclado.nextInt();
        double z = teclado.nextDouble();
        char w = teclado.next().charAt(0);*/
        
        w = teclado.nextInt();
        teclado.nextLine();
        x = teclado.nextLine();
        y = teclado.nextLine();
        z = teclado.nextLine();
        
        System.out.println("Dados digitados:");
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        //System.out.println(w); char
        
        teclado.close();
        
        
        
        
        
        
        
        
    }
}
