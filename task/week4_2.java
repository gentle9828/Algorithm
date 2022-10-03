package task;

public class week4_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Advanced Programming");
        sb.delete(0, 8);
        sb.insert(0, "Enhanced");
        System.out.println(sb);
        sb.delete(9, sb.length());
        sb.append("Network");
        System.out.println(sb);
    }
}
