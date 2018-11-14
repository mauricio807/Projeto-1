package projeto;

import java.util.Scanner;

public class Fila implements Queue {

    int fila[];
    int first;
    int last;
    int size;

    Scanner input = new Scanner(System.in);

    public Fila() {
        fila = new int[15];
        size = first = last = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean isFull() {
        return (size == 14);
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return this.fila[first];
    }

    @Override
    public Object remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        int r = fila[first];
        first = first + 1;
        size--;
        return r;
    }

    @Override
    public void add(Object f) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia!");
        }
        System.out.println("Adicionar: ");
        f = input.nextInt();
        fila[last] = (int) f;
        last = (last + 1);
        size++;
    }

}