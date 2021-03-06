package com.blockchain.dao;

import com.blockchain.model.Payment;
import java.util.List;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PaymentMapper
{
	@Options(useGeneratedKeys = true)
	@Insert("insert into Payments (Money,CreateTime,PartyA,PartyB) "
			+ "values(#{money},#{createTime},#{partyA},#{partyB})")
	void insertPayment(Payment p);

	@Select("select * from Payments where Id = #{id}")
	Payment getPayment(@Param("id")int id);

	@Select("select * from Payments where partyA = #{id} || partyB = #{id}")
	List<Payment> getPayments(@Param("id")int id);
}
