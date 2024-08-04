public class CallerClassAndMethodName {
    public static void CallerClassAndMethodName(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        if (stackTrace.length < 3) {
            return null;
        } else {
            return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
        }
    }
}