public class VariableScope {

    // Global variable declaration (accessible from both main and showScope)
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the globalCount value from the main method
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method
        showScope();
    }

    public static void showScope() {
        // Local variable declaration (only accessible within this method)
        int localCount = 50;

        // Print globalCount (accessible in this method)
        System.out.println("Global Count (from showScope): " + globalCount);
        
        // Print localCount (only accessible within this method)
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
