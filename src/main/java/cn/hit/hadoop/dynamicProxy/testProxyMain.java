package cn.hit.hadoop.dynamicProxy;


import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/10/24.
 */
public class testProxyMain {

    public static void main(String args[]) {

        myInterfaceImpl impl = new myInterfaceImpl();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        Class<?>[] interfaces = impl.getClass().getInterfaces();

        myInvocation invocation = new myInvocation(impl);

        myInterface proxy = (myInterface) Proxy.newProxyInstance(loader, interfaces, invocation);

        System.out.println(proxy.add(10, 20));

    }
}
