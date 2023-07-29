package HW3.Task1;

public class TypeObj {
        public static <T> void printElement(T ob){
            System.out.println("Тип объекта: "  +ob.getClass().getName());
    }
}
