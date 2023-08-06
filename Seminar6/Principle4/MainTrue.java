package Seminar6.Principle4;
/*
Принцип 4. Interface segregation principle - данный принцип требует разделения «толстых»
интерфейсов на несколько специализированных, связанных общей функциональностью.
В данном примере реализован принцип 4, в котором мы наблюдаем разделение интерфейсов с отдельными методами.
Они имплементированы для каждого класса. Интерфейс родитель AnimalActions, имеет методы, которые жизненнонеобходимы любому животному.

 */
interface AnimalActions {
    void eat();
    void sleep();

}
interface Flying extends AnimalActions {
    void fly();
}

interface Scratchable extends AnimalActions {
    void scratch();
}
interface GivePaw  {
    void givePaw();

}
abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal implements GivePaw,AnimalActions{
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void givePaw() {
        System.out.println("Dog gives paw.");
    }

    @Override
    public void eat() {
        //...
    }

    @Override
    public void sleep() {
        //...
    }
}

class Cat extends Animal implements Scratchable {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

    @Override
    public void scratch() {
        System.out.println("Cat scratches.");
    }

    @Override
    public void eat() {
        //...
    }

    @Override
    public void sleep() {
        //...
    }
}
class Bird implements Flying {

    @Override
    public void eat() {
        //...
    }

    @Override
    public void sleep() {
        //...
    }

    @Override
    public void fly() {
        System.out.println("Bird flying.");

    }
}

public class MainTrue {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Bird bird1 = new Bird();

        animal1.makeSound(); // Вывод: Dog barks.
        animal2.makeSound(); // Вывод: Cat meows.

        if (animal2 instanceof Scratchable) {
            Scratchable cat = (Scratchable) animal2;
            cat.scratch(); // Вывод: Cat scratches.
        }
        if (animal1 instanceof GivePaw) {
            GivePaw dog = (GivePaw) animal1;
            dog.givePaw(); // Вывод: Dog gives paw.
        }
        if (bird1 instanceof Flying) {
            Flying bird = (Flying) bird1 ;
            bird.fly(); // Вывод: Bird flying.
        }
    }
}
