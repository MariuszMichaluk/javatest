import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private HashMap<String, Description> hashmap = new HashMap<String, Description>();
	Scanner scanner = new Scanner(System.in);
	
	private boolean isPesel(String str) {
		return str.matches("\\d{11}");
	}
	
	private void addCommand() {
		System.out.println("Wybrałeś komendę ADD");
		String pesel;
		while(true) {
		  System.out.println("Podaj pesel:");
		  pesel = scanner.next();
		  if(isPesel(pesel)) break;
		  System.out.println("Pesel jest nieprawidłowy");
		}
		  
		  System.out.println("Podaj imie:");
		  String imie = scanner.next();
		  System.out.println("Podaj nazwisko:");
		  String nazwisko = scanner.next();
		  Description description = new Description(imie, nazwisko);
		  hashmap.put(pesel, description);
	}
	
	private void findCommand() {
		System.out.println("Wybrałeś komendę FIND");
		  System.out.println("Podaj pesel:");
		  String pesel = scanner.next();
		  if(!hashmap.containsKey(pesel)) {
			  System.out.println("Nie ma osoby o takim numerze pesel!");
			  return;
		  }
		  Description description = hashmap.get(pesel);
		  System.out.println("Imie: " + description.name + " Nazwisko: " + description.surname);
	}
	private void remove() {
		System.out.println("Wybrałeś komendę REMOVE");
		  System.out.println("Podaj pesel:");
		  String pesel = scanner.next();
		 hashmap.remove(pesel);
	}
	private void list() {
		 for(Description d : hashmap.values())
			  System.out.println(d.name + " " + d.surname);
	}
	
   public static void main(String args[])
   {   
	   Main main = new Main();
	  while(true) {
		  System.out.println("Podaj komende:");
		  String komenda = main.scanner.next();
		  switch(komenda) {
		  case "ADD":
			  main.addCommand();
		  	break;
		  case "FIND":
			  main.findCommand();
			 break;
		  case "REMOVE":
			  main.remove();
			  break;
		  case "LIST":
			  main.list();		  
			  break;
		  default:
			  System.out.println("Wybrałeś nieprawidłową komendę");
		  }
	  }
   }
}
	  