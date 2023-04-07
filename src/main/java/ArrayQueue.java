public class ArrayQueue<T> implements Queue<T> {
    private T[] queueArray; //������ ��� �������� ��������� �������
    private int head; //�������� �� ������ ������� �������
    private int tail; //��������� �� ��������� ������� �������
    private int maxSize; //����������� ������ ������� �������
    private int count; //������� ���������� ��������� � �������

    //����������� ��� ������������� �������
    public ArrayQueue(int size){
        queueArray = (T[]) new Object[size];
        maxSize = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    //�������� ��������� �������� � �������
    public T pop() {

        //�������� �� ������� ��������� �������
        if (isEmpty()) {
            System.out.println("���������� �������� � �������. ���������� �����������");
            return null;
        }

        T x = queueArray[head];

        System.out.println("�������� ��������: " + x);

        //head = (head + 1) % maxSize;
        head++;
        count--;

        return x;
    }

    //���������� �������� � �������
    public void push(T item) {

        //������ ����� ������� � ������ ������������ ������
        if (size() == maxSize) {
            maxSize *= 1.5;
            T[] resizedArray = (T[])new Object[maxSize];
            for (int i = head, j = 0; i < queueArray.length; i++, j++) {
                resizedArray[j] = queueArray[i];
            }
            queueArray = resizedArray;
            head = 0;
            tail = size() - 1;
        }

         System.out.println("����������� �������: " + item);

        //tail = (tail + 1) % maxSize;
        tail++;
        queueArray[tail] = item;
        count++;
    }

    //���������� ������ ������� �������
    public T peek() {

        //�������� �� ������� ��������� �������
        if (isEmpty()) {
            System.out.println("���������� �������� � �������. ���������� �����������");
            System.exit(-1);
        }

        return queueArray[head];
    }

    public int size() { //��������� ������ �������
        return count;
    }

    public boolean isEmpty() { //��������� ����� �� ������� ��� ���
        return (size() == 0);
    }

    public boolean isFull() { //��������� ��������� �� ������� ��� ���
        return (size() == maxSize);
    }

}
