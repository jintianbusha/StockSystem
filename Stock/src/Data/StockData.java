package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import Listener.LoginListenerClass;
import MainInterface.*;

public class StockData extends AbstractTableModel{//数据库导入JTable所用的表格模型
	
	String sql;
	String n;
	Statement s;
	StockData sdData;
	ResultSet rs;
	int i = 1;
	private Vector data;
	private Vector title;
	public StockData()
	{
		data = new Vector();
		//读入数据库中的表格数据，包括股票名称、股票代码及股票价格  
		  sql="select * from stock";
		  s = LoginListenerClass.statement;
		  try 
		  {
			rs = s.executeQuery(sql);
			while(rs.next())
			{
				data.add(rs.getString(1));
				data.add(rs.getString(2));
				data.add(rs.getString(3));
				data.add(rs.getString(4));
				data.add(rs.getString(5));
				data.add(rs.getString(6));
				data.add(rs.getString(10));
				data.add(rs.getString(11));
			}
		  } 
		  catch (SQLException e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		
		  title = new Vector();
		  title.add("StockID");
		  title.add("StockName");
		  title.add("RISE");
		  title.add("NowPrice");
		  title.add("OpenPrice");
		  title.add("ClosePrice");
		  title.add("HighPrice");
		  title.add("LowPrice");
	}
	
	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.size()/getColumnCount();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return title.size();
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data.get((rowIndex*getColumnCount())+columnIndex);
	}
	
	public String getColumnName(int columnIndex) {
        String colName = new String();
          if (columnIndex>=0&&columnIndex<=(title.size()))
           colName=(String)title.get(columnIndex);
          return colName;
 }

}
