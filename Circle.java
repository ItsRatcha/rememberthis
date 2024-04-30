import java.util.Objects;

public class Circle implements Comparable<Circle> {
    private double radius;
    private String name;

    public Circle() {
        this.radius = 1.0;
        this.name = "circle";
    }

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(name, circle.name);
    }

    public void set(double radius) {
        this.radius = radius;
    }

    public void set(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Circle o) {
        int radiusComparison = Double.compare(this.radius, o.radius);
        
        if (radiusComparison == 0) {
            return Integer.compare(this.name.length(), o.name.length());
        } else {
            return radiusComparison;
        }
    }
}
