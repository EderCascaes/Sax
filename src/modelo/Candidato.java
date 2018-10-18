/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ederson
 */
public class Candidato {

    String inscricao;
    String data_nascimento;
    String cargo;
    String resposta;
    double notaPort;
    double notaMate;
    double notaCesp;
    double notaFinal;

    public Candidato(String inscricao, String data_nascimento, String cargo, String resposta) {
        this.inscricao = inscricao;
        this.data_nascimento = data_nascimento;
        this.cargo = cargo;
        this.resposta = resposta;
    }

    public Candidato() {
         }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public double getNotaPort() {
        return notaPort;
    }

    public void setNotaPort(double notaPort) {
        this.notaPort = notaPort;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaCesp() {
        return notaCesp;
    }

    public void setNotaCesp(double notaCesp) {
        this.notaCesp = notaCesp;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    

    @Override
    public String toString() {
        return "Candidato: {" + "inscricao = " + inscricao + ", data nascimento = " + data_nascimento + ", cargo = " + cargo + ", resposta = " +  resposta +  ", Nota Final = "+ notaFinal + "}";
    }
    
    

}
