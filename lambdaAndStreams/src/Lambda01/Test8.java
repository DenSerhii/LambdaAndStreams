package Lambda01;

public class Test8 {
    public static void main(String[] args) {
        G g;
        A a;
        g= A::new;
        a=g.m();
        System.out.println(a);
        H h= A::new;
        a=h.m(5);
        System.out.println(a);
    }

    interface G{
        A m();
    }
    interface H{
        A m(int x);
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
