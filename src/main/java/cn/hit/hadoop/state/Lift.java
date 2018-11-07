package cn.hit.hadoop.state;

/**
 * 状态模式
 */
public class Lift implements  State {

    @Override
    public void close() {

        System.out.println("电梯关闭了...");
    }

    @Override
    public void open() {
     System.out.println("电梯打开，可以进电梯了...");
    }

    @Override
    public void Running() {
      System.out.println("电梯运行时...");
    }

    @Override
    public void stop() {
     System.out.println("电梯停止了...");
    }
}
