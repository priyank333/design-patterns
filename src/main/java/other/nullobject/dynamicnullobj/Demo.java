package other.nullobject.dynamicnullobj;

import other.nullobject.BankAccount;
import other.nullobject.Log;

import java.lang.reflect.Proxy;

public class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T noOps(Class<T> itf) {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class<?>[]{itf}, (proxy, method, args) -> {
            if (method.getReturnType().equals(Void.TYPE)) {
                return null;
            } else {
                return method.getReturnType().getConstructor().newInstance();
            }
        });
    }

    public static void main(String[] args) {

        //Computationally it is a heavy operation.
        Log log = noOps(Log.class);
        BankAccount bankAccount = new BankAccount(log);
        bankAccount.deposit(100);
        bankAccount.withdraw(12);
        bankAccount.withdraw(90);
    }
}
