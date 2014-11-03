package MainInterface;

import javax.swing.*;

import Listener.*;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class Login extends JFrame{//登录窗口
	
	private JFrame vFrame = new JFrame();
	public static JFrame jFrame;
	public Login()
	{
	JTextField jtfUserName = new JTextField(20);
	JPasswordField jpfPassword = new JPasswordField(20);
	JButton jbtLogin = new JButton("Login");
	JLabel jlName = new JLabel("UserName  :");
	JLabel jlPassword = new JLabel("Password   :");
	JLabel jlIP = new JLabel("           IP        :");
	JTextField jtfIP = new JTextField("222.205.39.229",20);
	
	JPanel jPanel = new JPanel();

	jPanel.add(jlIP);
	jPanel.add(jtfIP);
	jPanel.add(jlName);
	jPanel.add(jtfUserName);
	jPanel.add(jlPassword);
	jPanel.add(jpfPassword);
	jPanel.add(jbtLogin);
	add(jPanel);

	
	LoginListenerClass loginListenerClass = new LoginListenerClass(jtfUserName,jpfPassword,jtfIP);
	jbtLogin.addActionListener(loginListenerClass);
	}
	
	public static void main(String []agrs)
	{
		jFrame = new Login();
		jFrame.setTitle("Stock System Login");
		jFrame.setSize(300, 220);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}
