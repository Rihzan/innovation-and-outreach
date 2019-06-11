public class casting {
    public static void main(String[] args){
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.5f;
        float floatValue2 = (float)99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;
        System.out.println(intValue);

        doubleValue = intValue;// all good examples of casting
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);

        byteValue = (byte)128;//Shows how casting to byte 1 after the max value itll wrap around to the smallest value it can hold
        System.out.println(byteValue);
    
    }
}