package javacodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,1, 2, 10, 40, 40, 50, 50, 60, 70, 80, 90, 90, 100);

		Set<Integer> set = new HashSet<>();
		list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
	}

}
