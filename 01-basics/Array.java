import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        int[] n1 = new int[5];
        // Unlike Python, size of the array must be predefined.
        // That is, the size of the array is not dynamic.
        // Moreover, the type of the data in each index must be same.
        System.out.println(n.length);
        System.out.println(n1[0]); // Note that when we create array, 0 is filled as default.

        // If we want dynamic sized array, ArrayList can be used.
        // We can append item via method "add"
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size()); // list = [1, 2, 3]
    }
}