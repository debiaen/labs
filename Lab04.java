package mypackage;

public class Lab04 {
    public static void main(String[] args) {
        String str = "Це приклад рядка для тестування"; 
        String[] words = str.split(" ");
        
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        
        for (String word : words) {
            int length = word.length();
            if (length < minLength) minLength = length;
            if (length > maxLength) maxLength = length;
        }
        
        System.out.println("Довжина найкоротшого слова: " + minLength);
        System.out.println("Довжина найдовшого слова: " + maxLength);
    }
}
