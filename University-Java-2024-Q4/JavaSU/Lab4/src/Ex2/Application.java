package Ex2;

public class Application {
    private final Logger applicationLogger;

    Application(Logger logger){
        this.applicationLogger = logger;
    }

    public Logger logInfo(){
        return applicationLogger;
    }
}
