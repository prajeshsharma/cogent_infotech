import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Rectangle rectangle = new Rectangle();
            System.out.println("Enter length of Rectangle " + (i + 1) + ':');
            rectangle.setLength(sc.nextDouble());
            System.out.println("Enter breadth of Rectangle " + (i + 1) + ':');
            rectangle.setBreadth(sc.nextDouble());
            rectangles[i] = rectangle;
        }
        for (Rectangle rectangle : rectangles) rectangle.display();

    }
}
