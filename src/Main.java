import java.util.List;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        snakeSort();
        uniqueU();
        fib();
    }

    public static void uniqueU() {
        int limit = 10;
        SortedSet<Integer> result = UniqueU48.generateU(limit);
        System.out.println("48. Ряд уникальных чисел: ");
        System.out.println(result);
    }

    public static void snakeSort() {

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("47. Первый массив");
        for(int i = 0; i < array1.length; i++)
            for (int j = 0; j < array1.length; j++)
                array1[i][j] = (int) (Math.random() * 10);
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++)
                System.out.print(array1[i][j] + " ");
            System.out.println(" ");
        }

        List<Integer> result1 = Snake47.snail(array1);
        System.out.println("Отсортированный массив");
        System.out.println(result1);


    }


    public static void fib() {
        int n = 10;
        int result = fib49.fib(n);
        System.out.print("49. Число " + n + " в последовательности фиббоначи равно: " + result);
        System.out.println("");
    }
}
