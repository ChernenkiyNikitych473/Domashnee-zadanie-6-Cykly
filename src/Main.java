public class Main {
    public static void main (String[] args) {
        System.out.println("Задача №1");
        System.out.println("Задача №1");
        // С помощью цикла for выведите в консоль все числа от 1 до 10
        System.out.println("Решение задачи №1");
        // Решение задачи №1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Значение " + i);
        }
        System.out.println("Задача №2");
        // С помощью цикла for выведите в консоль все числа от 10 до 1
        System.out.println("Решение задачи №2");
        // Решение задачи №2
        for (int i = 10; i >= 1; i--) {
            System.out.println("Значение " + i);
        }
        System.out.println("Задача №3");
        // Выведите в консоль все четные числа от 0 до 17
        System.out.println("Решение задачи №3");
        // Решение задачи №3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Значение " + i);
        }
        System.out.println("Задача №4");
        // Выведите в консоль все четные числа от 10 до -10 от большего числа к меньшему
        System.out.println("Решение задачи №4");
        // Решение задачи №4
        for (int i = 10; i >= -10; i--) {
            System.out.println("Значение " + i);
        }
        System.out.println("Задача №5");
        // Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным»
        System.out.println("Решение задачи №5");
        // Решение задачи №5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача №6");
        // Напишите программу, которая выводит в консоль последовательность чисел: 1 2 4 8 16 32 64 128 256 512
        System.out.println("Решение задачи №6");
        // Решение задачи №6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Значение " + i);
        }
        System.out.println("Задача №7");
        // Напишите программу, которая выводит в консоль последовательность чисел: 1 2 4 8 16 32 64 128 256 512
        System.out.println("Решение задачи №7");
        // Решение задачи №7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Значение " + i);
        }
        System.out.println("Задача №8");
        // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей»
        System.out.println("Решение задачи №8");
        // Решение задачи №8
        int deposit = 30000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + deposit;
            System.out.println("Месяц " + i + " : сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача №9");
        // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей»
        System.out.println("Решение задачи №9");
        // Решение задачи №9
        deposit = 30000;
        sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + sum / 100;
            sum = sum + deposit;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача №10");
        // Напишите программу, которая выводит в консоль таблицу умножения на 2:2*1=2 2*2=4 2*3=6 2*4=8 2*5=10 2*6=12 2*7=14 2*8=16 2*9=18 2*10=20
        System.out.println("Решение задачи №10");
        // Решение задачи №10
        for (int i = 0; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }
}
