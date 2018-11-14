package projeto;

import java.util.Scanner;

public class PilhaProcessos implements Stack {

    int processos[];
    int top;

    Scanner input = new Scanner(System.in);

    public PilhaProcessos() {
        processos = new int[12];
        top = 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return (top == 0);
    }

    @Override
    public boolean isFull() {
        return (top == 11);
    }

    @Override
    public void push(Object e) {
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
    public Object top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return this.processos[top - 1];
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Overflow!");
        }
        int p;
        p = processos[top--];
        return p;
    }

}