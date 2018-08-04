package com.bingdeng.mysite;

import com.bingdeng.mysite.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySiteApplicationTests {

	@Test
	public void contextLoads() {

		RedisUtil.set("fsq","方水清我爱你",20L);
		System.out.println(("宝贝："+RedisUtil.get("fsq")));

	}

}
