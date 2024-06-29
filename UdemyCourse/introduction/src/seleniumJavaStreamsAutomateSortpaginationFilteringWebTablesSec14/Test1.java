package seleniumJavaStreamsAutomateSortpaginationFilteringWebTablesSec14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Test1 {
	
	//@Test
	public void regular()
	{
		ArrayList<String>names=new ArrayList<String>();
		names.add("Abhinash");
		names.add("John");
		names.add("Alekhya");
		names.add("Adan");
		names.add("Ram");
		
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void streamfilter()
	{
		ArrayList<String>names=new ArrayList<String>();
		names.add("Abhinash");
		names.add("John");
		names.add("Alekhya");
		names.add("Adan");
		names.add("Ram");	
		
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if inter op (filter) returns true.
		//we can create stream
		//how to use filter in stream API
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		
		Long d=Stream.of("Abhinash","John","Alekhya","Adan","Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		//print all the names of arraylist
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//if you want only one result
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//printbnames which have last letter "a" with uppercase
		Stream.of("Abhinash","John","Alekhya","Adan","Ram").filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter as a with uppercase and sorted
		List<String>names1=Arrays.asList("Azhinash","John","Alekhya","Adan","Ram");
		names1.stream().filter(s->s.startsWith("A"))
		.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Stream.of("Azhinash","John","Alekhya","Adan","Ram").filter(s->s.startsWith("A"))
		//.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
		
		

	
	
}
