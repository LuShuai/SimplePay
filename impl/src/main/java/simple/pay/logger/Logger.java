package simple.pay.logger;

/**
 * Created by shuailu on 3/31/16.
 */
public class Logger {

    private static final int DEBUG = 3;
    private static final int WARN = 2;
    private static final int INFO = 1;
    private static final int ERROR = 0;

    int level = 3;
    Class<?> clazz;

    private Logger(Class<?> clazz) {
        this.clazz = clazz;
    }

    public static Logger getLogger(Class<?> clazz) {
        return new Logger(clazz);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void info(String methodName, String message, String... param) {
        System.out.println(String.format("%s(%s): %s", clazz.getSimpleName(), methodName, String.format(message, param)));
    }

}
