
package heranca_e_polimorfismo;

/**
 *
 * @author 18082974
 */
public class Heranca_e_polimorfismo {

    public static void main(String[] args) {
        Pessoa instPessoa = new Pessoa(22,50,"joao","brasileiro","cego");
        instPessoa.printParametros();
        
        Passageiro instPassageiro1 = new Passageiro(22,2,35,55,"Carlos","Britanico","nenhuma");
        instPassageiro1.printParametros();
        
       
        Companhia aee = new Companhia();
        aee.tipoPneu();
        aee.mudecor("amarelo");
        
        
    }
    
}
