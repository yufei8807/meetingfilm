package com.example.meeting.common;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.meeting.bean.MoocBackendUserT;
import com.example.meeting.mapper.MoocBackendUserTMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "com.example.meeting")
@MapperScan(basePackages = "com.example.meeting.mapper")
public class MeetingCommonApplicationTests {

	@Autowired
	MoocBackendUserTMapper mapper;

	@Test
	public void contextLoads() {
//		MoocBackendUserT moocBackendUserT = mapper.selectById(2);
//		System.out.println(moocBackendUserT);
//
//
//		QueryWrapper wrapper = new QueryWrapper();
//		wrapper.eq("user_name","josh");
//
//		List<MoocBackendUserT> moocBackendUserTS = mapper.selectList(wrapper);
//		for (MoocBackendUserT user : moocBackendUserTS)
//			System.out.println(user);

		Page<MoocBackendUserT> page = new Page<>(1,2);
		IPage<MoocBackendUserT> moocBackendUserTIPage = mapper.selectPage(page, null);
		long pages = moocBackendUserTIPage.getPages();
		long total = moocBackendUserTIPage.getTotal();
		System.out.println(pages);
		System.out.println(total);
	}


}
