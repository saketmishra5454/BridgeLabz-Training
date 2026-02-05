package annotations;

import java.util.ArrayList;

public class SuppressUnchecked{

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Raw ArrayList (no generics)
        ArrayList list = new ArrayList();

        list.add("Saket");
        list.add(100);

        // No warning due to @SuppressWarnings
        for (Object o : list) {

            System.out.println(o);
        }
    }
}
