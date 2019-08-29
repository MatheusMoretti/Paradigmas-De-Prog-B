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
public class Passageiro extends Pessoa {
    
    int assento,malas;
    

    public Passageiro(int assento, int malas, int idade, int peso, String nome, String naturalidade, String limitaçao) {
        super(idade, peso, nome, naturalidade, limitaçao);
        this.assento = assento;
        this.malas = malas;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public int getMalas() {
        return malas;
    }

    public void setMalas(int malas) {
        this.malas = malas;
    }

  public void printParametros(){
        System.out.println("Nome do passageiro: "+this.getNome()+"\nIdade: "+this.getIdade()+"\nNaturalidade: "+this.getNaturalidade()+"\nPeso: "+this.getPeso()+"\nLimitaçao "+this.getLimitaçao()+
                "\nAssento: "+this.getAssento()+"\nNumero de Malas: "+this.getMalas());
        System.out.println("Esses sao os dados do Super:");
        super.printParametros();
    }
    
}
