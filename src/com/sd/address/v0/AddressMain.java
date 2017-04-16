package com.sd.address.v0;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


class PhoneAdd{
  String phone_num;
  String addr;
  
  public PhoneAdd(String phone_num, String addr){
    this.phone_num = phone_num;
    this.addr = addr;
  }
}

public class AddressMain extends JFrame{
 JButton jb1, jb2, jb3, jb4;
 JTextField jf1, jf2, jf3;
 JTextArea jta;
 
 HashMap<String, PhoneAdd>map = new HashMap<String, PhoneAdd>();
 
 AddressMain() {
   setTitle("전화번호부");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   setLayout(null);
   
   JPanel jp1 = new JPanel();
   jp1.setLayout(new GridLayout(1, 4));
   jp1.setSize(400, 30);
   jp1.setLocation(460, 50);
   
   jb1=new JButton("조회");
   jb2=new JButton("검색");
   jb3=new JButton("삽입");
   jb4=new JButton("삭제");
   ContactA listenerA = new ContactA();
   ContactB listenerB = new ContactB();
   ContactC listenerC = new ContactC();
   ContactD listenerD = new ContactD();

   jb1.addActionListener(listenerA);
   jb2.addActionListener(listenerB);
   jb3.addActionListener(listenerC);
   jb4.addActionListener(listenerD);
   
   jp1.add(jb1);
   jp1.add(jb2);
   jp1.add(jb3);
   jp1.add(jb4);
   
   JPanel jp2 = new JPanel();
   jp2.setLayout(new GridLayout(3, 1));
   jp2.setSize(320, 90);
   jp2.setLocation(540, 150);
   
   jf1=new JTextField();
   jf2=new JTextField();
   jf3=new JTextField();
   
   jp2.add(jf1);
   jp2.add(jf2);
   jp2.add(jf3);
   
   JPanel jp3 = new JPanel();
   jp2.setLayout(new GridLayout(3, 1));
   jp2.setSize(80, 90);
   jp2.setLocation(460, 150);
   
   JLabel jl1 = new JLabel("이    름"); 
   JLabel jl2 = new JLabel("전화번호");
   JLabel jl3 = new JLabel("주    소");
   
   jp3.add(jl1);
   jp3.add(jl2);
   jp3.add(jl3);
   
   jta = new JTextArea();
   JScrollPane js = new JScrollPane(jta);
   js.setSize(430, 300);
   js.setLocation(10, 10);
   add(js);
   
   add(jp1);
   add(jp2);
   add(jp3);
   
   setSize(900, 350);
   setVisible(true);
 }
  class ContactA implements ActionListener {
   public void actionPerformed(ActionEvent e) {
     Vector<String> v = new Vector<String>();
     Set<String> names = map.keySet();
     Collections.sort(v);
     Iterator<String> it = v.iterator();
     
     while (it.hasNext()) {
       String name = it.next();
       PhoneAdd contact = map.get(name);
       jta.append(name + ":" + contact.phone_num + "" + contact.addr+ "\n");
     }
     jf1.setText("");
     jf2.setText("");
     jf3.setText("");
   }
 }
  
   class ContactB implements ActionListener {
   public void actionPerformed(ActionEvent e) {
     String ToFindName=jf1.getText();
     
     if(map.containsKey(ToFindName)) {
       PhoneAdd contact = map.get(ToFindName);
       jta.append(ToFindName + " : " + contact.phone_num + " " + contact.addr + "\n");
     }
     
     jf1.setText("");
     jf2.setText("");
     jf3.setText("");
   }
 }
   class ContactC implements ActionListener {
   public void actionPerformed(ActionEvent e) {
     map.put(jf1.getText(), new PhoneAdd(jf2.getText(), jf3.getText()));
     if(jf1.getText() == " "){
       jta.append("비어있습니다. 다시 입력하세요\n");
     } else {
       jta.append(jf1.getText() + "등록되었 습니다. \n");
     }
     jf1.setText("");
     jf2.setText("");
     jf3.setText("");
   }
 }
   class ContactD implements ActionListener {
   public void actionPerformed(ActionEvent e){
     String ToRemoveName = jf1.getText();
     
     if(map.containsKey(ToRemoveName)) {
       map.remove(ToRemoveName);
       jta.append(jf1.getText() + "는 삭제되었습니다.\n"); 
     }else {
       jta.append(jf1.getText() + "는 등록되었습니다.\n");
     }
     jf1.setText("");
     jf2.setText("");
     jf3.setText("");
   }
   
 }
 
 public static void main(String[] args) {
   new AddressMain();
 }
}
     