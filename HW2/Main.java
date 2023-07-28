package HW2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Market shop = new Market();

        shop.enqueue("Anna");
        shop.enqueue("Svetlana");
        shop.enqueue("Pavel");
        shop.enqueue("Dmitriy");

        shop.size();

        StatusQueue<Integer> queue = i -> i > 0;// Добавила реализацию собственного функционального интерфейса
        System.out.println("Статус очереди: " + queue.isEmpty(shop.iSize()));
        System.out.println();

        System.out.println("Список клиентов: ");
        Iterator<String> iter = shop;// Реализовала  интерфейс Iterator<E>(выводит список клиентов в очереди)
        while (iter.hasNext()) {
            System.out.println("Клиент: " + iter.next());
        }

        shop.acceptOrder("Пирожное");
        shop.acceptOrder("Мороженое");
        shop.acceptOrder("Кофе");
        shop.dequeue();
        shop.update();
        shop.update();
        shop.update();
        shop.update();
    }


}
