package HW3.Task2;

public class Arr {
    public static <T> void printArray(T[] array){
        for (T iter : array) {
            System.out.println("-> "+ iter);
        }
    }
}
