
package controller;

import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class KATA4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        String fileName = "email.txt";
        MailListReader reader = new MailListReader();
        List<Mail> mailList = reader.read(fileName);
        
        MailHistogramBuilder builder = new MailHistogramBuilder();
        Histogram<String> histogram = builder.build(mailList);
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
