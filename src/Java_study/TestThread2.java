package Java_study;

//创建线程方式2：实现runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法。
public class TestThread2 implements Runnable{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---"+i);
        }

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       //创建runnable接口的实现类对象
        TestThread2 testThread2 = new TestThread2();
        //创建线程对象，通过线程对象来开启我们的线程，代理,并且丢入runnable接口实现类
        Thread thread = new Thread(testThread2);
        //丢入runnable接口实现类

        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }
}
