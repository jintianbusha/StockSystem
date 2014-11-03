package MainInterface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewSecurityAccount extends JFrame{//登陆后的窗口

	public ViewSecurityAccount(boolean b)
	{
		setTitle("AllStockView");
		setResizable(false);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyStockViewPanel());
		setVisible(b);

	}
}
