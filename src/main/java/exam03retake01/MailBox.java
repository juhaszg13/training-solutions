package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<Mail> mails=new ArrayList<>();

   public void addMail(Mail mail){
       mails.add(mail);
   }
    public List<Mail>findByCriteria(){
        return null; //Nincs még kész
    }

    public List<Mail> getMails() {
        return mails;
    }
}
