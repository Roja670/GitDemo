package practiceAllCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStream {
	
	//@Test
	public void regular()
	{
		ArrayList<String>names=new ArrayList<String>();
		names.add("Abhilash");
		names.add("John");
		names.add("Alekhya");
		names.add("Adan");
		names.add("Ram");
		
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"));
			{
				count++;
			}	
			
		}
		System.out.println(count);
		
	}
	//@Test
	public void streamFilter()
	{
		ArrayList<String>names=new ArrayList<String>();
		names.add("Abhilash");
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
		
		Long d=Stream.of("Abhilash","John","Ram","Alekhya","Adan","Rama").filter(s->
		{
			s.startsWith("A");
			return true;
			
		}).count();
		System.out.println(d);
		
		//print all the names of arraylist
				//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
	    //if you want only one result use limit(1)
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//printbnames which have last letter "a" with uppercase
		
		Stream.of("Abhilash","John","Ram","Alekhya","Adan","Rama").filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter as a with uppercase and sorted
		List<String>names1=Arrays.asList("Abhilash","John","Ram","Alekhya","Adan","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	//@Test
	public void concat()
	{
		ArrayList<String>names2=new ArrayList<String>();
		names2.add("Man");
		names2.add("Don");
		names2.add("Women");
		
		List<String>names3=Arrays.asList("Azhinash","John","Alekhya","Adan","Ram");
		Stream <String> newStream=Stream.concat(names2.stream(), names3.stream());
		
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adan"));
		
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	//collect
	@Test
	public void streamCollect() {
		
	     List<String> ls=Stream.of("Abhilash","John","Ram","Alekhya","Adan","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
	     System.out.println(ls.get(0));
	     
	     List<Integer> values=Arrays.asList(3,2,2,7,5,1,7,9);
	   //print unique number from this array.
			//values.stream().distinct().forEach(s->System.out.println(s));
			
			//sort the array give the 3rd index
	     List<Integer>li=values.stream().distinct().sorted().collect(Collectors.toList());
	     System.out.println(li.get(2));
	

	}
	
}
		
			
	
