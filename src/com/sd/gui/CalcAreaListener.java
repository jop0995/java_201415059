package com.sd.gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.sd.gui.*;
class CalcAreaListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        String cmd=e.getActionCommand();
        if (cmd.equals("���")) {
            System.out.println("��� ��ư");
            b.setText("����߽��ϴ�");
        } else if (cmd.equals("���")) {
            System.out.println("��� ��ư");
            b.setText("����߽��ϴ�");
        } else {
            System.out.println("��ư�� ����);
        }
    }
}