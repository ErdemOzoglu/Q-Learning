
package goldgamingprototip_2;

import java.awt.Dimension;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class StartPage extends javax.swing.JFrame {

    
    public StartPage() throws IOException {
       
        this.bw = new FileWriter(btxt);
        
        
        initComponents();
        
    }
    GameBoard3 gb = new GameBoard3();
    JFrame jf = new JFrame();
    int x;
    String xs;
    int y;
    String ys;
    String startxs;
    String startys;
    String exxs;
    String exys;
    int starty;
    int startx;
    int exy;
    int exx;
    int gold_field;
    int secret_gold;
    int[][] matris ;
    
    
    
    int bayrak=0;
    
   
    
    
    File btxt = new File("egeller.txt");
 
    
    
    FileWriter bw;
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonstart = new javax.swing.JButton();
        textX = new javax.swing.JTextField();
        textY = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        textstartx = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        textexx = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        textstarty = new javax.swing.JTextField();
        textexy = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        buttonstart.setBackground(new java.awt.Color(51, 51, 51));
        buttonstart.setForeground(new java.awt.Color(255, 255, 255));
        buttonstart.setText("START");
        buttonstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonstartActionPerformed(evt);
            }
        });
        getContentPane().add(buttonstart);
        buttonstart.setBounds(320, 20, 150, 110);

        textX.setBackground(new java.awt.Color(204, 204, 0));
        textX.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        textX.setText("25");
        textX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textXActionPerformed(evt);
            }
        });
        getContentPane().add(textX);
        textX.setBounds(150, 20, 140, 50);

        textY.setBackground(new java.awt.Color(204, 204, 0));
        textY.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        textY.setText("25");
        textY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textYActionPerformed(evt);
            }
        });
        getContentPane().add(textY);
        textY.setBounds(150, 80, 140, 50);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sütun ");
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 80, 120, 50);

        textstartx.setBackground(new java.awt.Color(204, 204, 0));
        textstartx.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        textstartx.setText("1");
        getContentPane().add(textstartx);
        textstartx.setBounds(210, 150, 270, 40);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Başlangıç Satır Değeri");
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 150, 170, 50);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Bitiş Satır Değeri");
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 260, 170, 50);

        textexx.setBackground(new java.awt.Color(204, 204, 0));
        textexx.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        textexx.setText("12");
        getContentPane().add(textexx);
        textexx.setBounds(210, 270, 270, 40);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Başlangıç Sütun  Değeri");
        getContentPane().add(jButton5);
        jButton5.setBounds(7, 210, 170, 40);

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Bitiş Sütun Değeri");
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 320, 170, 50);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Satır");
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 20, 120, 50);

        textstarty.setBackground(new java.awt.Color(204, 204, 0));
        textstarty.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        textstarty.setText("1");
        getContentPane().add(textstarty);
        textstarty.setBounds(210, 210, 270, 40);

        textexy.setBackground(new java.awt.Color(204, 204, 0));
        textexy.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        textexy.setText("15");
        getContentPane().add(textexy);
        textexy.setBounds(210, 330, 270, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goldgamingprototip_2/unnamed.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYActionPerformed
        
    private void buttonstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonstartActionPerformed
       
        
        
        xs=textX.getText();
       x= Integer.parseInt(xs);
       ys=textY.getText();
       y= Integer.parseInt(ys);
       startxs=textstartx.getText();
       exxs=textexx.getText();
       startx=Integer.parseInt(startxs);
       exx=Integer.parseInt(exxs);
       startys=textstarty.getText();
       exys=textexy.getText();
       starty=Integer.parseInt(startys);
       exy=Integer.parseInt(exys);
       
       
       
        matris = new int [x][y];    //Bu matrisin amacı altın yerlerini ve gizli altınları tutmaktır.
       
        
        //Tabloyu oluşturma ** Birinci Matris için
        for (int i = 0; i < x; i++) {
            for(int j = 0; j < y ;j++){
               matris[i][j]=0;   
            }    
        }
        
       
        
        matris[starty-1][startx-1]=2;
        matris[exy-1][exx-1]=3;
        
      gold_field = (x*y)/3;
      
      int gold_count = 0;
      
      while(true){
          int  a = (int) ((Math.random()*(x-1))+1);
          int  b = (int) ((Math.random()*(y-1))+1);
          
          //Random Altın atama işlemi
           
         if(matris[a][b]==1){
               continue;
          }
          else if(gold_count == gold_field){
              
              break;
          } 
         else if(matris[a][b]==0){
                 matris[a][b]=1;
                 gold_count++;
          } 
      }
      
    
     
       
        
            
         int vv=0;
         
          System.out.println();System.out.println();System.out.println();
         for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" "+matris[i][j]);
                
            }
             System.out.println();
        }
         System.out.println();
         System.out.println("------------------------------------------------------------------------");
         System.out.println();
         
        try {
                    BufferedWriter bbw = new BufferedWriter(bw);
                    
                    bw.write(" boşluklar b ile gösterilmiştir ");
                    bbw.newLine();
                    bbw.flush();
                    bw.write(" duvarlar d ile gösterilmiştir ");
                    bbw.newLine();
                    bbw.flush();
                    bw.write(" ajan a ile gösterilmiştir ");
                    bbw.newLine();
                    bbw.flush();
                    bw.write(" hedef h ile gösterilmiştir ");
                    bbw.newLine();
                    bbw.flush();
                    
                     for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                vv= matris[i][j]; 
                switch (vv) {
                    case 0:
                        bw.write(" ("+(i+1)+","+(j+1)+",b) ");
                        break;
                    case 1:
                        bw.write(" ("+(i+1)+","+(j+1)+",k) ");
                        break;
                    case 2:
                        bw.write(" ("+(i+1)+","+(j+1)+",a) ");
                        break;
                    case 3:
                        bw.write(" ("+(i+1)+","+(j+1)+",h) ");
                        break;
                    default:
                        break;
                }
                
            }
            bbw.newLine();
             bbw.flush();
        }           
                   
                    bbw.flush();
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
        try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
        

        gb.initializeGui(x, y,matris);
        
        jf.add(gb.getGui());
        jf.setLocationByPlatform(true);
        jf.setMinimumSize(jf.getSize());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setPreferredSize(new Dimension(600,600));
        jf.setMinimumSize(new Dimension(600,600));
        jf.setLocation(650,50);
        jf.pack();
        jf.setVisible(true);
        
      
    }//GEN-LAST:event_buttonstartActionPerformed

    
    
    
    
    private void textXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textXActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textXActionPerformed
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StartPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonstart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textX;
    private javax.swing.JTextField textY;
    private javax.swing.JTextField textexx;
    private javax.swing.JTextField textexy;
    private javax.swing.JTextField textstartx;
    private javax.swing.JTextField textstarty;
    // End of variables declaration//GEN-END:variables
}
