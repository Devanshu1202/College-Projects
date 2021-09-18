/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reter
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class AddDisplay {
    Connection com=JavaConnect.getConnection();
        PreparedStatement ps;
    public void makeUser(String UserName,String Name,String Password,String SecurityQuestion,String Answer )
    {
        try
        {
            ps=com.prepareStatement("INSERT INTO SignUp(UserName,Name,Password,SecurityQuestion,Answer)values(?,?,?,?,?)");
            ps.setString(1,UserName);
            ps.setString(2,Name);
            ps.setString(3,Password);
            ps.setString(4,SecurityQuestion);
            ps.setString(5,Answer);
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"New Account Created!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void fillTable(JTable table)
    {
        try
        {
            ps=com.prepareStatement("SELECT name,usn,branch,mobileno,gender,age,email FROM student");
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next())
            {
                row=new Object[7];
                row[0]=rs.getString(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(4);
                row[4]=rs.getString(5);
                row[5]=rs.getString(6);
                row[6]=rs.getString(7);
                model.addRow(row);
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void makeRoom(String RoomNumber,String Type,String Floor ,String Cost,String RoomName)
    {
        try
        {
             ps=com.prepareStatement("INSERT INTO rooms(RoomNumber,Type,Floor,Cost,RoomName)values(?,?,?,?,?)");
             ps.setString(1,RoomNumber);
            ps.setString(2,Type);
            ps.setString(3,Floor);
            ps.setString(4,Cost);
            ps.setString(5,RoomName);
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"New Room Created!");
            }
                    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
        public void NewStudent(String name,String usn,String branch ,String mn,String g,String age,String email)
    {
        try
        {
             ps=com.prepareStatement("INSERT INTO student(name,usn,branch,mobileno,gender,age,email)values(?,?,?,?,?,?,?)");
             ps.setString(1,name);
            ps.setString(2,usn);
            ps.setString(3,branch);
            ps.setString(4,mn);
            ps.setString(5,g);
            ps.setString(6,age);
            ps.setString(7,email);
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"New Student Added!");
            }
                    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
        public void fillDetailTable(JTable table)
    {
        try
        {
            ps=com.prepareStatement("SELECT usn,name,branch,mobileno,roomno,roomname,cost,floor,type FROM details");
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next())
            {
                row=new Object[9];
                row[0]=rs.getString(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(4);
                row[4]=rs.getString(5);
                row[5]=rs.getString(6);
                row[6]=rs.getString(7);
                row[7]=rs.getString(8);
                row[8]=rs.getString(9);
                model.addRow(row);
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
     public void fillRoomTable(JTable table)
    {
        try
        {
            ps=com.prepareStatement("SELECT RoomNumber,Type,Floor,Cost,RoomName FROM rooms");
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next())
            {
                row=new Object[5];
                row[0]=rs.getString(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(4);
                row[4]=rs.getString(5);
                
                model.addRow(row);
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
     public void fillLogsTable(JTable table)
    {
        try
        {
            ps=com.prepareStatement("SELECT BookingNo,Usn,Name,Branch,MobileNo,RoomNo,Cost,Action,Date FROM booking");
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next())
            {
                row=new Object[9];
                row[0]=rs.getString(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(4);
                row[4]=rs.getString(5);
                row[5]=rs.getString(6);
                row[6]=rs.getString(7);
                row[7]=rs.getString(8);
                row[8]=rs.getString(9);
                model.addRow(row);
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
