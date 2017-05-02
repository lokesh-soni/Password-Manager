
package javaapplication16;

import com.sun.glass.ui.Clipboard;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.WindowConstants;

/**
 *
 * @author Navneet
 */
public class prohome1 extends javax.swing.JFrame {
   int n;
public String onpro=new Third().user;

    
    public prohome1() {
        super("Password manager");
      
        this.setIconImage(new Second().Flag.getImage());
      
 //this.setVisible(true);
        initComponents();
       // JOptionPane.showMessageDialog(this, "Welcome " +(new Third().user)+" !!");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
  try{String d,dd,ddd,dddd,actualuser;actualuser = onpro;
        ArrayList<String> fes = new ArrayList();
        ArrayList<String> bankacc = new ArrayList();
        ArrayList<String> insacc = new ArrayList();
        ArrayList<String> otheracc = new ArrayList();
        File f = new File("c:\\Password Manager\\"+actualuser+"\\OnlineSites");
        File ff = new File("c:\\Password Manager\\"+actualuser+"\\Bank");
        File fff = new File("c:\\Password Manager\\"+actualuser+"\\Insurance");
        File ffff = new File("c:\\Password Manager\\"+actualuser+"\\Others");
        String[] fles = f.list();
        String[] fless = ff.list();
        String[] flesss = fff.list();
        String[] flessss = ffff.list();
        int t = fles.length;
        int tt = fless.length;
        int ttt = flesss.length;
        int tttt = flessss.length;
for(int i= 0;i<t;i++){String o = fles[i];try{ String[] fils = o.split("_");d = fils[1];fes.add(d);}catch(Exception eee){}}
int n = fes.size();String[] files = new String[n];for(int cnt=0;cnt<n;cnt++){files[cnt] = fes.get(cnt);}

for(int i= 0;i<tt;i++){String oo = fless[i];try{ String[] filss = oo.split("_");dd = filss[1];bankacc.add(dd);}catch(Exception eee){}}
int nn = bankacc.size();String[] filess = new String[nn];for(int cntt=0;cntt<nn;cntt++){filess[cntt] = bankacc.get(cntt);}		

for(int i= 0;i<ttt;i++){String ooo = flesss[i];try{ String[] filsss = ooo.split("_");ddd = filsss[1];insacc.add(ddd);}catch(Exception eee){}}
int nnn = insacc.size();String[] filesss = new String[nnn];for(int cnttt=0;cnttt<nnn;cnttt++){filesss[cnttt] = insacc.get(cnttt);}		

for(int i= 0;i<tttt;i++){String oooo = flessss[i];try{ String[] filssss = oooo.split("_");dddd = filssss[1];otheracc.add(dddd);}catch(Exception eee){}}
int nnnn = otheracc.size();String[] filessss = new String[nnnn];for(int cntttt=0;cntttt<nnnn;cntttt++){filessss[cntttt] = otheracc.get(cntttt);}		

        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OnlineSitesList = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BankList = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InsuranceList = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        OtherList = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();OnlineSiteMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();BankMenu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();InsuranceMenu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();OtherMenu = new javax.swing.JMenuItem();
        ProfileMenu = new javax.swing.JMenu();
        showProfile = new javax.swing.JMenuItem();
        EditProfile = new javax.swing.JMenuItem();
       jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        signOut = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
         // m1 = new javax.swing.JMenuItem();
        m1 = new javax.swing.JMenuItem();
        m2 = new javax.swing.JMenuItem();
        m3 = new javax.swing.JMenuItem();
        m4 = new javax.swing.JMenuItem();
          m5 = new javax.swing.JMenuItem();  m6 = new javax.swing.JMenuItem();jMenu6 = new javax.swing.JMenu();
        
        AboutMentor = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        AboutDevelopers = new javax.swing.JMenu();
        jMenu1.setText("jMenu1");jMenuItem3.setText("jMenuItem3");
        jMenuItem4.setText("jMenuItem4");jMenu3.setText("File");
        jMenuBar2.add(jMenu3);jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);menu1.setLabel("File");
        menuBar1.add(menu1);menu2.setLabel("Edit");
        menuBar1.add(menu2);jLabel1.setText("jLabel1");
        jButton1.setText("jButton1");setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 500, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("BrandonGrotesque-Medium", 0, 11)); // NOI18N
        
