package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.dto.MobileContactUpdateDTO;

public class ValidationUtil {

    /**
     * No instances of this class should be available.
     */
    private ValidationUtil() {

    }

    public static String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5) errorResponse += "Ο τηλεφωνικός αριθμός πρέπει να έχει περισσότερα από 5 ψηφία.\n";
        if (insertDTO.getFirstname().length() < 2) errorResponse += "Το Όνομα πρέπει να περιέχει 2 ή περισσότερους χαρακτήρες.\n";
        if (insertDTO.getLastname().length() < 2) errorResponse += "Το Επώνυμο πρέπει να περιέχει 2 ή περισσότερους χαρακτήρες.\n";

        return errorResponse;
    }

    public static String validateDTO(MobileContactUpdateDTO updateDTODTO) {
        String errorResponse = "";

        if (updateDTODTO.getPhoneNumber().length() <= 5) errorResponse += "Ο τηλεφωνικός αριθμός πρέπει να έχει περισσότερα από 5 σύμβολα.\n";
        if (updateDTODTO.getFirstname().length() < 2) errorResponse += "Το Όνομα πρέπει να περιέχει 2 ή περισσότερους χαρακτήρες.\n";
        if (updateDTODTO.getLastname().length() < 2) errorResponse += "Το Επώνυμο πρέπει να περιέχει 2 ή περισσότερους χαρακτήρες.\n";

        return errorResponse;
    }
}
