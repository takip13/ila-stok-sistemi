
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class ilac_tanim extends javax.swing.JFrame {

    /**
     * Creates new form ilac_ekle
     */
    public ilac_tanim() {
        initComponents();
       
        setTitle("İlaç Tanım Ekranı");
                 Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        combo_box_doldur();
        
        temizle();
        
    }
    
     public Object item = null;
    
    
     public Statement statement = null;
    
     public PreparedStatement preparedstatement= null;
     
     public  ResultSet resultset = null;
     
     Database_Connect islem = new Database_Connect();
        
     public Connection conn = islem.con;
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uretici_combo = new javax.swing.JComboBox();
        ilac_turu_combo = new javax.swing.JComboBox();
        recete_combo = new javax.swing.JComboBox();
        ilac_kodu_field = new javax.swing.JTextField();
        ilac_adi_field = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        getir_buton = new javax.swing.JButton();
        sil_buton = new javax.swing.JButton();
        guncelle_buton = new javax.swing.JButton();
        ekle_buton = new javax.swing.JButton();
        Ara_buton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ilac Kodu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 74, -1, -1));

        jLabel2.setText("İlac Adi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 139, -1, -1));

        jLabel3.setText("Uretici ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 215, -1, -1));

        jLabel4.setText("Ilac Turu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 289, -1, -1));

        jLabel5.setText("Recete");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 362, -1, -1));

        uretici_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(uretici_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 212, 115, -1));

        ilac_turu_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(ilac_turu_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 286, 115, -1));

        recete_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(recete_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 356, 115, -1));
        getContentPane().add(ilac_kodu_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 71, 115, -1));

        ilac_adi_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilac_adi_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(ilac_adi_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 136, 115, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İlac Kodu", "İlac Adi", "Uretici", "İlac Türü", "Recete"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getir_buton.setText("Getir");
        getir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getir_butonActionPerformed(evt);
            }
        });

        sil_buton.setText("Sil");
        sil_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_butonActionPerformed(evt);
            }
        });

        guncelle_buton.setText("Güncelle");
        guncelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonActionPerformed(evt);
            }
        });

        ekle_buton.setText("Ekle");
        ekle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonActionPerformed(evt);
            }
        });

        Ara_buton.setText("Ara");
        Ara_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ara_butonActionPerformed(evt);
            }
        });

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Ara_buton)
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ekle_buton)
                        .addGap(88, 88, 88)
                        .addComponent(guncelle_buton)
                        .addGap(74, 74, 74)
                        .addComponent(sil_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getir_buton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ara_buton))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getir_buton)
                    .addComponent(sil_buton)
                    .addComponent(guncelle_buton)
                    .addComponent(ekle_buton))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ilac_adi_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilac_adi_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilac_adi_fieldActionPerformed

    private void ekle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_butonActionPerformed

       String ilac_kodu= ilac_kodu_field.getText(); 
       String ilac_adi= ilac_adi_field.getText().toUpperCase();
       String uretici="";
       String ilac_turu="";
       String recete="";
        
       try
       {           
       
       item = uretici_combo.getSelectedItem();
       uretici = ((ComboItem)item).getValue();
       
       item = ilac_turu_combo.getSelectedItem();
       ilac_turu = ((ComboItem)item).getValue();
       
       item = recete_combo.getSelectedItem();
       recete = ((ComboItem)item).getValue();
       }
       
       catch(Exception e)
       {
        
           JOptionPane.showMessageDialog(this, "Lütfen boş alanları doldurunuz!","UYARI",JOptionPane.WARNING_MESSAGE);
           
           return;
           
       }       
       
       
       
        String sorgu = " insert into ilac_detay"
        + " (ilac_kodu,ilac_adi,uretici_kodu,ilac_tur_kodu,recete_kodu)"
        + " values (?, ?, ?, ?, ?)";
        
        
        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,ilac_kodu);
            preparedstatement.setString(2,ilac_adi);
            
            
            preparedstatement.setString(3,uretici);
            
            preparedstatement.setString(4,ilac_turu);           
 
            preparedstatement.setString(5,recete);
            
            preparedstatement.execute();

        }
                       
       
         
         catch (SQLException ex) 
         {
             
            String hata_mesajı = ex.getMessage();
            
            boolean pk_kontrol = hata_mesajı.contains("PK");    //Primary Key
              
            boolean null_kontrol = hata_mesajı.contains("NULL");

            if(pk_kontrol == true)
            {
             JOptionPane.showMessageDialog(this, "Girdiğiniz ilaç kodu kayitlarda mevcuttur!","UYARI",JOptionPane.WARNING_MESSAGE);

             ilac_kodu_field.requestFocus();

             return;
            }
            
            else if (null_kontrol)
            {
               
             JOptionPane.showMessageDialog(this, "İlaç türü kodu ve ilaç adı boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             ilac_kodu_field.requestFocus();

             return;
                       
            }
                  
             
             ex.printStackTrace();
         }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Eklendi!");
        
         temizle();
         
       
        
    }//GEN-LAST:event_ekle_butonActionPerformed

    private void guncelle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_butonActionPerformed
       
       String ilac_kodu= ilac_kodu_field.getText().toUpperCase();
       String ilac_adi= ilac_adi_field.getText().toUpperCase();
       String uretici;
       String ilac_turu;
       String recete;
        
       try
       {    

       item = uretici_combo.getSelectedItem();
       uretici = ((ComboItem)item).getValue();
       
       item = ilac_turu_combo.getSelectedItem();
       ilac_turu = ((ComboItem)item).getValue();
       
       item = recete_combo.getSelectedItem();
       recete = ((ComboItem)item).getValue();
       }
       
       
       catch(Exception e)
       {
          
           JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurunuz!","UYARI",JOptionPane.WARNING_MESSAGE);
           
           return;
           
           
       } 
           
       String sorgu = " Update ilac_detay Set ilac_adi=?,uretici_kodu=?,ilac_tur_kodu=?,recete_kodu=?  Where ilac_kodu=?   ";
      

        
        if(ilac_kodu.equals("") || ilac_adi.equals(""))
        {
            
             JOptionPane.showMessageDialog(this, "İlaç türü kodu ve ilaç adı boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             ilac_kodu_field.requestFocus();

             return;
            
        }
        
        boolean kontrol=kod_kontrol(ilac_kodu);
        
        if(kontrol==false)
        {
           JOptionPane.showMessageDialog(this, "Böyle bir ilaç türü kodu kayıtlarda bulunmamaktadır!","UYARI",JOptionPane.WARNING_MESSAGE); 
           
           ilac_kodu_field.requestFocus();
           
           return;
           
        }
        
     
        
        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,ilac_adi);
            preparedstatement.setString(2,uretici);
            preparedstatement.setString(3,ilac_turu);
            preparedstatement.setString(4,recete);
            preparedstatement.setString(5,ilac_kodu);
            
            preparedstatement.execute();

        }
                       
       
         
         catch (SQLException ex) 
         {
             
           ex.printStackTrace();
           return;
                  
         }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Güncellendi!");
        
        temizle();
        
    }//GEN-LAST:event_guncelle_butonActionPerformed

    private void sil_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_butonActionPerformed
      
        String ilac_kodu;
        
        ilac_kodu = ilac_kodu_field.getText();
        
        if(ilac_kodu.equals(""))
        {
           
           JOptionPane.showMessageDialog(this, "Lütfen ilaç kodunu giriniz!","UYARI",JOptionPane.WARNING_MESSAGE); 
           return; 
           
        }
        
        boolean kontrol=kod_kontrol(ilac_kodu);
        
        if(kontrol==false)
        {
           JOptionPane.showMessageDialog(this, "Böyle bir ilaç türü kodu kayıtlarda bulunmamaktadır!","UYARI",JOptionPane.WARNING_MESSAGE); 
           
           ilac_kodu_field.requestFocus();
           
           return;
           
        }
        
            
        try
        {
            
            
            
            preparedstatement=conn.prepareStatement(
                    "DELETE FROM ilac_detay"
                            + " WHERE ilac_kodu=?");
            
            preparedstatement.setString(1,ilac_kodu);
            
            preparedstatement.execute();
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(Ureticiler.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Silindi"); 
       
         temizle();
         
        
        
    }//GEN-LAST:event_sil_butonActionPerformed

    private void getir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getir_butonActionPerformed
           
       
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
       model.setRowCount(0);
       
       String sorgu = "select a.ilac_kodu,a.ilac_adi,e.uretici_adi,c.ilac_turu,d.recete_tipi from\n" +
                      "ilac_detay a,ilac_turleri c,receteler d,uretici_bilgileri e where\n" +
                      "a.uretici_kodu=e.uretici_kod and a.ilac_tur_kodu=c.ilac_turu_kodu and a.recete_kodu=d.recete_kodu order by a.ilac_kodu";
       
       String ilac_kodu;
       String ilac_adi;
       String uretici_adi;
       String ilac_turum;
       String recete_tipi;
       
        try
        {
            
            statement=conn.createStatement();
            
            resultset = statement.executeQuery(sorgu);
            
            while(resultset.next())
            {
             
               ilac_kodu=resultset.getString("ilac_kodu");
               ilac_adi=resultset.getString("ilac_adi");
               uretici_adi=resultset.getString("uretici_adi");
               ilac_turum=resultset.getString("ilac_turu");
               recete_tipi=resultset.getString("recete_tipi");
               
               Object [] eklenecek = {ilac_kodu,ilac_adi,uretici_adi,ilac_turum,recete_tipi};
               
               model.addRow(eklenecek);
            
                
            }
            
            resultset.close();
            
        }
                       
       
         
         catch (SQLException ex) 
         {
             
           ex.printStackTrace();
           return;
                  
         }
        
        
    }//GEN-LAST:event_getir_butonActionPerformed

    
    public void temizle()
    {
        
        uretici_combo.setSelectedIndex(0);
        ilac_turu_combo.setSelectedIndex(0);
        recete_combo.setSelectedIndex(0);
        ilac_adi_field.setText("");
        ilac_kodu_field.setText("");
    }
            
    public boolean bos_kontrol()
    {
       
        
       if(ilac_kodu_field.getText().equals("") && ilac_adi_field.getText().equals("") && uretici_combo.getSelectedIndex()==0 && ilac_turu_combo.getSelectedIndex()==0 && recete_combo.getSelectedIndex()==0) 
       {
         
           return false;
       } 
       
       return true;
        
    }        
    
    private void Ara_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ara_butonActionPerformed

       boolean sonuc=bos_kontrol();
       
       if(sonuc==false)
       {
           JOptionPane.showMessageDialog(this, "Lütfen en az bir tane arama kriteri giriniz!","UYARI",JOptionPane.WARNING_MESSAGE);
           
           return;
       } 
           
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
       model.setRowCount(0);
       
       String sorgu = "select a.ilac_kodu,a.ilac_adi,e.uretici_adi,c.ilac_turu,d.recete_tipi from\n" +
                      "ilac_detay a,ilac_turleri c,receteler d,uretici_bilgileri e where\n" +
                      "a.uretici_kodu=e.uretici_kod and a.ilac_tur_kodu=c.ilac_turu_kodu and a.recete_kodu=d.recete_kodu ";
       
   
       String ilac_kodu="";
       String ilac_adi="";
       String uretici_adi="";
       String ilac_turum="";
       String recete_tipi="";
       
       bos_kontrol();
       
       if(!ilac_kodu_field.getText().equals(""))
       {
         
         
           ilac_kodu=ilac_kodu_field.getText(); 
          
           System.out.println(ilac_kodu);
           
           sorgu=sorgu.concat("and ilac_kodu= '"+ilac_kodu+"'   ");
         
           
       }
       
       if(!ilac_adi_field.getText().equals(""))
       {
         
          ilac_adi=ilac_adi_field.getText().toUpperCase(); 
           
          sorgu=sorgu.concat("and ilac_adi= '"+ilac_adi+"'   ");
           
       }
       
       int secilen=uretici_combo.getSelectedIndex();
           
       
       if(secilen!=0)
       {
           
          item = uretici_combo.getSelectedItem();
          String uretici_kodu = ((ComboItem)item).getValue(); 
          
           
          sorgu=sorgu.concat("and uretici_kodu= '"+uretici_kodu+"'   ");
    
       }
       
       secilen=ilac_turu_combo.getSelectedIndex();
       
       
       if(secilen!=0)
       {
         
          item = ilac_turu_combo.getSelectedItem();
          String ilac_turu = ((ComboItem)item).getValue();
           
          sorgu=sorgu.concat("and ilac_tur_kodu= '"+ilac_turu+"'   ");
           
       }
       
       secilen=recete_combo.getSelectedIndex();
                            
       if(secilen!=0)
       {
         
          item = recete_combo.getSelectedItem();
          String recete = ((ComboItem)item).getValue();
           
          sorgu=sorgu.concat("and a.recete_kodu= '"+recete+"'   ");
          
          
           
       }

       
        try
        {
            
            statement=conn.createStatement();
            
            resultset = statement.executeQuery(sorgu);
            
            while(resultset.next())
            {
             
               ilac_kodu=resultset.getString("ilac_kodu");
               ilac_adi=resultset.getString("ilac_adi");
               uretici_adi=resultset.getString("uretici_adi");
               ilac_turum=resultset.getString("ilac_turu");
               recete_tipi=resultset.getString("recete_tipi");
               
               Object [] eklenecek = {ilac_kodu,ilac_adi,uretici_adi,ilac_turum,recete_tipi};
               
               model.addRow(eklenecek);
            
                
            }
            
            resultset.close();
            
        }
                       
       
         
         catch (SQLException ex) 
         {
             
           ex.printStackTrace();
           return;
                  
         }
        
       int count= jTable1.getModel().getRowCount(); 
       
       if(count==0)
       {
           
             JOptionPane.showMessageDialog(this,"Arama Kriterlerinize Uygun Bir Kayıt Bulunmamaktadır","UYARI",JOptionPane.WARNING_MESSAGE);  
             
             temizle();
             
             ilac_kodu_field.requestFocus();
             
             return;
           
       }
        
        
        
    }//GEN-LAST:event_Ara_butonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        ilac_islem_ekrani ekran = new ilac_islem_ekrani();
        ekran.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ilac_tanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilac_tanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilac_tanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilac_tanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ilac_tanim().setVisible(true);
            }
        });
    }
     public void combo_box_doldur()
     {
         
        //Uretici COMBOBOX DOLDURMA İŞLEMLERİ
        String uretici_sorgu ="Select uretici_kod,uretici_adi"
                      + " from uretici_bilgileri order by uretici_kod";
    
      
    
        resultset = Getir(uretici_sorgu );
        
         try 
        {
            while (resultset.next())
            { 
                
                uretici_combo.addItem(new ComboItem(resultset.getString("uretici_adi"),resultset.getString("uretici_kod")));
                
            }

        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
     
         
        //İLAÇ TÜRÜ COMBO DOLDURMA İŞLEMLERİ
         
        String ilac_turu_sorgu ="Select ilac_turu_kodu,ilac_turu"
                        + " from ilac_turleri order by ilac_turu_kodu";
    
      
    
        resultset = Getir(ilac_turu_sorgu );
        
         try 
        {
            while (resultset.next())
            { 
                
                ilac_turu_combo.addItem(new ComboItem(resultset.getString("ilac_turu"),resultset.getString("ilac_turu_kodu")));
            }

        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
         
         
        //RECETELER COMBO DOLDURMA İŞLEMLERİ
         
        String receteler_sorgu ="Select recete_kodu,recete_tipi"
                        + " from receteler order by recete_kodu";
    
      
    
        resultset = Getir(receteler_sorgu );
        
         try 
        {
            while (resultset.next())
            { 
                
                recete_combo.addItem(new ComboItem(resultset.getString("recete_tipi"),resultset.getString("recete_kodu")));
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
      
      
    public boolean kod_kontrol(String kod)
    {
        
        String sorgu= " Select ilac_kodu from "
                + "ilac_detay"
                + " where ilac_kodu=?";
        
              
        try
        {
            PreparedStatement st = conn.prepareStatement(sorgu);

           
            st.setString(1,kod); //Soru işareti yerine tc gönderiyoruz
           
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ara_buton;
    private javax.swing.JButton ekle_buton;
    private javax.swing.JButton getir_buton;
    private javax.swing.JButton guncelle_buton;
    private javax.swing.JTextField ilac_adi_field;
    private javax.swing.JTextField ilac_kodu_field;
    private javax.swing.JComboBox ilac_turu_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox recete_combo;
    private javax.swing.JButton sil_buton;
    private javax.swing.JComboBox uretici_combo;
    // End of variables declaration//GEN-END:variables
}
