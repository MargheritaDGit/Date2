//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
// Stampa sulla console

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        String inputString = "2023-03-01T13:00:00Z";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        String formattedDate = offsetDateTime.format(formatter2);

        System.out.println("La data formattata è : " + formattedDate);
        System.out.println("PROVA altro modo di formattare data è : " + formattedDate);

    }
}


