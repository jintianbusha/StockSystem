package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import MainInterface.ViewSecurityAccount;
import MainInterface.*;

public class LoginListenerClass implements ActionListener{
	
	public static Statement statement;
	public JTextField jtf1;
	public JPasswordField jpf1;
	public String usernameString;
	public String passwordString;

	String pw;
	
	public LoginListenerClass(JTextField jtf,JPasswordField jpf)
	{
		jtf1 = jtf;
		jpf1 = jpf;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Connection connection;
		
		String sqlString;
		String url;
		
		//连接数据库222.205.38.252
		url = "jdbc:mysql://222.205.39.229:3306/test?user=root&password=root";
		ResultSet result;
		int i = 0;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");               //数据库连接并创建Statement
			System.out.println("JDBC driver starts successfully!");
			connection = DriverManager.getConnection(url);
			System.out.println("MySQL connects successfully!");
			statement = connection.createStatement();
			
			
		} 
		catch (Exception e1) 
		{
			System.out.println("数据库连接错误！");
			// TODO: handle exception
			System.out.print("ERROR!");
		}
		
		//从数据库中查找用户,比对密码
		usernameString = jtf1.getText();
		passwordString = jpf1.getText();
		sqlString = "select password from administrator where id = '"+jtf1.getText()+"'";
		try {
			result = statement.executeQuery(sqlString);
			while(result.next())
			{
				pw = result.getString("password");
				if(pw.equals(passwordString))
				{
					System.out.println("Login Success!");
					new ViewSecurityAccount(true);
					Login.jFrame.setVisible(false);
				}
					
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
}
