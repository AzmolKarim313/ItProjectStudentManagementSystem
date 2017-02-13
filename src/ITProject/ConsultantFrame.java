/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITProject;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Azmol-IT
 */
public class ConsultantFrame extends javax.swing.JFrame {

    DatabaseConnection dbObj = new DatabaseConnection();
    SwingComponentAccess component = new SwingComponentAccess();
    Connection con = dbObj.doConnection();
    PreparedStatement pstm = null;
    
    private String strAddSyllabusTopics, strAddSyllabusHours;
    private int  strAddSyllabusMonth;
    
    private String strUpdateSyllabusTopics, strUpdateSyllabusHours;
    private int  strUpdateSyllabusMonth;
        
    /**
     * Creates new form ConsultantFrame
     */
    public ConsultantFrame() {
        initComponents();
        openingWindow();
    }
    
    public void openingWindow(){
        windowConfig();
        panelDynamicCons.setVisible(false);
        initialComboBox();
        retriveConsInfo();
//        showConsImage();
//        consCourseCode();
        component.courseCodeRetrive(cbxConsbatchInfoCourseCode, cbxConsbatchInfoRound);
        component.courseCodeRetrive(cbxConsSyllaInfoCourseCode, cbxConsSyllaInfoRound);
        component.courseCodeRetrive(cbxResultinfoCourseCode, cbxResultinfoRound);
//        component.courseCodeRetrive(cbxAddSyllabus);
    }
    
    public void initialComboBox(){
        cbxConsSyllaInfoCourseCode.addItem("Select");
        cbxConsSyllaInfoRound.addItem("Select");
        cbxConsbatchInfoCourseCode.addItem("Select");
        cbxConsbatchInfoRound.addItem("Select");
        cbxResultinfoBatch.addItem("Select");
        cbxResultinfoCourseCode.addItem("Select");
        cbxResultinfoRound.addItem("Select");
        cbxSyllabusMonth.addItem("Select");
//        cbxAddSyllabus.addItem("Select");
    }
    
    public void windowConfig(){
        getContentPane().setBackground(new Color(208, 236, 231));
        Toolkit theKit = this.getToolkit();
        Dimension winSize = theKit.getScreenSize();
        this.setLocation(winSize.width/28, winSize.height/20);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/icon.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panelDynamicCons = new javax.swing.JPanel();
        panelConsInfo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtConsSub = new javax.swing.JTextField();
        txtConsPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConsName = new javax.swing.JTextField();
        txtConsUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtConsEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtConsFrame = new javax.swing.JTextField();
        lblImageInfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtConsMdyName = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtOldPass = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        txtReNewPass = new javax.swing.JPasswordField();
        lblImageModify = new javax.swing.JLabel();
        panelBatchInfo = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cbxConsbatchInfoRound = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cbxConsbatchInfoCourseCode = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConsBatchnfo = new javax.swing.JTable();
        panelSyllabusInfo = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbxConsSyllaInfoRound = new javax.swing.JComboBox();
        cbxConsSyllaInfoCourseCode = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        panelDynamicSyllabus = new javax.swing.JPanel();
        panelSylView = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsSyllabus = new javax.swing.JTable();
        panelSylAdd = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtAddSyllabusTopics = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAddSyllabusHours = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtAddSyllabusMonth = new javax.swing.JTextField();
        panelSylModify = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        txtUpdateSyllabusTopic = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtUpdateSyllabusHour = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cbxSyllabusMonth = new javax.swing.JComboBox();
        panelResultInfo = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        cbxResultinfoRound = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cbxResultinfoCourseCode = new javax.swing.JComboBox();
        cbxResultinfoBatch = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        txtConsResultMonth = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtResStuId = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtResStuName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtExternalMark = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtEvidenceMark = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableResDetail = new javax.swing.JTable();
        panelReplaceInfo = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        cbxRepReport = new javax.swing.JComboBox();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableReplaceInfo = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IT Scholarship Project");
        setPreferredSize(new java.awt.Dimension(950, 654));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(208, 236, 231));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        jPanel6.setLayout(new java.awt.GridLayout(7, 1, 5, 5));

        jButton1.setBackground(new java.awt.Color(208, 236, 231));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton1.setText("Consultant Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jButton2.setBackground(new java.awt.Color(208, 236, 231));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton2.setText("Batch Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);

        jButton3.setBackground(new java.awt.Color(208, 236, 231));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton3.setText("Syllabus Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);

        jButton4.setBackground(new java.awt.Color(208, 236, 231));
        jButton4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton4.setText("Result Information");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);

