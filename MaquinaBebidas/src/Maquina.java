import java.util.LinkedList;

public class Maquina {
    private Bebidas bebida;
    private Moedas moedas;

    protected LinkedList<Bebidas> listaCola;
    protected LinkedList<Bebidas> listaPepsi ;
    protected LinkedList<Bebidas> listaTea ;
    public LinkedList<Moedas> moedas5 ;
    public LinkedList<Moedas> moedas10 ;
    public LinkedList<Moedas> moedas20 ;
    public LinkedList<Moedas> moedas50 ;




    public Maquina() {
        this.bebida = new Bebidas();
        this.moedas = new Moedas();


        listaCola =  new LinkedList<>();
        listaPepsi =  new LinkedList<>();
        listaTea =  new LinkedList<>();
        moedas5 = new LinkedList<>();
        moedas10 = new LinkedList<>();
        moedas20 = new LinkedList<>();
        moedas50 = new LinkedList<>();
        inicializarBebida();
        inicializarMoedas();
    }


    public void inicializarBebida(){
        bebida.criarProdutos(listaCola,listaPepsi,listaTea);
    }

    public void inicializarMoedas(){
        moedas.adicionarMoedas(moedas5,moedas10,moedas20,moedas50);
    }


    public float getPrecos(int tipoBebida){
        if(tipoBebida == 1){
            if(listaCola.size()!= 0){
                return listaCola.getFirst().getPreco();
            }else{
                System.out.println("Item fora de stock");
            }
        }


        else if (tipoBebida == 2) {
            if(listaPepsi.size()!= 0){
                return listaPepsi.getFirst().getPreco();
            }else{
                System.out.println("Item fora de stock");
            }
        }

        else if (tipoBebida == 3) {
            if(listaTea.size()!= 0){
                return listaTea.getFirst().getPreco();
            }else{
                System.out.println("Item fora de stock");
            }
        }

        else {
            System.out.println("item não existe");
        }
        return 0;
    }

}
