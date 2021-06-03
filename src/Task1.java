import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] inputArr = new double[5];
        for (int i = 0; i < inputArr.length;){
            System.out.println("Input Double type value: ");
            try{
                inputArr[i] = scanner.nextDouble();
                i++;
            }catch (Exception e){
                System.out.println("Incorrect type data ");
            }
        }
    }
}
