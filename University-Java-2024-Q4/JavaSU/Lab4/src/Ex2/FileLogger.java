package Ex2;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Creating new file to write \"" + message + "\"...");
    }
}
