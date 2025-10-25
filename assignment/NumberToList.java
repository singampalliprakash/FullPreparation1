package assignment;

import java.util.ArrayList;
import java.util.List;

public class NumberToList {
	public static void main(String[] args) {
        int n = 2342;
        System.out.println(numberToList(n));
    }

    public static List<Integer> numberToList(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(0, n % 10);
            n /= 10;
        }

        return list;
    }
}
