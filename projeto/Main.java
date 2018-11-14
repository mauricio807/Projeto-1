package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PilhaProcessos pp = new PilhaProcessos();
        Fila f = new Fila();
        Scanner input = new Scanner(System.in);
        int opcao;
        int opcaoo;
        int escolha;

        do {
            System.out.println("1 - Fila");
            System.out.println("2 - Pilha de processos");
            System.out.println("   ");
            System.out.println("Digite a opção: ");
            escolha = input.nextInt();
            System.out.println("   ");

            if (escolha == 1) {
                do {
                    System.out.println("1 - Verificar Fila");
                    System.out.println("2 - Chamar o Primeiro da Fila");
                    System.out.println("3 - Atender o Primeiro da Fila");
                    System.out.println("4 - Adicionar a Fila");
                    System.out.println("   ");
                    opcaoo = input.nextInt();
                    System.out.println("   ");

                    if (opcaoo == 1) {
                        System.out.println("Tamanho da fila: " + f.size);
                        System.out.println("   ");
                    }

                    if (opcaoo == 2) {
                        System.out.println("Primeiro da fila: " + f.peek());
                        System.out.println("   ");
                    }

                    if (opcaoo == 3) {
                        System.out.println("Atendido! " + f.remove());
                        System.out.println("   ");
                    }

                    if (opcaoo == 4) {
                        f.add(f);
                        System.out.println("   ");
                    }

                } while (opcaoo != 4);
            }

            if (escolha == 2) {
                do {
                    System.out.println("1 - Analisar Processo");
                    System.out.println("2 - Adicionar Processo");
                    System.out.println("3 - Excluir Processo");
                    System.out.println("4 - Quantidade de Processos");
                    System.out.println("   ");
                    System.out.println("Digite a opção: ");
                    opcao = input.nextInt();
                    System.out.println("  ");

                    if (opcao == 1) {
                        System.out.println("Primeiro processo: " + pp.top());
                        System.out.println("  ");
                    }

                    if (opcao == 2) {
                        pp.push(pp);
                        System.out.println("  ");
                    }

                    if (opcao == 3) {
                        System.out.println("Exluir processo: " + pp.pop());
                        System.out.println("  ");
                    }

                    if (opcao == 4) {
                        System.out.println("Quantidade de processos: " + pp.size());
                        System.out.println("  ");
                    }
                } while (opcao != 4);

            }

        } while (escolha != 2);
    }
}