package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer arg0) {
		// TODO Auto-generated method stub
		System.out.println("Value is "+arg0);
	}
}

public class DemoTest1 {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(4);list.add(2);list.add(7);list.add(3);list.add(8);list.add(2);
	list.add(1);list.add(4);list.add(9);list.add(2);list.add(5);list.add(7);
	list.add(6);list.add(8);list.add(2);list.add(1);list.add(3);list.add(6);
	/*System.out.println("Using for each loop");
	for(int a:list) {
		System.out.println(a);
	}
	System.out.println("Using Iterator");
	Iterator<Integer> li = list.iterator();
	while(li.hasNext()) {
		int n = li.next();
		System.out.println(n);
	}*/
	System.out.println("Using lambda expression");
	//list.stream().forEach((val)->System.out.println(val));
	//list.stream().filter(v->v%2==0).forEach(value->System.out.println(value));
	//list.stream().filter(v->v%2!=0).forEach(value->System.out.println(value));
	
	//list.stream().distinct().forEach(value->System.out.println(value));
	
	//Optional<Integer> op1= list.stream().filter(v->v==100).findAny();
	/*Optional<Integer> op1= list.stream().filter(v->v==4).findFirst();
	if(op1.isPresent()) {
		System.out.println("yes");
	}else {
		System.out.println("No");
	}
	*/
	System.out.println("Number of records are "+list.size());
	
	List ll = list.stream().filter(v->v==4).collect(Collectors.toList());
	
	System.out.println("Number of records are "+ll.size());
	
	//Stream<Integer> ll1 = list.stream();	// converting list to stream 
	
	//Consumer<Integer> cc = new MyConsumer();
	
	//ll1.forEach(cc);
	}

}
