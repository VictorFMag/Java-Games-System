package com.mycompany.sistemajogos;

import java.util.Scanner;

public class AdivinheONúmero {
    int numGerado = (int)(Math.random() * 100);
    Scanner in = new Scanner(System.in);
    int menor = 0, maior = 99, numEscolhido, contTentativas=0;
    
    public void verificaNum(){
        do{
            System.out.print("Escolha um número entre "+menor+" e "+maior+": ");
            numEscolhido = in.nextInt();
            if(numEscolhido>numGerado){
                contTentativas++;
                maior=numEscolhido;
                System.out.println("O número está entre "+menor+" e "+maior);
            }
            else if(numEscolhido<numGerado){
                contTentativas++;
                menor=numEscolhido;
                System.out.println("O número está entre "+menor+" e "+maior);
            }
            else{
                System.out.println("PARABÉNS! Você acertou o número sorteado ("+numGerado+") com "+contTentativas+" tentativas.\n");
            }
        }while(numEscolhido!=numGerado);
    }
}
