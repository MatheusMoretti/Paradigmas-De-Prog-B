
package heranca_e_polimorfismo;

public abstract class Aviao {
    public String cor,nomeAviao;    //atributos
    
    public abstract void tipoPneu();            //Interface Abstrata
    public abstract void mudecor(String cor);
    public abstract void atributoNome(String nome);
    
    public void projetoAviao(){         //metodos
        System.out.println("projeto");
    }
    
    
}
