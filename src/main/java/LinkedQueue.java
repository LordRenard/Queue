public class LinkedQueue<T> implements Queue<T> {

    private Node<T> tail = null; //��������� ������� � �������
    private Node<T> head = null; //������ ������� � �������
    private int count = 0; //������� ���������� ��������� � �������

    //�������� �������� �� �������
       public T pop() {

        //���������� ��������� ���� ������� �����
        if (head == null) {
            System.out.println("������� �����");
            return null;
        }

        Node<T> temp = head;
        System.out.println("�������� ��������: " + temp.data);

        head = head.next; //������� ������ � ���������� ����

        count--; // ���������� ���������� ����� �� 1

        return temp.data; // ���������� ��������� �������
    }

    //���������� �������� � �������
    public void push(T item) {

        //���������� ����� ���� � �������
        Node<T> node = new Node<T>(item);

        //���� ������ ������, �� ������ ������� ����� � ������� � ������� ������������

        // ���������� �������� � ������ �����, ���� ������� �����
        if (isEmpty()) {
            head = node;
        } else { //��������� ��������� ������� � �������
            tail.next = node;
        }

        tail = node;
        count++;
    }

    //�������� �������� �������� �������
    public T peek() {

        return head == null ? null : head.data;
    }

    public int size() { //���������� ������� ������ �������
        return count;
    }

    public boolean isEmpty() { //��������� �������� �� ������� ������
        return count == 0;
    }


    private class Node<R> {
        R data;
        Node<R> next;

        public Node(R data) {
            this.data = data;
            this.next = null;
        }
    }
}

