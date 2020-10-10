package com.finaldemo;

import com.finaldemo.dao.p.UserPRepository;
import com.finaldemo.dao.s.MessagePRepository;
import com.finaldemo.entity.p.UserP;
import com.finaldemo.entity.s.MessageP;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinaldemoApplicationTests {

  @Autowired
  @Qualifier("primaryJdbcTemplate")
  protected JdbcTemplate jdbcTemplate1;

  @Autowired
  @Qualifier("secondaryJdbcTemplate")
  protected JdbcTemplate jdbcTemplate2;

//  @Test
//  public void test() throws Exception {
//
//    // 往第一个数据源中插入两条数据
//    jdbcTemplate1.update("insert into person(age,name) values( ?, ?)", 20, "aaa");
//    jdbcTemplate1.update("insert into person(age,name) values( ?, ?)", 30, "bbb");
//
//    // 往第二个数据源中插入一条数据，若插入的是第一个数据源，则会主键冲突报错
//    jdbcTemplate2.update("insert into user(user_name,password) values(?, ?)", "aaa", 20);
//
//    // 查一下第一个数据源中是否有两条数据，验证插入是否成功
//    Assert.assertEquals("12", jdbcTemplate1.queryForObject("select count(1) from person", String.class));
//
//    // 查一下第一个数据源中是否有两条数据，验证插入是否成功
//    Assert.assertEquals("6", jdbcTemplate2.queryForObject("select count(1) from user", String.class));
//
//  }

  @Autowired
  private UserPRepository userPRepository;
  @Autowired
  private MessagePRepository messagePRepository;

  @Test
  public void testP() throws Exception {

    userPRepository.save(new UserP("aaa", 10));
    userPRepository.save(new UserP("bbb", 20));
    userPRepository.save(new UserP("ccc", 30));
    userPRepository.save(new UserP("ddd", 40));
    userPRepository.save(new UserP("eee", 50));

    Assert.assertEquals(5, userPRepository.findAll().size());

    messagePRepository.save(new MessageP("o1", "aaaaaaaaaa"));
    messagePRepository.save(new MessageP("o2", "bbbbbbbbbb"));
    messagePRepository.save(new MessageP("o3", "cccccccccc"));

    Assert.assertEquals(3, messagePRepository.findAll().size());

  }

}
