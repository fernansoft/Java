import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dinossauro skeep = new Dinossauro();
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        System.out.println("\nSeja bem vindo ao minigame do Dinossauro Skeep!");
        System.out.println("Vamos começar!");
        while (skeep.isAlive() && input != 9) {
            System.out.println("\n\n\n\n********************************************************");
            System.out.println("Status atual do Skeep:");
            skeep.mostrarStatus();

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("LISTA DE AÇÕES:");
            System.out.println("#1 - Pular        #2 - Correr");
            System.out.println("#3 - Comer        #4 - Brincar");
            System.out.println("#5 - Tomar Sol    #6 - Ficar na Sombra");
            System.out.println("\n#9 - Finalizar programa");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Digite o numero da ação para executá-la: ");
            input = scanner.nextInt();
            switch (input) {
            case 1:
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                skeep.pular();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                break;
            case 2:
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                skeep.correr();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                break;
            case 3:
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                skeep.comer();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                break;
            case 4:
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                skeep.brincar();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                break;
            case 5:
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                skeep.tomarSol();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                break;
            case 6:
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                skeep.ficarNaSombra();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                break;
            default:
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("Ops, opção inválida!");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                break;
            }
        }
        scanner.close();
    }
}