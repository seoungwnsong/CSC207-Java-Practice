public class Comparisons {
    public static void main(String[] args)
    {
        // Comparison Example
        double b = 0.1 + 0.2;
        double c = 0.3;
        System.out.println(b == c);
        // Mathematically, this should result true.
        // However, in fact this results false, as java cannot be represented exactly
        // in binary floating point. Therefore we compare by simple epsilon equation as following.
        //if (Math.abs(b-c)<epsilon) {result}

        int x = 3;
        double y = 3.0;
        System.out.println(x == y);
        // For primitive types, == haves like python ==, which compare their value.
        // For primitive types that are automatically convertible, it converts, and compare.
        // Example above tells: 3 -> 3.0 and compare 3.0 == 3.0, which results true

        String d = new String("abc");
        String s = new String("abc");
        // For objects, == behaves like 'is'. which compare their id. Hence does not fall
        if(d == s) // inside the if block. .equals is required to compare their value.
        {
            System.out.println("c and s are equal");
        }

        // Note that logic evaluation follows python.
        // if A || B -> checks A, and if true, results true immediately.
        // if A && B -> checks A, and if false, results false immediately.
        // this works even if B raises error.
    }
}
