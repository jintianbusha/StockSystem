package MainInterface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Listener.ViewMyStock;

import java.awt.*;

public class MySocketAccountPanel extends JPanel{//查询我的股票的窗口的控件及布局（My Stock View）
	public MySocketAccountPanel()
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
		    	  new Object[]{"Google","44589","$17.5","10000","$10.5","+$70000"},
		    	  new Object[]{"Baidu","32249","$20.8","20000","$25.8","-$100000"},
		    	  new Object[]{"AliBaBa","66547","$23.4","20000","$18.9","+$90000"}
		      };
	      Object title[] =
    		  {
    		  	"股票名称","股票代码","股票当前价格","股票总数","股票持有成本","持有股票损益"
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
	      
	      
	      JLabel lbstockname = new JLabel("请输入股票名称：");
	      jpother.add(lbstockname);
	      
	      JTextField jtfStockName = new JTextField();
	      jpother.add(jtfStockName);
	      
	      JLabel lbstocksymbol = new JLabel("请输入股票代码：");
	      jpother.add(lbstocksymbol);
	      
	      JTextField jtfStockSymbol = new JTextField();
	      jpother.add(jtfStockSymbol);
	      
	      JButton btbuy = new JButton("购买股票");
	      jpother.add(btbuy);
	      
	      JButton btseal = new JButton("卖出股票");
	      jpother.add(btseal);
	   
	}
}
