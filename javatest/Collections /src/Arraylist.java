
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
   public static void main(String args[]) {
	  Scanner scanner = new Scanner(System.in);
	  String imie = scanner.next();
	  String gender = scanner.next();
	  System.out.println("Imie: " + imie + " plec: " + gender);
	  scanner.close();
	  List<Description> obj = new ArrayList<Description>(); 
	  obj.add(new Description("Asia", Description.Gender.KOBIETA));
	  obj.add(new Description("Paweł", Description.Gender.FACET));
	  obj.add(new Description("Marzena", Description.Gender.KOBIETA));
	  obj.add(new Description("Adrianna", Description.Gender.KOBIETA));
	  obj.add(new Description("Piotr", Description.Gender.FACET));
	  obj.add(new Description("Adrian", Description.Gender.FACET));
	  obj.add(new Description("Dawid", Description.Gender.FACET));
	  obj.add(new Description("Klaudia", Description.Gender.KOBIETA));
	  obj.add(new Description("Piotrek", Description.Gender.FACET));
	  obj.add(new Description("Andrzej", Description.Gender.FACET));
	  for(Description d : obj)
		  System.out.println(d.name);
	  
	  for(int i = 0; i < obj.size(); ++i)
		  if(obj.get(i).plec == Description.Gender.FACET)
			  System.out.println(obj.get(i).name);
	  
	 
//	  obj.add("Ajeet");
//	  obj.add("Harry");
//	  obj.add("Chaitanya");
//	  obj.add("Steve");
//	  obj.add("Anuj");

	  System.out.println("Currently the array list has following elements:"+obj);

//	  obj.add(0, "Rahul");
//	  obj.add(1, "Justin");

//	  obj.remove("Chaitanya");
//	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);

	  obj.remove(1);
	  obj.remove(0);

	  System.out.println("Current array list is:"+obj);
   }
}