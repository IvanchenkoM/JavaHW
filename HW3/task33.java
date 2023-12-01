/* Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task33 {
    public static void main(String[] args) {
        List<Integer> nums =  generateNums(10,1, 100);
        System.out.println("Список " + nums);
        task1(nums);
    }
    static List<Integer> generateNums(int countElemets, int min, int max){
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0 ; i < countElemets; i++){
            int randNums = rand.nextInt(max - min + 1) + min;
            nums.add(randNums);
        }
        return nums;
    }


    static void task1(List<Integer> numbers) {
        numbers.removeIf(num -> num % 2 == 0);

        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) < min){
                min = numbers.get(i);
            }
        }

        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum = numbers.get(i) + sum;
        }
        double srNum = sum / numbers.size();
        System.out.println("Список без чётных чисел " + numbers);
        System.out.println("Минимальное число списка: " + min);
        System.out.println("Максимальное число списка: " + max);
        System.out.println("Среднее значение списка: " + srNum);

    }
}