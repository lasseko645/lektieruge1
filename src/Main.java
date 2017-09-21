import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaring two variable 1 to read the radius and one to store the area


        double radius;      // here im declaring the variable "radius" witch reads the value of the radius of our circle//

        double area;        // here im declaring the variable "area" witch stores our value of the areal calculation

        Scanner input = new Scanner(System.in);     // det eneste jeg ved om den her linje er at den henter en classe som giver brugeren muglighed for at inputte data

        System.out.println("skriv radius for circlen: ");   // her er den tekst før stedet som intager brugerens input

        radius = input.nextDouble();     //her definere jeg værdien for vore radius variable

        //radius = 14;        // floating point i dont know how to use properly. for now its static value

        area = radius * radius * 3.14; // here im setting the floating value of the variable area, by setting up the calculation

        // here ill print out the result
        System.out.println(" the area of a circle with this radius is " + area);


    }
}