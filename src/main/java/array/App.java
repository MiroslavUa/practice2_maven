package array;
import arraysorting.ArrayOfRandomFigures;

public class App {
    public static void main(String[] args) {

        run();

    }

    public static void run() {

        ArrayOfRandomFigures arrayOne = new ArrayOfRandomFigures(10, 'a'); /* a = 97 в таблице ASCII.
        Просто интересно было проверить, сработает ли такой код */
        ArrayOfRandomFigures arrayTwo = new ArrayOfRandomFigures(20, 200);
        ArrayOfRandomFigures arrayThree = new ArrayOfRandomFigures(30, 1000);

        System.out.println("Elements in arrays before sort:");

        arrayOne.getArrayForSorting();
        System.out.print("\n");
        arrayTwo.getArrayForSorting();
        System.out.print("\n");
        arrayThree.getArrayForSorting();
        System.out.print("\n");

        arrayOne.sortCurrentArray();
        arrayTwo.sortCurrentArray();
        arrayThree.sortCurrentArray();

        System.out.println("\nElements in arrays after sort:");
        arrayOne.getArrayForSorting();
        System.out.print("\n");
        arrayTwo.getArrayForSorting();
        System.out.print("\n");
        arrayThree.getArrayForSorting();
        System.out.print("\n");
    }
}
