import java.util.Stack;

/*
*
* 解释器模式：给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示
* 来解释语言中的句子。
* */
public class Main {
    public static void main(String[] args){
         Context context = new Context();
         //定义一个语法容器，容纳一个具体的表达式，通常为List、Stack等类型
         Stack<Expression> stack = new Stack<>();
         for(;;){
             //进行语法判断产生递归调用
             if(false){
                 break;
             }
         }
         Expression expression = stack.pop();
         expression.interpreter(context);

    }
}
