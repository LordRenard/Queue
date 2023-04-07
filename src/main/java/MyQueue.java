public class MyQueue {

    public static void main (String[] agrs) {
        ArrayQueue<Integer> newQueue = new ArrayQueue<>(10);

        for (int i = 0; i <= 2000; i++) {
            newQueue.push(i);
        }

        System.out.println("������ ������� � �������: " + newQueue.peek());

        newQueue.pop();

        System.out.println("������ ������� � �������: " + newQueue.peek());

        System.out.println("������ �������: " + newQueue.size());

        newQueue.pop();
        newQueue.pop();

        System.out.println(newQueue.isEmpty() ? "������� �����" : "� ������� ������� ��������");
    }
}
