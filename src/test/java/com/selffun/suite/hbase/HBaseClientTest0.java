package com.selffun.suite.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;


public class HBaseClientTest0 {

	private static Configuration conf = null;
	/**
	 * 初始化配置
	 */
	static {
		conf = HBaseConfiguration.create();
		// conf.set("hbase.zookeeper.quorum", "192.168.135.54");

	}

	/**
	 * 创建表操作
	 * 
	 * @throws IOException
	 */
	public static void createTable(String tableName, String[] cfs)
			throws IOException {

		HBaseAdmin admin = new HBaseAdmin(conf);
		try {
			if (admin.tableExists(tableName)) {
				System.out.println("表已经存在！OMG");
			} else {
				// HTableDescriptor tableDesc = new HTableDescriptor(tablename);
				HTableDescriptor tableDesc = new HTableDescriptor(
						TableName.valueOf(tableName));
				for (int i = 0; i < cfs.length; i++) {
					tableDesc.addFamily(new HColumnDescriptor(cfs[i]));
				}
				admin.createTable(tableDesc);
				System.out.println("表创建成功！YEAH");
			}
		} finally {
			if (admin != null) {
				admin.close();
			}
		}

	}

	/** 
	 * 删除表
	 * @tableName 表名
	 * 
	 */
	public static void deleteTable(String tableName) throws IOException {
		HBaseAdmin admin = new HBaseAdmin(conf);
		admin.disableTable(tableName);
		admin.deleteTable(tableName);
		System.out.println("表" + tableName + "已删除!");
	}

	/** 
	 * 遍历查询hbase表
	 * 
	 * @tableName 表名
	 */
	public static void getResultScann(String tableName) throws IOException {
		Scan scan = new Scan();
		ResultScanner rs = null;
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		try {
			rs = table.getScanner(scan);
			for (Result r : rs) {
				for (Cell cell : r.listCells()) {
					System.out
							.println("-------------------------------------------");
					System.out.println("row:"
							+ Bytes.toString(CellUtil.cloneRow(cell)));
					System.out.println("famlily:"
							+ Bytes.toString(CellUtil.cloneFamily(cell)));
					System.out.println("qualifier:"
							+ Bytes.toString(CellUtil.cloneQualifier(cell)));
					System.out.println("value:"
							+ Bytes.toString(CellUtil.cloneValue(cell)));

				}
			}
		} finally {
			rs.close();
		}
	}

	/**
	 * rowkey区间遍历查询hbase表
	 * 
	 * @tableName 表名
	 */
	public static void getResultScann(String tableName, String start_rowkey,
			String stop_rowkey) throws IOException {
		Scan scan = new Scan();
		scan.setStartRow(Bytes.toBytes(start_rowkey));
		scan.setStopRow(Bytes.toBytes(stop_rowkey));
		ResultScanner rs = null;
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		try {
			rs = table.getScanner(scan);
			for (Result r : rs) {
				for (KeyValue kv : r.list()) {
					System.out.println("row:" + Bytes.toString(kv.getRow()));
					System.out.println("family:"
							+ Bytes.toString(kv.getFamily()));
					System.out.println("qualifier:"
							+ Bytes.toString(kv.getQualifier()));
					System.out
							.println("value:" + Bytes.toString(kv.getValue()));
					System.out.println("timestamp:" + kv.getTimestamp());
					System.out
							.println("-------------------------------------------");
				}
			}
		} finally {
			rs.close();
		}
	}

	/** 
	 * 根据rwokey查询
	 * 
	 * @rowKey rowKey
	 * @tableName 表名
	 */
	public static Result getData(String tableName, String rowKey)
			throws IOException {
		Get get = new Get(Bytes.toBytes(rowKey));
		HTable table = new HTable(conf, Bytes.toBytes(tableName));// 获取表
		Result result = table.get(get);
		for (Cell cell : result.listCells()) {
			System.out.println("-------------------------------------------");
			System.out
					.println("row:" + Bytes.toString(CellUtil.cloneRow(cell)));
			System.out.println("famlily:"
					+ Bytes.toString(CellUtil.cloneFamily(cell)));
			System.out.println("qualifier:"
					+ Bytes.toString(CellUtil.cloneQualifier(cell)));
			System.out.println("value:"
					+ Bytes.toString(CellUtil.cloneValue(cell)));
		}
		return result;
	}

	/*
	 * 为表添加数据（适合知道有多少列族的固定表）
	 * 
	 * @rowKey rowKey
	 * 
	 * @tableName 表名
	 * 
	 * @column1 第一个列族列表
	 * 
	 * @value1 第一个列的值的列表
	 * 
	 * @column2 第二个列族列表
	 * 
	 * @value2 第二个列的值的列表
	 */
	public static void putData(String tableName, String rowKey, String colomnFamilyName1, 
			String[] column1, String[] value1, String colomnFamilyName2, String[] column2, String[] value2)
			throws IOException {

		Put put = new Put(Bytes.toBytes(rowKey));// 设置rowkey
		HTable table = new HTable(conf, Bytes.toBytes(tableName));// HTabel负责跟记录相关的操作如增删改查等//

		HColumnDescriptor[] columnFamilies = table.getTableDescriptor() // 获取所有的列族
				.getColumnFamilies();

		for (int i = 0; i < columnFamilies.length; i++) {
			String familyName = columnFamilies[i].getNameAsString(); // 获取列族名
			if (familyName.equals(colomnFamilyName1)) { // 列族匹配
				for (int j = 0; j < column1.length; j++) {
					put.add(Bytes.toBytes(familyName),
							Bytes.toBytes(column1[j]), Bytes.toBytes(value1[j]));
				}
			}
			else if(familyName.equals(colomnFamilyName2)){
				for (int j = 0; j < column2.length; j++) {
					put.add(Bytes.toBytes(familyName),
							Bytes.toBytes(column2[j]), Bytes.toBytes(value2[j]));
				}
			}
			else{
				continue;
			}
		}
		table.put(put);
		System.out.println("插入数据成功!");
	}

