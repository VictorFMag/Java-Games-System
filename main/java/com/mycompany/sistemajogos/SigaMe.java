package com.mycompany.sistemajogos;

import java.util.Scanner;

public class SigaMe {
    Scanner in = new Scanner(System.in);
    int numDigitado;
    int sequencia[] = new int[5];
    
    public void limpaConsole(){
        for(int i=0; i<20; i++){
            System.out.println("\n");
        }
    }
    
    public void geraSequencia(){
        try{
            for(int i=0; i<5; i++){
                int numGerado = (int)(1+ (Math.random() * 100));
                sequencia[i] = numGerado;
                System.out.println(sequencia[i]);
                Thread.sleep(2000);
                this.limpaConsole();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void verificaSequencia(){
        try{
            this.geraSequencia();
            for(int i=0; i<5; i++){
                System.out.print("Digite o "+(i+1)+"º termo da sequencia: ");
                numDigitado = in.nextInt();
                if(numDigitado!=sequencia[i]){
                    System.out.println("Você errou a sequência. Vamos tentar novamente!");
                    i=-1;
                    for(int j=0; j<5; j++){
                        System.out.println(sequencia[j]);
                        Thread.sleep(2000);
                        this.limpaConsole();
                    }
                }
                else{
                    System.out.println("Correto!");
                }
            }
            System.out.println("Parabéns! Você acertou toda a sequência!\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
