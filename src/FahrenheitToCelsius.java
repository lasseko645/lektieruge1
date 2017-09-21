import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // her definere jeg scanneren
        Scanner input = new Scanner(System.in);

        //her reservere jeg variable
        double fahrenheit;
        double celsius;

        //her laver jeg den line som skal printes før jeg giver et input
        System.out.println("enter degrees given in fahrenheit, ");
        //her definere jeg at den reserverede variable fahrenheit skal være = det input som brugeren sætter ind
        fahrenheit = input.nextDouble();

        //her definere jeg at den reserverede variable celsius skal være = omregnings formlen for F til C
        celsius = (5.0/9) * (fahrenheit - 32);

        //her printer jeg hvad omregningen skal være
        System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");




    }
}
