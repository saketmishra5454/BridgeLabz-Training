package collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pract {
	public static void main(String[] args) {
		
		
//		List<Integer> list = Arrays.asList(5,6,8,3,2,4,5,7,8,9);
//		
//		List<Integer> result = list.stream().filter(n->n%2 == 0).map(n->n*n).sorted().collect(Collectors.toList());
//		
//		System.out.println(result);
		
	
		
		List<String> list = new ArrayList<>();
		
		list.add("Saket");
		list.add("abhi");
		list.add("adi");
		
		Map<Integer,String> map = list.stream().collect(Collectors.toMap(x->x.length(),x->x));
		
		System.out.println(map);
		
		
	}

}
