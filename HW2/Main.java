package HW2;

public class Main {
    public static void main(String[] args) {
        Market shop = new Market();

        shop.enqueue("Anna");
        shop.enqueue("Svetlana");
        shop.enqueue("Pavel");
        shop.enqueue("Dmitriy");

        shop.size();

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
