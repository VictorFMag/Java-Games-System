/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemajogos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SuporteOnline {
    
    public void respostas(){
        System.out.println("Bem-vindo ao sistema de suporte técnico. Em que posso ajudar?");
        
        ArrayList<String> respostas = new ArrayList();
        respostas.add("Nenhum outro cliente se queixou a respeito deste problema antes. Quais as configurações do seu sistema?");
        respostas.add("Isto está explicado no manual. Você leu o manual?");
        respostas.add("Parece estranho. Você poderia explicar o problema com mais detalhes?");
        respostas.add("Desculpe, mas eu não consigo resolver. Você terá que aguardar a visita de um técnico");
        respostas.add("Parece interessante. Fale mais a respeito...");
        respostas.add("Tente desinstalar e instalar novamente");
        respostas.add("Algo saiu errado, tente digitar novamente");
        respostas.add("Já verificou se o cabo está conectado?");
        respostas.add("Não entendi o que quis dizer. Poderia ser mais claro?");
        respostas.add("Infelizmente não é possível ajudá-lo daqui. Agendarei a visita de um técnico o quanto antes");
        
        String respostaUsuario;
        do{
            Scanner in = new Scanner(System.in);
            respostaUsuario = in.nextLine();
            
            int numResposta = (int)(Math.random() * 9);
            System.out.println(respostas.get(numResposta));
        }while(!"tchau".equals(respostaUsuario));
        System.out.println("Foi bom falar com você. Espero ter ajudado a resolver seu problema. Tchau...\n");
    }
}
