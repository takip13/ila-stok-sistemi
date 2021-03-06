
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class ilac_stok extends javax.swing.JFrame {

    
     public Object item = null;
    
    
     public Statement statement = null;
    
     public PreparedStatement preparedstatement= null;
     
     public  ResultSet resultset = null;
     
     Database_Connect islem = new Database_Connect();
        
     public Connection conn = islem.con;
    /**
     * Creates new form ilac_stok
     */
    public ilac_stok() {
        initComponents();
        
        combo_box_doldur();
                 Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setTitle("İlaç Stok Ekranı");
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adet_field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ekle_buton = new javax.swing.JButton();
        guncelle_buton = new javax.swing.JButton();
        getir_buton = new javax.swing.JButton();
        ilac_adi_combo = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("İlac Adı");

        jLabel2.setText("Adet");

        jLabel3.setText("Son kullanma tarihi");

        adet_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adet_fieldActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İlac Adı", "Adet", "Son kullanma Tarihi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ekle_buton.setText("Ekle");
        ekle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonActionPerformed(evt);
            }
        });

        guncelle_buton.setText("Güncelle");
        guncelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonActionPerformed(evt);
            }
        });

        getir_buton.setText("Getir");
        getir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getir_butonActionPerformed(evt);
            }
        });

        ilac_adi_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilac_adi_comboActionPerformed(evt);
            }
        });

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adet_field)
                            .addComponent(ilac_adi_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ekle_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(guncelle_buton)
                                .addGap(112, 112, 112)
                                .addComponent(getir_buton))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guncelle_buton)
                            .addComponent(ekle_buton)
                            .addComponent(getir_buton))
                        .addGap(58, 58, 58)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ilac_adi_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(adet_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void guncelle_butonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        
        String ilac_adi="";
        String adet="";
        Date sk;
        String sk_tarihi="";
        
        try
        {    
        item = ilac_adi_combo.getSelectedItem();
        ilac_adi = ((ComboItem)item).getValue();
        
        adet=adet_field.getText();
        
        sk = jDateChooser1.getDate();         
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //date formatını değişltirmek için
        sk_tarihi = formatter.format(sk);
        }
        
                
        catch (Exception e)
        {
            
          JOptionPane.showMessageDialog(this, "Lütfen boş alanları doldurunuz! ","UYARI",JOptionPane.WARNING_MESSAGE);
          
          return;

        }
        
        boolean kontrol=kod_kontrol(ilac_adi,sk_tarihi);
        
        if(kontrol==false)
        {
            
          JOptionPane.showMessageDialog(this, " Bu tarihte seçtiğiniz ilaçtan giriş yapılmamıştır! ","UYARI",JOptionPane.WARNING_MESSAGE);
            
          return; 
          
        }
        
        
        String sorgu = " update ilac_stok"
                 + " set adet=?"
                 + " where ilac_kodu=? and son_kullanma_tarihi=? ";
        
   
        
        
        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,adet);
            preparedstatement.setString(2,ilac_adi);
            preparedstatement.setString(3,sk_tarihi);

            preparedstatement.execute();

        }
        
        
                    
        catch(SQLException ex)
        {
                
            String hata_mesajı = ex.getMessage();
            
            boolean pk_kontrol = hata_mesajı.contains("PK");    //Primary Key
             
            boolean null_kontrol = hata_mesajı.contains("NULL");

            if(pk_kontrol == true)
            {
             JOptionPane.showMessageDialog(this, "Bir günde aynı ilaçtan farklı sayılarda ekleyemezsiniz! ","UYARI",JOptionPane.WARNING_MESSAGE);

             adet_field.requestFocus();

             return;
            }
            
            else if (null_kontrol)
            {
               
             JOptionPane.showMessageDialog(this, "İlaç adı ve son kullanma tarihi boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             adet_field.requestFocus();

             return;
                       
            } 
            
            
        }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Güncellendi!");

        
    }                                              

    
 
   
    
    private void ekle_butonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        String ilac_adi="";
        String adet="";
        Date sk;
        String sk_tarihi="";
        
        try
        {    
        item = ilac_adi_combo.getSelectedItem();
        ilac_adi = ((ComboItem)item).getValue();
        
        adet=adet_field.getText();
        
        sk = jDateChooser1.getDate();         
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //date formatını değişltirmek için
        sk_tarihi = formatter.format(sk);
        }
        
        
        catch (Exception e)
        {
            
          JOptionPane.showMessageDialog(this, "Lütfen boş alanları doldurunuz! ","UYARI",JOptionPane.WARNING_MESSAGE);
          
          return;

        }
        
        String sorgu = " insert into ilac_stok"
                 + " (ilac_kodu,son_kullanma_tarihi,adet)"
                 + " values (?, ?, ?)";
        
   
        
        
        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,ilac_adi);
            preparedstatement.setString(2,sk_tarihi);
            preparedstatement.setString(3,adet);

            preparedstatement.execute();

        }
                    
        catch(SQLException ex)
        {
                
            String hata_mesajı = ex.getMessage();
            
            boolean pk_kontrol = hata_mesajı.contains("PK");    //Primary Key
             
            boolean null_kontrol = hata_mesajı.contains("NULL");

            if(pk_kontrol == true)
            {
             JOptionPane.showMessageDialog(this, "Bir günde aynı ilaçtan farklı sayılarda ekleyemezsiniz! ","UYARI",JOptionPane.WARNING_MESSAGE);

             adet_field.requestFocus();

             return;
            }
            
            else if (null_kontrol)
            {
               
             JOptionPane.showMessageDialog(this, "İlaç adı ve son kullanma tarihi boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             adet_field.requestFocus();

             return;
                       
            } 
            
            
        }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Eklendi!");
        
        
    }                                          

       
        
        
    private void getir_butonActionPerformed(java.awt.event.ActionEvent evt) {                                            

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        
        String sorgu = " Select s.ilac_kodu,d.ilac_adi,s.son_kullanma_tarihi,s.adet From ilac_stok s,ilac_detay d where s.ilac_kodu=d.ilac_kodu order by ilac_kodu,adet desc";

        String ilac_kodu;
        String son_kullanma;
        String adet;
        
        
        
        try
        {
            
            statement=conn.createStatement();
            
            resultset = statement.executeQuery(sorgu);
            
            while(resultset.next())
            {
             
               ilac_kodu=resultset.getString("ilac_adi");
               son_kullanma=resultset.getString("son_kullanma_tarihi");
               adet=resultset.getString("adet");
               
               Object [] eklenecek = {ilac_kodu,adet,son_kullanma};
               
               model.addRow(eklenecek);
            
                
            }
            
            resultset.close();
            
        }
                       
       
         
         catch (SQLException ex) 
         {
             
           ex.printStackTrace();
           return;
                  
         }
      
        
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        this.dispose();
        ilac_islem_ekrani ekran = new ilac_islem_ekrani();
        ekran.setVisible(true);
        
    }                                        
        
    
    private void ilac_adi_comboActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void adet_fieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

     
     public void combo_box_doldur()
     {
         
        //Uretici COMBOBOX DOLDURMA İŞLEMLERİ
        String ilac_sorgu ="Select ilac_kodu,ilac_adi"
                      + " from ilac_detay order by ilac_kodu";
    
      
    
        resultset = Getir(ilac_sorgu );
        
         try 
        {
            while (resultset.next())
            { 
                
                ilac_adi_combo.addItem(new ComboItem(resultset.getString("ilac_adi"),resultset.getString("ilac_kodu")));
            }

        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
     
         

     }
     
      public ResultSet Getir(String sorgu)
        {
          
       
          try 
          {
              statement = conn.createStatement();

              resultset = statement.executeQuery(sorgu);
              return resultset;

          }

          catch (SQLException ex)
          {
              ex.printStackTrace();
          } 

          return resultset;

       }
      
    public boolean kod_kontrol(String kod,String kod2)
    {
        
        String sorgu= " Select ilac_kodu from "
                + "ilac_stok"
                + " where ilac_kodu=? and son_kullanma_tarihi=?";
        
        
        
        try
        {
            PreparedStatement st = conn.prepareStatement(sorgu);

           
            st.setString(1,kod); //Soru işareti yerine tc gönderiyoruz
            st.setString(2,kod2);
           
            ResultSet rs = st.executeQuery();
            
           
            if(rs.next())
            {
                return true;
            }    
            
        } 
        
        
        
        catch (SQLException ex)
        {
             Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        
        return false;
        
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ilac_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilac_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilac_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilac_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ilac_stok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField adet_field;
    private javax.swing.JButton ekle_buton;
    private javax.swing.JButton getir_buton;
    private javax.swing.JButton guncelle_buton;
    private javax.swing.JComboBox ilac_adi_combo;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   

}