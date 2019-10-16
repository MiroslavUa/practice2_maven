package arraysorting;

public class ArrayOfRandomFigures {
    private int[] arrayForSorting;
    private int sizeOfArray;
    private int range; //диапазон выбора случайных чисел, которые будут размещены в массиве

    public ArrayOfRandomFigures(int sizeOfArray, int range) {
        arrayForSorting = new int[sizeOfArray];

        for (int i = 0; i < arrayForSorting.length; i++) {
            arrayForSorting[i] = (int) (Math.random()*range); /*как работает Math.random() не понимаю, равно как и то,
            почему выражение (Math.random()*range) задает ограничение на выбор случайных чисел. Данное выражение нашел на
            stackoverflow ;) */
        }
    }

    public void getArrayForSorting() {
        for (int i = 0; i < arrayForSorting.length; i++) {
            System.out.print (arrayForSorting[i] + " ");
        }
    }

    public void sortCurrentArray() {
        for (int i = 0; i < this.arrayForSorting.length; i++) {

            /*Предположим, что первый элемент массива является минимальным */
            int assumedMinimalValue = this.arrayForSorting[i];
            int indexLessValue = i;

            /*В оставшейся части массива ищем элемент, который может оказаться меньше предположенного минимума*/
            for (int j = i+1; j < this.arrayForSorting.length; j++) {
                //Если такой элемент получиться найти, запоминаем его индекс в массиве
                if (this.arrayForSorting[j] < assumedMinimalValue) {
                    assumedMinimalValue = this.arrayForSorting[j];
                    indexLessValue = j; //сохранение номера элемента в массиве, значение которого меньше предположенного
                }
            }

            /*Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами*/
            if (i != indexLessValue) {
                int temporary = this.arrayForSorting[i];
                this.arrayForSorting[i] = this.arrayForSorting[indexLessValue];
                this.arrayForSorting[indexLessValue] = temporary;
            }
        }

    }
}