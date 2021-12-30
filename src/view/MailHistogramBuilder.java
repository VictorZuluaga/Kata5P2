
package view;
import java.util.*;
public class MailHistogramBuilder {
    
    public model.Histogram<String> build(List<model.Mail> lista){
        model.Histogram<String> histo = new model.Histogram<>();
        Iterator<model.Mail> it = lista.iterator();
        String aux = "";
        while(it.hasNext()){
            aux = it.next().getDomain();
            histo.increment(aux);
        }
        return histo;
    }
}
