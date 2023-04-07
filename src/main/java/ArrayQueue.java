public class ArrayQueue<T> implements Queue<T> {
    private T[] queueArray; //массив для хранения элементов очереди
    private int head; //указывет на первый элемент очереди
    private int tail; //указывает на последний элемент очереди
    private int maxSize; //максимальый размер ёмкости очереди
    private int count; //текущее количество элементов в очереди

    //конструктор для инициализации очереди
    public ArrayQueue(int size){
        queueArray = (T[]) new Object[size];
        maxSize = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    //удаление переднего элемента в очереди
    public T pop() {

        //проверка на наличее элементов очереди
        if (isEmpty()) {
            System.out.println("Отсутсвуют элементы в очереди. Выполнение остановлено");
            return null;
        }

        T x = queueArray[head];

        System.out.println("Удаление элемента: " + x);

        //head = (head + 1) % maxSize;
        head++;
        count--;

        return x;
    }

    //добавление элемента в очередь
    public void push(T item) {

        //создаём новую очередь в случае переполнения первой
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

         System.out.println("Добавляется элемент: " + item);

        //tail = (tail + 1) % maxSize;
        tail++;
        queueArray[tail] = item;
        count++;
    }

    //возвращает первый элемент очереди
    public T peek() {

        //проверка на наличее элементов очереди
        if (isEmpty()) {
            System.out.println("Отсутсвуют элементы в очереди. Выполнение остановлено");
            System.exit(-1);
        }

        return queueArray[head];
    }

    public int size() { //возращает размер очереди
        return count;
    }

    public boolean isEmpty() { //проверяет пуста ли очередь или нет
        return (size() == 0);
    }

    public boolean isFull() { //проверяет заполнена ли очередь или нет
        return (size() == maxSize);
    }

}
