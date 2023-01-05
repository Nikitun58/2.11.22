public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1.1");
        int salary = 65535;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            i++;
            total = total + 15_000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        // Задача 1.2
        System.out.println("Задача 1.2");
        for (int t = 10; t >= 1; t--) {
            System.out.print(" " + t);
        }
        System.out.println();
        int p = 0;
        while (p < 10) {
            p++;
            System.out.print(" " + p);
        }

        System.out.println();
        // Задача 1.3
        System.out.println("Задача 1.3");
        int populationCityY = 12_000_000;
        int birthpopulationOneYeas = populationCityY / 1000 * 17;
        int deadOneYeas = populationCityY / 1000 * 8;
        for (int y = 1; y <= 10; y++) {
            populationCityY = populationCityY + birthpopulationOneYeas - deadOneYeas;
            System.out.println("Год " + y + " численность населения составляет " + populationCityY);
        }
        // Задача 2.1
        System.out.println("Задача 2.1");
        int contributionVaciliya = 15_000;
        int tol = 0;
        int m = 0;
        while (contributionVaciliya <= 2459000) {
            m++;
            tol = tol + contributionVaciliya / 100 * 7;
            contributionVaciliya = contributionVaciliya + tol;
            System.out.println("Месяц " + m + " сумма с % " + contributionVaciliya);

            // Задача 2.2
            System.out.println("Задача 2.2");
            int contributionVaciliya2 = 15_000;
            int tol2 = 0;
            int m2 = 0;
            while (contributionVaciliya2 <= 2459000) {
                m2++;
                tol2 = tol2 + contributionVaciliya2 / 100 * 7;
                contributionVaciliya2 = contributionVaciliya2 + tol2;
                if (m2 % 6 ==0) {
                    System.out.println("Месяц " + m2 + " сумма с % " + contributionVaciliya2);
                }
            }

            // Задача 2.3
            System.out.println("Задача 2.3");
            int contributionVaciliya3 =15_000;
            int tol3=0;
            for (int m3=0;m3<=108;m3++){
                tol3=tol3+contributionVaciliya3/100*7;
                contributionVaciliya3=contributionVaciliya3+tol;
                if(m3 % 6 ==0){
                System.out.println("Месяц "+m3+ " сумма с % "+contributionVaciliya3);}}
        }
            //Задача % 2.4
            System.out.println("Задача 4");
            int fistFridayOfMount= 5;
            while (fistFridayOfMount<31){
                System.out.println("сегодня пятница "+fistFridayOfMount+" число пора готовить отчет ");
                fistFridayOfMount=fistFridayOfMount+7;
                }
            //Задача №3.1
            System.out.println("Задача №3.1");
            int completion=2022;
            for ( int beforeTheStart=0; beforeTheStart<=completion+100;beforeTheStart+=79){
                if(beforeTheStart>=completion-200 && beforeTheStart<=completion+100)
                    System.out.println(beforeTheStart);
            }
        //Задача №3.1
        System.out.println("Задача №3.1");
            int plus=2;
            for (int pl=1;pl<=10;pl++){
                System.out.println(plus+" * "+pl+" = "+plus*pl);
                }











    }}





