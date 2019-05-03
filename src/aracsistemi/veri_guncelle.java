package aracsistemi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class veri_guncelle extends javax.swing.JFrame {

    public veri_guncelle() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        veri_id = new javax.swing.JTextField();
        marka = new javax.swing.JButton();
        renk = new javax.swing.JButton();
        yakit_turu = new javax.swing.JButton();
        hiz = new javax.swing.JButton();
        fiyat = new javax.swing.JButton();
        tekerlek_sayisi = new javax.swing.JButton();
        uretim_yili = new javax.swing.JButton();
        yolcu_sayisi = new javax.swing.JButton();
        bir_onceki = new javax.swing.JButton();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Veri ID:");

        marka.setText("Marka");
        marka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markaActionPerformed(evt);
            }
        });

        renk.setText("Renk");
        renk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkActionPerformed(evt);
            }
        });

        yakit_turu.setText("Yakıt Türü");
        yakit_turu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakit_turuActionPerformed(evt);
            }
        });

        hiz.setText("Hız");
        hiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hizActionPerformed(evt);
            }
        });

        fiyat.setText("Fiyat");
        fiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiyatActionPerformed(evt);
            }
        });

        tekerlek_sayisi.setText("Tekerlek Sayısı");
        tekerlek_sayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekerlek_sayisiActionPerformed(evt);
            }
        });

        uretim_yili.setText("Üretim Yılı");
        uretim_yili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uretim_yiliActionPerformed(evt);
            }
        });

        yolcu_sayisi.setText("Yolcu Sayısı");
        yolcu_sayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yolcu_sayisiActionPerformed(evt);
            }
        });

        bir_onceki.setText("Bir Önceki Menüye Dön");
        bir_onceki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bir_oncekiActionPerformed(evt);
            }
        });

        cikis.setText("Çıkış");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tekerlek_sayisi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uretim_yili, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yolcu_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yakit_turu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hiz, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(veri_id, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bir_onceki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veri_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marka)
                    .addComponent(renk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hiz)
                    .addComponent(yakit_turu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tekerlek_sayisi)
                    .addComponent(fiyat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uretim_yili)
                    .addComponent(yolcu_sayisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bir_onceki)
                    .addComponent(cikis))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bir_oncekiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bir_oncekiActionPerformed
        this.setVisible(false);
        Frame1 frame = new Frame1();
        frame.setTitle("ARAÇ SİSTEMİ");
        frame.setResizable(false);
        frame.setLocation(600, 400);
        frame.setVisible(true);
    }//GEN-LAST:event_bir_oncekiActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cikisActionPerformed

    @SuppressWarnings("empty-statement")
    private void markaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markaActionPerformed
        
        int i,j,k;
        String line,yedek = null;
        int kontrol=0;
        String[] dosyalar = new String[5];
        dosyalar[0]="otomobil.txt";
        dosyalar[1]="bisiklet.txt";
        dosyalar[2]="gemi.txt";
        dosyalar[3]="ucak.txt";
        dosyalar[4]="ucan_gemi.txt";
        
        String[] dosya = new String[100];        
        
        
        try {
            for(i=0;i<5;i++){
                FileReader fileReader = new FileReader(dosyalar[i]);
                BufferedReader br = new BufferedReader(fileReader);
                
                for(k=0;k<100;k++){
                    dosya[k]="";
                }
                
                k=0;
                while ((line = br.readLine())!=null) {
                    dosya[k]=line;
                    k++;
                }
                
                
                
                for(j=0;!"".equals(dosya[j]);j++){
                    if(dosya[j].equals(veri_id.getText())){
                        yedek = JOptionPane.showInputDialog(null,"Marka");
                        dosya[j+1]=yedek;
                        kontrol=-1;
                        JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                        break;
                    }
                }
                
                
                if(kontrol==-1){
                    Dosya d = new Dosya();
                    d.sil(dosyalar[i]);
                    for(j=0;!"".equals(dosya[j]);j++){
                        d.yaz(dosya[j],dosyalar[i]);
                    }
                   
                    break;
                }
            
                br.close();
            }
            
            if(kontrol!=-1){
                JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_markaActionPerformed

    private void renkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkActionPerformed
        int i,j,k;
        String line,yedek = null;
        int kontrol=0;
        String[] dosyalar = new String[5];
        dosyalar[0]="otomobil.txt";
        dosyalar[1]="bisiklet.txt";
        dosyalar[2]="gemi.txt";
        dosyalar[3]="ucak.txt";
        dosyalar[4]="ucan_gemi.txt";
        
        String[] dosya = new String[100];        
        
        
        try {
            for(i=0;i<5;i++){
                FileReader fileReader = new FileReader(dosyalar[i]);
                BufferedReader br = new BufferedReader(fileReader);
                
                
                for(k=0;k<100;k++){
                    dosya[k]="";
                }
                
                k=0;
                while ((line = br.readLine())!=null) {
                    dosya[k]=line;
                    k++;
                }
                
                
                
                for(j=0;!"".equals(dosya[j]);j++){
                    if(dosya[j].equals(veri_id.getText())){
                        yedek = JOptionPane.showInputDialog(null,"Renk");
                        dosya[j+2]=yedek;
                        JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                        kontrol=-1;
                        break;
                    }
                }
                
                
                if(kontrol==-1){
                    Dosya d = new Dosya();
                    d.sil(dosyalar[i]);
                    for(j=0;!"".equals(dosya[j]);j++){
                        d.yaz(dosya[j],dosyalar[i]);
                    }
                   
                    break;
                }
            
                br.close();  
            }
            
            
            
            if(kontrol!=-1){
                JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
            }
        } catch (IOException ex) {
            Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_renkActionPerformed

    private void yakit_turuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakit_turuActionPerformed
        String yedek1 = (veri_id.getText()).substring(0,1);
        
        if(yedek1.equals("b")){
            JOptionPane.showMessageDialog(null,"'"+veri_id.getText()+"' ID numaralı verinin bu özelliği bulunmamaktadır!");
        }
        else{
            int i,j,k;
            String line,yedek=null;
            int kontrol=0;
            String[] dosyalar = new String[5];
            dosyalar[0]="otomobil.txt";
            dosyalar[1]="gemi.txt";
            dosyalar[2]="ucak.txt";
            dosyalar[3]="ucan_gemi.txt";
        
            String[] dosya = new String[100];        
        
        
            try {
                for(i=0;i<4;i++){
                    FileReader fileReader = new FileReader(dosyalar[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Yakıt Türü");
                            dosya[j+3]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar[i]);
                        }

                        break;
                    }

                    br.close();  
                }

                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                } 
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }//GEN-LAST:event_yakit_turuActionPerformed

    private void hizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hizActionPerformed
        
        String yedek1 = (veri_id.getText()).substring(0,1);
        String[] dosya = new String[100];
        int i,j,k;
        String line,yedek=null;
        int kontrol=0;
        
        
        if(yedek1.equals("b")){
            try {
                
                    FileReader fileReader = new FileReader("bisiklet.txt");
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Hız");
                            dosya[j+3]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil("bisiklet.txt");
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],"bisiklet.txt");
                        }
                    }

                    br.close();  
                
                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            
            String[] dosyalar = new String[5];
            dosyalar[0]="otomobil.txt";
            dosyalar[1]="gemi.txt";
            dosyalar[2]="ucak.txt";
            dosyalar[3]="ucan_gemi.txt";

            try {
                for(i=0;i<4;i++){
                    FileReader fileReader = new FileReader(dosyalar[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Hız");
                            dosya[j+4]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar[i]);
                        }

                        break;
                    }

                    br.close();  
                }
                
                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_hizActionPerformed

    private void fiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyatActionPerformed
        String yedek1 = (veri_id.getText()).substring(0,1);
        String[] dosya = new String[100];
        int i,j,k;
        String line,yedek=null;
        int kontrol=0;
        
        
        if(yedek1.equals("b")){
            try {
                
                    FileReader fileReader = new FileReader("bisiklet.txt");
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Fiyat");
                            dosya[j+4]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil("bisiklet.txt");
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],"bisiklet.txt");
                        }
                    }

                    br.close();  
                
                    if(kontrol!=-1){
                        JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                    }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            
            String[] dosyalar = new String[5];
            dosyalar[0]="otomobil.txt";
            dosyalar[1]="gemi.txt";
            dosyalar[2]="ucak.txt";
            dosyalar[3]="ucan_gemi.txt";

            try {
                for(i=0;i<4;i++){
                    FileReader fileReader = new FileReader(dosyalar[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Fiyat");
                            dosya[j+5]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar[i]);
                        }

                        break;
                    }

                    br.close();  
                }
                
                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_fiyatActionPerformed

    private void tekerlek_sayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekerlek_sayisiActionPerformed
        String yedek1 = (veri_id.getText()).substring(0,1);
        String[] dosya = new String[100];
        int i,j,k;
        String line,yedek=null;
        int kontrol=0;
        
        
        if(yedek1.equals("g")){
            JOptionPane.showMessageDialog(null,"'"+veri_id.getText()+"' ID numaralı verinin bu özelliği bulunmamaktadır!");
        }
        else if(yedek1.equals("b")){
            try {
                
                    FileReader fileReader = new FileReader("bisiklet.txt");
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Tekerlek Sayısı");
                            dosya[j+5]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil("bisiklet.txt");
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],"bisiklet.txt");
                        }
                    }

                    br.close();  
                    
                    if(kontrol!=-1){
                        JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                    }

                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            
            String[] dosyalar = new String[5];
            dosyalar[0]="otomobil.txt";
            dosyalar[1]="ucak.txt";
            dosyalar[2]="ucan_gemi.txt";

            try {
                for(i=0;i<3;i++){
                    FileReader fileReader = new FileReader(dosyalar[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Tekerlek Sayısı");
                            dosya[j+6]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar[i]);
                        }

                        break;
                    }

                    br.close();  
                }
                
                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tekerlek_sayisiActionPerformed

    private void uretim_yiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uretim_yiliActionPerformed
        String yedek1 = (veri_id.getText()).substring(0,1);
        String[] dosya = new String[100];
        int i,j,k;
        String line,yedek=null;
        int kontrol=0;
        
        
        if(yedek1.equals("b") || yedek1.equals("g")){
            String[] dosyalar2=new String[2];
            dosyalar2[0]="bisiklet.txt";
            dosyalar2[1]="gemi.txt";
            try {
                for(i=0;i<2;i++){
                    FileReader fileReader = new FileReader(dosyalar2[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Üretim Yılı");
                            dosya[j+6]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar2[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar2[i]);
                        }
                        break;
                    }

                    br.close();  
                }
                
                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        else{
            
            String[] dosyalar = new String[5];
            dosyalar[0]="otomobil.txt";
            dosyalar[1]="ucak.txt";
            dosyalar[2]="ucan_gemi.txt";

            try {
                for(i=0;i<3;i++){
                    FileReader fileReader = new FileReader(dosyalar[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Üretim Yılı");
                            dosya[j+7]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar[i]);
                        }

                        break;
                    }

                    br.close();  
                }
                
                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_uretim_yiliActionPerformed

    private void yolcu_sayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yolcu_sayisiActionPerformed
        String yedek1 = (veri_id.getText()).substring(0,1);
        String[] dosya = new String[100];
        int i,j,k;
        String line,yedek=null;
        int kontrol=0;
        
        
        if(yedek1.equals("b") || yedek1.equals("g")){
            String[] dosyalar2=new String[2];
            dosyalar2[0]="bisiklet.txt";
            dosyalar2[1]="gemi.txt";
            try {
                for(i=0;i<2;i++){
                    FileReader fileReader = new FileReader(dosyalar2[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Yolcu Sayısı");
                            dosya[j+7]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar2[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar2[i]);
                        }
                        break;
                    }

                    br.close();  
                }

               if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                } 
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        else{
            
            String[] dosyalar = new String[5];
            dosyalar[0]="otomobil.txt";
            dosyalar[1]="ucak.txt";
            dosyalar[2]="ucan_gemi.txt";

            try {
                for(i=0;i<3;i++){
                    FileReader fileReader = new FileReader(dosyalar[i]);
                    BufferedReader br = new BufferedReader(fileReader);


                    for(k=0;k<100;k++){
                        dosya[k]="";
                    }

                    k=0;
                    while ((line = br.readLine())!=null) {
                        dosya[k]=line;
                        k++;
                    }



                    for(j=0;!"".equals(dosya[j]);j++){
                        if(dosya[j].equals(veri_id.getText())){
                            yedek = JOptionPane.showInputDialog(null,"Yolcu Sayısı");
                            dosya[j+8]=yedek;
                            kontrol=-1;
                            JOptionPane.showMessageDialog(null, "Veri Güncellendi!");
                            break;
                        }
                    }


                    if(kontrol==-1){
                        Dosya d = new Dosya();
                        d.sil(dosyalar[i]);
                        for(j=0;!"".equals(dosya[j]);j++){
                            d.yaz(dosya[j],dosyalar[i]);
                        }

                        break;
                    }

                    br.close();  
                }

                if(kontrol!=-1){
                    JOptionPane.showMessageDialog(null,"Girilen '"+veri_id.getText()+"' ID numaralı bir araç bulunmamaktadır !");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(veri_guncelle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_yolcu_sayisiActionPerformed

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
            java.util.logging.Logger.getLogger(veri_guncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(veri_guncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(veri_guncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(veri_guncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new veri_guncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bir_onceki;
    private javax.swing.JButton cikis;
    private javax.swing.JButton fiyat;
    private javax.swing.JButton hiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton marka;
    private javax.swing.JButton renk;
    private javax.swing.JButton tekerlek_sayisi;
    private javax.swing.JButton uretim_yili;
    private javax.swing.JTextField veri_id;
    private javax.swing.JButton yakit_turu;
    private javax.swing.JButton yolcu_sayisi;
    // End of variables declaration//GEN-END:variables
}
