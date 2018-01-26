import java.util.*;

public class Hashmap {
   public static void main(String args[]) {
	  
	  HashMap<String, Description> hashmapka = new HashMap<>();
	  
	  hashmapka.put("1234567890", new Description("Kasia", Description.Gender.KOBIETA));
	  hashmapka.get("1234567890");
	  hashmapka.put("1234567890", new Description("Andrzej", Description.Gender.FACET));
	  hashmapka.get("1234567890");
	  for(Description d : hashmapka.values())
		  System.out.println(d.name);
/*
	  obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");

	  System.out.println("Currently the array list has following elements:"+obj);

	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  obj.remove("Chaitanya");
	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);

	  obj.remove(1);
	  obj.remove(0);

	  System.out.println("Current array list is:"+obj);*/
   }
}