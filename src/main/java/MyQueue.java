public class MyQueue {

    public static void main (String[] agrs) {
        ArrayQueue<Integer> newQueue = new ArrayQueue<>(10);

        for (int i = 0; i <= 2000; i++) {
            newQueue.push(i);
        }

        System.out.println("Первый элемент в очереди: " + newQueue.peek());

        newQueue.pop();

        System.out.println("Первый элемент в очереди: " + newQueue.peek());

        System.out.println("Размер очереди: " + newQueue.size());

        newQueue.pop();
        newQueue.pop();

        System.out.println(newQueue.isEmpty() ? "Очередь пуста" : "В очереди имеются элементы");
    }
}
