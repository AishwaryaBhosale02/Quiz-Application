package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.lang.*;
import java.sql.DriverManager;
import java.sql.Driver;
import java.util.logging.*;


public class Verbal extends javax.swing.JFrame {
    
    ButtonGroup btngrp[]=new ButtonGroup[5];
    int i=1,j=0;    
    JRadioButton btn[]=new JRadioButton[21];
    int result=0;

    
   
    public Verbal()
    {
             initComponents();
             setLocationRelativeTo(null);
             Connection mycon=null;
             Statement mystate=null;
             ResultSet myres=null;
             
             
             i=1;
             System.out.println(this.i);
             MyActionListener2 ml=new MyActionListener2(this);

       try
       { 
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","Quiz123@");
           mystate=mycon.createStatement();
           myres=mystate.executeQuery("select *from verbal");
           System.out.println(mycon);
           txtarea.setFont(new Font("Tahona",Font.PLAIN,20));
            txtarea.append("VERBAL QUESTIONS \n\n");    
            int y=100;
            while(myres.next())
           {
              
               btngrp[j]=new ButtonGroup();
               txtarea.append(myres.getString(("ques") ));
               txtarea.append("\n\n");
               btn[i]=new  JRadioButton("A");
               btn[i].setBounds(10,y+20,20,10);
               btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                txtarea.append("        ");
                txtarea.append(myres.getString(("A") ));
               txtarea.append("\n\n");
                y=y+60;
                 btngrp[j].add(btn[i]);
                 i++;

               
                
                btn[i]=new  JRadioButton("B");
               btn[i].setBounds(10,y,20,10);
                btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                  btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                 txtarea.append("       "); 
               txtarea.append(myres.getString(("B") ));
               txtarea.append("\n\n");
                y=y+60;
                 btngrp[j].add(btn[i]);
                 i++;

                
               
               
                btn[i]=new  JRadioButton("C");
               btn[i].setBounds(10,y,20,10);
                btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                  btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                 txtarea.append("       "); 
               txtarea.append(myres.getString(("C") ));
               txtarea.append("\n\n");
                y=y+60;
                 btngrp[j].add(btn[i]);
                 i++;

                
               
               btn[i]=new  JRadioButton("D");
                btn[i].setBounds(10,y,20,10);
                 btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                   btn[i].addActionListener(ml);
                txtarea.add(btn[i]);
                 txtarea.append("       ");
                txtarea.append(myres.getString(("D") ));
                txtarea.append("\n\n");
                 y=y+80;
                 btngrp[j].add(btn[i]);
                 i++;
                 
               j++;
                 //txtarea.append("\n");
                
           }
       }
       catch(SQLException e)
       {
           System.out.println("exception  = "+e);

       }
       catch(ClassNotFoundException ex)
       {
             System.out.println("exception  = "+ex);
           Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE,null,ex);
       }
       
       finally
       {
          if(mycon!=null)
          {
              
          }
       }
       
        setVisible(true);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnback = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtarea.setBackground(new java.awt.Color(224, 238, 249));
        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        btnback.setBackground(new java.awt.Color(185, 218, 247));
        btnback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnnext.setBackground(new java.awt.Color(185, 218, 247));
        btnnext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnnext.setText("NEXT");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnback, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnnext, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       
        System.out.println("reusult out of 5:"+result);
        Quiz.obj.commonFunction(result);
        new Quiz();
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed

      Quiz.obj.commonFunction(result);
        new Result();
       //new Coding();
        dispose();
    }//GEN-LAST:event_btnnextActionPerformed

    
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Verbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Verbal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnnext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
class MyActionListener2 implements ActionListener 
{
    
    Verbal v;
     MyActionListener2 (Verbal f)
     {
         v=f;
     }
    @Override
     public void actionPerformed(ActionEvent e)
     {
          
        JRadioButton b=(JRadioButton)e.getSource();
       // System.out.println("\n i = "+a.i);
       int i=1;
        while(i<=20)
        {
                 
            if( b==v.btn[i])
            { 
               // System.out.println("btn no = "+i);
                break;
            }
            i++;
        }
        int k=0;
        if(i<=1*4)
        {
           k=1; 
        }
        else if(1*4<i&&i<=2*4)
        {
            k=2; 
        }
        else if(2*4<i&&i<=3*4)
        {
            k=3; 
        }
        else if(3*4<i&&i<=4*4)
        {
            k=4; 
        }
        else
        {
            k=5;
        }
       
        System.out.println("reusult  be4 anything : "+v.result);
        Connection mycon=null;
        Statement mystate=null;
        ResultSet myres=null;
        try
        {
             mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","Quiz123@");
             String query="select ans from verbal where idverbal = '"+k+"'";
             mystate=mycon.createStatement();
             myres=mystate.executeQuery(query);
             //System.out.println(mycon);
                    if(myres.next())
                    {
                          String ans= myres.getString("ans");
                          System.out.println("ans for q = "+k+"  "+ans+" i = "+i);
                          if(ans.equals("a")&&(i==1||i==5||i==9||i==13||i==17))
                          {
                              System.out.println("result incremented for correct option a");
                              v.result++;
                              
                          }
                          else if(ans.equals("b")&&(i==2||i==6||i==10||i==14||i==18))
                          {
                               System.out.println("result incremented for correct option b");
                              v.result++;
                             
                          }
                          else if(ans.equals("c")&&(i==3||i==7||i==11||i==15||i==19))
                          {
                               System.out.println("result incremented for correct option c");
                              v.result++;
                              
                          }
                          else if(ans.equals("d")&&(i==4||i==8||i==12||i==16||i==20))
                          {
                               System.out.println("result incremented for correct option d");
                              v.result++;
                               
                          }
                          else
                          {
                                  
                           }
                          
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(v,"Result not found");
                    }
                    //a.result++;
        }
        catch(Exception exp)
        {
            System.out.println("exception caught"+exp);
        }
       
            
     }
}


