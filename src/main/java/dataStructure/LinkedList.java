package dataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public LinkedList (String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    // Método para puxar o Head da lista
    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista vazia.");
        } else {
        System.out.println("Cabeça da lista: " + head.data);
        }
    }

    // Método para puxar o tail da lista
    public void getTail() {
        if (this.tail == null) {
            System.out.println("Lista vazia.");
        } else {
        System.out.println("Cauda da lista: " + tail.data);
        }
    }

    // Método para puxar o tamanho da lista
    public void getLength() {
        System.out.println("Tamanho: " + this.length);
    }


    // Exibir a lista
    public void print () {
        System.out.println("######### LISTA ########");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("######### LISTA ########\n");
    }

    // Adicionar a lista
    public void append (String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Remover o último (Tail)
    public Node removeLast () {
    if (length == 0 ) return null;
    Node pre = head;
    Node temp = null;

        while(pre.next != tail) {
         pre = pre.next;
        }

    tail = pre;
    temp = tail.next;
    tail.next = null;
    length--;
        if (length == 0) {
           head = null;
            tail = null;
        }
        return temp;
    }

    // Remover o primeiro (Head)
    public Node removeFirst () {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
             head = null;
             tail = null;
        }
        return temp;
    }

    // Acrescentar no início da lista (Head)
    public void prepend(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Ler a lista de uma posição específica
    public Node get(int index) {
        if (index <0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Alterar o valor de um elemento já existente
    public boolean set(int index, String data) {
        Node temp = get(index);
        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    // Inserir valor a lista em posição aleatória
    public boolean insert(int index, String data) {
        if (index <0 || index > length) return false;
        if (index == 0) {
            prepend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }
        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length -1) return removeLast();

        Node prev = get(index -1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.append("elemento 4");

        list.prepend("elemento 0");

//        System.out.println(list.removeLast().data);
//        System.out.println(list.removeFirst().data);
//        System.out.println(list.get(3).data);
//        list.remove(2);
//        list.insert(3, "elemento 2.5");
//        list.getHead();
//        list.getTail();
//        list.getLength();

//        list.print();
//        list.set(1, "elemento 0.5");
//
//        list.print();
    }

}
