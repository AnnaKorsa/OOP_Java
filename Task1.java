package HW1;

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Барсик");
        cat.setAge(5);
        Owner catOwner = new Owner();
        catOwner.setName("Игорь");

        cat.setOwner(catOwner);
        cat.greet();
    }
}

