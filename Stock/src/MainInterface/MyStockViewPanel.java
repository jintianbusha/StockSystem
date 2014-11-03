package MainInterface;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;

import Data.StockData;
import Listener.LoginListenerClass;
import Listener.ViewMyFund;
import Listener.ViewMyStock;



public class MyStockViewPanel extends JPanel{//登陆后的主窗口窗口控件及布局（ALL Stock View）
	
	public MyStockViewPanel()
	   {  
	      setLayout(new BorderLayout(5,10));
	      
	      JPanel jptable = new JPanel();
	      add(jptable,BorderLayout.WEST);
	      
	      JPanel jpother = new JPanel();
	      add(jpother,BorderLayout.CENTER);
	      
	      jpother.setLayout(new GridLayout(13,3,15,15));
	      
	      JTable jtAllInfo;
	      jtAllInfo = new JTable(new StockData()){ 
	    	  public boolean isCellEditable(int row,int col){ 
	    		   return false;
	    		} 
	    		};
	      jtAllInfo.setPreferredScrollableViewportSize(new Dimension(600, 500));
	      //add(jtAllInfo);
	      
	      JScrollPane scrollPane = new JScrollPane(jtAllInfo);
	      jptable.add(scrollPane);
	      
	      JLabel lbblank = new JLabel("");
	      jpother.add(lbblank);
	      
	      JButton btViewMyStock = new JButton("查询我的股票");
	      jpother.add(btViewMyStock);
	      ViewMyStock vms = new ViewMyStock();
	      btViewMyStock.addActionListener(vms);
	  
	      JButton btViewMyFundAccount = new JButton("查询我的资金账户");
	      jpother.add(btViewMyFundAccount);
	      ViewMyFund vmf = new ViewMyFund();
	      btViewMyFundAccount.addActionListener(vmf);
	      
	      JLabel lb1 = new JLabel("请输入股票名称：");
	      jpother.add(lb1);
	      
	      JTextField jtfStockName = new JTextField();
	      jpother.add(jtfStockName);
	      
	      JLabel lb2 = new JLabel("请输入股票代码：");
	      jpother.add(lb2);
	      
	      JTextField jtfStockSymbol = new JTextField();
	      jpother.add(jtfStockSymbol);
	      
	      JButton btSearch = new JButton("查询");
	      jpother.add(btSearch);
	      
	   }
}
