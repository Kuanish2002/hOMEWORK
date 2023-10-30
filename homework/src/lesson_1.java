
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class lesson_1 {
    public static void main(String[] args) {

        printTheeeWords();
        checkSumSign(5,-7);

        printColor();
        compareNumbers();
    }

    public static void printTheeeWords() {
        System.out.print("Orange\n");
        System.out.print("Banana\n");
        System.out.print("Apple\n");

    }

    public static void checkSumSign(int a,int b) {
        int c;
        c = a+b;
        if (c>= 0){
            System.out.print("Число положительно\n");

        }
        else {
            System.out.print("Число  отрицательное\n ");

        }
    }
    public static void printColor() {
        int value = 12;
        if (value < 0){
            System.out.print("Красный");
        }
        else if (value > 0 && value<100) {
            System.out.print("Желтый\n");
        }
        else {
            System.out.print("Зелёное\n");
        }
    }

    public static void compareNumbers() {
        int a,b;
        a = 5; b=6;
        if (a>= b){
            System.out.print("a>= b\n");

        }
        else {
            System.out.print("a<b\n");

        }
    }
}