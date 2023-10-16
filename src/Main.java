public class Main {
     public static void main(String[] args) {

        System.out.println("Задача1");
        for (int i =1;i<=10 ; i =i+1) {
             System.out.println(i );
        }
         System.out.println("Задача2");
         for (int i =10; i>0; i =i-1) {
             System.out.println(i);
         }
         System.out.println("Задача3");
         for (int i =0;i<=17 ; i =i+2) {
             System.out.println(i );
         }
         System.out.println("Задача4");
         for (int i =10;i>=-10 ; i =i-1) {
             System.out.println(i );
         }
         System.out.println("Задача5");
         for (int i =1904;i<=2096 ; i =i+4) {
             System.out.println("Год является високосным"+i );
         }
         System.out.println("Задача6");
         for (int i =7;i<=98 ; i =i + 7) {
             System.out.println(i );
         }
         System.out.println("Задача7");
         for (int i =1;i<=512 ; i =i * 2) {
             System.out.println(i );
         }
         System.out.println("Задача8");
         int everyMonth=29000;
         int total=0;
         for (int i=0; i<=12; i++) {
            total= total+ everyMonth;
             System.out.println("Месяц"+i+"Сумма накоплений равна"+total+"рублей");

         }
         System.out.println("Задача9");
         int every=29000;
         int totaly=0;
         for (int i=0; i<=12; i++) {
             totaly= totaly + totaly/100;
             totaly= totaly+ everyMonth;

             System.out.println("Месяц"+i+ "Сумма накоплений равна" +totaly + "рублей" );
         }
         System.out.println("Задача10");
         int number=1;
         for (int i =1;i<=10 ; i =i+1) {
             number= i * 2;
             System.out.println("2 * " + i + " = " + 2 * i );
         }















     }

    }

