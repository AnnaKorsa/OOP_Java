package HW1.Task2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){
        this.width = 5;
        this.height = 11;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }
}
