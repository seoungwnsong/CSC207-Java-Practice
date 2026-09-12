public class PrimitiveTypes
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 5;
        System.out.println(x == y); // This  results True as both x and y are primitive int values
        // Hence == compares their stored values 5 == 5.
        // Same goes for the other primitive types: byte, short, long, etc.

        Integer z = 100000000;
        Integer w = 100000000;
        System.out.println(z == w); // This results False as z and w now references the object
        // However, not that if the value is small enough, it can result True, as Java reuses it.
    }
}
