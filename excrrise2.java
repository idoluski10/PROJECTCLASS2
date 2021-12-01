import java.util.Scanner;

public class excrrise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 10 numbers");
        double arr[]=new double[10];
        double sum=0;
        for (int i=0; i<arr.length;i++) {


            arr[i]= (double) scanner.nextDouble();
        }

        for (int i=0;i<arr.length;i++) {

            sum=sum+arr[i];
        }

        double average = sum / arr.length;

        for (int i=0;i<arr.length;i++) {

            if (arr[i]>average) {
                System.out.print(arr[i]+" ,");

            }
        }

    }


}


