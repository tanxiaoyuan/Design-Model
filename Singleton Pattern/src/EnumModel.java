/**
 当一个Java类第一次被真正使用到的时候静态资源被初始化、Java类的加载和初始化过程都是线程安全的（因为虚拟机在加载枚举的类的时候，会使用ClassLoader的loadClass方法，而这个方法使用同步代码块保证了线程安全）。所以，创建一个enum类型是线程安全的。
 **/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EnumModel {
    private enum MyEnum{
        ENUM_FACTORY;
        private Connection connection;
        MyEnum(){
            try {
                Class.forName("");
                connection = DriverManager.getConnection("","","");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        private Connection getConnection(){
            return connection;
        }
    }
    public static Connection getConnection(){
        return MyEnum.ENUM_FACTORY.getConnection();
    }
}