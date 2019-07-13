import java.util.ArrayList;
import java.util.List;

/*
* 迪米特法则(最少知识法则)：一个对象应该对其他对象有最少的了解，一个类对自己需要调用的类知道得最少。
* 1. 只和朋友交流，朋友类指出现在成员变量、方法输入参数中的类称为成员朋友类，而出现在方法体内的类不属于朋友类。
* 2. 朋友之间也是有距离的，朋友之间只暴露必要的方法。
* 3. 是自己的就是自己的，如果一个方法放在本类里，既不增加类间关系，也不对本类产生负面影响，就放在本类中。
* 4. 谨慎使用Serializable
* */
public class Main {
    public static void main(String[] args){
        List<Girl> girlList = new ArrayList<>();
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(girlList));
    }

}
