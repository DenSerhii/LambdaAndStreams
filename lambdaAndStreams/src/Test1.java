public class Test1 {
    public static void main(String[] args) {
        G g=new G() {
            @Override
            public void m() {

            }
        };

        g =A::n;    //reference to static method of class
        g.m();

        A a=new A();
        a.n2();
        g=a::n2; //reference to method of instance
        //----------or--------
        g=new G() {
            @Override
            public void m() {
                a.n2();
            }
        };

        g.m();

    }
    interface G{
        void m();
    }
    static class A{
        static void n(){
            System.out.println("A.n");
        }
        void  n2(){
            System.out.println("A.n2");
        }
    }
}
