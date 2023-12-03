import insurance.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        FortuneInsurance insurance1 = new FortuneInsurance("Ubezpieczenie na przedmiot o wartości poniżej 1 000 złoty na okres 12 miesięcy", "12 miesięcy", 200, 500, "0 - 1000 zł");
        FortuneInsurance insurance2 = new FortuneInsurance("Ubezpieczenie na przedmiot o wartości do 5 000 złoty na okres 12 miesięcy", "12 miesięcy", 800, 2000, "1000 - 5000 zł");
        FortuneInsurance insurance3 = new FortuneInsurance("Ubezpieczenie na przedmiot o wartości poniżej 1 000 złoty na okres 6 miesięcy", "6 miesięcy", 100, 250, "0 - 1000 zł");
        FortuneInsurance insurance4 = new FortuneInsurance("Ubezpieczenie na przedmiot o wartości do 5 000 złoty na okres 6 miesięcy", "6 miesięcy", 400, 1000, "1000 - 5000 zł");
        CarInsurance insurance5 = new CarInsurance("Ubezpieczenie na samochód o wartości poniżej 10 000 złoty", "12 miesięcy", 1000, 2500, "0 - 10000 zł");
        CarInsurance insurance6 = new CarInsurance("Ubezpieczenie na samochód o wartości do 25 000 złoty", "12 miesięcy", 3000, 7500, "10000 - 25000 zł");
        CarInsurance insurance7 = new CarInsurance("Ubezpieczenie na samochód o wartości poniżej 10 000 złoty", "6 miesięcy", 500, 1250, "0 - 10000 zł");
        CarInsurance insurance8 = new CarInsurance("Ubezpieczenie na samochód o wartości do 25 000 złoty", "6 miesięcy", 1500, 3750, "10000 - 25000 zł");
        HouseInsurance insurance9 = new HouseInsurance("Ubezpieczenie na dom o wartości poniżej 300 000 złoty na okres 24 miesięcy", "24 miesięcy", 3000, 10000, "0 - 300 000 zł");
        HouseInsurance insurance10 = new HouseInsurance("Ubezpieczenie na dom o wartości do 1 000 000 złoty na okres 24 miesięcy", "24 miesięcy", 10000, 35000, "300 000 - 1000000 zł");
        HouseInsurance insurance11 = new HouseInsurance("Ubezpieczenie na dom o wartości poniżej 300 000 złoty na okres 12 miesięcy", "12 miesięcy", 1500, 5000, "0 - 300 000 zł");
        HouseInsurance insurance12 = new HouseInsurance("Ubezpieczenie na dom o wartości do 1 000 000 złoty na okres 12 miesięcy", "12 miesięcy", 5000, 17500, "300 000 - 1000000 zł");
        PeopleInsurance insurance13 = new PeopleInsurance("Ubezpieczenie zdrowotne dla jednej osoby na okres 12 miesięcy", "12 miesięcy", 300, 1000, "1");
        PeopleInsurance insurance14 = new PeopleInsurance("Ubezpieczenie zdrowotne dla rodziny na okres 12 miesięcy", "12 miesięcy", 1000, 2500, "2 - 5");
        PeopleInsurance insurance15 = new PeopleInsurance("Ubezpieczenie zdrowotne dla jednej osoby na okres 6 miesięcy", "6 miesięcy", 150, 500, "1");
        PeopleInsurance insurance16 = new PeopleInsurance("Ubezpieczenie zdrowotne dla rodziny na okres 6 miesięcy", "6 miesięcy", 500, 1250, "2 - 5");

        System.out.println("Rodzaje ubezpieczeń");
        System.out.println("-------------------------------------");
        System.out.println("Wciśnij 1 aby wybrać ubezpieczenie na przedmiot");
        System.out.println("Wciśnij 2 aby wybrać ubezpieczenie na smaochód");
        System.out.println("Wciśnij 3 aby wybrać ubezpieczenie  na dom");
        System.out.println("Wciśnij 4 aby wybrać ubezpieczenie zdrowotne");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Wybierz wartość przedmiotu i okres trwania ubezpieczenia");
                System.out.println("1. " + insurance1);
                System.out.println("2. " + insurance2);
                System.out.println("3. " + insurance3);
                System.out.println("4. " + insurance4);
                int choice1 = scanner.nextInt();
                switch (choice1) {
                    case 1 -> System.out.println("Wybrano ubezpieczenie: " + insurance1);
                    case 2 -> System.out.println("Wybrano ubezpieczenie: " + insurance2);
                    case 3 -> System.out.println("Wybrano ubezpieczenie: " + insurance3);
                    case 4 -> System.out.println("Wybrano ubezpieczenie: " + insurance4);
                }
            }
            case 2 -> {
                System.out.println("Wybierz wartość samochodu i okres trwania ubezpieczenia");
                System.out.println("1. " + insurance5);
                System.out.println("2. " + insurance6);
                System.out.println("3. " + insurance7);
                System.out.println("4. " + insurance8);
                int choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1 -> System.out.println("Wybrano ubezpieczenie: " + insurance5);
                    case 2 -> System.out.println("Wybrano ubezpieczenie: " + insurance6);
                    case 3 -> System.out.println("Wybrano ubezpieczenie: " + insurance7);
                    case 4 -> System.out.println("Wybrano ubezpieczenie: " + insurance8);
                }
            }
            case 3 -> {
                System.out.println("Wybierz wartość domu i okres trwania ubezpieczenia");
                System.out.println("1. " + insurance9);
                System.out.println("2. " + insurance10);
                System.out.println("3. " + insurance11);
                System.out.println("4. " + insurance12);
                int choice3 = scanner.nextInt();
                switch (choice3) {
                    case 1 -> System.out.println("Wybrano ubezpieczenie: " + insurance9);
                    case 2 -> System.out.println("Wybrano ubezpieczenie: " + insurance10);
                    case 3 -> System.out.println("Wybrano ubezpieczenie: " + insurance11);
                    case 4 -> System.out.println("Wybrano ubezpieczenie: " + insurance12);
                }
            }
            case 4 -> {
                System.out.println("Wybierz ilość osób i okres trwania ubezpieczenia");
                System.out.println("1. " + insurance13);
                System.out.println("2. " + insurance14);
                System.out.println("3. " + insurance15);
                System.out.println("4. " + insurance16);
                int choice4 = scanner.nextInt();
                switch (choice4) {
                    case 1 -> System.out.println("Wybrano ubezpieczenie: " + insurance13);
                    case 2 -> System.out.println("Wybrano ubezpieczenie: " + insurance14);
                    case 3 -> System.out.println("Wybrano ubezpieczenie: " + insurance15);
                    case 4 -> System.out.println("Wybrano ubezpieczenie: " + insurance16);
                }
            }
        }
    }
}