import java.util.ArrayList;
import lib.Person;

class Main {
  public static void main(String[] args){

  

    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();
    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<Integer> number = new ArrayList<>();

    Person p1 = new Person(20, "Yellow", 29);

    number.add(10);
    number.add(20);
    number.add(30);
    number.add(40);
    number.add(50);
    number.add(60);
    number.add(70);
    number.add(80);
    number.add(90);
    number.add(100);


    for(int i=0; i <number.size(); i++){
      System.out.println(number.get(i));
    }
    

    // Add elements to ArrayList
    languages.add("Fahim");
    languages.add("Rashed Bhai");
    languages.add("Pavel");
    persons.add(p1);
    persons.add(new Person());
    persons.add(new Person(10, "Rakib Hasan", 28));
    
  
    System.out.println("ArrayList: " + languages);
    System.out.println("ArrayList: " + persons);

    languages.forEach(name -> {
      System.out.println("hello Bangladesh");
    });
  }
}