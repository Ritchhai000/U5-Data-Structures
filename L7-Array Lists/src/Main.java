import java.util.ArrayList;

public class Main {

    /* An ArrayList is a special OBJECT that works similarly to an Array. It can store data, including objects. An ArrayList is a much, MUCH more flexible list.
    Firstly, you not need to know the size of the ArrayList when declaring it and you can add and remove elements and the size will update.

    We are going to compare ArrayLists to Arrays.
    */

    public static void main(String[] args){

        //Declare an array of 5 dice.
        Die[] diceArray = new Die[5];
        int[] numbersArray = new int[5];

        //Declare an arraylist of 5 dice.
        ArrayList<Die> diceList = new ArrayList();
        ArrayList<Integer> numbers = new ArrayList();

        //ADDING ELEMENTS
        for(int i = 0; i < diceArray.length; i++){

            //Array
            diceArray [1] = new Die();
            numbersArray[i] = i;
        }

        //ArrayList
        //The size, or number of items, is the number of loops of the for loop. Typically this number is declared as a constant globally.
        for(int i = 0; i < 5; i++){

            diceList.add(new Die());
            numbers.add(i);
        }

        //DISPLAYING ELEMENTS
        for(Die die: diceArray){

            die.roll();
            System.out.println("Array Dice: " + die.getValue());
        }

        //ArrayLists
        for(int i = 0; i < diceList.size(); i++){

            diceList.get(i).roll();
            int value = diceList.get(i).getValue();
            System.out.println("ArrayList: " + value);
        }

        //REMOVING ELEMENTS

        //Array - BAD DON'T REMOVE ELEMENTS FROM ARRAYS
        /*System.out.println("Removed Element 2");
        diceArray[2] = null;
        for(Die die: diceArray){

            System.out.println("Array Dice: " + die.getValue());
        }*/

        //BOTTOM LINE: YOU CAN'T REMOVE AN ELEMENT FROM AN ARRAY

        //ArrayList
        System.out.println("Removed Element 2 from ArrayList");
        diceList.remove(2);
        for(Die die: diceList){

            System.out.println(die.getValue());
        }

        //ADDING AN ELEMENT WHEREVER
        diceList.add(2, new Die());
        diceList.get(2).roll();
        System.out.println("Added Element at 2");
        for(Die die: diceList){
            System.out.println("ArrayList Dice: " + die.getValue());
        }
    }


}
