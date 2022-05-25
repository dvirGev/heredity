abstract class Shape {
    protected final int width;
    protected final int height;
    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public abstract void draw();
}
/**
 * תוסיפו ותממשו בצורה רקורסיבית  מחלקה משולש שיורשת מצורה
 * תוסיפו ותממשו מחלקה מלבן שיורשת מצורה
 * תוסיפו מחלקה ריבוע
 */
class Main {
    public static void main(String[] args) {
        Shape triangular = new Triangular(5);
        triangular.draw();
        /**
         * @
         * @@
         * @@@
         * @@@@
         * @@@@@
         */
        Shape rectangle = new Rectangle(5,3);
        rectangle.draw();
        /**
         * @@@@@
         * @@@@@
         * @@@@@
         */
        Shape square = new Square(3);
        square.draw();
        /**
         * @@@
         * @@@
         * @@@
         */
    }
}
