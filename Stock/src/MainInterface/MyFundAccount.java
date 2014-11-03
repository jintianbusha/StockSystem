package MainInterface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Listener.ViewMyStock;

import java.awt.*;

public class MyFundAccount extends JFrame{
	public MyFundAccount(boolean b)
	{
		setTitle("MyFundView");
		setResizable(false);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setContentPane(new MyFundAccountPanel());
		setVisible(b);
	}
}
