package vtb.skripova;

public class Main {

    public static void main(String[] args) {
        //стоимость бензина
        {double benz, liter, cost;
            benz = 49.78;
            liter=52.382;
            cost=benz*liter;
            System.out.println("стоимость=");
            System.out.println(cost);
            System.out.println(" ");
        }

        //зарплата на руки
        {double zarplata;
            double ruki;
            double ndfl=0.13;
            zarplata=184123;
            ruki=zarplata-zarplata*ndfl;
            System.out.println("зарплата на руки=");
            System.out.println(ruki);
            System.out.println(" ");
        }

        //секунды в часы
        {double sec=1800;
            double hour;
            double sechour=3600;
            hour=sec/sechour;
            System.out.println("часы=");
            System.out.println(hour);
        }
    }
}
