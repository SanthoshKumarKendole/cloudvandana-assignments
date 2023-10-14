import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class shuffleArray
{
    public static void main(String args[])
    {
        Integer[] array = {1,2,3,4,5,6,7,8,9};
        List<Integer> arr=Arrays.asList(array);
        Collections.shuffle(arr);
        arr.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}