package dataStructure;

public class Stack {

    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value=value;
        }
    }

    public Stack (int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // Exibe o valor que está em 1º na lista
    public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

    // Exibe o tamanho da lista
    public void getHeight() {
        System.out.println("Altura: " + height);
    }

    // Exibe a lista inteira
    public void print() {
        System.out.println("######### PILHA #########");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("######### PILHA #########\n");
    }

    // Método para adicionar valor ao topo
    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    //Metodo de remoção do valor que está no topo
    public Node pop() {
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);
        myStack.print();

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);

        myStack.getTop();
        myStack.getHeight();

        myStack.print();


    }





}
