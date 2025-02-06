package Ex2;

public class Main {
    public static void main(String[] args) {
        Logger consoleLog = new ConsoleLogger();
        consoleLog.log("message ^^");

        Logger fileLog = new FileLogger();
        fileLog.log("message ^^");

        Application app1 = new Application(consoleLog);
        Application app2 = new Application(fileLog);

        System.out.println(app1.logInfo());
        System.out.println(app2.logInfo());
    }
}
