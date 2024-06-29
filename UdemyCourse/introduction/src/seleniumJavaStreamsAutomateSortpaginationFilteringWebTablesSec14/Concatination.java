package seleniumJavaStreamsAutomateSortpaginationFilteringWebTablesSec14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Concatination {
	    @Test
		public void concat()
		{
			ArrayList<String>names=new ArrayList<String>();
			names.add("Man");
			names.add("Don");
			names.add("Women");
			
			
			List<String>names1=Arrays.asList("Azhinash","John","Alekhya","Adan","Ram");
			Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
			
			//newStream.sorted().forEach(s->System.out.println(s));
			boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adan"));
			System.out.println(flag);
			Assert.assertTrue(flag);
		}
			@Test
			public void streamCollect()
			{
			//Collect
			List<String>ls=Stream.of("Abhinash","John","Alekhya","Adan","Ram").filter(s->s.endsWith("a"))
			.map(s->s.toUpperCase()).collect(Collectors.toList());
			System.out.println(ls.get(0));
			
			
			List<Integer>values=Arrays.asList(3,2,2,7,5,1,7,9);
			//print unique number from this array.
			//values.stream().distinct().forEach(s->System.out.println(s));
			
			//sort the array give the 3rd index
			List<Integer>li=values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(2));
			
		}

}
