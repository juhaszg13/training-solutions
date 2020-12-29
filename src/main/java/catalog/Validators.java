package catalog;


import java.util.List;

public class Validators {
   public static boolean isBlank(String str) {
        if(str==null||str.isBlank()){
            return true;
        }
    return false;
    }
    public static boolean isEmpty(List<String> lst ) {
        if(lst==null||lst.size()==0){
            return true;
        }
        return false;
    }
}
