package Seminar6.Principle1;

/* Принцип 1.Single responsibility principle (принцип единственной ответственности) гласит, что класс должен иметь только одну причину для изменения
 т.е. он должен быть ответственым только за одну функциональность или обязанность.
 Данный пример соответствует принципу единой ответственности, т.к. некоторые функции  "жизнено важные действия" вынесены в отдельный класс.
 */

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Не важные действия для жизни
    public void move() {
        // Код для перемещения животного
    }

    public void makeSound() {
        // Код для издания звука
    }

}

// Жизнено важные действия
    class AnimalActions {

        public void eat() {
        // Код для питания животного
        }

     public void sleep() {
        // Код для сна животного
        }

     public void reproduce() {
        // Код для размножения животного
        }

}
