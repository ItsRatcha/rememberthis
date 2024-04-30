// Animal.java
public abstract class Animal implements Movable {
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String eat();

    public abstract String sound();
}
