/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ederson
 */
public class Calculadora {
    int acertos=0,r=0;
    int erros ;
    double resultado_port;
    double resultado_mat;
    double resultado_cesp;
    String aprovado = "Aprovado";
    String reprovado = "Reprovado";
    char x = 'x';
    double  nf ;
   
    public double CalculaPort(String a, String b){
        char[] ga = a.toCharArray();
        char[] re = b.toCharArray();
        acertos=0;
        erros=0; 
        for(int i= 0; i < 15;i++ ){
            if(ga[i]==re[i]){
                acertos++;
            //    System.out.println( (i+1) +" Acerto :"+ ga[i] + " = " + re[i] + " Pontos : "+ acertos);
            }
            if(ga[i] != re[i] && re[i]!= x ){
                erros++;
              //  System.out.println(( i+1) +" Erro :"+ ga[i] + " = " + re[i] + " Pontos : "+ erros);
            }
        }
        return resultado_port = 10*(acertos-(0.2*erros))/15;
    }
    
     public double CalculaMat(String a, String b){
        char[] ga = a.toCharArray();
        char[] re = b.toCharArray(); 
        acertos=0;
        erros=0;
        int c=15;
         for(int i= 0; i < 15;i++ ){
            if(ga[c+i]==re[c+i]){
                acertos++;
                //System.out.println((c+ i+1) + " Acerto :"+ ga[c+i] + " = " + re[c+i] + " Pontos : "+ acertos);
            }
            if(ga[c+i]!=re[c+i] && re[c+i]!= x){
                erros++;
                //System.out.println(( c+i+1) +" Erro :"+ ga[c+i] + " = " + re[c+i] + " Pontos : "+ erros);
            }            
        }
        
        return resultado_mat = 10*(acertos-(0.2*erros))/15;
 
    }
     
     public double CalculaCesp(String a, String b){
        char[] ga = a.toCharArray();
        char[] re = b.toCharArray();
        acertos=0;
        erros=0;
        int c =30;
         for(int i= 0; i < 20;i++ ){
            if(ga[c+i]==re[c+i]){
                acertos++;
                //System.out.println((c+ i+1) +" Acerto :"+ ga[c+i] + " = " + re[c+i] + " Pontos : "+ acertos);
            }
            if(ga[c+i]!=re[c+i] && re[c+i]!= x){
                erros++;
                //System.out.println((c+ i+1) +" Erro :"+ ga[c+i] + " = " + re[c+i] + " Pontos : "+ erros);
            }
            
        }
        
        return resultado_cesp = 10*(acertos-(0.2*erros))/20;

    }
    
     
      
     public double CalculoFinal(double a, double b, double c){
    
      double resultadoFinal = ((3*a)+(3*b)+(6*c))/12;
        return  resultadoFinal;
}
      
    
}
