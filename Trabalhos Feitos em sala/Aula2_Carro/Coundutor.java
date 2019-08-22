
package exeraula2;

public class Condutor {
    String nome,naturalidade;
    int idade;
    Carro carro; 

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void comprar(Carro carro1){
        carro = carro1;
    }
    
    public void infomeu(){
        System.out.println("Km: "+carro.KM);
        if(carro.porta==true)System.out.println("Porta: "+carro.porta);
        else System.out.println("Porta: "+carro.porta);
        System.out.println("Cor: "+carro.cor);
        System.out.println("Modelo: "+carro.modelo);
        System.out.println("Fabricante: "+carro.fabricante);
    }
    
}