        OnlineSitesList.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        OnlineSitesList.setModel(new javax.swing.AbstractListModel() { 
        public int getSize() { return files.length; }
        public Object getElementAt(int i) { return files[i]; }
        });OnlineSitesList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        OnlineSitesListMouseClicked(evt);}});
        OnlineSitesList.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
        OnlineSitesListComponentShown(evt);}});
        jScrollPane1.setViewportView(OnlineSitesList);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE));
        jTabbedPane1.addTab("Online Sites", jPanel1);
        
        BankList.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        BankList.setModel(new javax.swing.AbstractListModel() {
       // String[] strings = { "SBI", "KODAK", "ICICI", "Corporation Bank", "Citi Bank" };
        public int getSize() { return filess.length; }
        public Object getElementAt(int i) { return filess[i]; }});
        BankList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        BankListMouseClicked(evt);}});
        BankList.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
        BankListComponentShown(evt);}});
        jScrollPane3.setViewportView(BankList);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE));
        jTabbedPane1.addTab("Banks", jPanel2);
        
        InsuranceList.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        InsuranceList.setModel(new javax.swing.AbstractListModel() {
        public int getSize() { return filesss.length; }
        public Object getElementAt(int i) { return filesss[i]; }});
        InsuranceList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        InsuranceListMouseClicked(evt);}});
        InsuranceList.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
        InsuranceListComponentShown(evt);}});
        jScrollPane4.setViewportView(InsuranceList);
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE));
        jTabbedPane1.addTab("Insurances", jPanel3);

        OtherList.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        OtherList.setModel(new javax.swing.AbstractListModel() {
        public int getSize() { return filessss.length; }
        public Object getElementAt(int i) { return filessss[i]; }});
        OtherList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        OtherListMouseClicked(evt);}});
        OtherList.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentShown(java.awt.event.ComponentEvent evt) {
        OtherListComponentShown(evt);}});
        jScrollPane5.setViewportView(OtherList);
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)     );
        jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)    );
        jTabbedPane1.addTab("Others", jPanel5);
        
        jMenu4.setText("New");

        OnlineSiteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        OnlineSiteMenu.setText("Online Sites");
        OnlineSiteMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        OnlineSiteMenuMouseClicked(evt);}});
        OnlineSiteMenu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        OnlineSiteMenuActionPerformed(evt);}});
        jMenu4.add(OnlineSiteMenu);
        jMenu4.add(jSeparator1);

        BankMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        BankMenu.setText("Banks");
        BankMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        BankMenuMouseClicked(evt);}});
        BankMenu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        BankMenuActionPerformed(evt);}});
        jMenu4.add(BankMenu);
        
        jMenu4.add(jSeparator2);

        InsuranceMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        InsuranceMenu.setText("Insurances");
        InsuranceMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        InsuranceMenuMouseClicked(evt);}});
        InsuranceMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceMenuActionPerformed(evt);
            }
        });
        jMenu4.add(InsuranceMenu);
        jMenu4.add(jSeparator3);

        OtherMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        OtherMenu.setText("others");
        OtherMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OtherMenuMouseClicked(evt);
            }
        });
        OtherMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherMenuActionPerformed(evt);
            }
        });
        jMenu4.add(OtherMenu);

        jMenuBar1.add(jMenu4);
        
        ProfileMenu.setText("Profile");
      
       
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MenuMouseClicked(evt);}});
       showProfile.setText("Show Profile");
ProfileMenu.add(showProfile);
showProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProfileActionPerformed(evt);
            }
        });
ProfileMenu.add(jSeparator6);
        EditProfile.setText("Edit Profile");
