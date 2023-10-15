public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOs=0;
        int clientAnd=1;
        if (clientOs<clientAnd) {
            System.out.println("Установите версию приложения для по IOS ссылке");
        } else {
            System.out.println("Установите версию приложения для по Android ссылке");
        }
        System.out.println("Задача 2");
        int clientDeviceYear= 2015;
        if (clientDeviceYear>=2015) {
            System.out.println("Установка приложения");
        } else {
            System.out.println("Установите облегченную версию приложения");
        }
        System.out.println("Задача 3");
        int year= 2021;
        if (year>1584) {
            System.out.println(year+"год не является високосным");
        }else {
            System.out.println(year+"год является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance= 95;
        if(deliveryDistance>100){
            System.out.println("Доставки нет");
        } else  {
                int days=1;
        if (deliveryDistance>20){
          days++;
        }
          if(deliveryDistance>60){
              days++;
              System.out.println("Количество дней"+days);
          }
        }
        System.out.println("Задача 5");
        {
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
}