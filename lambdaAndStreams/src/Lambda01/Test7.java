package Lambda01;

public class Test7 {
    public static void main(String[] args) {
        G g;

        g=A::new;
        g.m();

        H h=A::new;
        h.m(5);
    }

    interface G{
        void m();
    }
    interface H{
        void m(int x);
    }

    static class A{
        A(){
            System.out.println("A()");
        }
        A(int x){
            System.out.println("A(int)");
        }
    }
}
