package javacodes;

import java.util.Arrays;
import java.util.List;

public class LimitSkipOperation {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 2, 10, 40, 40, 50, 50, 60, 70, 80, 90, 90, 100);
		list.stream().limit(9).forEach(x -> System.out.println(x));  //o/p:1 1 2 10 40 40 50 50 60

		List<Integer> list2 = Arrays.asList(5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		list2.stream().skip(9).forEach(x -> System.out.println(x));   //o/p:15 16 17 18 19

	}

}
