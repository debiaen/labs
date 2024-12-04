package mypackage;


class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message);
    }
}


class MyCloneableClass implements Cloneable {
    private String name;

    public MyCloneableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}


public class Lab05 {
    public static void main(String[] args) {
        try {
            
            throwCustomException();

        } catch (CustomException e) {
            System.out.println("Власний виняток відловлено: " + e.getMessage());
        }

        try {
            
            simulateCloneNotSupportedException();

        } catch (CloneNotSupportedException e) {
            System.out.println("Виняток CloneNotSupportedException відловлено: " + e.getMessage());
        }

        try {
            
            simulateNullPointerException();

        } catch (NullPointerException e) {
            System.out.println("Виняток NullPointerException відловлено: " + e.getMessage());
        }
    }

    
    private static void throwCustomException() throws CustomException {
        throw new CustomException("Це власний виняток.");
    }

    
    private static void simulateCloneNotSupportedException() throws CloneNotSupportedException {
        MyCloneableClass obj = new MyCloneableClass("Test");
        System.out.println("Клонування об'єкта: " + obj.getName());
        Object clonedObj = obj.clone();
        System.out.println("Клонований об'єкт: " + ((MyCloneableClass) clonedObj).getName());
    }

    
    @SuppressWarnings("null") 
    private static void simulateNullPointerException() {
        String nullString = null;
        System.out.println("Довжина строки: " + nullString.length()); 
    }
}
