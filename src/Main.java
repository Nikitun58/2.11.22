public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1.1");
        int salary=65535;
        int total=0;
        int i=0;
        while (total<=2459000){
            i++;
            total=total+15_000;
            System.out.println("Месяц "+i+ " сумма накоплений равна "+total+ " рублей");
        }

        // Задача 1.2
        System.out.println("Задача 1.2");
        for (int t=10; t>=1; t--){
            System.out.print(" "+t);
        }
        System.out.println();
        int p=0;
        while (p<10){p++;
            System.out.print(" "+p);}

        System.out.println();
        // Задача 1.3
        System.out.println("Задача 1.3");
        int populationCityY=12_000_000;
        int birthpopulationOneYeas=populationCityY/1000*17;
        int deadOneYeas=populationCityY/1000*8;
        for (int y=1; y<=10; y++){
            populationCityY=populationCityY+birthpopulationOneYeas-deadOneYeas;
            System.out.println("Год "+y+" численность населения составляет "+populationCityY);
        }
        // Задача 2.1
        System.out.println("Задача 2.1");
        int contributionVaciliya =15_000;
        int tol=0;
        int m=0;
        while (contributionVaciliya<=2459000){
            m++;
            tol=tol+contributionVaciliya/100*7;
            contributionVaciliya=contributionVaciliya+tol;
            System.out.println("Месяц "+m+ " сумма с % "+contributionVaciliya);
        }



        }





    }