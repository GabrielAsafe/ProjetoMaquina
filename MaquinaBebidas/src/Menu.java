import java.util.Scanner;

public class Menu {

    public static void listarMenu(){

        System.out.println("1: Efetuar compra");

    }


    public static void MenuAdministrador(){

        System.out.println("1: Reset machine");


    }



    public static void receberMoedas(){

        System.out.println("1: inserir 5 centimos");
        System.out.println("2: inserir 10 centimos");
        System.out.println("3: inserir 20 centimos");
        System.out.println("4: inserir 50 centimos");

    }


    public static void escolherBebida(){

        System.out.println("1: Coca cola");
        System.out.println("2: Pepsi");
        System.out.println("3:Ice Tea");


    }


    public static void mostrarSelecao(int item, float valor){

        if(item == 1)
        System.out.println("O item escolhido foi: Coca cola" + " Você inseriu: " + valor);
        else if (item ==2) {
            System.out.println("O item escolhido foi: Pepsi" + " Você inseriu: " + valor);
        }else {
            System.out.println("O item escolhido foi: Ice Tea" + " Você inseriu: " + valor);
        }


    }



}

