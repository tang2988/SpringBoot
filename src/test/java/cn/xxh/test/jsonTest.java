package cn.xxh.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxh.json.FileData;
import com.xxh.springbootMybatis.ServiceImpl.FileDataService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = xxhTest.class)
public class jsonTest {
	
	@Autowired
	FileDataService dataService;
	
	@Test
	public void Testjson() throws Exception{
		 FileData bbbb = dataService.findJson();
		 System.out.println(bbbb);
    }


}
