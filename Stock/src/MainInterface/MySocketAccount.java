package MainInterface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Listener.ViewMyStock;

import java.awt.*;

public class MySocketAccount extends JFrame{
	public MySocketAccount(boolean b)
	{
		setTitle("MyStockView");
		setResizable(false);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setContentPane(new MySocketAccountPanel());
		setVisible(b);
	}
}
