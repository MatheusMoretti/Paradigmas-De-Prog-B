/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca_e_polimorfismo;

/**
 *
 * @author 18082974
 */
public class Pessoa {
    public int idade,peso;
    public String nome,naturalidade,limitaçao;
    
    public Pessoa(int idade, int peso, String nome, String naturalidade, String limitaçao) {
        this.idade = idade;
        this.limitaçao = limitaçao;
        this.peso = peso;
        this.nome = nome;
        this.naturalidade = naturalidade;
    }
            
            

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLimitaçao() {
        return limitaçao;
    }

    public void setLimitaçao(String limitaçao) {
        this.limitaçao = limitaçao;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    
    public void printParametros(){
        System.out.println("Nome da pessoa: "+this.getNome()+"\nIdade: "+this.getIdade()+"\nNaturalidade: "+this.getNaturalidade()+"\nPeso: "+this.getPeso()+"\nLimitaçao "+this.getLimitaçao()+"\n\n");
    }
}
