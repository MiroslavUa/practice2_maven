package array;

import java.util.Scanner;
import arraysorting.ArrayOfRandomFigures;

public class App {
    public static void main(String[] args) {

        run();

    }

    public static void run() {

        while(true){

            int arraySize;
            int randomFiguresRange;
            int exitOrContinue;

            Scanner in = new Scanner(System.in);

            System.out.print ("Enter an array size: ");
            arraySize = in.nextInt();
            System.out.print ("\nEnter range of random figures: ");
            randomFiguresRange = in.nextInt();
            System.out.print("\nUnsorted array of random figures is:\n");
            ArrayOfRandomFigures arrayRandom = new ArrayOfRandomFigures(arraySize, randomFiguresRange);
            arrayRandom.getArrayForSorting();

            arrayRandom.sortCurrentArray();
            System.out.print("\n\nSorted array of random figures is:\n");
            arrayRandom.getArrayForSorting();

            System.out.println("\n\nSort another array - enter \"1\", Exit - enter \"2\"");
            exitOrContinue = in.nextInt();

            if(exitOrContinue == 2){
                break;
            } else {
                System.out.print("\n");
            }
        }
    }
}
