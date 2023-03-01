package structural.proxy.dynamiclogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
    private final Object target;
    private Map<String, Integer> methodCount;

    public LoggingHandler(Object target) {
        this.target = target;
        methodCount = new HashMap<>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().contains("toString")) {
            return methodCount.toString();
        }
        methodCount.merge(method.getName(), 1, Integer::sum);
        return method.invoke(target, args);
    }
}
