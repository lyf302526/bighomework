package org.big.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.big.domain.User;

import com.mchange.v1.cachedstore.CachedStore.Manager;

public interface ManagerMapper {
	@Select("select * from manager where loginname = #{loginname} and password = #{password}")
	Manager findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	@Insert("insert into manager(loginname,password)values(#{loginname},#{password})")
	int save(Manager manager);
	@Update("update manager set password=#{password} where loginname=#{loginname}")
	int update(Manager manager);
}
