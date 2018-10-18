/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.util.Collections;
import java.util.Comparator;
import modelo.Candidato;
import java.util.List;

/**
 *
 * @author Ederson
 */
public class CompareToTabajara  {
    
    int rt = 0;
    public void compare(List Candidato) {
        
        Collections.sort (Candidato, new Comparator() {
    public int compare(Object o1, Object o2) {
                
                Candidato p1 = (Candidato) o1;
                Candidato p2 = (Candidato) o2;
                if (p1.getNotaFinal() > p2.getNotaFinal()){
                   rt = -1 ;
                    return rt;
                }else{
                   if(p1.getNotaFinal() < p2.getNotaFinal()){
                       rt = 1;
                       return rt;
                   } 
                    if(p1.getNotaFinal()==p2.getNotaFinal()){
                 
    
    Collections.sort (Candidato, new Comparator() {
    public int compare(Object o1, Object o2) {
                
                Candidato p1 = (Candidato) o1;
                Candidato p2 = (Candidato) o2;
                if (p1.getNotaCesp() > p2.getNotaCesp()){
                   rt = -1 ;
                    return rt;
                }else{
                   if(p1.getNotaCesp() < p2.getNotaCesp()){
                       rt = 1;
                       return rt;
                   } 
                    if(p1.getNotaCesp()==p2.getNotaCesp()){
                        
    Collections.sort (Candidato, new Comparator() {
    public int compare(Object o1, Object o2) {
                
                Candidato p1 = (Candidato) o1;
                Candidato p2 = (Candidato) o2;
                if (p1.getNotaMate() > p2.getNotaMate()){
                   rt = -1 ;
                    return rt;
                }else{
                   if(p1.getNotaMate() < p2.getNotaMate()){
                       rt = 1;
                       return rt;
                   } 
                   
                    if(p1.getNotaMate()==p2.getNotaMate()){
    Collections.sort (Candidato, new Comparator() {
    public int compare(Object o1, Object o2) {
                
                Candidato p1 = (Candidato) o1;
                Candidato p2 = (Candidato) o2;
                String data1 = p1.getData_nascimento();
                String data2 = p2.getData_nascimento();
                String array1[] = new String[3];
                array1 = data1.split("-");
                int ano1 = Integer.parseInt(array1[0]);
                int mes1 = Integer.parseInt(array1[1]);
                int dia1 = Integer.parseInt(array1[2]);
                String array2[] = new String[3];
                array2 = data2.split("-");
                int ano2 = Integer.parseInt(array2[0]);
                int mes2 = Integer.parseInt(array2[1]);
                int dia2 = Integer.parseInt(array2[2]);
                
                if (ano1>ano2){
                    rt = -1 ;
                    return rt;
                }else{
                    if(ano1<ano2){
                       rt = 1;
                       return rt;
                   }
                    if(ano1==ano2){
                        
                                if(dia1>dia2){
                                rt = -1 ;
                                return rt;
                           }else{
                                        if(dia1<dia2){
                                        rt = -1 ;
                                        return rt;
                                }
                          }
    if(dia1==dia2){
    
    Collections.sort (Candidato, new Comparator() {
    public int compare(Object o1, Object o2) {
                
                Candidato p1 = (Candidato) o1;
                Candidato p2 = (Candidato) o2;
                int g = Integer.parseInt( p1.getInscricao());
                int g2 = Integer.parseInt( p2.getInscricao());
                if (g> g2){
                   rt = -1 ;
                    return rt;
                }else{
                   if(g < g2){
                       rt = 1;
                       return rt;
                   } 

                        rt = 0;
                        return rt;
                }   
           }
        });                                            
                                                
    }             
}                   
                        rt = 0;
                        return rt;
                }   
           }
        });                    
   
    }
                        rt = 0;
                        return rt;
                }   
           }
        });                
                    }
                        rt = 0;
                        return rt;
                }   
           }
        });
    }
                        rt = 0;
                        return rt;
                }
             
            }
        });
        
        System.out.println ("");
        int p=1, i;
        
        for(i=0; i < Candidato.size();i++){
            if(i<3){
            
            System.out.println ("candidato Aprovado em " + p + "º :"+Candidato.get(i));
            p++;
            }
        }
        if(i<3){
             System.out.println ("candidato Aprovado em " + p + "º : \"---\" ");
             i++;
             p++;
        }
      
        
    }
    
}
