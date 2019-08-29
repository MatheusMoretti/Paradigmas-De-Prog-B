
package heranca_e_polimorfismo;

public class Companhia extends Aviao{
    
    public void tipoPneu(){
        System.out.println("Double");
    }
    public void mudecor(String cor){
        super.cor = cor;
        System.out.println("cor: "+cor);
    }
   
    public void atributoNome(String nome){
        super.nomeAviao = nome;
        System.out.println("nome: "+nome);
    }

 
}
