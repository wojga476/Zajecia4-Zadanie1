public class TriangleTest {

    public static void main(String[] args) {
        Triangle sprawdzenie =new Triangle(60,90,30);
        boolean czyProst = sprawdzenie.isRightTriangle(sprawdzenie);
        System.out.println(czyProst);
    }
}
