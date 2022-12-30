import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void cheackingLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void cheackingDevice(int yearOfRelease, int operatingSystem) {
        if (yearOfRelease <= 2015 && operatingSystem == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (yearOfRelease <= 2015 && operatingSystem == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (yearOfRelease >= 2015 && operatingSystem == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        }
        if (yearOfRelease >= 2015 && operatingSystem == 1) {
            System.out.println("Установите приложениe для Android по ссылке");
        }
    }

    public static void cheackingDistanceOrder(int distance) {
        if (distance > 0 && distance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (distance > 60 && distance <= 100){
            System.out.println("Потребуется дней: 3");
        }
        if (distance > 100){
            System.out.println("Доставки нет");
        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        int year = 3031;
        cheackingLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        int operatingSystem = 1;
        cheackingDevice(currentYear, operatingSystem);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        cheackingDistanceOrder(deliveryDistance);
    }
}