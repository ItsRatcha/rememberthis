// Dog.java
public class Dog extends Animal {
    private String color;

    public Dog(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }

    @Override
    public String sound() {
        return "Woof woof";
    }

    @Override
    public String howToMove() {
        return "Dog walks";
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", color=" + color + "]";
    }
}
