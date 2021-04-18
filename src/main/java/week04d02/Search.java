package week04d02;

public class Search {
    public String getIndexesOfChar(String word, char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(word).append(" szóban a(z) ").append(c).append(" karakter:");
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (c ==chars[i]){
                sb.append(" ").append(i).append(",");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void mgain(String[] args) {
        Search search=new Search();
        System.out.println(search.getIndexesOfChar("almafa",'a'));
    }
}
