package Task1;

import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        double[] inputArr = new double[5];
        for (int i = 0; i < inputArr.length; ) {
            System.out.println("Input Double type value" + i + " : ");
            if ((inputArr[i] = input()) != 0.0)
                i++;
            else
                System.out.print("Enter DOUBLE type!\n");
        }

        System.out.println("The result array:");
        for (double elem:inputArr){
            System.out.println(elem);
        }
    }

    private static double input() {
        String s;
        double d = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            s = scanner.nextLine();
            if(!s.contains(".")){
                throw new NumberFormatException("Inncorrect data type");
            }
            d = Double.parseDouble(s);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return d;
    }
}
