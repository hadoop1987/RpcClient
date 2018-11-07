package cn.hit.hadoop.state;

/**
 * Created by Administrator on 2018/11/6.
 */
public class StateTest {

    public static void  main(String args[]) throws IllegalAccessException, InstantiationException {
        //通过 java反射来 实例化类，不使用new 方式

        try {
            Class<Lift> state = (Class<Lift>) Class.forName("cn.hit.hadoop.state.Lift");
            Lift lift =state.newInstance();
            lift.open();
            lift.close();
            lift.Running();
            lift.stop();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
