package com.chenfei.boot.activemq;

import com.chenfei.boot.activemq.produce.Queue_Produce;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest
@WebAppConfiguration
class BootMqProduceApplicationTests {

	@Resource
	private Queue_Produce queue_produce;

	@Test
	void contextLoads() throws Exception{
		queue_produce.produceMsg();
	}

}
