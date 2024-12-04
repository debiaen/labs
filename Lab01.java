package mypackage; 

public class Lab01 {
    public static void main(String[] args) {
        
        int decimal = 123;
        int octal = 0173; 
        int hex = 0x7B;  
        System.out.println("Decimal: " + decimal + ", Octal: " + octal + ", Hex: " + hex);

       
        char charLiteral = 'A';
        char unicodeChar = '\u0041'; 
        System.out.println("Символьна константа: " + charLiteral + ", Юнікод символ: " + unicodeChar);

       
        String stringLiteral = "Hello, Java!";
        System.out.println("Рядкова константа: " + stringLiteral);

       
        int myVariable = 42;
        System.out.println("Приклад імені змінної: " + myVariable);

      
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Чи цікава Java? " + isJavaFun);
        System.out.println("Чи смачна риба? " + isFishTasty);

       
        boolean result = isJavaFun && !isFishTasty;
        System.out.println("Логічне AND: " + result);

      
        byte byteValue = 127;
        short shortValue = 32000;
        int intValue = 1000000;
        long longValue = 10000000000L;
        System.out.println("Byte: " + byteValue + ", Short: " + shortValue + 
                           ", Int: " + intValue + ", Long: " + longValue);

       
        int sum = 10 + 20;
        int difference = 30 - 15;
        int product = 5 * 6;
        int quotient = 40 / 5;
        int remainder = 43 % 10;
        System.out.println("Сума: " + sum + ", Різниця: " + difference + 
                           ", Добуток: " + product + ", Частка: " + quotient + 
                           ", Залишок: " + remainder);

      
        double pi = 3.14;
        int roundedPi = (int) pi;
        System.out.println("Округлене значення Pi: " + roundedPi);

       
        int a = 10;
        int b = 5;
        System.out.println("Чи a > b? " + (a > b));
        System.out.println("Чи a == b? " + (a == b));

       
        int bitwiseAnd = 5 & 3;
        int bitwiseOr = 5 | 3;
        int bitwiseXor = 5 ^ 3;
        int bitwiseComplement = ~5;
        System.out.println("Побітове AND: " + bitwiseAnd + 
                           ", OR: " + bitwiseOr + ", XOR: " + bitwiseXor + 
                           ", Complement: " + bitwiseComplement);

       
        int leftShift = 1 << 2;
        int rightShift = 4 >> 1;
        int unsignedRightShift = -4 >>> 1;
        System.out.println("Зміщення вліво: " + leftShift + 
                           ", Зміщення вправо: " + rightShift + 
                           ", Беззнакове зміщення вправо: " + unsignedRightShift);

       
        float floatValue = 3.14f;
        double doubleValue = 3.14159;
        System.out.println("Float: " + floatValue + ", Double: " + doubleValue);

      
        int x = 5;
        x += 3;
        System.out.println("x після += : " + x);

       
        int max = (a > b) ? a : b; 
        System.out.println("Максимум: " + max);
    }
}
