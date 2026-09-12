public class TypeConversion {
    public static void main(String[] args)
    {
        // Auto Conversion example
        // Java allows widening conversion.
        // byte -> short -> int -> long -> float -> double
        // char -> int or higher
        float x = 3;
        double y = 3.0f;
        int z = 'a';
        double w  = 'a';
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);

        // Casting example
        // Any conversion that does not follow the auto conversion chain can be
        // done via this method.
        int x_ = (int)3.7231; // Casting float or double always removes the demical part.
        byte y_ = (byte)1232; // Since 1232 is over the range of byte(-128 ~ 127), it takes mod 256 and result -48
        char z_ = (char)123423; // Results corresponding unicode. Again, if it is over the range, it takes mod.
        // boolean w_ = (boolean)1; -> Boolean cannot be casted.
        System.out.println(x_);
        System.out.println(y_);
        System.out.println(z_);

        // Some Important Outcomes
    //  1.
        short t = 32767; // This is 0111 1111 1111 1111
        byte t_ = (byte)t; // As byte is 8-bit, it drops the first 8-bit, and result 1111 1111
        System.out.println(t_);
    //  2.
        double d = 1/2 + (1/2) + (double)1/2 + (1/2.0);
        // Consider that 1/2 and (1/2) is both integer division, hence, result 1/2 -> 0
        // Now notice in (double)1/2 casts only 1, hence becomes 1.0/2 -> 0.5
        // Finally (1/2.0) is divided by double, which results 0.5
        System.out.println(d); // Together d results: d = 0 + 0 + 0.5 + 0.5 = 1.0

    }
}
