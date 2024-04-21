/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.gustavo.duarte.trabalhoestruturadedados.b;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TrabalhoEstruturaDeDados1b {

    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
        int chave;
        long inicio = System.currentTimeMillis();
        System.out.println("Digite o tamanho do seu vetor: ");
        int n = s.nextInt();
        
        int[]vetor = new int[n];
        
        for (int i=0; i< vetor.length; i++){
            System.out.println("Digite o valor do vetor na posicao " + (i+1)); 
            vetor[i] = s.nextInt();
        }
        
        for (int i=0; i< vetor.length; i++){
                    System.out.println("Vetor escolhido pelo usuário: ["+(i+1)+"]: " + vetor[i]);
        }
        
        System.out.println("Escolha qual dos métodos de ordenação você gostaria de usar? 1- Insercao, 2 - Seleção, 3 - Bolha");
        int selecao = s.nextInt();
        switch(selecao){
            case 1:
                System.out.println("Metodo de Ordenação em Insercao: ");
                int j; 
                for (int i=1; i<vetor.length; i++){
                    chave = vetor[i];
                    for(j = i-1; j>=0 && vetor[j]>chave; j--){
                        vetor[j+1] = vetor[j];
                    }
                    vetor[j+1]= chave;
                }

                for (int i = 0; i < vetor.length; i++) {
                        System.out.println("Vetor Ordenado: ["+(i+1)+"] = "+vetor[i]);            
                        }  
                 break;
                 
            case 2:   
                System.out.println("Método de Ordenação em Seleção: ");
                for(int i = 0; i < vetor.length-1; i++){
                   int posicaoMenor = i;

                   for(int k = i+1; k < vetor.length; k++){
                       if(vetor[k] < vetor[posicaoMenor]){
                           posicaoMenor = k;
                        }
                    }
                   if(posicaoMenor != i){
                       int aux = vetor[i];
                       vetor[i] = vetor[posicaoMenor];
                       vetor[posicaoMenor] = aux;
                    }
                }

                   for(int i = 0; i < vetor.length; i++){
                   System.out.println("Vetor Ordenado: ["+(i+1)+"] = "+vetor[i]);
                   }
               break;
            case 3:                 
                boolean houveTroca = true;
                System.out.println("Metodo de Ordenação em Bolha: ");
                while(houveTroca){
                    houveTroca = false;
                    for(int i = 0; i < vetor.length - 1; i++){
                        if(vetor[i] > vetor[i+1]){
                            int aux = vetor[i];
                            vetor[i] = vetor[i+1];
                            vetor[i+1] = aux;
                            houveTroca = true;
                        }
                    }
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.println("Vetor Ordenado: ["+(i+1)+"] = "+vetor[i]);            
                        }   
                }
                break;
                }
                
                
                long fim = System.currentTimeMillis();
                long tempoExecucao = fim - inicio;
                System.out.println("Tempo de execucao do projeto: : "+tempoExecucao + " Milisegundos");
    }    }


