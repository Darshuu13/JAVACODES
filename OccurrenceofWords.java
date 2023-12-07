package javacodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceofWords {

	
	public static void main(String[] args) {
		
		String str="Hello coders welcome to the the coding world world coders";
		List<String> list= Arrays.asList(str.split(" "));
		
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
		
	}
}
