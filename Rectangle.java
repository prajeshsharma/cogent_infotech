public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea() {
        return  length * breadth;
    }

    public void display() {
        System.out.println("length: " + length);
        System.out.println("breadth: " + breadth);
        System.out.println("area: " + calculateArea());
    }
}
