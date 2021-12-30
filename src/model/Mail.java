
package model;

public class Mail {
    
    private String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        int pos = this.mail.indexOf("@");
        return this.mail.substring(pos+1);
    }
}
