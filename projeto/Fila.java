package projeto;

import java.util.Scanner;

public class Fila implements Queue {

    int fila[];  //Variavel para o Arrey da fila
    int first;  //Variavel para receber o primeiro da fila
    int last;  //Variavel para receber o ultimo da fila
    int size;  //Variavel para receber o tamanho total de pessoas na fila

    Scanner input = new Scanner(System.in);

    public Fila() {  //Contrutor da classe Fila
        fila = new int[15];
        size = first = last = 0;
    }

    @Override
    public int size() {  //Metodo para verificar o número de pessoas na fila
        return size;
    }

    @Override
    public boolean isEmpty() {  //Metodo para verificar se a posição na fila está vazia
        return (size == 0);
    }

    @Override
    public boolean isFull() {  //Metodo para verificar se a posição na fila está ocupado
        return (size == 14);
    }

    @Override
    public Object peek() {  //Metodo para retornar o primeiro na fila
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return this.fila[first];
    }

    @Override
    public Object remove() {  //Metodo para remover o primeiro da fila
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        int r = fila[first];
        first = first + 1;
        size--;
        return r;
    }

    @Override
    public void add(Object f) {  //Metodo para adicionar pessoa ao final da fila
        if (isFull()) {
            throw new RuntimeException("Fila cheia!");
        }
        System.out.println("Insira a prioridade: "
                + "\n 1 - Idoso / Gestante / Deficiente"
                + "\n 2 - Aluno"
                + "\n 3 - Visitante / Professor");
        f = input.nextInt();
        fila[last] = (int) f;
        last = last + 1;
        size++;
    }

}
