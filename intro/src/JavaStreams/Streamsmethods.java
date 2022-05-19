package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streamsmethods {

	@Test
	public void Regular() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Axar");
		names.add("Akash");
		names.add("Rahul");
		names.add("Deepak");
		names.add("Umar");
		names.add("Anand");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(c);

	}
	@Test
	public void StreamMap() {
		
		Stream.of("Axar","Akhay","Anudeep","Deepak","Umar").filter(s->s.endsWith("r")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//converting Arrays to List Then Stream method applying to list
		List<String> names=Arrays.asList("Axar","       ","Akhay","Anudeep","Deepak","Umar","Akbar","Bachanpandey");
		names.stream().filter(s->s.length()>5).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	
	}
	
	

}
