package months;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        System.out.println(months);

        months.add(7, new Month("August"));

        System.out.println(months);

        HashSet<Month> months1 = new HashSet<>();

        months1.add(new Month("January"));
        months1.add(new Month("February"));
        months1.add(new Month("March"));
        months1.add(new Month("january"));

        System.out.println("for");

        for (Month m : months1) {
            System.out.println(m);
        }

        System.out.println("iterator");

        Iterator<Month> iterator = months1.iterator();

        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month);
        }

    }
}