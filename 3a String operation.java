
import com.sun.security.jgss.GSSUtil;

public class str_operations {
    public static boolean compareStr(String s1, String s2) {
        return s1.equals(s2);
    }
    public static String copyStr(String ori){
        return new String(ori);
    }
    public static String concatinateStr(String s1, String s2){
        return s1+s2;
    }
    public static void main(String[] args){
        String s1="Hellooo";
        String s2= "HELLO";
        String s3=" lala";
        System.out.println(compareStr(s1, s2));
        System.out.println(copyStr(s1));
        System.out.println(concatinateStr(s1, s3));
    }
}
