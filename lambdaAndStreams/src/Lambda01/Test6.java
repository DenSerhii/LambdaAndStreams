package Lambda01;

public class Test6 {
    public static void main(String[] args) {
        G g;
        //(1)reference to static method
        g=A::n;
        g.m();

        //(2)reference to method of instance
        A a=new A();
        g=a::n2; //посилання на метод класу
        //g=new A()::n2;
        g.m();

        //(3)reference to  not static method of class
        J j=A::n2;
        g.m();

        //(4)reference to constructor
        g=A::new;
        g.m();

        //(5)reference to array initializer
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
