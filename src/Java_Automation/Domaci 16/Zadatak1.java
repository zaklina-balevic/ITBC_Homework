package Java_Automation.Domaci

import java.util.ArrayList;

public class Zadatak1 {
    /*
Napraviti static metodu u main koje rade kao sql min, max, sum, avg i distinct u SQLu koristeci ArrayList<Integer>.
 Ne morate praviti drugu klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
 Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne tipove tipa int (za min, max i sum)
  i double (za avg)
     */
    public static void main(String[] args) {

        ArrayList<Integer> sql = new ArrayList<>();
        sql.add(10);
        sql.add(3);
        sql.add(15);
        sql.add(21);
        sql.add(3);
        sql.add(15);
        sql.add(12);
        sql.add(2);
        sql.add(20);
        sql.add(7);
        sql.add(17);

        int minResult = min(sql);
        int maxResult = max(sql);
        int sumResult = sum(sql);
        double avgResult = avg(sql);
        ArrayList<Integer> distinctResult = distinct(sql);

        System.out.println("Min: " + minResult);
        System.out.println("Max: " + maxResult);
        System.out.println("Sum: " + sumResult);
        System.out.println("Avg: " + avgResult);
        System.out.println("Distinct: " + distinctResult);


    }


    public static int min(ArrayList<Integer> sql) {
        int min = sql.get(0);
        for (int i = 0; i < sql.size(); i++) {
            if (min > sql.get(i)) {
                min = sql.get(i);
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> sql) {
        int max = sql.get(0);
        for (int i = 0; i < sql.size(); i++) {
            if (max < sql.get(i)) {
                max = sql.get(i);
            }

        }
        return max;
    }

    public static int sum(ArrayList<Integer> sql) {
        int sum = 0;
        for (int i = 0; i < sql.size(); i++) {
            sum += sql.get(i);
        }
        return sum;
    }

    public static double avg(ArrayList<Integer> sql) {
        int sum = 0;
        for (int i = 0; i < sql.size(); i++) {
            sum += sql.get(i);
        }
        return (double) sum / sql.size();
    }

    public static ArrayList<Integer> distinct(ArrayList<Integer> sql) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < sql.size(); i++) {
            if (!uniqueList.contains(sql.get(i))) {
                uniqueList.add(sql.get(i));
            }
        }
        return uniqueList;
    }

}
