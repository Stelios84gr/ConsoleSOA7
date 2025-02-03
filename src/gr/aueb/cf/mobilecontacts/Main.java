package gr.aueb.cf.mobilecontacts;

import gr.aueb.cf.mobilecontacts.controller.MobileContactController;
import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final MobileContactController controller = new MobileContactController();

    public static void main(String[] args) {
        String choice;

        while (true) {
            printMenu();
            choice = getToken();

            if (choice.equals("q") || choice.equals("Q")) {
                break;
            }

            handleChoice(choice);
        }

        System.out.println("Thank you for using Mobile Contacts App.");
    }

    public static void handleChoice(String choice) {
        String firstname;
        String lastname;
        String phoneNumber;
        String response;

        switch (choice) {
            case "1":
                System.out.println("Παρακαλώ εισάγετε Όνομα, Επώνυμα και Αρ. Τηλεφώνου");
                firstname = getToken();
                lastname = getToken();
                phoneNumber = getToken();
                MobileContactInsertDTO insertDTO = new MobileContactInsertDTO(firstname, lastname, phoneNumber);
                response = controller.insertContact(insertDTO);

                if (response.startsWith("OK")) {
                    System.out.println("Επιτυχής Εισαγωγή");
                    System.out.println(response.substring(3));
                } else {
                    System.out.println("Ανεπιτυχής Εισαγωγή");
                    System.out.println(response.substring(7));
                }
                break;
            case "2":
                //
                break;
            case "3":
                //
                break;
            case "4":
                //
                break;
            case "5":
                //
                break;
            default:
                //
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Εισαγωγή Επαφής");
        System.out.println("2. Ενημέρωση Επαφής");
        System.out.println("3. Διαγραφή Επαφής");
        System.out.println("4. Αναζήτηση Επαφής");
        System.out.println("5. Προβολή Επαφών");
        System.out.println("Q/q. Έξοδος");
    }

    public static String getToken() {
        return in.nextLine().trim();
    }
}
