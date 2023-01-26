package lsp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja ouvir qual grunhido?\n 1 - Gato \n 2 - Cachorro\n 3 - Qualquer animal");
        int escolha = scanner.nextInt();
        switch(escolha){
            case 1:
                mostraGrunhido(new Gato());
                break;
            case 2:
                mostraGrunhido(new Cachorro());
                break;
            case 3:
                mostraGrunhido(new AnimalDomestico());
                break;
                default:
                System.out.print("Escolha inválida!!!");
        }
        scanner.close();
    }

    public static void mostraGrunhido(AnimalDomestico animalDomestico) {
        animalDomestico.ouvirGrunhido();
    }
}
