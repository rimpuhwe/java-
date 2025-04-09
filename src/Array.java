import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //declaring the array
        String[] fruits = {"pineapple", "banana","apple", "kiwi"};
        // displaying all element in fruits array(it's the same as the foreach method  in javascript)
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println(fruits.length);
     //accepting the user to input the element into the array
        System.out.print("How many names dou you want to enter?");
        int size = scanner.nextInt();
        String[] names = new String[size];
        for(int i = 0 ; i < names.length ; i++){
            System.out.print("A name: ");
            String name = scanner.next();
            names[i]= name;
        }
        for(String name : names){
            System.out.print( name + " ");

        }
        System.out.println();
        // searching an item in string array
        System.out.print("which fruit do you want:");
        String fruit = scanner.next();
        boolean isFound = false;
        for (String s : fruits) {
            if (s.equals(fruit)) {
                System.out.println("you got it");
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            System.out.println("we don't have that one");
        }

        System.out.println(sum(2,3,4,5));
    }
    public static int sum (int ...numbers){
        int sum  = 0 ;
        for (int number : numbers) {
            sum += number ;
        }
        return sum;

    }


}
