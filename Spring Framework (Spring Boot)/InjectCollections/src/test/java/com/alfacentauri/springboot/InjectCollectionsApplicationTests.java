package com.alfacentauri.springboot;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjectCollectionsApplicationTests {

	@Autowired
	List<String> list;	
	
	@Test
	void testListInjections() {
		System.err.println(list);
	}

}
