import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] nomes={"54010927844", "10010010099"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu cpf");
        String cpf= scanner.nextLine();
        if(cpf==nomes[]){
            System.out.println("Prazer senhor bolinha");
        }
        //------------------------------------
        System.out.println("Digite quantas camisetas vc quer: ");
        int vendido= Integer.parseInt(scanner.nextLine());

        int reposto= Integer.parseInt(args[1]);
        int estoqueInicial= Integer.parseInt(args[2]);

        Produto camiseta = new Camiseta();
        if(estoqueInicial==0){
            vendido=0;
        } else if(vendido>estoqueInicial){
            vendido=0;
        }
        camiseta.estoque(vendido, reposto, estoqueInicial);

        scanner.close();
    }
}
