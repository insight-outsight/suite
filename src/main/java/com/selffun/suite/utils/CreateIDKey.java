package com.selffun.suite.utils;

import java.util.Date;
/**
 * 创建不重复的四位数ID
 * @author Administrator
 *
 */
public class CreateIDKey {
	public final String createIdKey()
    {
		String idKey = "";
        idKey += "1";
        String[] reID;
        double random = Math.random();
        Date curDate = new Date();

        if (curDate != null)
        {
            idKey += String.valueOf(curDate.getSeconds()).trim()
                     +String.valueOf((float) random * 100);
        }
        reID = idKey.split("\\.");
        idKey = reID[0];
        return idKey;
    }
}
