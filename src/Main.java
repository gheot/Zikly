public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1");
        System.out.println("Task 1");
        int total = 0;
        int b = 1;
        while (total <= 2_459_000) {
            total = total + 29000;
            total = total + total / 100;
            System.out.println("Месяц " + b + ", сумма накоплений равна " + total + " рублей");
            b++;
        }


        System.out.println("task2");

        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("task3");
        int population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deathRate = (double) 8 / 1000;
        for (int j = 1; j < 11; j++) {
            population = population + (int) (population * birthRate) - (int) (population * deathRate);
            System.out.println("Год - " + j + ", численность населения составляет " + population);
        }


        System.out.println("part 2");
        System.out.println("task 1");
        int totalTwo = 15000;
        int u = 1;
        while (totalTwo <= 12000000) {
            totalTwo = totalTwo + totalTwo * 7 / 100;
            System.out.println("Месяц " + u + ", сумма накоплений равна " + totalTwo + " рублей");
            u++;
        }
        System.out.println("task2");

        int t = 1;
        int total3 = 15000;
        System.out.println("НЕ СМОГЛА РЕШИТЬ ЭТУ ЗАДАЧУ");


        System.out.println("task3");
        System.out.println("НЕ СМОГЛА РЕШИТЬ, ТАК КАК ОНА АНАЛОГИЧНА ВТОРОЙ");


        System.out.println("task4");
        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {

            System.out.println("Сегодня пятница " + friday + "-ое число. Необходимо подготовить отчет.");


        }

        System.out.println("part3");
        System.out.println("task1");
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year < end; year++) {
            if (year % 79 == 0) {

                System.out.println(year);
            }
        }
        System.out.println("task2");


        int number = 1;
        for (; number <= 10; number++) {

            int product = number * 2;
            System.out.println("2*" + number + " = " + product);

        }
    }


}


