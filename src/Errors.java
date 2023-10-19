public class Errors extends RuntimeException {
    private static int errorCount = 0;

    public Errors(String a) {
        super(a);
        errorCount++;
    }

    public static int getErrorCount() {
        return errorCount;
    }
}