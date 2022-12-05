import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Witaj w naszym banku!");

        System.out.println("Wprowadź swoje imię: ");
        String name = scan.nextLine();

        System.out.println("Wprowadź swoje nazwisko: ");
        String lastName = scan.nextLine();

        System.out.println("Wprowadź swoje pesel: ");
        int pesel = scan.nextInt();


        User user1 = new User(name, lastName, pesel);

        System.out.println("Menu \n 1. Informacje o koncie \n 2. Wplata pieniedzy \n 3. Wyplata pieniedzy \n 4. Wyjscie ");
        System.out.println("Wyierz opcję: ");
        int option = scan.nextInt();

        switch (option){
            case 1:
                user1.print();
                break;
            case 2:
                System.out.println("Jaka kwote chcesz wplacic? ");
                double nowaWplata = scan.nextDouble();
                user1.deposit(nowaWplata);
                System.out.println("Saldo konta wynosi: " + user1.getBalance());
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
        }

    }
}