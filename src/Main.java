public class Main {
    public static void main(String[] args) {
        {
          System.out.println("Задача 1");
      int clientOs=1;
      if (clientOs==1) {
          System.out.println("Установите версию приложения для по Android ссылке");
      } else if (clientOs==0) {
          System.out.println("Установите версию приложения для по IOS ссылке");
      } else {
            System.out.println("Незнакомое значение");
        }
            System.out.println("Задача 2");
      int clienOs= 1;
      int deviceYear= 2016;
      if (deviceYear<2015 && clienOs==0) {
          System.out.println("Установите облегченную версию приложения для IOS по ссылке");
      } else if (deviceYear<2015 && clienOs==1) {
          System.out.println("Установите облегченную версию приложения для Andriod по ссылке");
      } else if(deviceYear<=2015 && clienOs==0) {
          System.out.println("Установите  версию приложения для IOS по ссылке");
      } else if (deviceYear>=2015 && clienOs==1) {
          System.out.println("Установите версию приложения для Andriod по ссылке");
        }
            System.out.println("Задача 3");
        int year= 2000 ;
        if (year>1584 && year % 4==0  && year % 100!=0  || year % 400==0 ){
            System.out.println(year +"год является високосным");
        } else {
            System.out.println(year +"год не является високосным");
        }
        }
        System.out.println("Задача 4");
        int deliveryDistance = 100;
        if (deliveryDistance <20) {
            System.out.println("Потребуется дней: 1");}
        else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");}
        else if (deliveryDistance >=60 && deliveryDistance <100) {
            System.out.println("Потребуется дней: 3");}
        else {
            System.out.println("Доставки нет");}

        System.out.println("Задача 5");


        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");

            case 6:
            case 7:
            case 8:
                System.out.println("Лето");

            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default :
                System.out.println("Больше месяцев нет");
        }
    }






        }


