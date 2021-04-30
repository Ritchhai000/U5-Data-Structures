import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MMMR calc = new MMMR();

        double [] testArr = {2, 6, 3, 2, 1};

        System.out.println("The mean is: " + calc.mean(testArr));
        System.out.println("The median is: " + calc.median(testArr));
        System.out.println("The range is: " + calc.range(testArr));
        System.out.println();
    }
}
