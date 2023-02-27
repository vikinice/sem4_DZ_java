/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.*/

import java.util.LinkedList;



public class zadacha2 {
    public static void main(String[] args) {
    LinkedList<Integer> linList = new LinkedList<>();
    linList.add(1);
    linList.add(2);
    linList.add(3);
    System.out.println(linList);
    enqueue(linList, 7);
    dequeue(linList);
    System.out.println(first(linList));
    }
    
    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
    list.addLast(num);
    System.out.println(list);
    return list;
    }
    
    public static int dequeue(LinkedList<Integer> list) {
    int temp = list.get(0);
    list.remove(0);
    System.out.println(list);
    return temp;
    }
    
    public static int first(LinkedList<Integer> list) {
        return list.get(0);
    }
}
