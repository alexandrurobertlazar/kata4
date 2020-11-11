package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import persistence.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", mailHistogram);
        histogramDisplay.execute();
    }
    
}
