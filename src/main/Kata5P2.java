package main;

public class Kata5P2 {

   
    public static void main(String[] args) throws Exception{
        String fileName = "email.txt";
        view.MailListReader m = new view.MailListReader();
        view.MailHistogramBuilder b = new view.MailHistogramBuilder();
        view.HistogramDisplay d = new view.HistogramDisplay(b.build(m.read(fileName)));
        d.execute();
    }
    
}