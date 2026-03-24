public class DataType {
    public static void main(String[] args) {
        byte b1 = 10;
        System.out.println("Byte value: " + b1); 
        System.out.println("Minimum value of byte: " + Byte.MIN_VALUE);
        System.out.println("Maximum value of byte: " + Byte.MAX_VALUE);
        System.out.println(Byte.SIZE + " bits");

        short s1 = 100;
        System.out.println("Short value: " + s1);
        System.out.println("Minimum value of short: " + Short.MIN_VALUE);  
        System.out.println("Maximum value of short: " + Short.MAX_VALUE);
        System.out.println(Short.SIZE + " bits");

        int i1 = 1000;
        System.out.println("Integer value: " + i1);
        System.out.println("Minimum value of int: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of int: " + Integer.MAX_VALUE);
        System.out.println(Integer.SIZE + " bits");

        long l1 = 10000L;
        System.out.println("Long value: " + l1);
        System.out.println("Minimum value of long: " + Long.MIN_VALUE);
        System.out.println("Maximum value of long: " + Long.MAX_VALUE);
        System.out.println(Long.SIZE + " bits");

        float f1 = 3.14f;
        System.out.println("Float value: " + f1);
        System.out.println("Minimum value of float: " + Float.MIN_VALUE);
        System.out.println("Maximum value of float: " + Float.MAX_VALUE);
        System.out.println(Float.SIZE + " bits");

        double d1 = 3.14159;
        System.out.println("Double value: " + d1);
        System.out.println("Minimum value of double: " + Double.MIN_VALUE);
        System.out.println("Maximum value of double: " + Double.MAX_VALUE);
        System.out.println(Double.SIZE + " bits");

        char c1 = 'A';
        System.out.println("Character value: " + c1);
        System.out.println("Minimum value of char: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum value of char: " + (int) Character.MAX_VALUE);
        System.out.println(Character.SIZE + " bits");

        boolean bool1 = true;
        System.out.println("Boolean value: " + bool1);
        System.out.println("Boolean values can be either true or false.");

    }
}
