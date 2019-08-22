
package exeraula2;


public class Carro {
    String cor,modelo,fabricante;
    int rodas,passageiros,portas,KM;
    boolean porta;
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isPorta() {
        return porta;
    }

    public void setPorta(boolean porta) {
        this.porta = porta;
    }

    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }
    
    public void AttKM(){
        int atual = getKM();
        setKM((atual+500));
    }
    
   /* public void AttPorta(){
        int atual = getPortastatus();
        setPortastatus(());
    }*/
    public void Infos(){
        System.out.println("Km: "+getKM());
        if(porta==true)System.out.println("Porta: "+isPorta());
        else System.out.println("Porta: "+isPorta());
        System.out.println("Cor: "+getCor());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Fabricante: "+getFabricante());
    }
    }
    
