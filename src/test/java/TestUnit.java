import com.zys.pojo.User;
import com.zys.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @program: SSM-xml
 * @description: testUnit
 * @author: xiaozhang6666
 * @create: 2020-09-14 22:47
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:ApplicationContext.xml"})
public class TestUnit {

    @Autowired
    UserService userService;

    @Test
    public void findAll() {
        List<User> all = userService.findAll();
        System.out.println(all);
    }

    @Test
    public void testSave() {
        Integer integer = userService.saveUser(new User(null, "小王八2", new Date(),"男", "北京昌平"));
        System.out.println(integer);
    }

    @Test
    public void test1(){
        System.out.println("你好");
    }
}
