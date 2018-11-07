package cn.hit.hadoop.dynamicProxy;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.ObjectWritable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/10/24.
 */
public class myInvocation implements InvocationHandler {

    Object proxy;

    public myInvocation(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        int value;

       value =(int)method.invoke(this.proxy,args);
        return  value;
    }
}
