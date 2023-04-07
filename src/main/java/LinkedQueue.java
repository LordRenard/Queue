public class LinkedQueue<T> implements Queue<T> {

    private Node<T> tail = null; //последний элемент в очереди
    private Node<T> head = null; //первый элемент в очереди
    private int count = 0; //текущее количество элементов в очереди

    //удаление элемента из очереди
       public T pop() {

        //завершение программы если очередь пуста
        if (head == null) {
            System.out.println("ќчередь пуста");
            return null;
        }

        Node<T> temp = head;
        System.out.println("”даление значини€: " + temp.data);

        head = head.next; //переход вперед к следующему узлу

        count--; // уменьшение количества узлов на 1

        return temp.data; // возвращает удаленный элемент
    }

    //добавление элемента в очередь
    public void push(T item) {

        //выдел€етс€ новый узел в очереди
        Node<T> node = new Node<T>(item);

        //если список пустой, то первый элемент будет и головой и хвостом одновременно

        // определ€ем переднюю и заднюю часть, если очередь пуста
        if (isEmpty()) {
            head = node;
        } else { //обновл€ем последний элемент в очереди
            tail.next = node;
        }

        tail = node;
        count++;
    }

    //проверка верхнего значени€ очереди
    public T peek() {

        return head == null ? null : head.data;
    }

    public int size() { //возвращает текущий размер очереди
        return count;
    }

    public boolean isEmpty() { //провер€ет €вл€етс€ ли очередь пустой
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

