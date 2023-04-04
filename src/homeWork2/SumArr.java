package homeWork2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public class SumArr
    {
        public static void Arr1(){
        {
            // не примитивный целочисленный массив
            Integer[] A = { 6, 8, 3, 5, 1, 9 };

            List<Integer> ints = Arrays.asList(A);

            System.out.println("Min element is " + Collections.min(ints));
            System.out.println("Max element is " + Collections.max(ints));
        }
    }
}
