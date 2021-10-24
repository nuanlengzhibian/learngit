package JavaGui;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个Java图形界面窗口");
        Frame frame2 = new Frame("我的第二个Java图形界面窗口");


        //设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(600,600);
        //设置背景颜色
        frame.setBackground(new Color(26, 113, 96));
        //窗口弹出的初始位置
        frame.setLocation(300,300);
        //设置大小固定
        frame.setResizable(true);

    }
}
