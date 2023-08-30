
package employeemanagementsystem;


import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tfworkingDays,tfaddress, tfphone,tfleaveday, tfsalary, tfper,tfdesignation,tfentry,tfexittime;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Employee Detail");
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
        
        
        
        
        JLabel labeldob = new JLabel("Date");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        JLabel labelworkingDays = new JLabel("workingDays");
        labelworkingDays.setBounds(50, 250, 150, 30);
        labelworkingDays.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelworkingDays);
        
        tfworkingDays= new JTextField();
        tfworkingDays.setBounds(200, 250, 150, 30);
        add(tfworkingDays);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 300, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 300, 150, 30);
        add(tfaddress);
        
        
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        
        JLabel labelentry = new JLabel("Entry Time");
        labelentry.setBounds(50, 350, 150, 30);
        labelentry.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelentry);
        
        tfentry  = new JTextField();
        tfentry.setBounds(200, 350, 150, 30);
        add(tfentry);
        
        JLabel lablexittime = new JLabel("Exit Time");
        lablexittime.setBounds(400, 350, 150, 30);
        lablexittime.setFont(new Font("serif", Font.PLAIN, 20));
        add(lablexittime);
        
        tfexittime  = new JTextField();
        tfexittime.setBounds(600, 350, 150, 30);
        add(tfexittime);
        
         JLabel labelper = new JLabel("Permission Hours");
        labelper.setBounds(50, 400, 150, 30);
        labelper.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelper);
        
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
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 450, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
        add = new JButton("Add Details");
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
           
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String workingDays = tfworkingDays.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String leaveday = tfleaveday.getText();
            String per = tfper.getText();
            String empId = lblempId.getText();
            String entry = tfentry.getText();
            String exittime = tfexittime.getText();
            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+workingDays+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+education+"', '"+designation+"', '"+entry+"','"+exittime+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
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
        new AddEmployee();
    }
}