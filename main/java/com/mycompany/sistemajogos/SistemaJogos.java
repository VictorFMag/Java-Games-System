package com.mycompany.sistemajogos;

import java.util.Scanner;

public class SistemaJogos {

    public static void main(String[] args) {
        int escolha = 0;
        Scanner in = new Scanner(System.in);
        
        while(escolha!=4){
            System.out.println("********** MENU **********");
            System.out.println("*1 - Adivinhe o Número   *");
            System.out.println("*2 - Siga-me             *");
            System.out.println("*3 - Suporte Online      *");
            System.out.println("*4 - Sair                *");
            System.out.println("**************************");
            System.out.print("\nEscolha a opção desejada: ");
            escolha = in.nextInt();
            
            switch(escolha){
                case 1:
                    AdivinheONúmero a = new AdivinheONúmero();
                    a.verificaNum();
                    break;
                case 2:
                    SigaMe b = new SigaMe();
                    b.verificaSequencia();
                    break;
                case 3:
                    SuporteOnline c = new SuporteOnline();
                    c.respostas();
                    break;
                case 4:
                    System.out.println("Sistema finalizado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
