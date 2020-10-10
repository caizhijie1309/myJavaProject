package com.example.demo.Controller;
import com.example.demo.Dao.UserLoginDao;
import com.example.demo.Model.UserLogin;
import com.example.demo.Model.disease;
import com.example.demo.Dao.UserPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
//@RunWith(SpringRunner.class)
//@SpringBootTest
/**
 * Created by Cookie on 2018/1/24.
 */

@RestController
public class HelloController {
    @Autowired
    private UserPRepository UserP;

   @GetMapping(value = "/dis")
    public List<disease> getAllDisease() {
      List<disease> diseases = UserP.findAll();
       return diseases;
   }
    @Autowired
    private UserLoginDao UserL;
    @GetMapping(value = "/login")
    public  List<UserLogin> getAlLogin(){
        List<UserLogin> Userlogin = (List<UserLogin>) UserL.findAll();
        return Userlogin;
    }
}
