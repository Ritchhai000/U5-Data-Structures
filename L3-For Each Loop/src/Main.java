import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*int[] arr = {4, 5, 6, 7, 8};

        for(int i = 0; i < arr.length; i++){

            int value = arr[i];
            System.out.println(value);
        }

        //Change this ^ into this:

        for(int value: arr){

            System.out.println(value + 3);
        }*/


        //Prompt the user to enter 5 names, then output those names.

        /*String[] names = new String[5];

        for(int i = 0; i < names.length; i++) {

            System.out.println("Enter a name.");
            names[i] = read.nextLine();
        }

        for (String name : names) {

                System.out.println(name);
         }*/

        //An employee works 5 days a week at $9.50/hour. Prompt the user to enter their hours worked for a month and output their weekly income totals.

        int[] daily  = new int[10];
        double[] weekly = new int[2];

        for(int i = 0; i < weekly.length; i++){
            for(int j = 0; j < daily.length; j++){

                System.out.println("please enter employee's hours: ");
                daily[j] = read.nextInt();
                weekly[i] += daily[j] * 9.50;
            }

        }

        for(double weeklyTotal: weekly){

            System.out.println(weeklyTotal);
        }

    }
}
