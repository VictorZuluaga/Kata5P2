
package view;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
public class MailListReader {
    
    public List<model.Mail> read(String fileName)throws Exception{
        List<model.Mail> lista = new ArrayList<>(); 
        File doc = new File(fileName);
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        String aux = "";
        while ((aux = obj.readLine()) != null){
            if(!aux.contains("@")){
                continue;
            }
            lista.add(new model.Mail(aux));
        }
        return lista;
    }
}

