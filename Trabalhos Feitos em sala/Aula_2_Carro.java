
package exeraula2;

public class ExerAula2 {

    public static void main(String[] args) {
      Carro carro = new Carro();
      Condutor condutor = new Condutor();
      
      carro.cor = "preto";
      //carro.setCordocarro("preta");
      
      carro.setRodas(4);
      carro.setPortas(4);
      carro.setPassageiros(5);
      carro.setModelo("Fiat");
      carro.setFabricante("toyota");
      carro.setKM(4000);
      
      condutor.setIdade(22);
      condutor.setNaturalidade("br");
      condutor.setNome("Jorge");
      
      System.out.println("O condutor "+condutor.nome+" possui um carro: "+carro.modelo+" do fabrincate: "+carro.fabricante+" da cor "+carro.cor);
      System.out.println("O carro ja rodou "+carro.KM+"km");
      System.out.println("----------------------");
      carro.AttKM();
      carro.Infos();
      carro.setPorta(true);
      carro.Infos();
      System.out.println("----------------------");
      
      condutor.comprar(carro);
      condutor.infomeu();
      
    }
    
}
