import java.util.LinkedList;

public class Moedas {

    private int quantidadeMoedas;

    private String tipoMoedas;


    public Moedas(int quantidadeMoedas, String tipoMoedas) {
        this.quantidadeMoedas = quantidadeMoedas;
        this.tipoMoedas = tipoMoedas;
    }

    public Moedas() {
        this.quantidadeMoedas = 0;
        this.tipoMoedas = "";
    }




    public void adicionarMoedas(LinkedList<Moedas> moedas5, LinkedList<Moedas> moedas10, LinkedList<Moedas> moedas20, LinkedList<Moedas> moedas50){
        for(int i=1;i<=10;i++){
            moedas5.add( new Moedas(1,"5"));
            moedas10.add(new Moedas(1,"10"));
            moedas20.add(new Moedas(1,"20"));
            moedas50.add(new Moedas(1,"50"));
        }
    }


    public int getQuantidadeMoedas() {
        return quantidadeMoedas;
    }

    public String getTipoMoedas() {
        return tipoMoedas;
    }
}
