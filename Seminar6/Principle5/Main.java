package Seminar6.Principle5;
/*Принцип 5. Dependency inversion principle (принцип инверсии зависимостей) гласит, что модули высокого уровня не должны
 зависеть  от модулей нижнего уровня.
 В данном примере мы видим, что наш класс PetOwner не завит от класса Dog,который наследуется от класса Animal. Таким образом
 класс PetOwner может принимать любой класс, который будет наследником класса Animal (например класс Cat, Birds и др.).
 */

interface Animal { // Модуль высокого уровня
    void makeSound();
}

class Dog implements Animal { // Модуль нижнего уровня
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class PetOwner {  // Модуль высокого уровня
    private Animal animal; // Если бы данный класс принимал и создавал объекты класса Dog, а не Animal, то нарушался бы принцип 5.

    public PetOwner(Animal animal) {
        this.animal = animal;
    }

    public void makeAnimalSound() {
        animal.makeSound();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        PetOwner petOwner = new PetOwner(dog);

        petOwner.makeAnimalSound(); // Вывод: Dog barks.
    }
}