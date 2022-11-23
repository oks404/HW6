public class Main {
    public static void main(String[] args) {
//  Задание 1.1
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
//  Задание 1.2
        for (int a = 10; a >= 1; a--){
            System.out.println(a);
        }
//  Задание 1.3
        for (int b = 0; b <= 17; b = b + 2){
            System.out.println(b);
        }
//  Залание 1.4
        for (int c = 10; c >= -10; c--){
            System.out.println(c);
        }
//  Задание 2.1
        for (int d = 1904; d <= 2096; d = d +4){
            System.out.println(d + " год является високосным");
        }
//  Задание 2.2
        for (int e = 7; e <= 98; e = e +7){
            System.out.println(e);
        }
//  Задание 2.3
        for (int f = 1; f <= 512; f = f * 2){
            System.out.println(f);
        }
//  Задание 3.1
        int salary = 29000;
        int total = 0;
        for (int g = 1; g <= 12; g++){
            total = total + salary;
            System.out.println("Месяц " + g + " сумма накоплений - " + total);
        }


    }
}