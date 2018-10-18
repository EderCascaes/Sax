/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Ederson
 */
public class Concurso {
    
    String gabarito;
    String cargo;
    ArrayList<Candidato> candidatos;

    public Concurso(String gabarito, String cargo, ArrayList<Candidato> candidatos) {
        this.gabarito = gabarito;
        this.cargo = cargo;
        this.candidatos = candidatos;
    }

    

    public Concurso() {
     }

    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    

    @Override
    public String toString() {
        System.out.println("Concurso {" + "gabarito = " + gabarito + '}');
        return "\n Candidatos {" + candidatos + '}';
    }

}
