public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }

        // Задание 2
        System.out.println("Задание 2");
        for (int m=10; m>=1; m--){
            System.out.println(m);
        }

        // Задание 3
        System.out.println("Задание 3");
        for (int l=0; l<=17; l=l+2){
            System.out.println(l);
        }

        // Задание 4
        System.out.println("Задание 4");
        for (int k=10; k>=-10; k--){
            System.out.println(k);
        }

        // Задание 1 ДЗ2
        System.out.println("Задание 1. ДЗ2");
        for (int y=1904; y<=2096; y=y+4){
            System.out.println(""+y+" год является високосным");
        }

        // Задание 2 ДЗ2
        System.out.println("Задание 2. ДЗ2");
        for (int i=7; i<=98; i=i+7){
            System.out.print(i +" ");
        }
        System.out.println();

        // Задание 3 ДЗ2
        System.out.println("Задание 3. ДЗ2");
        for (int i=1; i<=512; i=i*2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Задание 1 ДЗ3
        System.out.println("Задание 1. ДЗ3");
        int contribution = 29000;
        int sum = 0;
        for (int i=0; i<12; i++){
            sum += contribution;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sum+" рублей");
        }

        // Задание 2 ДЗ3
        System.out.println("Задание 2. ДЗ3");
        int contributionTwo = 29000;
        int sumWithPercent = 0;
        for (int i=0; i<12;i++){
            sumWithPercent = sumWithPercent + contributionTwo;
            sumWithPercent = sumWithPercent + sumWithPercent/100;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sumWithPercent+" рублей");
        }
    }
}