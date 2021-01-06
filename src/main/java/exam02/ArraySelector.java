package exam02;

public class ArraySelector {
    public String selectEvens(int[] temp) {
        if (temp.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < temp.length; i += 2) {
            sb.append("," + " " + temp[i]);
        }
        sb.delete(1, 3);
        sb.append("]");
        return sb.toString();
    }
}
