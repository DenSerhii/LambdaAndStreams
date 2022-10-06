package Lambda01;

public class Test4 {
    public static void main(String[] args) {
        G g =String::new;//посилання на конструктор
        System.out.println(g.m(new char[]{'a','b'}));
    }

    interface G{
        String m (char[] chars);
    }
}
