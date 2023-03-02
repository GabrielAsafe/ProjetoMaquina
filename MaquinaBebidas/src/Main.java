import java.util.Scanner;

public class Main {
    private Maquina maquina;
    Scanner input = new Scanner(System.in);
    private int bebida;

    float preco;
    int opc2;

    public Main(){
        maquina = new Maquina();
        while (true){
            float valorInserido = 0;
            Menu.listarMenu();
            int opc  = input.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("0: Cancelar compra");
                    Menu.escolherBebida();
                    bebida = input.nextInt();

                    if(bebida != 0){
                        preco = maquina.getPrecos(bebida);

                        System.out.println("O preço desse item é:" + preco);
                        while (valorInserido < preco){
                            Menu.receberMoedas();
                            Menu.mostrarSelecao(bebida,valorInserido);
                            opc2 = input.nextInt();
                            if(opc2 ==1){
                                valorInserido+=5;
                                maquina.moedas5.add( new Moedas(1,"5"));
                            } else if(opc2 ==2){
                                valorInserido+=10;
                                maquina.moedas10.add(new Moedas(1,"10"));
                            }else if(opc2 ==3){
                                valorInserido+=20;
                                maquina.moedas20.add(new Moedas(1,"20"));
                            }
                            else if(opc2 ==4){
                                valorInserido+=50;
                                maquina. moedas50.add(new Moedas(1,"50"));
                            } else if(opc2 ==0){
                                System.out.println("Operação cancelada");
                            }
                            else{
                                System.out.println("Valor inválido");
                            }
                        }

                    }
                    System.out.println("A maquina devolveu "+ (valorInserido - preco));

                    System.out.println("Retire seu produto no dispensador");



                    break;

                case 0000:
                        Menu.MenuAdministrador();
                        opc = input.nextInt();
                        if(opc2 == 1){
                            maquina = new Maquina();
                        }
                    break;

            }
        }


    }

    public static void main(String[] args) {
        new Main();
    }
}