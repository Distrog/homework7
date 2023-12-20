public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2495000) {
            total *= 1.01;
            total += salary;
            month++;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");

        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Задача 3");
        int population = 12000000;
        float birthRate = (float) 17 / 1000;
        float mortalityRate = (float) 8 / 1000;
        for (int i = 1; i <= 10; i++) {
            population += population * birthRate;
            population -= population * mortalityRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        System.out.println("Задача 4");
        int deposit = 15000;
        month = 0;
        while (deposit <= 12000000) {
            deposit += deposit * 0.07f;
            month++;
            System.out.println("Месяц " + month + ". Сумма какоплений равна " + deposit);
        }

        System.out.println("Задача 5");
        deposit = 15000;
        month = 0;
        while (deposit <= 12000000) {
            deposit += deposit * 0.07f;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Сумма какоплений равна " + deposit);
            }
        }

        System.out.println("Задача 6");
        deposit = 15000;
        month = 0;
        int lastMonth = 9 * 12;
        while (month != lastMonth) {
            deposit += deposit * 0.07f;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Сумма какоплений равна " + deposit);
            }
        }

        System.out.println("Задача 7");
        int firstMonthDay = 2;
        int days = 31;
        for (int i = firstMonthDay; i <= days; i++) {
            if ((i - firstMonthDay + 1) % 5 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("Задача 8");
        int cometYear = 79;
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;
        for (int i = startYear; i <= endYear; i++) {
            if (i % cometYear == 0) {
                System.out.println(i);
            }
        }
    }
}