        jButton5.setBackground(new java.awt.Color(208, 236, 231));
        jButton5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton5.setText("Replacement Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5);

        panelDynamicCons.setBackground(new java.awt.Color(208, 236, 231));
        panelDynamicCons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelDynamicCons.setLayout(new java.awt.CardLayout());

        panelConsInfo.setBackground(new java.awt.Color(208, 236, 231));

        jPanel1.setBackground(new java.awt.Color(254, 245, 231));

        jPanel3.setBackground(new java.awt.Color(254, 245, 231));

        txtConsSub.setEditable(false);

        txtConsPhone.setEditable(false);

        jLabel5.setText("Contact No. : ");

        txtConsName.setEditable(false);

        txtConsUserName.setEditable(false);

        jLabel2.setText("Consultant Name : ");

        jLabel6.setText("User Name : ");

        jLabel4.setText("Email : ");

        txtConsEmail.setEditable(false);

        jLabel3.setText("Coordinate Subject : ");

        jLabel1.setText("Consulting Frame : ");

        txtConsFrame.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsUserName))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConsName)
                                    .addComponent(txtConsSub)
                                    .addComponent(txtConsEmail)
                                    .addComponent(txtConsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConsFrame)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtConsUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtConsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtConsFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtConsSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(txtConsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtConsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblImageInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageInfo.setText("jLabel7");
        lblImageInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 3, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(lblImageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblImageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personal Information", jPanel1);

        jPanel2.setBackground(new java.awt.Color(254, 245, 231));

        jPanel4.setBackground(new java.awt.Color(254, 245, 231));

        jLabel11.setText("New Re-Password :");

        txtConsMdyName.setEditable(false);

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setText("Old Password : ");

        jLabel8.setText("User Name : ");

        jLabel10.setText("New Password : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConsMdyName, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtOldPass)
                            .addComponent(txtNewPass)
                            .addComponent(txtReNewPass)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtConsMdyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtReNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap())
        );

        lblImageModify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageModify.setText("jLabel7");
        lblImageModify.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 3, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(lblImageModify, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageModify, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modify Information", jPanel2);

        javax.swing.GroupLayout panelConsInfoLayout = new javax.swing.GroupLayout(panelConsInfo);
        panelConsInfo.setLayout(panelConsInfoLayout);
        panelConsInfoLayout.setHorizontalGroup(
            panelConsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        panelConsInfoLayout.setVerticalGroup(
            panelConsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDynamicCons.add(panelConsInfo, "card2");

        panelBatchInfo.setBackground(new java.awt.Color(208, 236, 231));

        jPanel7.setBackground(new java.awt.Color(245, 238, 248));

        jPanel5.setBackground(new java.awt.Color(245, 238, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avilable Batch Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel14.setText("Round : ");

        cbxConsbatchInfoCourseCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxConsbatchInfoCourseCodeItemStateChanged(evt);
            }
        });

        jLabel13.setText("Cousre Name : ");

        jButton10.setText("Show");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxConsbatchInfoCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxConsbatchInfoRound, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(cbxConsbatchInfoRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cbxConsbatchInfoCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(245, 238, 248));

        tableConsBatchnfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableConsBatchnfo.setRowHeight(25);
        tableConsBatchnfo.setRowMargin(3);
        jScrollPane2.setViewportView(tableConsBatchnfo);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout panelBatchInfoLayout = new javax.swing.GroupLayout(panelBatchInfo);
        panelBatchInfo.setLayout(panelBatchInfoLayout);
        panelBatchInfoLayout.setHorizontalGroup(
            panelBatchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBatchInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelBatchInfoLayout.setVerticalGroup(
            panelBatchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBatchInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDynamicCons.add(panelBatchInfo, "card3");

        panelSyllabusInfo.setBackground(new java.awt.Color(214, 234, 248));

        jPanel9.setBackground(new java.awt.Color(214, 234, 248));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Required Batch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei", 1, 12))); // NOI18N

        jLabel15.setText("Round : ");

        jLabel16.setText("Course Code : ");

        cbxConsSyllaInfoRound.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxConsSyllaInfoRoundItemStateChanged(evt);
            }
        });

        cbxConsSyllaInfoCourseCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxConsSyllaInfoCourseCodeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxConsSyllaInfoCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxConsSyllaInfoRound, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(cbxConsSyllaInfoCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxConsSyllaInfoRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(214, 234, 248));
        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        jPanel10.setLayout(new java.awt.GridLayout(7, 1, 5, 5));

        jButton7.setBackground(new java.awt.Color(214, 234, 248));
        jButton7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton7.setText("View Syllabus");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7);

        jButton8.setBackground(new java.awt.Color(214, 234, 248));
        jButton8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton8.setText("Add Syllabus");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8);

        jButton9.setBackground(new java.awt.Color(214, 234, 248));
        jButton9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton9.setText("Modify Syllabus");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9);

        panelDynamicSyllabus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.pink, java.awt.Color.pink, java.awt.Color.pink, java.awt.Color.pink));
        panelDynamicSyllabus.setLayout(new java.awt.CardLayout());

        tableConsSyllabus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableConsSyllabus.setRowHeight(25);
        jScrollPane1.setViewportView(tableConsSyllabus);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSylViewLayout = new javax.swing.GroupLayout(panelSylView);
        panelSylView.setLayout(panelSylViewLayout);
        panelSylViewLayout.setHorizontalGroup(
            panelSylViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSylViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSylViewLayout.setVerticalGroup(
            panelSylViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSylViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDynamicSyllabus.add(panelSylView, "card2");

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));

        jLabel18.setText("Topics Name : ");

        jLabel17.setText("Month No. : ");

        jButton11.setText("Add Topic");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel19.setText("Total Hours : ");

        txtAddSyllabusMonth.setEditable(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddSyllabusMonth))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAddSyllabusTopics)
                                .addComponent(txtAddSyllabusHours, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtAddSyllabusMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtAddSyllabusTopics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtAddSyllabusHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSylAddLayout = new javax.swing.GroupLayout(panelSylAdd);
        panelSylAdd.setLayout(panelSylAddLayout);
        panelSylAddLayout.setHorizontalGroup(
            panelSylAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSylAddLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        panelSylAddLayout.setVerticalGroup(
            panelSylAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSylAddLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        panelDynamicSyllabus.add(panelSylAdd, "card3");

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));

        jLabel20.setText("Topics Name : ");

        jLabel21.setText("Month No. : ");

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("Update Topic");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel22.setText("Total Hours : ");

        cbxSyllabusMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSyllabusMonthItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUpdateSyllabusTopic)
                            .addComponent(txtUpdateSyllabusHour, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(cbxSyllabusMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton12)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cbxSyllabusMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtUpdateSyllabusTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtUpdateSyllabusHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSylModifyLayout = new javax.swing.GroupLayout(panelSylModify);
        panelSylModify.setLayout(panelSylModifyLayout);
        panelSylModifyLayout.setHorizontalGroup(
            panelSylModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSylModifyLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        panelSylModifyLayout.setVerticalGroup(
            panelSylModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSylModifyLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        panelDynamicSyllabus.add(panelSylModify, "card4");

        javax.swing.GroupLayout panelSyllabusInfoLayout = new javax.swing.GroupLayout(panelSyllabusInfo);
        panelSyllabusInfo.setLayout(panelSyllabusInfoLayout);
        panelSyllabusInfoLayout.setHorizontalGroup(
            panelSyllabusInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSyllabusInfoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelSyllabusInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSyllabusInfoLayout.createSequentialGroup()
                        .addComponent(panelDynamicSyllabus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(panelSyllabusInfoLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelSyllabusInfoLayout.setVerticalGroup(
            panelSyllabusInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSyllabusInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSyllabusInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDynamicSyllabus, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelDynamicCons.add(panelSyllabusInfo, "card4");

        panelResultInfo.setBackground(new java.awt.Color(253, 237, 236));

        jPanel14.setBackground(new java.awt.Color(253, 237, 236));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Batchwise Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cbxResultinfoRound.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxResultinfoRoundItemStateChanged(evt);
            }
        });

        jLabel23.setText("Round :");

        jLabel24.setText("Batch ID : ");

        jLabel32.setText("Course Code : ");

        cbxResultinfoCourseCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxResultinfoCourseCodeItemStateChanged(evt);
            }
        });

        cbxResultinfoBatch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxResultinfoBatchItemStateChanged(evt);
            }
        });

        jLabel33.setText("No. of Month : ");

        txtConsResultMonth.setEditable(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxResultinfoCourseCode, 0, 179, Short.MAX_VALUE)
                            .addComponent(cbxResultinfoRound, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxResultinfoBatch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConsResultMonth)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(cbxResultinfoCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cbxResultinfoRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cbxResultinfoBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtConsResultMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(253, 237, 236));
        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        jPanel15.setLayout(new java.awt.GridLayout(5, 1, 5, 12));

        jButton13.setBackground(new java.awt.Color(253, 237, 236));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("Result Information");
        jButton13.setToolTipText("Required Student Information");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13);

        jButton14.setBackground(new java.awt.Color(253, 237, 236));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("Retake Information");
        jButton14.setToolTipText("Retake Student Information");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton14);

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("Report");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton17);

        jPanel18.setBackground(new java.awt.Color(214, 234, 248));

        jPanel17.setBackground(new java.awt.Color(214, 234, 248));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Result Preparation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel25.setText("Student ID : ");

        txtResStuId.setEditable(false);

        jLabel27.setText("Student Name :");

        txtResStuName.setEditable(false);

        jLabel29.setText("External :");

        jLabel30.setText("Evideance : ");

        jButton15.setBackground(new java.awt.Color(214, 234, 248));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtResStuName, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(txtResStuId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29))))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExternalMark)
                    .addComponent(txtEvidenceMark, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtResStuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtResStuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtExternalMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtEvidenceMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(214, 234, 248));

        tableResDetail.setBackground(new java.awt.Color(214, 234, 248));
        tableResDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableResDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableResDetailMouseClicked(evt);
            }
        });
        tableResDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableResDetailKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tableResDetail);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelResultInfoLayout = new javax.swing.GroupLayout(panelResultInfo);
        panelResultInfo.setLayout(panelResultInfoLayout);
        panelResultInfoLayout.setHorizontalGroup(
            panelResultInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultInfoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelResultInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResultInfoLayout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        panelResultInfoLayout.setVerticalGroup(
            panelResultInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultInfoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelResultInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelResultInfoLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        panelDynamicCons.add(panelResultInfo, "card5");

        panelReplaceInfo.setBackground(new java.awt.Color(250, 229, 211));

        jLabel31.setText("Report Type : ");

        cbxRepReport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "All", "Replaced", "Non-Replaced" }));
        cbxRepReport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRepReportItemStateChanged(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(250, 229, 211));

        tableReplaceInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableReplaceInfo);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton16.setBackground(new java.awt.Color(250, 229, 211));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("Report");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReplaceInfoLayout = new javax.swing.GroupLayout(panelReplaceInfo);
        panelReplaceInfo.setLayout(panelReplaceInfoLayout);
        panelReplaceInfoLayout.setHorizontalGroup(
            panelReplaceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReplaceInfoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelReplaceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReplaceInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxRepReport, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(panelReplaceInfoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelReplaceInfoLayout.setVerticalGroup(
            panelReplaceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReplaceInfoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelReplaceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReplaceInfoLayout.createSequentialGroup()
                        .addGroup(panelReplaceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(cbxRepReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelDynamicCons.add(panelReplaceInfo, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDynamicCons, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(panelDynamicCons, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1262, 661);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panelDynamicCons.setVisible(true);
        // removing panel
        panelDynamicCons.removeAll();
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
        
        // adding panel
        panelDynamicCons.add(panelConsInfo);
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
        
        showConsImage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        panelDynamicCons.setVisible(true);
        // removing panel
        panelDynamicCons.removeAll();
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
        
        // adding panel
        panelDynamicCons.add(panelBatchInfo);
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        panelDynamicCons.setVisible(true);
        // removing panel
        panelDynamicCons.removeAll();
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
        
        // adding panel
        panelDynamicCons.add(panelSyllabusInfo);
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        panelDynamicCons.setVisible(true);
        // removing panel
        panelDynamicCons.removeAll();
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
        
        // adding panel
        panelDynamicCons.add(panelResultInfo);
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        panelDynamicCons.setVisible(true);
        // removing panel
        panelDynamicCons.removeAll();
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
        
        // adding panel
        panelDynamicCons.add(panelReplaceInfo);
        panelDynamicCons.repaint();
        panelDynamicCons.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        // removing panel
        panelDynamicSyllabus.removeAll();
        panelDynamicSyllabus.repaint();
        panelDynamicSyllabus.revalidate();
        
        // adding panel
        panelDynamicSyllabus.add(panelSylView);
        panelDynamicSyllabus.repaint();
        panelDynamicSyllabus.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        // removing panel
        panelDynamicSyllabus.removeAll();
        panelDynamicSyllabus.repaint();
        panelDynamicSyllabus.revalidate();
        
        // adding panel
        panelDynamicSyllabus.add(panelSylAdd);
        panelDynamicSyllabus.repaint();
        panelDynamicSyllabus.revalidate();
        
//        addSylMonth();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        // removing panel
        panelDynamicSyllabus.removeAll();
        panelDynamicSyllabus.repaint();
        panelDynamicSyllabus.revalidate();
        
        // adding panel
        panelDynamicSyllabus.add(panelSylModify);
        panelDynamicSyllabus.repaint();
        panelDynamicSyllabus.revalidate();
        
        modifySylMonth();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        LoginFrame loginMain = new LoginFrame();
        loginMain.setVisible(true);
        dbObj.closeConnection();
    }//GEN-LAST:event_formWindowClosing

    private void cbxConsbatchInfoCourseCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxConsbatchInfoCourseCodeItemStateChanged
//        cbxConsbatchInfoRound.removeItemAt(0);
        component.jCOmboBoxRemove2ndItem(cbxConsbatchInfoRound);
//        consRound(cbxConsbatchInfoCourseCode,cbxConsbatchInfoRound);
        component.roundRetriveByCourse(cbxConsbatchInfoCourseCode,cbxConsbatchInfoRound);
    }//GEN-LAST:event_cbxConsbatchInfoCourseCodeItemStateChanged

    private void cbxConsSyllaInfoCourseCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxConsSyllaInfoCourseCodeItemStateChanged
//        cbxConsSyllaInfoRound.removeItemAt(0);
        component.jCOmboBoxRemove2ndItem(cbxConsSyllaInfoRound);
        component.roundRetriveByCourse(cbxConsSyllaInfoCourseCode, cbxConsSyllaInfoRound);
        
        addSyllabusProcess(cbxConsSyllaInfoCourseCode);
        
        component.jCOmboBoxRemove2ndItem(cbxSyllabusMonth);
        monthRetrive(cbxConsSyllaInfoCourseCode, cbxSyllabusMonth);
//        consRound(cbxConsSyllaInfoCourseCode, cbxConsSyllaInfoRound);

        addSylMonth();
    }//GEN-LAST:event_cbxConsSyllaInfoCourseCodeItemStateChanged

    private void cbxResultinfoCourseCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxResultinfoCourseCodeItemStateChanged
//       cbxResultinfoRound.removeItemAt(0);
        component.jCOmboBoxRemove2ndItem(cbxResultinfoRound);
        component.roundRetriveByCourse(cbxResultinfoCourseCode, cbxResultinfoRound);
//        consRound(cbxResultinfoCourseCode, cbxResultinfoRound);
    }//GEN-LAST:event_cbxResultinfoCourseCodeItemStateChanged

    private void cbxResultinfoRoundItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxResultinfoRoundItemStateChanged
//        cbxResultinfoBatch.removeItemAt(0);
        component.jCOmboBoxRemove2ndItem(cbxResultinfoBatch);
        component.batchIdRetriveByRoundByCourse(cbxResultinfoCourseCode, cbxResultinfoRound, cbxResultinfoBatch);
//        batchIdentifing(cbxResultinfoRound, cbxResultinfoBatch);
    }//GEN-LAST:event_cbxResultinfoRoundItemStateChanged

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
       addSyllabus();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        updateSyllabus();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void cbxSyllabusMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSyllabusMonthItemStateChanged
        // TODO add your handling code here:
        
//        monthRetriveData(cbxSyllabusMonth, txtUpdateSyllabusTopic);
    }//GEN-LAST:event_cbxSyllabusMonthItemStateChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        consBachInfo();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void cbxConsSyllaInfoRoundItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxConsSyllaInfoRoundItemStateChanged
        // TODO add your handling code here:
        consSyllabusInfo();
    }//GEN-LAST:event_cbxConsSyllaInfoRoundItemStateChanged

    private void cbxResultinfoBatchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxResultinfoBatchItemStateChanged
        if (cbxResultinfoBatch.getSelectedItem().equals("Select")) {
            txtConsResultMonth.setText("");
        }
    }//GEN-LAST:event_cbxResultinfoBatchItemStateChanged

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        monthRetrive();
        resultInfoDataProcess();
        resultInfoData();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        resRetakeData();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void cbxRepReportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRepReportItemStateChanged
        // TODO add your handling code here:
        if (cbxRepReport.getSelectedItem().equals("All")) {
            completeReport();
        }else if(cbxRepReport.getSelectedItem().equals("Replaced")){
            completeRepReport();
        }else if(cbxRepReport.getSelectedItem().equals("Non-Replaced")){
            completeNonRepReport();
        }
    }//GEN-LAST:event_cbxRepReportItemStateChanged

    private void tableResDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResDetailMouseClicked
        // TODO add your handling code here:
        tableSelectDataRetrive();
        txtEvidenceMark.setText("");
        txtExternalMark.setText("");
    }//GEN-LAST:event_tableResDetailMouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        updateResInfo();
        resultInfoData();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tableResDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableResDetailKeyReleased
        // TODO add your handling code here:
        tableSelectDataRetrive();
        txtEvidenceMark.setText("");
        txtExternalMark.setText("");
    }//GEN-LAST:event_tableResDetailKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        consModifyInfo();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        component.printTable(tableResDetail);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        component.printTable(tableReplaceInfo);
    }//GEN-LAST:event_jButton16ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultantFrame().setVisible(true);
            }
        });
    }
    
    public void showConsImage(){
        String stmIamg = "select img from consultant_info where cons_id = '"+LoginFrame.getStrUserName()+"'";
        component.showImage(stmIamg, lblImageInfo);
        component.showImage(stmIamg, lblImageModify);
    }
    
    public void initialValues(){
        try {
            strAddSyllabusTopics = txtAddSyllabusTopics.getText();
            strAddSyllabusHours = txtAddSyllabusHours.getText();
        } catch (NullPointerException ex) {
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
    public void retriveConsInfo(){
        ResultSet rs = null;
        String subject = "";
        String stm = "select * from consultant_info where cons_id = ? ;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, LoginFrame.getStrUserName());
            rs = pstm.executeQuery();
            if (rs.next()) {
                for (int i = 1; i < 3; i++) {
                    subject += rs.getString("course"+i)+ " ";
                }
                txtConsUserName.setText(rs.getString(1));
                txtConsMdyName.setText(rs.getString(1));
                txtConsName.setText(rs.getString(2));
                txtConsFrame.setText(rs.getString(4));
                txtConsSub.setText(subject);
                txtConsEmail.setText(rs.getString(5));
                txtConsPhone.setText(rs.getString(6));
            }
//            showConsImage();
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
        
    }
       
    public void addSyllabusProcess(JComboBox component){
        ResultSet rs = null;
        int idxMonth = 0;
        try {
            String str = "select MAX(idx_month) from syllabus_info where course_code = ? ;";
            pstm = con.prepareStatement(str);
            pstm.setString(1, component.getSelectedItem().toString());
            rs = pstm.executeQuery();
            if (rs.next()) {
                idxMonth = rs.getInt(1);
            } else {
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
        strAddSyllabusMonth = ++idxMonth;
        txtAddSyllabusMonth.setText(String.valueOf(strAddSyllabusMonth));
    }
    
    public void monthRetrive(JComboBox component1, JComboBox component2){
        ResultSet rs = null;
        
        String stm = "select idx_month from syllabus_info where course_code = ? ;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, component1.getSelectedItem().toString());
            rs = pstm.executeQuery();
            while(rs.next()){
                component2.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    
    public void monthRetriveData(JComboBox component1, JTextField textField){
        ResultSet rs = null;
        strUpdateSyllabusMonth =(int)cbxSyllabusMonth.getSelectedItem();
//        System.out.println("month : " + month);
        String stm = "select topics_name from syllabus_info where idx_month = "+strUpdateSyllabusMonth+" ;";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            if(rs.next()){
                textField.setText(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    
    public void updateSyllabus(){
        strUpdateSyllabusMonth = new Integer(cbxSyllabusMonth.getSelectedItem().toString());
        strUpdateSyllabusTopics = txtUpdateSyllabusTopic.getText();
        strUpdateSyllabusHours = txtUpdateSyllabusHour.getText();
        int n = 0;
        
        String stm = "update syllabus_info set topics_name = '" + 
                strUpdateSyllabusTopics + "' where idx_month = " + strUpdateSyllabusMonth+ ";";
        
        try {
            pstm = con.prepareStatement(stm);
            n = pstm.executeUpdate();
        } catch (SQLException ex) { 
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
        if (n > 0) {
            System.out.println("Update Syllabus");
        } else {
            System.out.println("Update not Syllabus");
        }
    }
    
    public void consBachInfo(){
        String stm = "select st.student_id,st.batch_id,bi.tsp_code,st.course_stiuation\n" +
            "from student_table st, batch_info bi\n" +
            "Where st.batch_id=bi.batch_id\n" +
            "AND bi.round = '"+cbxConsbatchInfoRound.getSelectedItem().toString()+"'\n" +
            "AND bi.course_code ='"+cbxConsbatchInfoCourseCode.getSelectedItem().toString()+"'";
        component.tableDataRetrive(stm, tableConsBatchnfo);
    }
    
    public void consSyllabusInfo(){
        String stm = "select idx_month,topics_name\n" +
                    "from syllabus_info\n" +
                    "where course_code = '"+cbxConsSyllaInfoCourseCode.getSelectedItem().toString()+"'";
        component.tableDataRetrive(stm, tableConsSyllabus);
    }
    
    public void monthRetrive(){
        ResultSet rs = null;
        String stm = "select max(rt.noOfMonth)+1\n" +
                    "from result_table rt,batch_info bi,student_table st\n" +
                    "where bi.batch_id = st.batch_id\n" +
                    "and st.student_id = rt.student_id\n" +
                    "and bi.batch_id ='"+cbxResultinfoBatch.getSelectedItem().toString()+"'";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            while(rs.next()){
                txtConsResultMonth.setText(String.valueOf(rs.getInt(1)));
            }
        } catch (Exception e) {
        }
    }
    
    public void  resultInfoDataProcess(){
        ResultSet rs = null;
        PreparedStatement pstm1 = null;
        int month = 0;
        String strMonth = txtConsResultMonth.getText();
        try {
            month = Integer.parseInt(strMonth);
        } catch (Exception e) {
        }
        String stm = "SELECT student_id \n" +
                    "FROM student_table\n" +
                    "where batch_id = '"+cbxResultinfoBatch.getSelectedItem().toString()+"';";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            while(rs.next()){
                String stminsert = "insert into result_table(student_id,noOfMonth)\n" +
                                    "values(?,?)";
                pstm1 = con.prepareStatement(stminsert);
                pstm1.setInt(1, rs.getInt(1));
                pstm1.setInt(2, month);
                pstm1.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    public void resultInfoData(){
        int month = 0;
        String strMonth = txtConsResultMonth.getText();
        try {
            month = Integer.parseInt(strMonth);
        } catch (Exception e) {
        }
        String stm = "select student_id, external_mark, evidance_mark, report\n" +
                    "from result_table\n" +
                    "where noOfMonth ="+month+";";
        component.tableDataRetrive(stm, tableResDetail);
    }
    
    public void resRetakeData(){
        ResultSet rs = null;
        int month = 0;
        String stm = "select max(rt.noOfMonth)\n" +
                    "from result_table rt, student_table st\n" +
                    "where st.student_id = rt.student_id\n" +
                    "and st.batch_id = '"+cbxResultinfoBatch.getSelectedItem().toString()+"'";
        try {
             pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            if(rs.next()){
                month = rs.getInt(1);
                txtConsResultMonth.setText(String.valueOf(month));
            }
        } catch (Exception e) {
        }
        String stm1 = "select rt.student_id, rt.external_mark, rt.evidance_mark, rt.report\n" +
                    "from result_table rt, student_table st\n" +
                    "where st.student_id = rt.student_id\n" +
                    "and st.batch_id = '"+cbxResultinfoBatch.getSelectedItem().toString()+"'\n" +
                    "and rt.noOfMonth = "+month+"\n"+
                    "and rt.report != 'Pass';";
        component.tableDataRetrive(stm1, tableResDetail);
    }
    
    public void completeReport(){
        String stm = "select st.student_id,si.stu_name,bi.round,si.stu_subject,bi.shift,bi.status,st.replace_status\n" +
                    "from student_table st, student_info si, batch_info bi\n" +
                    "where st.stu_id = si.stu_id\n" +
                    "and st.batch_id = bi.batch_id\n" +
                    "and bi.status = 'Complete'";
        component.tableDataRetrive(stm, tableReplaceInfo);
    }
    
    public void completeRepReport(){
        String stm = "select st.student_id,si.stu_name,bi.round,si.stu_subject,bi.shift,bi.status,st.replace_status\n" +
                    "from student_table st, student_info si, batch_info bi\n" +
                    "where st.stu_id = si.stu_id\n" +
                    "and st.batch_id = bi.batch_id\n" +
                    "and bi.status = 'Complete'\n" +
                    "and st.replace_status = 'Replaced'";
        component.tableDataRetrive(stm, tableReplaceInfo);
    }
    
    public void completeNonRepReport(){
        String stm = "select st.student_id,si.stu_name,bi.round,si.stu_subject,bi.shift,bi.status\n" +
                    "from student_table st, student_info si, batch_info bi\n" +
                    "where st.stu_id = si.stu_id\n" +
                    "and st.batch_id = bi.batch_id\n" +
                    "and bi.status = 'Complete'\n" +
                    "and st.replace_status !=  'Replaced'";
        component.tableDataRetrive(stm, tableReplaceInfo);
    }
    
    public void addSylMonth(){
        ResultSet rs = null;
        String stm ="select max(idx_month)+1 from syllabus_info where course_code = '"+ 
                cbxConsSyllaInfoCourseCode.getSelectedItem().toString()+"';";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            if (rs.next()) {
                txtAddSyllabusMonth.setText(String.valueOf(rs.getInt(1)));
            }
        } catch (Exception e) {
        }
    }
    
    public void addSyllabus(){
        String cc="", topic="";
        int month = 0, hour = 0;
        try {
            cc = cbxConsSyllaInfoCourseCode.getSelectedItem().toString();
            month = Integer.parseInt(txtAddSyllabusMonth.getText());
            topic = txtAddSyllabusTopics.getText();
            hour = Integer.parseInt(txtAddSyllabusHours.getText());
        } catch (Exception e) {
        }
        String stm = "insert into syllabus_info(course_code, idx_month, topics_name, hour)\n" +
                     "values('"+cc+"',"+month+",'"+topic+"',"+hour+")";
        try {
            pstm = con.prepareStatement(stm);
            
            int n = pstm.executeUpdate(stm);
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Insert Data");
            } else {
                JOptionPane.showMessageDialog(null, "not Insert Data");
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        
    }
    
//    public  void modifySyllabus(){
//        String cc = cbxConsSyllaInfoCourseCode.getSelectedItem().toString();
//        String strMonth = cbxSyllabusMonth.getSelectedItem().toString();
//        String topic = "";
//        int hour = 0;
//        try {
//            topic =
//        } catch (Exception e) {
//        }
//    }
    
    public void modifySylMonth(){
        ResultSet rs = null;
        String stm ="select idx_month from syllabus_info";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cbxSyllabusMonth.addItem(rs.getInt(1));
            }
        } catch (Exception e) {
        }
    }
    
    public void tableSelectDataRetrive(){
        ResultSet rs = null;
        try {
            int row = tableResDetail.getSelectedRow();
            String table_click = (tableResDetail.getModel().getValueAt(row, 0).toString());
            int id = Integer.parseInt(table_click);
            String stm = "select rt.student_id,si.stu_name\n" +
                        "from result_table rt, student_info si, student_table st\n" +
                        "where rt.student_id = st.student_id\n" +
                        "and st.stu_id = si.stu_id\n" +
                        "and rt.student_id = "+id+";";
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            if (rs.next()) {
                txtResStuId.setText(String.valueOf(rs.getInt(1)));
                txtResStuName.setText(rs.getString(2));
            } else {
                JOptionPane.showMessageDialog(null, "Select data not Found");
            }
        } catch (Exception e) {
        }
    }
    
    public void updateResInfo(){
        String resStatus = "";
        int id=0,month=0,externalMark=0,evidenceMark=0;
        try {
            id = Integer.parseInt(txtResStuId.getText());
            month = Integer.parseInt(txtConsResultMonth.getText());

            externalMark = Integer.parseInt(txtExternalMark.getText());
            evidenceMark = Integer.parseInt(txtEvidenceMark.getText());
        } catch (NumberFormatException e) {
        }catch (NullPointerException e) {
        }
        
        if (externalMark <= 0 && evidenceMark <= 0) {
            resStatus = "Abscent";
        } else if (externalMark < 70 || evidenceMark < 30) {
            resStatus = "Retake";
        } else if (externalMark >= 70 && evidenceMark >= 30){
            resStatus = "Pass";
        }
        
        String stm = "update result_table\n" +
            "set external_mark = ?, evidance_mark = ?, report = '"+ resStatus+"'\n" +
            "where student_id = "+id+"\n" +
            "and noOfMonth = "+month+";";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setInt(1,externalMark );
            pstm.setInt(2, evidenceMark);
            int n = pstm.executeUpdate();
            if (n>0) {
                System.out.println("Result updated");
            } else {
                System.out.println("Result not updated");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
    public void consModifyInfo(){
        ResultSet rs = null;
        PreparedStatement pstm1 = null;
        String oldPass = "",newPass = "", reNewPass = "";
        String stm = "select cons_pass from consultant_info where cons_id ='"+
                LoginFrame.getStrUserName()+"'";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            if (rs.next()) {
                oldPass = rs.getString(1);
            }
        } catch (Exception e) {
        }
        System.out.println("Pass :"+ oldPass);
        if (oldPass.equals(txtOldPass.getText())) {
            newPass = txtNewPass.getText();
            reNewPass = txtReNewPass.getText();
            if (newPass.equals(reNewPass)) {
                String stm1 = "update consultant_info\n" +
                            "set cons_pass = '"+newPass+"'\n" +
                            "where cons_id ='"+LoginFrame.getStrUserName()+"'";
                try {
                    pstm1 = con.prepareStatement(stm1);
                    pstm1.executeUpdate();
                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your RE-New password are not same");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your old password is wrong");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxConsSyllaInfoCourseCode;
    private javax.swing.JComboBox cbxConsSyllaInfoRound;
    private javax.swing.JComboBox cbxConsbatchInfoCourseCode;
    private javax.swing.JComboBox cbxConsbatchInfoRound;
    private javax.swing.JComboBox cbxRepReport;
    private javax.swing.JComboBox cbxResultinfoBatch;
    private javax.swing.JComboBox cbxResultinfoCourseCode;
    private javax.swing.JComboBox cbxResultinfoRound;
    private javax.swing.JComboBox cbxSyllabusMonth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblImageInfo;
    private javax.swing.JLabel lblImageModify;
    private javax.swing.JPanel panelBatchInfo;
    private javax.swing.JPanel panelConsInfo;
    private javax.swing.JPanel panelDynamicCons;
    private javax.swing.JPanel panelDynamicSyllabus;
    private javax.swing.JPanel panelReplaceInfo;
    private javax.swing.JPanel panelResultInfo;
    private javax.swing.JPanel panelSylAdd;
    private javax.swing.JPanel panelSylModify;
    private javax.swing.JPanel panelSylView;
    private javax.swing.JPanel panelSyllabusInfo;
    private javax.swing.JTable tableConsBatchnfo;
    private javax.swing.JTable tableConsSyllabus;
    private javax.swing.JTable tableReplaceInfo;
    private javax.swing.JTable tableResDetail;
    private javax.swing.JTextField txtAddSyllabusHours;
    private javax.swing.JTextField txtAddSyllabusMonth;
    private javax.swing.JTextField txtAddSyllabusTopics;
    private javax.swing.JTextField txtConsEmail;
    private javax.swing.JTextField txtConsFrame;
    private javax.swing.JTextField txtConsMdyName;
    private javax.swing.JTextField txtConsName;
    private javax.swing.JTextField txtConsPhone;
    private javax.swing.JTextField txtConsResultMonth;
    private javax.swing.JTextField txtConsSub;
    private javax.swing.JTextField txtConsUserName;
    private javax.swing.JTextField txtEvidenceMark;
    private javax.swing.JTextField txtExternalMark;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPass;
    private javax.swing.JPasswordField txtReNewPass;
    private javax.swing.JTextField txtResStuId;
    private javax.swing.JTextField txtResStuName;
    private javax.swing.JTextField txtUpdateSyllabusHour;
    private javax.swing.JTextField txtUpdateSyllabusTopic;
    // End of variables declaration//GEN-END:variables
}
