import insurance.FortuneInsurance;
import insurance.PeopleInsurance;
import people.People;

public class Main {
    public static void main(String[] args) {


    People people = new People("Marek", "Warszawa", "640395384", false);
    People people1 = new People("Paweł", "Kraków", "948214053", true);
    FortuneInsurance fortuneInsurance1 = new FortuneInsurance("Przedmioty poniżej 1000 złoty", "12 miesięcy", 200, 800, "0 - 1000 zł");
    FortuneInsurance fortuneInsurance2 = new FortuneInsurance("Przedmioty powyżej 1000 złoty", "12 miesięcy", 700, 2000, "1000 - 10000 zł");
    PeopleInsurance peopleInsurance1 = new PeopleInsurance("Ubezpieczenie zdrowotne dla jednej osoby", "12 miesięcy", 300, 1000, "1");
    PeopleInsurance peopleInsurance2 = new PeopleInsurance("Ubezpieczenie zdrowotne dla kilku osób", "12 miesięcy", 1000, 3000, "2 - 5");

    System.out.println(people);
    System.out.println(people1);



    }
}