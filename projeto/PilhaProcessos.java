package projeto;

import java.util.Scanner;

public class PilhaProcessos implements Stack {

    int processos[];  //Variavel atribuido para o Arrey de processos
    int top;  //Variavel atribuido para receber os processoas na pilha 

    Scanner input = new Scanner(System.in);

    public PilhaProcessos() {  //Construtor da classe PilhaProcessos
        processos = new int[12];
        top = 0;
    }

    @Override
    public int size() {  //Metodo para retornar o número de processos existentes na pilha
        return top;
    }

    @Override
    public boolean isEmpty() {  //Metodo para verificar se a posição na pilha está vazia
        return (top == 0);
    }

    @Override
    public boolean isFull() {  //Metodo para verificar se a posição na pilha foi preenchido
        return (top == 11);
    }

    @Override
    public void push(Object e) {  //Metodo para adicionar processo no topo da pilha de acordo com a prioridade
        if (isFull()) {
            throw new RuntimeException("Stack Overflow!");
        }
        System.out.println("Insira a prioridade do processo: "
                + "\n 1 - Inscrição"
                + "\n 2 - Renovação"
                + "\n 3 - Trancamento");
        e = input.nextInt();
        processos[top] = (int) e;
        top++;
    }

    @Override
    public Object top() {  //Metodo para retornar o primeiro processo da pilha
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return this.processos[top - 1];
    }

    @Override
    public Object pop() {  //Metodo para remover processo do topo da pilha 
        if (isEmpty()) {
            throw new RuntimeException("Stack Overflow!");
        }
        int p;
        p = processos[top--];
        return p;
    }

}
