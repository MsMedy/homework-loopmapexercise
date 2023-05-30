import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /* HOMEWORK - 'ASK USER FOR 5 VALUES' EXERCISE */


        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> inputArray = new ArrayList<Integer>(5);

        int largest = Integer.MAX_VALUE * -1;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Please provide 5 whole, positive, numbers: ");
        for(int i = 0; i < 5; i++) {
            int userInput = sc.nextInt();
            inputArray.add(userInput);
        }
            System.out.println("Here is your list: " + inputArray);

        Integer arrSum = 0;
        for(int num: inputArray){
            arrSum += num;
        }
        System.out.println("sum of array values: " + arrSum);

        Integer arrProduct=1;
        for(int num: inputArray){
            arrProduct *= num;
        }
        System.out.println("product of array values: " + arrProduct);

        for(int num: inputArray){
            if(num < smallest){
                smallest = num;
            }
        }
        System.out.println("the smallest value of the provided array is: " + smallest);

        for(int num: inputArray){
            if(num > largest){
                largest = num;
            }
        }
        System.out.println("the largest value of the provided array is: " + largest);

/*

   /* HOMEWORK - CAR DEALER EXERCISE */
       /*
        HashMap<String, String> cars = new HashMap<>();

        cars.put("honda", "civic");
        cars.put("pontiac", "grand am");
        cars.put("nissan", "altima");
        cars.put("dodge", "ram");

        Scanner input = new Scanner(System.in);

        System.out.println("What car model are ya looking for today? : ");
        String answer = input.nextLine();
        ;

        String modifiedAnswer = answer.toLowerCase();

        if(cars.containsKey(modifiedAnswer)){
            System.out.println("Looks like you're in luck! We have a " + modifiedAnswer + " " + cars.get(modifiedAnswer) + ".");
        }
        else if(cars.containsKey(answer) == false) {
            System.out.println("We don't have that bud, sorry");
        }

        */

       /* CLASSWORK - TO LIST EXERCISE */

        /*
        String userInput = "";
        Integer value = 1;

        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> toDoList = new HashMap<Integer, String>();
        System.out.println("What do you want to add to To Do list? Type exit to close " +
                "the interface." );
        String exit = "exit";
        while(!userInput.equals(exit)){
            userInput = input.nextLine();
            if(!userInput.equals(exit)){
                toDoList.put(value, userInput);
                value++;
            }
        }

        System.out.println("This is your current To Do List :" + toDoList);
    }
}


         */

    }
    }
