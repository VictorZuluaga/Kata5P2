
package view;
import java.util.*;
import model.*;
public class MailHistogramBuilder {
    
    public model.Histogram<String> build(List<String> lista){
        model.Histogram<String> histo = new model.Histogram<>();
        Iterator<String> it = lista.iterator();
        String aux = "";
        while(it.hasNext()){
            aux = it.next();
            int x = aux.indexOf("@");
            histo.increment(aux.substring(x+1));
        }
        return histo;
    }
}
