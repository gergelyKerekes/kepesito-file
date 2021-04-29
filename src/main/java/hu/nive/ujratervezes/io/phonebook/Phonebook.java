package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        try (Writer writer = new FileWriter(output)) {

            for (Map.Entry<String, String> contact : contacts.entrySet()) {
                writer.append(contact.getKey())
                        .append(": ").append(contact.getValue()).append("\n");
            }

        } catch (IOException e) {
            System.out.println("Cannot write file!");
        } catch (NullPointerException ne) {
            throw new IllegalArgumentException();
        }

    }
}