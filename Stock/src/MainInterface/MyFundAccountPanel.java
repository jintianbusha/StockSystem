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
import Listener.ViewMyStock;

public class MyFundAccountPanel extends JPanel{
	public MyFundAccountPanel()
	{
		setLayout(new BorderLayout(5,10));
	      
	      JPanel jptable = new JPanel();
	      add(jptable,BorderLayout.WEST);
	      
	      JPanel jpother = new JPanel();
	      add(jpother,BorderLayout.CENTER);
	      
	      jpother.setLayout(new GridLayout(10,3,15,15));
	      
	      JTable jtAllInfo;
	      Object[][] data = 
		      {
		    	  new Object[]{"￥54455557.64","￥44589"}
		      };
	      Object title[] =
  		  {
  		  	"可用资金","冻结资金"
  		  };
	      jtAllInfo = new JTable(data,title){ 
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
	      
	      
	      JLabel lbstockname = new JLabel("");
	      jpother.add(lbstockname);
	      
  
	      JLabel lbstocksymbol = new JLabel("我的资金账户");
	      jpother.add(lbstocksymbol);
	      
	      
	}
}
