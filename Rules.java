package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name ){
       this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading=new JLabel("Welcome"+" "+name+" "+"To Quization");
        heading.setBounds(140, 20, 700, 30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        heading.setForeground(Color.blue);
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Mongolian Baiti",Font.PLAIN,16));
        rules.setText(
              "<html>"+
                          "1.Read all the rules carefully ! "+"<br><br>"+
                          "2. There will be time 15 minutues for each section ."+"<br><br>"+
                          "3. Coding :  Aptitude : Communication Based : "+"<br><br>"+
                          "4. Select one approprieate option out of four ."+"<br><br>"+
                          "5.Give the test honestly it is test just to self evaluate yourself ."+"<br><br>"+
                          "6.your score will be displayed after test  "+"<br><br>"+
                          "7.After the test try to evalute yourself where you can improve ."+"<br><br>"+
                          "8.ALL THE BEST !!  THANK YOU !!! "+"<br><br>"+
                   "<html>"     
        );
        add(rules);
        
        back=new JButton("Back ");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color (30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start=new JButton(" start ");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color (30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
             
        setSize(800,650);
        setLocation(300,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==start)
        {
            new Quiz();
        }
        else 
                {
                    setVisible(false);
                   // new Login();
                }
        dispose();
    }
    public static void main(String[] args){
        new Rules("USER");
    }
}