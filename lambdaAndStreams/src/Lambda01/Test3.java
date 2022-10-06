package Lambda01;

public class Test3 {
    public static void main(String[] args) {
        G g = String::charAt;

        char ch=g.m("asdd",2);
        System.out.println(ch);

        //----or----
        g=new G() {
            @Override
            public char m(String s, int x) {
                return s.charAt(x);
            }
        };
    }

    interface G{
        char m(String s,int x);
    }
}
