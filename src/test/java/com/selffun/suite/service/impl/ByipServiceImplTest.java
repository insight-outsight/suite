/**
 * 
 */
package com.selffun.suite.service.impl;

import static org.junit.Assert.*;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.selffun.suite.pojo.Byip;
import com.selffun.suite.pojo.ByipExample;
import com.selffun.suite.service.ByipService;

/**
 * @author Administrator
 *
 */
public class ByipServiceImplTest extends BaseServiceTest{
	
	@Resource
	ByipService byipServiceImpl;
	
	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#countByExample(com.selffun.suite.pojo.ByipExample)}.
	 */
	@Test
	public void testCountByExample() {
		ByipExample byipExample = new ByipExample();
		byipExample.createCriteria();
		int returnCount = byipServiceImpl.countByExample(byipExample);
		assertEquals(2,returnCount);
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#deleteByExample(com.selffun.suite.pojo.ByipExample)}.
	 */
	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#selectByExample(com.selffun.suite.pojo.ByipExample)}.
	 */
	@Test
	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#updateByExampleSelective(com.selffun.suite.pojo.Byip, com.selffun.suite.pojo.ByipExample)}.
	 */
	@Test
	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#updateByExample(com.selffun.suite.pojo.Byip, com.selffun.suite.pojo.ByipExample)}.
	 */
	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#selectByExampleAndPage(com.selffun.suite.pojo.ByipExample, org.apache.ibatis.session.RowBounds)}.
	 */
	@Test
	public void testSelectByExampleAndPage() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#deleteByPrimaryKey(java.lang.Long)}.
	 */
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#insert(com.selffun.suite.pojo.Byip)}.
	 */
	@Test
	public void testInsert() {
/*		Byip byip = new Byip();
		byip.setCallCount(99922l);
		byip.setCmCreatedTime(new Date());
		byip.setDataInput(400000088l);
		byip.setDataOutput(8700333l);
		byip.set*/
		
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#insertSelective(com.selffun.suite.pojo.Byip)}.
	 */
	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#selectByPrimaryKey(java.lang.Long)}.
	 */
	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#updateByPrimaryKeySelective(com.selffun.suite.pojo.Byip)}.
	 */
	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.selffun.suite.service.impl.ByipServiceImpl#updateByPrimaryKey(com.selffun.suite.pojo.Byip)}.
	 */
	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
