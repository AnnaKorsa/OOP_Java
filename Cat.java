package HW1;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    public void greet() {
        System.out.printf("Мяу! Меня зовут %s. Мне %d лет.Мой владелец - %s.", name, age, owner.getName());
    }
}


