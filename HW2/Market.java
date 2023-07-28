package HW2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.String.format;

public class Market implements QueueBehaviour,MarketBehaviour, Iterator<String> {// Добавлен Iterator<String>
    public List<String> queue;
    private Queue<String> orders;
    private int counter;


    public Market(){
        queue = new LinkedList<>();
        orders = new LinkedList<>();

    }

    @Override
    public void enqueue(String client){
        queue.add(client);
        System.out.println(client + " встал(a) в очередь.");
        System.out.println();

    }
    @Override
    public String dequeue (){
        if (queue.isEmpty()){
            System.out.println("Очереди нет!");
        }  else if (orders.isEmpty()) {
            System.out.println(queue.remove(0) + " покинул(a) очередь.");
            System.out.println();
        } else {
            System.out.println(queue.remove(0) + " покинул(a) очередь.");
            System.out.println("Заказ: ' " + orders.poll()+ " ' отменен!" );
            System.out.println();

        }
        String string = "";
        return string;

    }
    @Override
    public void size(){
        System.out.println("Количество людей в очереди: " + queue.size());
        System.out.println();
    }
    public int iSize(){
      return queue.size();
    }

    @Override
    public void acceptOrder(String order) {
        orders.add(order);
        System.out.println("Заказ " + order + " принят!");
        System.out.println();
    }
    @Override
    public void issueOrder() {
        System.out.println("Заказ" + orders.peek() + " готов! ");
        System.out.println();
    }
    public void update(){
        if (queue.isEmpty()){
            System.out.println("Свободная касса!");
        }  else if (orders.isEmpty()) {
                System.out.println("Клиент: " + queue.remove(0) + " выпил воды и ушел :( ");
                System.out.println("Количество людей в очереди: " + queue.size());
                System.out.println();
            } else {
                System.out.println("Заказ: " + orders.poll() + " готов к выдаче! Клиент: " + queue.remove(0));
                System.out.println("Количество людей в очереди: " + queue.size());
                System.out.println();
            }
        }
        @Override
        public boolean hasNext() {
            // Здесь делаем проверку: если есть следующий элемент в листе, то true, иначе false
            return counter < queue.size();
        }
    @Override
    public String next() {
        // Возвращает элемент по указанному индексу в этом списке.
        return queue.get(counter++);
    }

}