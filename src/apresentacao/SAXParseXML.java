package apresentacao;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import calcula.Calculadora;
import calcula.CompareToTabajara;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.SAXParserFactory;

import javax.xml.parsers.SAXParser;
import modelo.Candidato;
import modelo.Concurso;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXParseXML{
        CompareToTabajara ct = new CompareToTabajara();
        Concurso concurso = new Concurso();
        Calculadora calculadora = new Calculadora();
        String gaba, resp;
        double p,m,c;
        Candidato candidato = new Candidato();
        ArrayList<Candidato> lista = new ArrayList<>();
        ArrayList<Candidato> aprovadosSuporte = new ArrayList<>();
        ArrayList<Candidato> aprovadosAnalista = new ArrayList<>();
        ArrayList<Candidato> aprovadosProgramador = new ArrayList<>();
	public  Concurso criaConcurso(){	            
        		try{
			DefaultHandler handler = new DefaultHandler(){
                                boolean gabarito = false;                           
				String id;
                                boolean data_nascimento = false;
				boolean cargo = false;
				boolean resposta = false;

                               						
	public void startElement(String uri, String lName, String qName, Attributes attributes) throws SAXException{
                    
                    if (qName.equalsIgnoreCase("gabarito")) {
                        gabarito = qName.equalsIgnoreCase("gabarito");
                    }

                    if (qName.equalsIgnoreCase("candidato")) {
                        id = attributes.getValue(0);
                    }
                    data_nascimento = qName.equalsIgnoreCase("data_nascimento");
                    cargo = qName.equalsIgnoreCase("cargo");
                    resposta = qName.equalsIgnoreCase("resposta");

                } 



                public void endElement(String uri, String lName, String qName) throws SAXException{	
                    //System.out.println("End element: "+qName);
                        if (qName.equalsIgnoreCase("concurso")) {
                    //System.out.println("Fim do elemento :" + qName);
                }
                }

                public void characters(char ch[], int start, int length) throws SAXException{	
                        
                        if (gabarito){
                                concurso.setGabarito(new String(ch, start, length));
                                System.out.println("Gabarito: "+ concurso.getGabarito());
                                gaba= concurso.getGabarito();
                                gabarito = false;
                        }
                        if (data_nascimento){
                                candidato.setInscricao(id);
                                //System.out.println("Inscricão  : "+ candidato.getInscricao());
                                candidato.setData_nascimento(new String(ch, start, length));
                                //System.out.println("Data Nasciemtno  : "+ candidato.getData_nascimento());
                                data_nascimento = false;
                        }
                        if (cargo) {
                                candidato.setCargo(new String(ch, start, length));
                                //System.out.println("Cargo  : "+ candidato.getCargo());   
                                cargo = false;
                        }
                        if (resposta) {
                                candidato.setResposta(new String(ch, start, length));
                                //System.out.println("Respostas : "+ candidato.getResposta());
                                resp=candidato.getResposta();
                                resposta = false;

                                
                        p=calculadora.CalculaPort(gaba, resp);
                        m=calculadora.CalculaMat(gaba, resp);
                        c=calculadora.CalculaCesp(gaba, resp);
                                    candidato.setNotaPort(p);
                                    candidato.setNotaMate(m);
                                    candidato.setNotaCesp(c);
                                    candidato.setNotaFinal(calculadora.CalculoFinal(p, m, c));
                        if(p >= 6 && m >= 6 && c >= 6){
//                                 System.out.println(" Candidato Aprovado para avaliação de critérios : " );
//                                 System.out.println("Inscricão  : "+ candidato.getInscricao());
//                                 System.out.println("Data Nasciemtno  : "+ candidato.getData_nascimento());
//                                 System.out.println("Cargo  : "+ candidato.getCargo()); 
//                                 System.out.println("Respostas : "+ candidato.getResposta());
//                                 System.out.println("Notas -->  Por : "+ p +"   Mat : "+ m + "    Esp : "+ c);
//                                 System.out.println("Nota Final : "+ calculadora.CalculoFinal(p, m, c));
                              //   System.out.println(" Candidatos instanciado antes : "+ candidato );
                                 
                                 
                                 if(candidato.getCargo().equals("suporte")){
                                    aprovadosSuporte.add(candidato);
                                }
                                 if(candidato.getCargo().equals("analista")){
                                    aprovadosAnalista.add(candidato);
                                }
                                 if(candidato.getCargo().equals("programador")){
                                    aprovadosProgramador.add(candidato);
                                }
                                 
                                 lista.add(candidato);
                                 candidato = new Candidato();
                        }else{
                               // System.out.println(" Candidato Reprovado Inscrição : "+ id );
                        }
                        
                    }
                         
                
            //     return  ;
            }
        };
                    
                        
                        concurso.setCandidatos(lista);
        		SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();

			saxParser.parse(new File("file.xml"),handler);

		}catch (Exception e){	
			e.printStackTrace();
		
		}
                        
                        System.out.println("Lista de Candidatos com notas acima da nota mínima :");
                        System.out.println(" Candidato Aprovados Cargo Suporte : "+aprovadosSuporte );
                        System.out.println(" Candidato Aprovados Cargo Analista : "+aprovadosAnalista );
                        System.out.println(" Candidato Aprovados Cargo Programador : "+aprovadosProgramador );
                        System.out.println ("-------------------------------------------------------------------------------------------------------");
                        System.out.println("Aprovados no cargo de Suporte");
                        ct.compare(aprovadosSuporte);
                        System.out.println ("-------------------------------------------------------------------------------------------------------");
                        System.out.println("Aprovados no cargo de Analista");
                        ct.compare(aprovadosAnalista);
                        System.out.println ("-------------------------------------------------------------------------------------------------------");
                        System.out.println("Aprovados no cargo de Programador");
                        ct.compare(aprovadosProgramador);
                  
            return concurso;
	
	}

        
        
}



