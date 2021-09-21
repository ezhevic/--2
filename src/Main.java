import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();
        Vector vector1 = new Vector(x1, y1, z1);
        Vector vector2 = new Vector(x2, y2, z2);

        System.out.println(vector1.length());
        System.out.println(vector2.length());
        System.out.println(vector1.scalarProduct(vector2));
        System.out.println(vector1.cos(vector2));
        System.out.println(vector1.add(vector2));
        System.out.println(vector1.subtract(vector2));
    }
}
