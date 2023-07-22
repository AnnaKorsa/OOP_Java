package HW1.Task2;

public class Task2 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина прямоугольника: " + rectangle1.getWidth());
        System.out.println("Высота прямоугольника: " + rectangle1.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle(7, 4);
        System.out.println("Площадь прямоугольника: " + rectangle2.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle2.calculatePerimeter());
    }
}
