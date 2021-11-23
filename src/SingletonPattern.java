import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonPattern {

    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }

}
