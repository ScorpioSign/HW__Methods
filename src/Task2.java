import java.time.LocalDate;
import java.util.Scanner;

public class Task2 {
    // У банка появилось мобильное приложение. Когда пользователь заходит на сайт с телефона,
    // ему предлагается скачать приложение с учетом операционной системы и года выпуска телефона.
    //Ваша задача — написать программу, которая выдает соотв. сообщение клиенту при наличии двух условий.
    //Если год выпуска ранее текущего года, то к сообщению об установке нужно добавить информацию об
    // облегченной версии:
    //Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
    //Для Android: «Установите облегченную версию приложения для Android по ссылке».
    //Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
    //Если устройство старше текущего года, предложите ему установить облегченную версию.
    //Текущий год можно получить таким способом:
    //int currentYear = LocalDate.now().getYear();
    //Или самим задать значение вручную — ввести в переменную числовое значение.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите год выпуска: ");
        int year = scn.nextInt();
        System.out.print("Введите тип операционной системы (0 — iOS, 1 — Android): ");
        int os = scn.nextInt();

        suggestVersion(year, os);

    }
    public static void suggestVersion(int clientDeviceYear, int clientOS){
        int currentYear = LocalDate.now().getYear();
        System.out.print("Установите ");
        if (clientDeviceYear < currentYear) {
            System.out.print("облегченную ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS по ссылке");
        } else {
            System.out.println("Android по ссылке");

        }
    }
}
