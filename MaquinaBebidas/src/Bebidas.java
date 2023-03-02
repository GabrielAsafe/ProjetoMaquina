import java.util.LinkedList;

public class Bebidas {
    private float preco;
    private String tipo;


    public Bebidas(){
        this.preco = 0;
        this.tipo = "";
    }

    public Bebidas(float preco, String tipo) {
        this.preco = preco;
        this.tipo = tipo;
    }

    public void criarProdutos(LinkedList<Bebidas> bebida1, LinkedList<Bebidas> bebida2, LinkedList<Bebidas> bebida3){
        CriarCola(bebida1);
        CriarPepsi(bebida2);
        CriarTea(bebida3);
    }


    private void CriarCola(LinkedList<Bebidas> bebida){
        for (int i = 0; i<10;i++){
            bebida.add( new Bebidas(70,"Coca_cola"));
        }
    }

    private void CriarPepsi(LinkedList<Bebidas> bebida){
        for (int i = 0; i<10;i++){
            bebida.add( new Bebidas(65,"Pepsi"));
        }

    }

    public float getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    private void CriarTea(LinkedList<Bebidas> bebida) {
        for (int i = 0; i < 10; i++) {
            bebida.add(new Bebidas(65, "Ice Tea"));
        }



    }





}
