/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITProject;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.print.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Azmol-IT
 */
public class SwingComponentAccess {
    
    DatabaseConnection dbObj = new DatabaseConnection();
    Connection con = dbObj.doConnection();
    PreparedStatement pstm = null;
    
    public void jCOmboBoxRemove2ndItem(JComboBox component){
        int n = component.getItemCount();
        for (int j = 0; j < n-1; j++) {
            component.removeItemAt(1);
        }
    }
    
    public void courseCodeRetrive(JComboBox component1, JComboBox component2){
        ResultSet rs = null;
        
        String stm = "select course1,course2 from consultant_info where cons_id = ? ;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, LoginFrame.getStrUserName());
            rs = pstm.executeQuery();
            if (rs.next()) {
                for (int i = 1; i < 3; i++) {
                    if (rs.getString(i)!=null) {
                        component1.addItem(rs.getString(i));
                    }
                }
            }
            this.jCOmboBoxRemove2ndItem(component2);
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    
    public void courseCodeRetriveAdmin(JComboBox component1, JComboBox component2){
        ResultSet rs = null;
        
        String stm = "select course_code from course_info";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            while(rs.next()){
                component1.addItem(rs.getString(1));
            }
            this.jCOmboBoxRemove2ndItem(component2);
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    public void courseCodeRetriveAdmin(JComboBox component1){
        ResultSet rs = null;
        
        String stm = "select course_code from course_info";
        try {
            pstm = con.prepareStatement(stm);
            rs = pstm.executeQuery();
            while(rs.next()){
                component1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    
    public void courseCodeRetrive(JComboBox component1){
        ResultSet rs = null;
        
        String stm = "select course1,course2 from consultant_info where cons_id = ? ;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, LoginFrame.getStrUserName());
            rs = pstm.executeQuery();
            if (rs.next()) {
                for (int i = 1; i < 3; i++) {
                    if (rs.getString(i)!=null) {
                        component1.addItem(rs.getString(i));
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    
    public void courseCodeRetriveTSP(JComboBox getComponent){
        ResultSet rs = null;
        String stm = "select course_code from batch_info where tsp_code = ? group by course_code;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, LoginFrame.getStrUserName());
            rs = pstm.executeQuery();
            while(rs.next()){
                getComponent.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    
    public void roundRetriveByCourse(JComboBox getComponent, JComboBox setComponent){
        ResultSet rs = null;
        String stm = "select round from batch_info where course_code = ? group by round;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, getComponent.getSelectedItem().toString());
            rs = pstm.executeQuery();
            while(rs.next()){
                setComponent.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
    public void roundRetriveByTSP(JComboBox setComponent){
        ResultSet rs = null;
        String stm = "select round from batch_info where tsp_code = ? group by round;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, LoginFrame.getStrUserName());
            rs = pstm.executeQuery();
            while(rs.next()){
                setComponent.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
    public void batchIdRetriveByRoundByCourse(JComboBox component1, JComboBox component2, JComboBox component3){
        ResultSet rs = null;
        String stm = "select batch_id from batch_info where course_code = ? and round = ?;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, component1.getSelectedItem().toString());
            pstm.setString(2, component2.getSelectedItem().toString());
            rs = pstm.executeQuery();
            while(rs.next()){
                component3.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
    public void batchIdRetriveByRoundByCourseInTSP(JComboBox courseComponent, JComboBox roundComponent, JComboBox batchComponent){
        ResultSet rs = null;
        String stm = "select batch_id from batch_info where course_code = ? and round = ? and tsp_code = ?;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, courseComponent.getSelectedItem().toString());
            pstm.setString(2, roundComponent.getSelectedItem().toString());
            pstm.setString(3, LoginFrame.getStrUserName());
            rs = pstm.executeQuery();
            while(rs.next()){
                batchComponent.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
    public void batchIdRetriveByRoundByTSP(JComboBox getComponent, JComboBox setComponent){
        ResultSet rs = null;
        String stm = "select batch_id from batch_info where tsp_code = ? and round = ?;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, LoginFrame.getStrUserName());
            pstm.setString(2, getComponent.getSelectedItem().toString());
            rs = pstm.executeQuery();
            while(rs.next()){
                setComponent.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
    public void batchIdRetriveInTSP(JComboBox setComponent){
        ResultSet rs = null;
        String stm = "select batch_id from batch_info where tsp_code = ?;";
        try {
            pstm = con.prepareStatement(stm);
            pstm.setString(1, LoginFrame.getStrUserName());
            rs = pstm.executeQuery();
            while(rs.next()){
                setComponent.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
    public Date currentDate(JTextField dateField){
        Calendar cal = new GregorianCalendar();
        Date dateFormat = null;
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String dateValue = year + "-" +intConvert(month) + "-" + intConvert(day);
        dateField.setText(dateValue);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat = sdf.parse(dateValue);
        } catch (ParseException ex) {
            System.out.println("message" + ex.getMessage());
        } 
        return dateFormat;
    }
    
    public Date currentTime(JTextField timeField){
        Calendar cal = new GregorianCalendar();
        Date timeFormat = null;
        String period = "";
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
//        if (Calendar.AM_PM == 0) {
//            period = "AM";
//        } else {
//            period = "PM";
//        }
        String timeValue = intConvert(hour) + ":" + intConvert(minute) + ":" + intConvert(second);
        timeField.setText(timeValue);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        try {
            timeFormat = sdf.parse(timeValue);
        } catch (ParseException ex) {
            System.out.println("message" + ex.getMessage());
        } 
        return timeFormat;
        
    }
    
    public String attendanceIncoming(String shift){
        String status = "";
        
        Calendar calIn = Calendar.getInstance();
        
        // Set time of calendar to 9:15:00
        if (shift.equals("Morning")) {
            calIn.set(Calendar.HOUR_OF_DAY, 9);
            calIn.set(Calendar.MINUTE, 15);
            calIn.set(Calendar.SECOND, 0);
            calIn.set(Calendar.MILLISECOND, 0);
        } else if (shift.equals("Afternoon")){
            calIn.set(Calendar.HOUR_OF_DAY, 15);
            calIn.set(Calendar.MINUTE, 15);
            calIn.set(Calendar.SECOND, 0);
            calIn.set(Calendar.MILLISECOND, 0);
        }
        
        // Check if current time is befor 09:15:00 today
        boolean attIncome = Calendar.getInstance().before(calIn);
        
        if (attIncome) {
            status = "Present";
        } else {
            status = "Absent";
        }
        
        return status;
    }
    
    public String attendanceOutGoing(String shift){
        String status = "";
        
        Calendar calOut = Calendar.getInstance();
        
        // Set time of calendar to 13:00:00
        
        if (shift.equals("Morning")) {
            calOut.set(Calendar.HOUR_OF_DAY, 13);
            calOut.set(Calendar.MINUTE, 0);
            calOut.set(Calendar.SECOND, 0);
            calOut.set(Calendar.MILLISECOND, 0);
        } else if (shift.equals("Afternoon")){
            calOut.set(Calendar.HOUR_OF_DAY, 19);
            calOut.set(Calendar.MINUTE, 0);
            calOut.set(Calendar.SECOND, 0);
            calOut.set(Calendar.MILLISECOND, 0);
        }
        
        // Check if current time is after 13:00:00 today
        boolean attOutgoing = Calendar.getInstance().after(calOut);
        
        if (attOutgoing) {
            status = "Present";
        } else {
            status = "Absent";
        }
        
        return status;
    }
    
    public String intConvert(int x){
        String n = String.format("%02d", x);
        return n;
    }
    
    public void tableDataRetrive(String query,JTable tableName){
        try {
            
            DefaultTableModel dtm =(DefaultTableModel) tableName.getModel();
            dtm.setNumRows(0);

            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            
            ResultSetMetaData rmd = rs.getMetaData();
            int n = rmd.getColumnCount();

            Object[] columnData = new Object[n];
            for (int i = 0; i < n; i++) {
                columnData[i] = rmd.getColumnName(i+1);
            }
            dtm.setColumnIdentifiers(columnData);
            
            Object[] data = new Object[n];
            while (rs.next()) {
                for (int i = 0; i < n; i++) {
                    data[i] = rs.getObject(i+1);
                }
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        } 
    }
    
    public void resetTextField(JComboBox getComponent, JTextField setField){
        if (getComponent.getSelectedItem().equals("Select")) {
            setField.setText("");
        }
    }
    
    public ImageIcon resizeImage(String imagePath, JLabel label){
        ImageIcon myImage = new ImageIcon(imagePath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        
        return image;
    }
    
    public String getImage(JLabel label){
        JFileChooser file = new JFileChooser();
        String path = null;
        file.setCurrentDirectory(new File(System.getProperty("user.dir")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if( result == JFileChooser.APPROVE_OPTION){
            File selecteFile = file.getSelectedFile();
            path = selecteFile.getAbsolutePath();
            label.setIcon(this.resizeImage(path,label));
        } else if(result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "No File Selected");
        }
        return path;
    }
    
    public String getFile(JTextField getFile){
        JFileChooser file = new JFileChooser();
        String path = null;
        file.setCurrentDirectory(new File(System.getProperty("user.dir")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.file", "doc","docx","pdf");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if( result == JFileChooser.APPROVE_OPTION){
            File selecteFile = file.getSelectedFile();
            path = selecteFile.getAbsolutePath();
            getFile.setText(path);
        } else if(result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "No File Selected");
        }
        return path;
    }
    
    public void saveImage(String query, String path){
        try {
            pstm = con.prepareStatement(query);
            InputStream image = new FileInputStream(new File(path));
            pstm.setBlob(1, image);
            int n = pstm.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Data Updated");
            }else{
                JOptionPane.showMessageDialog(null, "Data not Updated");
            }
        } catch (SQLException ex) {
            System.err.println("sql");
        } catch (FileNotFoundException ex) {
            System.err.println("file");
        }
    }
    
    public void showImage(String query, JLabel showLabel){
        try {
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                byte[] img = rs.getBytes(1);
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImage = im.getScaledInstance(showLabel.getWidth(), showLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImage);
                showLabel.setIcon(newImage);
            }
        } catch (SQLException ex) {
            System.err.println("image sql problem");
        } 
    }
    
    public void printTable(JTable tableName){
        MessageFormat header = new MessageFormat("Report Detail");
        MessageFormat footer = new MessageFormat("{0,number,#}");
        try {
            tableName.print(JTable.PrintMode.FIT_WIDTH, header,footer);
        } catch (Exception e) {
        }
    }
    
}
