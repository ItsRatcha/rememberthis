// Bird.java
public class Bird extends Animal {
    private String color;

    public Bird(int age, String color) {
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
        return "Bird is eating";
    }

    @Override
    public String sound() {
        return "Tweet tweet";
    }

    @Override
    public String howToMove() {
        return "Bird flies";
    }

    @Override
    public String toString() {
        return "Bird [age=" + age + ", color=" + color + "]";
    }
}
