package com.selffun.suite.utils;

import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

/***
 * 
* @title: Jsonת����
* @description: TODO(ͨ����ʡ�ͷ�����ƽ�list����ת��Ϊjson) 
* @param   
* @return ����һ��json�ַ�
* @throws
 */
public class JsonUtil {

	public static String objectToJson(Object object) {
		StringBuilder json = new StringBuilder();
		if (object == null) {
			json.append("\"\"");
		} else if (object instanceof String || object instanceof Integer
				|| object instanceof Date || object instanceof Time || object instanceof Timestamp) {
			json.append("\"").append(object.toString()).append("\"");
		} else if(object instanceof Boolean){
			json.append(object.toString());
		}else {
			json.append(beanToJson(object));
		}
		return json.toString();
	}

	public static String beanToJson(Object bean) {
		//用于叶子节点不在JOSN中出现state字段
		int type = 0;
		StringBuilder json = new StringBuilder();
		json.append("{");
		PropertyDescriptor[] props = null;
			try {
				props = Introspector.getBeanInfo(bean.getClass(), Object.class)
						.getPropertyDescriptors();
			} catch (IntrospectionException e) {
			}
		if (props != null) {
			for (int i = 0; i < props.length; i++) {
				try {
					String name = objectToJson(props[i].getName());
					
					if (name.equals("\"callbacks\"") || name.equals("\"id\"") || name.equals("\"operation\"") || name.equals("\"parent_id\"") || name.equals("\"positon\"") || name.equals("\"initial\""))// ���˵�Ĭ�ϵ�IndexedPropertyDescriptor
					{
						continue;
					}
					String value = objectToJson(props[i].getReadMethod()
							.invoke(bean));
					if(name.equals("\"title\"")){
						name="\"data\"";
					}
					if(name.equals("\"node_id\"")){
						name="\"id\"";
					}
					if(name.equals("\"type\"")){
						name="\"rel\"";
						if(value.equals("\"1\"")){
							//用于叶子节点不在JOSN中出现state字段
							type=1;
							value="\"folder\"";
						}else{
							//用于叶子节点不在JOSN中出现state字段
							type=0;
							value="\"file\"";
						}
					}
					if(name.equals("\"state\"")){
						value="\"closed\"";
					}
					json.append(name);
					json.append(":");
					json.append(value);
					json.append(",");
				} catch (Exception e) {
				}
			}
			json.setCharAt(json.length() - 1, '}');
			//用于叶子节点不在JOSN中出现state字段
			json=RelFold.relToFold(json,type);
		} else {
			json.append("}");
		}
		return json.toString();
	}

	public static String listToJson(List<?> list) {
		StringBuilder json = new StringBuilder();
		json.append("[");
		if (list != null && list.size() > 0) {
			for (Object obj : list) {
				json.append(objectToJson(obj));
				json.append(",");
			}
			json.setCharAt(json.length() - 1, ']');
		} else {
			json.append("]");
		}
		return json.toString();
	}
}