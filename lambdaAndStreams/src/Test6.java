public class Test6 {
    public static void main(String[] args) {
        G g;
        g=A::n;
        g.m();

        A a=new A();
        g=a::n2; //посилання на метод класу
        //g=new A()::n2;
        g.m();

        J j=A::n2;
        g.m();

        g=A::new;
        g.m();

        H h=int[]::new;
        h.r(5);
    }


    interface G{
        void m();
    }

    interface  J{
        void v(A a);
    }
    static class A{
        A(){
            System.out.println("A#init");
        }
        static void n(){
            System.out.println("A.n");
        }
        void n2(){
            System.out.println("A#n2");
        }
    }

    interface H{
        int[] r(int x);
    }
}
