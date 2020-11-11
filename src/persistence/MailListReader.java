package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if (Mail.isMail(line)) list.add(new Mail(line));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }
    
}