	/*
	 * 更新表中的某一列
	 * 
	 * @tableName 表名
	 * 
	 * @rowKey rowKey
	 * 
	 * @familyName 列族名
	 * 
	 * @columnName 列名
	 * 
	 * @value 更新后的值
	 */
	public static void updateColumn(String tableName, String rowKey,
			String familyName, String columnName, String value)
			throws IOException {
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		Put put = new Put(Bytes.toBytes(rowKey));
		put.add(Bytes.toBytes(familyName), Bytes.toBytes(columnName),
				Bytes.toBytes(value));
		table.put(put);
		System.out.println("更新数据成功!!");
	}

	/*
	 * 查询表中的某一列
	 * 
	 * @tableName 表名
	 * 
	 * @rowKey rowKey
	 */
	public static void getResultByColumn(String tableName, String rowKey,
			String familyName, String columnName) throws IOException {
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		Get get = new Get(Bytes.toBytes(rowKey));
		get.addColumn(Bytes.toBytes(familyName), Bytes.toBytes(columnName)); // 获取指定列族和列修饰符对应的列
		Result result = table.get(get);
		for (KeyValue kv : result.list()) {
			System.out.println("family:" + Bytes.toString(kv.getFamily()));
			System.out
					.println("qualifier:" + Bytes.toString(kv.getQualifier()));
			System.out.println("value:" + Bytes.toString(kv.getValue()));
			System.out.println("Timestamp:" + kv.getTimestamp());
			System.out.println("-------------------------------------------");
		}
	}

	/*
	 * 查询某列数据的多个版本
	 * 
	 * @tableName 表名
	 * @rowKey rowKey
	 * @familyName 列族名
	 * @columnName 列名
	 */
	public static void getResultByVersion(String tableName, String rowKey,
			String familyName, String columnName) throws IOException {
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		Get get = new Get(Bytes.toBytes(rowKey));
		get.addColumn(Bytes.toBytes(familyName), Bytes.toBytes(columnName));
		get.setMaxVersions(5);
		Result result = table.get(get);
		for (KeyValue kv : result.list()) {
			System.out.println("family:" + Bytes.toString(kv.getFamily()));
			System.out
					.println("qualifier:" + Bytes.toString(kv.getQualifier()));
			System.out.println("value:" + Bytes.toString(kv.getValue()));
			System.out.println("Timestamp:" + kv.getTimestamp());
			System.out.println("-------------------------------------------");
		}
		/*
		 * List<?> results = table.get(get).list(); Iterator<?> it =
		 * results.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next().toString()); }
		 */
	}

	/*
	 * 删除指定的列
	 * 
	 * @tableName 表名
	 * 
	 * @rowKey rowKey
	 * 
	 * @familyName 列族名
	 * 
	 * @columnName 列名
	 */
	public static void deleteColumn(String tableName, String rowKey,
			String falilyName, String columnName) throws IOException {
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		Delete deleteColumn = new Delete(Bytes.toBytes(rowKey));
		deleteColumn.deleteColumns(Bytes.toBytes(falilyName),
				Bytes.toBytes(columnName));
		table.delete(deleteColumn);
		System.out.println("列" + falilyName + ":" + columnName + "已删除!");
	}

	/**
	 * 删除某行所有列
	 * 
	 * @tableName 表名
	 * @rowKey rowKey
	 */
	public static void deleteAllColumn(String tableName, String rowKey)
			throws IOException {
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		Delete deleteAll = new Delete(Bytes.toBytes(rowKey));
		table.delete(deleteAll);
		System.out.println("行"+rowKey+"中所有列已删除!");
	}

	public static void main(String[] args) throws Exception {

//		 System.setProperty("hadoop.home.dir", "F:\\hadoop-2.4.0");

//		创建表
		 String tableName = "messages2";
		 String columnFamily1 = "from";
		 String columnFamily2 = "to";
//		 String[] colomnFamilies = { columnFamily1, columnFamily2 };
//		 createTable(tableName, colomnFamilies);

		// deleteTable(tableName);
//		 putData(tableName, "d1h", columnFamily1, new String[]{"Jian1"}, new String[]{"zhi1"}, null, null, null);
//		 putData(tableName, "d1h", columnFamily1, new String[]{"Jian2"}, new String[]{"zhi2"}, null, null, null);
//		 putData(tableName, "d1h", columnFamily1, new String[]{"Jian1","gen"}, new String[]{"zhi1","lent"}, null, null, null);
//		 putData(tableName, "d1h", columnFamily1, new String[]{"Jianspark","Jianstorm"}, new String[]{"isOk","dontknow"}, null, null, null);
//		 putData(tableName, "d7h", columnFamily1, new String[]{"Jian1"}, new String[]{"zhi1"}, columnFamily2, new String[]{"wwwwww"}, new String[]{"bbbb"});
		 getResultScann(tableName);
//		 deleteAllColumn(tableName,"d1h");
		// putData("cap", "wuba",new String[]{"Jian1,Jian2"}, new
		// String[]{"zhi1,zhi2"}, null, null);
		// updateColumn( "wuba","cap","yd","Jian1","zhi1-mod2");
		// getData("wuba","hang1");
		// deleteColumn( "wuba","cap","yd","Jian1");
		// getResultScann("wuba");

	}

}
