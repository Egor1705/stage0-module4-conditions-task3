package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {

    public void amountOfDays(int month) {
        if(month%2!=0) {

            if(month<=7 && month >=1) {
                System.out.println("31");
            }
            else if (month<=11 && month>=9) {
                System.out.println("30");
            }
            else {
                System.out.println("wrong number!");
            }

        }
        else if (month==2) {
            System.out.println("28");
        }

        else if(month%2==0){
            if(month<=6 && month >=4) {
                System.out.println("30");
            }
            else if (month<=12 && month>=8) {
                System.out.println("31");
            }
            else {
                System.out.println("wrong number!");
            }
        }

    }
}