ProfileMenu.add(EditProfile);

        EditProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        //InsuranceMenu.setText("Insurances");
       
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });
        ProfileMenu.add(jSeparator5);
    signOut.setText("Sign Out");
    ProfileMenu.add(signOut);
 //signOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        //InsuranceMenu.setText("Insurances");
       
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jMenuBar1.add(ProfileMenu);

        jMenu2.setText("About Us");

        AboutMentor.setText("Mentor");
        jMenu2.add(AboutMentor);
        AboutMentor.add(m1);
        m1.setText("Rajan Chettri (8126753642)");
        jMenu2.add(jSeparator4);

        AboutDevelopers.setText("Developers");
        jMenu2.add(AboutDevelopers);
        AboutDevelopers.add(m2);
        m2.setText("Lokesh Soni (8100698151)");
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        AboutDevelopers.add(m3);
        m3.setText("Sreejani Dey (8296852905)");
        m4.setText("Nilesh Singh (9681407610)");
        m5.setText("Pallavi Kumar");
        m6.setText("Roshan Jaiswal (8444867455)");
        AboutDevelopers.add(m4);
        AboutDevelopers.add(m5);
        AboutDevelopers.add(m6);
        jMenuBar1.add(jMenu2);
 jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/1470597244_Find01.png"))); // NOI18N
       // jMenuBar1.add(jMenu6);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);}
       
  catch(Exception e){JOptionPane.showMessageDialog(this, "File not found !!"+e);}
    }// </editor-fold>//GEN-END:initComponents
    void addbutton(){
      
    }
    private void OnlineSiteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineSiteMenuActionPerformed
        OnlineSiteFrame onframe = new OnlineSiteFrame();
        onframe.setVisible(true);
        hide();
            
    }//GEN-LAST:event_OnlineSiteMenuActionPerformed
    private void BankMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankMenuActionPerformed
            Bank1 bf = new Bank1();
            bf.setVisible(true);
            hide();}
    private void InsuranceMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceMenuActionPerformed
        InsuranceFrame insf = new InsuranceFrame();
            insf.setVisible(true);
            hide();}
    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceMenuActionPerformed
       
            new Third().setVisible(true);
            hide();}
    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceMenuActionPerformed
       
    }
    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceMenuActionPerformed
                    new Profile().setVisible(true);
            hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_InsuranceMenuActionPerformed
      private void showProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceMenuActionPerformed
        //InsuranceFrame insf = new InsuranceFrame();
         try{ FileReader reader=new FileReader("C:\\Password Manager\\"+onpro+"\\Profile.txt");
         BufferedReader br=new BufferedReader(reader);
        String data;
       // JOptionPane.showMessageDialog(this,"try"+ br.readLine());
         while((data=br.readLine())!=null)
            {String[] datas = data.split(";");
         JOptionPane.showMessageDialog(this,( datas[0]
    +"\n"+datas[1]+"\n"+
            datas[2]+"\n"+
                    datas[3]+"\n"+
                            datas[4]+"\n"+
                                    datas[5]
            +"\n"+datas[6]+"\n"+datas[7])
    ,"Profile",1
    );
        // TODO add your handling code here:
    }}catch (Exception e){//JOptionPane.showMessageDialog(this, "Your Profile is blank! Please fill it.");
    }
      }
    private void ProfileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileMenuActionPerformed
       
    }//GEN-LAST:event_ProfileMenuActionPerformed
    private void jMenu6MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMenuMouseClicked   
    }
    private void ProfileMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMenuMouseEntered
    }
    private void ProfileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMenuMouseClicked
             Profile pr = new Profile ();
        
        pr.setVisible(true);
        hide();
    }
    private void OnlineSiteMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnlineSiteMenuMouseClicked  
    }
    public void BankListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnlineSitesListMouseClicked
         Object search =null;String actualuser, seearch="";actualuser = onpro;
    int[] selectedIx = this.BankList.getSelectedIndices();      
    for (int i = 0; i < selectedIx.length; i++) {
        search = BankList.getModel().getElementAt(selectedIx[i]);
            try{
            File jk = new File("C:Password Manager\\"+actualuser+"\\Bank");
            File[] gh = jk.listFiles();
            String[] g = jk.list();
            for (String gd : g){
                String p = "bank_"+search;
                if(gd.startsWith(p)){
                     seearch = gd.toString();
                    }     
            }  String [] choice = new String[7];
        choice[0]="Show card pin";
        choice[1]="Show CVV no.";
        choice[2]="Show Website Password";
        choice[3]="Show Details";
        choice[4]="Copy Password";
        choice[5]="Edit Details";
  
        choice[6]="Launch";
          FileReader reader=new FileReader("C:\\Password Manager\\"+actualuser+"\\Bank\\"+seearch+"");
         BufferedReader br=new BufferedReader(reader);
        String data; 
      
     while((data=br.readLine())!=null)
            {   String[] datas = data.split(";");  
            int eee = datas.length;
try{
     try{  n = JOptionPane.showOptionDialog(this,"Select one of them","BANK",-1,JOptionPane.WIDTH,null,choice,choice[0]); 
         String pin  = JOptionPane.showInputDialog("Hey "+actualuser+", Enter your pin");
    {
        String da;
    FileReader readr=new FileReader("C:\\Password Manager\\users.txt");
    BufferedReader br1=new BufferedReader(readr);
        boolean isvalid=false;
        while((da=br1.readLine())!=null)
            {
          if ((da.split(",")[0].equals(actualuser))&& 
                        (da.split(",")[5].equals(pin))){    
                 isvalid = true;        
  
switch (n){
    case 0:{JOptionPane.showMessageDialog(this ,datas[5]);};break;
    case 1:{JOptionPane.showMessageDialog(this, datas[6]);};break;
    case 2:{JOptionPane.showMessageDialog(this ,datas[12]);};break;
    case 3:{
        JOptionPane.showMessageDialog(this ,datas[0]
    +"\n"+datas[1]+"\n"+
            datas[2]+"\n"+
                    datas[3]+"\n"+
                            datas[4]+"\n"+
                                    datas[7]
            +"\n"+datas[8]+"\n"+
                    datas[9]
                            +"\n"+datas[10]+"\n"+
                                    datas[11]+"\n"+datas[12]+"\n"+
                                              datas[13]+"\n"+datas[14]
    
    );};break;
    case 4:{String myString = datas[12].split(":")[1];
StringSelection stringSelection = new StringSelection(myString);
        java.awt.datatransfer.Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
clpbrd.setContents(stringSelection, null);
JOptionPane.showMessageDialog(this ,"Password Copied");
 
    
    };break;
        
        
    case 5:{
        Bank1 b = new Bank1();
        b.setVisible(true);
//    b.setVisible(true);
      
    b.jTextField1.setText((datas[0]).split(":")[1]);
    b.jTextField2.setText((datas[1]).split(":")[1]);
    b.jComboBox2.setSelectedItem((datas[2]).split(":")[1]);
    b.jTextField3.setText((datas[3]).split(":")[1]);
    b.jComboBox2.setSelectedItem((datas[4]).split(":")[1]);
    b.jPasswordField2.setText((datas[5]).split(":")[1]);
    b.jTextField5.setText((datas[6]).split(":")[1]);
    b.jTextField4.setText((datas[7]).split(":")[1]);
    b.jTextField7.setText((datas[10]).split(":")[1]);
    b.jTextField8.setText((datas[11]).split(":")[1]);
    b.jTextField9.setText((datas[12]).split(":")[1]);
    b.jPasswordField1.setText((datas[13]).split(":")[1]);
    b.jTextArea1.setText((datas[14]).split(":")[1]);hide();
    };break;
    case 6:{ try {String opp ="https:"+datas[11].split(":")[1];
Desktop.getDesktop().browse(new URL(opp).toURI());
Desktop.getDesktop().browse(null);
}catch (Exception eq){};};break;
  //  case 6:{new Bank1().delete(((datas[0]).split(":")[1]),((datas[3]).split(":")[1]));};break;}
}}}if (isvalid == false){JOptionPane.showMessageDialog(this, "Oops incorrect pin!!");}
}}catch(Exception ee){JOptionPane.showMessageDialog(this, ee);}}
catch(Exception e){JOptionPane.showMessageDialog(this ,e);}
}}catch(Exception ex){}}}
    public void InsuranceListMouseClicked(java.awt.event.MouseEvent evt) {
    //    JOptionPane.showMessageDialog(this, "search:seearch:\n data:");

        Object search =null;String actualuser, seearch="";actualuser = onpro;
    int[] selectedIx = this.InsuranceList.getSelectedIndices();      
    for (int i = 0; i < selectedIx.length; i++) {
        search = InsuranceList.getModel().getElementAt(selectedIx[i]);
            try{
            File jk = new File("C:Password Manager\\"+actualuser+"\\Insurance");
            File[] gh = jk.listFiles();
            String[] g = jk.list();
            for (String gd : g){
                String p = "insurance_"+search;
                if(gd.startsWith(p)){
                     seearch = gd.toString();
                    }     
            }
                 //   JOptionPane.showMessageDialog(this, "search:"+search+"seearch:"+seearch+"\n data:");

          FileReader reader=new FileReader("C:\\Password Manager\\"+actualuser+"\\Insurance\\"+seearch);
         BufferedReader br=new BufferedReader(reader);
        String data;
        String[] choice=new String[5];
        choice[0]="Show Password" ;
        choice[1]="Copy Password";
        choice[2]="Show Details";
        choice[3]="Edit Details";
    //    choice[4]="Delete Account";
        choice[4]="Launch";
        while((data=br.readLine())!=null)
            {   String[] datas = data.split(";");          
try{
     try{  n = JOptionPane.showOptionDialog(this,"Select one of them",datas[0],-1,JOptionPane.WIDTH,null,choice,choice[0]); 
         String pin  = JOptionPane.showInputDialog("Hey "+actualuser+", Enter your pin");
        String da;
    FileReader readr=new FileReader("C:\\Password Manager\\users.txt");
    BufferedReader br1=new BufferedReader(readr);
        boolean isvalid=false;
        while((da=br1.readLine())!=null)
            {
          if ((da.split(",")[0].equals(actualuser))&& 
                        (da.split(",")[5].equals(pin))){    
                 isvalid = true;
  
switch (n){
                case 0 :JOptionPane.showMessageDialog(this ,"Your password:"+datas[8]);
                    break;
                case 1:{String myString = datas[8].split(":")[1];
StringSelection stringSelection = new StringSelection(myString);
        java.awt.datatransfer.Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
clpbrd.setContents(stringSelection, null);
JOptionPane.showMessageDialog(this ,"Password Copied");};
                    break;
                case 2:JOptionPane.showMessageDialog(this ,datas[0]
    +"\n"+datas[1]+"\n"+datas[2]+"\n"+datas[3]+"\n"+datas[4]+"\n"+datas[5]+"\n"+datas[6]+"\n"+datas[7]+"\n"+datas[8]);break;
                case 3:{
        InsuranceFrame b = new InsuranceFrame();
    b.setVisible(true);
    
    b.jTextField1.setText((datas[0]).split(":")[1]);
    b.jTextField2.setText((datas[1]).split(":")[1]);
  
    b.jTextField3.setText((datas[2]).split(":")[1]);
  
  
    b.jTextField5.setText((datas[4]).split(":")[1]);
    b.jTextField4.setText((datas[3]).split(":")[1]);
    b.jTextField6.setText((datas[5]).split(":")[1]);
    b.jTextField7.setText((datas[6]).split(":")[1]);
    b.jPasswordField1.setText((datas[7]).split(":")[1]);
      };break;
                //case 4:{};break;
                case 4:{  {
                try{
                    String opp ="https:"+datas[6];
Desktop.getDesktop().browse(new URL(opp).toURI());
Desktop.getDesktop().browse(null);
}catch (Exception eq){}}};
                
                    
                
                break;
                default:{break;}
                }
}}if (isvalid == false){JOptionPane.showMessageDialog(this, "Oops incorrect pin!!");}
}catch(Exception ee){JOptionPane.showMessageDialog(this, ee);}
}catch(Exception e){JOptionPane.showMessageDialog(this ,e);}}
}catch(IOException ex){}}}
    public void OtherListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnlineSitesListMouseClicked
    Object search =null;String actualuser, seearch="";actualuser = onpro;
    int[] selectedIx = this.OtherList.getSelectedIndices();      
    for (int i = 0; i < selectedIx.length; i++) {
        search = OtherList.getModel().getElementAt(selectedIx[i]);
            try{
            File jk = new File("C:Password Manager\\"+actualuser+"\\Others");
            File[] gh = jk.listFiles();
            String[] g = jk.list();
            for (String gd : g){
                String p = "other_"+search;
                if(gd.startsWith(p)){seearch = gd.toString();}}
            FileReader reader=new FileReader("C:\\Password Manager\\"+actualuser+"\\Others\\"+seearch);
         BufferedReader br=new BufferedReader(reader);
        String data;
        String[] choice=new String[3];
        choice[0]= "Show Password " ;
        choice[1]="Show Details";
        choice[2]="Edit Details";
        //choice[3]="Delete Account";
              while((data=br.readLine())!=null)
            {   String[] datas = data.split(";");          
try{
     try{  n = JOptionPane.showOptionDialog(this,"Select one of them",datas[1].split(":")[1].toString(),-1,JOptionPane.WIDTH,null,choice,choice[0]); 
         String pin  = JOptionPane.showInputDialog("Hey "+actualuser+", Enter your pin");
        String da;
    FileReader readr=new FileReader("C:\\Password Manager\\users.txt");
    BufferedReader br1=new BufferedReader(readr);
        boolean isvalid=false;
        while((da=br1.readLine())!=null)
            {
          if ((da.split(",")[0].equals(actualuser))&& 
                        (da.split(",")[5].equals(pin))){    
                 isvalid = true;
switch (n){     
    case 0:{JOptionPane.showMessageDialog(this ,"Your "+datas[1]);};break;
        case 1:{JOptionPane.showMessageDialog(this ,datas[0]
    +"\n"+datas[1]+"\n"+datas[2]);};break;
            case 2:{
            Other oo = new Other();
            
                    Other on = new Other();
                    on.setVisible(true);
on.jTextField1.setText(datas[0].split(":")[1]);
on.jTextField2.setText(datas[1].split(":")[1]);
on.jTextArea1.setText(datas[2].split(":")[1]);
hide();
//on.jTextField5.setText(datas[3])
};break;
             //   case 3:{new Other().delete(((datas[0]).split(":")[1]),((datas[3]).split(":")[1]));};break;      
    default:{};break;}
}}if (isvalid == false){JOptionPane.showMessageDialog(this, "Oops incorrect pin!!");}
}catch(Exception ee){JOptionPane.showMessageDialog(this, ee);}
}catch(Exception e){JOptionPane.showMessageDialog(this ,e);}}
}catch(IOException ex){}}}
    public void OnlineSitesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnlineSitesListMouseClicked
    Object search =null;String actualuser, seearch="";actualuser = onpro;
    int[] selectedIx = this.OnlineSitesList.getSelectedIndices();      
    for (int i = 0; i < selectedIx.length; i++) {
        search = OnlineSitesList.getModel().getElementAt(selectedIx[i]);
            try{
            File jk = new File("C:Password Manager\\"+actualuser+"\\OnlineSites");
            File[] gh = jk.listFiles();
            String[] g = jk.list();
            for (String gd : g){
                String p = "online_"+search;
                if(gd.startsWith(p)){
                     seearch = gd.toString();
                    }     
            }
          FileReader reader=new FileReader("C:\\Password Manager\\"+actualuser+"\\OnlineSites\\"+seearch+"");
         BufferedReader br=new BufferedReader(reader);
        String data;
        String[] choice=new String[6];
        choice[0]= "Show Password " ;
        choice[1]="Edit Password";
        choice[2]="Copy Password";
        choice[3]="Copy Link";
        choice[4]="Edit Details";
       // choice[5]="Delete Account";
        choice[5]="Launch";
        while((data=br.readLine())!=null)
            {   String[] datas = data.split(",");          
try{
     try{  n = JOptionPane.showOptionDialog(this,"Select one of them",datas[0],-1,JOptionPane.WIDTH,null,choice,choice[0]); 
         String pin  = JOptionPane.showInputDialog("Hey "+actualuser+", Enter your pin");
        String da;
    FileReader readr=new FileReader("C:\\Password Manager\\users.txt");
    BufferedReader br1=new BufferedReader(readr);
        boolean isvalid=false;
        while((da=br1.readLine())!=null)
            {
          if ((da.split(",")[0].equals(actualuser))&& 
                        (da.split(",")[5].equals(pin))){    
                 isvalid = true;
  
switch (n){
                case 0 :JOptionPane.showMessageDialog(this ,"Your password:"+datas[3]);
                    break;
                case 1 :String hh = JOptionPane.showInputDialog(this, "Current Password:"+datas[3], "Change Password", 2);
                    datas[3]=hh;
                   
                    JOptionPane.showMessageDialog(this, "New Password:"+ datas[3],"Password Changed", JOptionPane.PLAIN_MESSAGE);
               
  
                    String hq = "C:\\online_"+datas[0]+"_"+datas[2]+".txt";
                     try{
           
         FileWriter Writer = new FileWriter("C:\\Password Manager\\"+actualuser+"\\OnlineSites\\online_"+datas[0]+"_"+datas[2]+".txt");
                     BufferedWriter out = new BufferedWriter(Writer);
         String con = datas[0]+","+datas[1]+","+datas[2]+","+datas[3];
         out.write(con);
         out.flush();
         out.close();}catch(Exception e){JOptionPane.showMessageDialog(this ,e);}
                    break;
                case 2 :{String myString = datas[3];
StringSelection stringSelection = new StringSelection(myString);
        java.awt.datatransfer.Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
clpbrd.setContents(stringSelection, null);
JOptionPane.showMessageDialog(this ,"Password Copied");
                };
                    break;
                case 3 :{String myString = datas[1];
StringSelection stringSelection = new StringSelection(myString);
        java.awt.datatransfer.Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
clpbrd.setContents(stringSelection, null);
                JOptionPane.showMessageDialog(this ,"Link Copied");};
                    break;
                case 4 :{
                   prohome1 gg = new prohome1();
gg.disable();
                    OnlineSiteFrame on = new OnlineSiteFrame();
on.jTextField2.setText(datas[0]);
on.jTextField3.setText(datas[1]);
on.jTextField4.setText(datas[2]);
on.jTextField5.setText(datas[3]);


on.setVisible(true);

               };
                    break;
                case 5 :  {
                try{
                    String opp ="https:"+datas[1];
Desktop.getDesktop().browse(new URL(opp).toURI());
Desktop.getDesktop().browse(null);
}catch (Exception eq){}
                };break; default:{};break;}
}}if (isvalid == false){JOptionPane.showMessageDialog(this, "Oops incorrect pin!!");}
}catch(Exception ee){JOptionPane.showMessageDialog(this, ee);}
}catch(Exception e){JOptionPane.showMessageDialog(this ,e);}}
}catch(IOException ex){}}}

    private void BankMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankMenuMouseClicked
            
        // TODO add your handling code here:
    }//GEN-LAST:event_BankMenuMouseClicked

    private void InsuranceMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsuranceMenuMouseClicked
             // TODO add your handling code here:
    }//GEN-LAST:event_InsuranceMenuMouseClicked
    private void OtherMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OtherMenuMouseClicked
 
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherMenuMouseClicked
    private void OtherMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherMenuActionPerformed
            Other of = new Other();
            of.setVisible(true);
            hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherMenuActionPerformed
    private void OnlineSitesListComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_OnlineSitesListComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_OnlineSitesListComponentShown
    private void BankListComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_OnlineSitesListComponentShown
 }// TODO add your handling code here:
    private void InsuranceListComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_OnlineSitesListComponentShown
     }      // TODO add your handling code here:
    private void OtherListComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_OnlineSitesListComponentShown
        // TODO add your handling code here:
     }
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
            java.util.logging.Logger.getLogger(prohome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prohome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prohome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prohome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prohome1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutDevelopers;
    private javax.swing.JMenu AboutMentor;
    private javax.swing.JList BankList;
    private javax.swing.JMenuItem BankMenu;
    private javax.swing.JList InsuranceList;
    private javax.swing.JMenuItem InsuranceMenu;
    private javax.swing.JMenuItem OnlineSiteMenu;
    private javax.swing.JMenuItem showProfile; 
    private javax.swing.JMenuItem EditProfile;
    private javax.swing.JMenuItem signOut;
    private javax.swing.JList OnlineSitesList;
    private javax.swing.JList OtherList;
    private javax.swing.JMenuItem OtherMenu;
    public javax.swing.JMenu ProfileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem m1;
    private javax.swing.JMenuItem m2;
    private javax.swing.JMenuItem m3;
    private javax.swing.JMenuItem m4;
    private javax.swing.JMenuItem m5;
    private javax.swing.JMenuItem m6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6; private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
