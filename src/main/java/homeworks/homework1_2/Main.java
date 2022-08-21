package homeworks.homework1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        Scanner in1 = new Scanner(System.in);
        Integer inSize = in1.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        Scanner in2 = new Scanner(System.in);
        Integer in = in2.nextInt();
        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inSize; i++) list.add(random.nextInt(in));
        System.out.print("Вот случайный список: ");
        list.forEach(System.out::print);
        System.out.println("\nПросим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        Scanner in3 = new Scanner(System.in);
        int treshold = in2.nextInt();
        Filter filter = new Filter(treshold);
        System.out.println("Запускаем фильтрацию: ");
        List<Integer> res = filter.filterOut(list);
        System.out.println("Выводим результат на экран: ");
        System.out.print("Отфильтрованный список: ");
        res.forEach(System.out::print);
        System.out.println("\nЗавершаем программу");
    }
}
