package com.company;

public class Main {

    public static void main(String[] args) {
	// task 1
        int clientOS =1;
        if ( clientOS ==0 ){
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке.");
        }
            //Task 2
int clientDeviceYear =2014;
        int clientAnd = 1;
        if(clientAnd ==1 && clientDeviceYear >=2015){
            System.out.println(" Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        int clientIOS=0;
        if (clientIOS ==0 && clientDeviceYear >= 2015){
            System.out.println(" Установите версию приложения для IOS по ссылке ");
        } else {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }

        //Task 3
int year = 2020;
        boolean isYearLeap =(year % 4 ==0 )|| (year % 100 == 0) && ( year % 400==0);
if (isYearLeap) {
    System.out.println("Год является високосным");
} else {
    System.out.println("Год не является високосным ");
}


        //Task 4
        int deliveryDistance= 95;
int deliveryDays =1;
        if (deliveryDistance <=20){
            System.out.println(" Потребуется: " + deliveryDays + " дней.");
        }else if (deliveryDistance>20 && deliveryDistance<= 60){
            System.out.println(" Потребуется:" + (deliveryDays + 1) + "дня." );
        }else if ( deliveryDistance>60 && deliveryDistance<=100){
            System.out.println(" Потребуется: "+ (deliveryDays+2) + " дня.");
        } else {
            System.out.println(" Доставка не производится.");
        }


        //Task 5
        int monthNumber=12;
        switch ( monthNumber ){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
        }
    }

