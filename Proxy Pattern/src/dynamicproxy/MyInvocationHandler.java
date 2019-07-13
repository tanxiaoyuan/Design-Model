package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object obj;
    public MyInvocationHandler(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        new BeforeAdvice().exec();
        try {
            return method.invoke(obj, args);
        }finally {
            new BeforeAdvice().exec();
        }
    }
}
