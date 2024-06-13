package dataStructure;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value =value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }

    public void getFirst() {
        if (first != null) {
            System.out.println("Primeiro: " + first.value);
        } else {
            System.out.println("Fila está vazia.");
        }
    }

    public void getLast() {
        if (last != null) {
            System.out.println("Ultimo: " + last.value);
        } else {
            System.out.println("Fila está vazia.");
        }
    }

    public void getLength() {
        System.out.println("Tamanho da fila: " + length);
    }

    public void print() {
        Node temp = first;
        System.out.println("######## FILA ########");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("######## FILA ########\n");
    }

    // Adicionar valores a fila
    public void enqueue(int value) {
        Node newNode = new Node (value);

        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    // Retirar valores da fila (1 -> N)
    public Node dequeue() {
        if (length == 0 ) return null;
        Node temp = first;

        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }


    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        myQueue.print();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

//        System.out.println(myQueue.dequeue().value);
//        System.out.println(myQueue.dequeue().value);
//        System.out.println(myQueue.dequeue().value);
//        myQueue.print();

    }
}
