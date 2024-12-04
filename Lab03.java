package mypackage;

public class Lab03 {
    public static void main(String[] args) {
        int n = 5; 
        double[] x = new double[3 * n]; 
        
        
        for (int i = 0; i < 3 * n; i++) {
            x[i] = Math.random() * 100; 
        }
        
        
        System.out.println("Масив x:");
        for (int i = 0; i < 3 * n; i++) {
            System.out.print(x[i] + " ");
        }
        
        
        double maxFirstPart = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (x[i] > maxFirstPart) {
                maxFirstPart = x[i];
            }
        }
        
        
        double sum = 0;
        for (int i = n; i < 3 * n; i++) {
            if (x[i] > maxFirstPart) {
                sum += x[i];
            }
        }
        
       
        System.out.println("\nСума елементів з x[n+1, ..., 3n], що перевищують всі елементи з x[1, ..., n]: " + sum);
    }
}
