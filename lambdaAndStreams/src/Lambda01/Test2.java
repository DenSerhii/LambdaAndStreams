package Lambda01;

public class Test2 {
    public static void main(String[] args) {
        G g=A::n2;

        g.m(new A());

    }
    interface G{
        void m(A a);
    }
    static class A{
        void n2(){
            System.out.println("A.n2");
        }
    }
}
