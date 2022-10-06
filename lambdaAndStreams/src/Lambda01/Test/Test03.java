package Lambda01.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Test03 {
    public static void main(String[] args) {

        Map<Integer,String>map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer k, String v) {
                System.out.printf("%s==>%s%n",k,v);
            }
        });


        System.out.println("________lambda__________");
        map.forEach((k,v)->
                System.out.printf("%s==>%s%n",k,v));



    }
}
