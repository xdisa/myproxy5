import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

private final Object delegate;

public LogHandler(Object delegate){
    this.delegate = delegate;
}


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("method started:" + method.getName());
        Object result = method.invoke(delegate,args);
        System.out.println("method is finished. Result : " + method.getName() + result.toString());
        return result;

    }


}
