
package employeemanagementsystem;




import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
    
    JTextField tfname,tfdob,tfeducation, tfaddress, tfphone, tfemail,tfleaveday,tfper, tfsalary, tfdesignation, tfentry, tfexittime,tfworkingDays;
    JLabel lblempId;
    JButton add, back;
    String empId;
    
    UpdateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(Color.WHITE);  
        setLayout(null);
        
        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(400, 150, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(600, 150, 150, 30);
        add(tfdesignation);
        
        
        
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
        JLabel lbldob=new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        add(lbldob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        tfeducation=new JTextField();
        tfeducation.setBounds(400, 300, 150, 30);
        add(tfeducation);
        
        
        JLabel labelentry = new JLabel("Entry Time");
        labelentry.setBounds(50, 350, 150, 30);
        labelentry.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelentry);
        
        tfentry  = new JTextField();
        tfentry.setBounds(200, 350, 150, 30);
        add(tfentry);
        
        JLabel labelexittime = new JLabel("Exit Time");
        labelexittime.setBounds(400, 350, 150, 30);
        labelexittime.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelexittime);
        
        tfexittime  = new JTextField();
        tfexittime.setBounds(600, 350, 150, 30);
        add(tfexittime);
        
        JLabel per = new JLabel("Permission Hours");
        per.setBounds(50, 400, 150, 30);
        per.setFont(new Font("serif", Font.PLAIN, 20));
        add(per);
        
        tfper = new JTextField();
        tfper.setBounds(200, 400, 150, 30);
        add(tfper);
        
        JLabel labelleaveday= new JLabel("Leave Days");
        labelleaveday.setBounds(400, 400, 150, 30);
        labelleaveday.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelleaveday);
        
        tfleaveday = new JTextField();
        tfleaveday.setBounds(600, 400, 150, 30);
        add(tfleaveday);
        
        
        
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(50, 450, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);
        
        lblempId = new JLabel();
        lblempId.setBounds(200, 450, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                tfname.setText(rs.getString("name"));
                
                tfdob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfentry.setText(rs.getString("entry"));
                tfexittime.setText(rs.getString("exittime"));
                tfworkingDays.setText(rs.getString("workingDays"));               
                tfleaveday.setText(rs.getString("Leave Days"));             
                tfeducation.setText(rs.getString("education"));
                
                lblempId.setText(rs.getString("empId"));
                tfdesignation.setText(rs.getString("designation"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        add = new JButton("Update Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
           String dob = tfdob.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String workingDays = tfworkingDays.getText();
            
            String designation = tfdesignation.getText();
            String leaveday = tfleaveday.getText();
            String per = tfper.getText();
            String empId = lblempId.getText();
            String entry = tfentry.getText();
            String exit = tfexittime.getText();
            
            try {
                Conn conn = new Conn();
                String query = "update employee set name = '"+name+"', workingdays = '"+workingDays+"', dob = '"+dob+"',salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', designation = '"+designation+"',entry = '"+entry+"',exittime = '"+exit+"',where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}