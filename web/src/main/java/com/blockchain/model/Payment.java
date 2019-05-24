package com.blockchain.model;

import java.math.BigDecimal;
import java.util.Date;

public class Payment
{
	public int id;
	public BigDecimal money;
	public Date createTime;

	/**
	 *A掏钱给B
	 * 因为不实装充值和提款，所以有唯一指定账号AdminBank
	 * AdminBank作为A的时候表示充值
	 * AdminBank作为B的时候表示提取
	*/
	public int partyA;
	public int partyB;

}