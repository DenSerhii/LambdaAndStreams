import java.util.Arrays;

public class Tets5 {
    public static void main(String[] args) {
        G g=int[]::new;
        System.out.println(
                Arrays.toString(g.m(5))
        );
    }
    interface G{
        int[]m(int x);
    }
}
