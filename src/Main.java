
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        int inputNumbers[] = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < inputNumbers.length; i++) {
        System.out.println("Enter A Number: ");
        inputNumbers[i] = input.nextInt();
        }
        SortedSet set = new TreeSet();
         for (int i=0; i < inputNumbers.length; i++){
             set.add(inputNumbers[i]);

        }
        System.out.println("");
        System.out.println("The Largest Of The Three(3) Numbers Is: ");
        System.out.println(set.last());
    }
}