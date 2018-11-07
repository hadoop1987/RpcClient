package cn.hit.hadoop.dynamicProxy;

/**
 * Created by Administrator on 2018/10/24.
 */
public class myInterfaceImpl implements  myInterface {
    @Override
    public int add(int a, int b) {
        return (a+b);
    }

}
