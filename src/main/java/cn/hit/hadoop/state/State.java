package cn.hit.hadoop.state;

/**
 * Created by Administrator on 2018/11/6.
 */
public interface State {

    void close(); //关门
    void open(); //开门
    void Running(); //上下运行
    void  stop();//停止

}
