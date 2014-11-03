package MainInterface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Listener.ViewMyStock;

import java.awt.*;

public class MyStockAccount extends JFrame{
	public MyStockAccount(boolean b)
	{
		setTitle("MyStockView");
		setResizable(false);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setContentPane(new MyStockAccountPanel());
		setVisible(b);
	}
}
