package com.company;

public class Main {

    public static void main(String[] args) {
	// task 1
        int clientOS =1;
        if ( clientOS ==0 ){
            System.out.println(" ���������� ������ ���������� ��� IOS �� ������");
        } else {
            System.out.println(" ���������� ������ ���������� ��� Android �� ������");
        }
            //Task 2
int clientDeviceYear =2014;
        int clientAnd = 1;
        if(clientAnd ==1 && clientDeviceYear >=2015){
            System.out.println(" ���������� ������ ���������� ��� Android �� ������");
        }else {
            System.out.println("���������� �����������  ������ ���������� ��� Android �� ������");
        }
        int clientIOS=0;
        if (clientIOS ==0 && clientDeviceYear >= 2015){
            System.out.println(" ���������� ������ ���������� ��� IOS �� ������");
        } else {
            System.out.println("���������� �����������  ������ ���������� ��� IOS �� ������");
        }

        //Task 3
int year = 2020;
        boolean isYearLeap =(year % 4 ==0 )|| (year % 100 == 0) && ( year % 400==0);
if (isYearLeap) {
    System.out.println("��� �������� ����������");
} else {
    System.out.println(" ��� �� �������� ����������");
}


        //Task 4
        int deliveryDistance= 95;
int deliveryDays =1;
        if (deliveryDistance <=20){
            System.out.println(" �����������: " + deliveryDays + " ����.");
        }else if (deliveryDistance>20 && deliveryDistance<= 60){
            System.out.println(" �����������:" + (deliveryDays + 1) + "���." );
        }else if ( deliveryDistance>60 && deliveryDistance<=100){
            System.out.println(" �����������: "+ (deliveryDays+2) + " ���.");
        } else {
            System.out.println(" �������� �� ������������.");
        }


        //Task 5
        int monthNumber=12;
        switch ( monthNumber ){
            case 1:
                System.out.println("������");
                break;
            case 2:
                System.out.println("�������");
                break;
            case 3:
                System.out.println("����");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("���");
                break;
            case 6:
                System.out.println("����");
                break;
            case 7:
                System.out.println("����");
                break;
            case 8:
                System.out.println("������");
                break;
            case 9:
                System.out.println("��������");
                break;
            case 10:
                System.out.println("�������");
                break;
            case 11:
                System.out.println("������");
                break;
            case 12:
                System.out.println("�������");
                break;
            default:
                System.out.println("������ ������ �� ����������.");
        }
        }
    }

