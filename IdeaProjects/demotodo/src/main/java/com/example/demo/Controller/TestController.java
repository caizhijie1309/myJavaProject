package com.example.demo.Controller;

import com.example.demo.Dao.PlantRespository;
import com.example.demo.Dao.ResultMsg;
import com.example.demo.Dao.ResultStatusCode;
import com.example.demo.Dao.UserPRepository;
import com.example.demo.Model.Plant;
import com.example.demo.Model.Test;
import com.example.demo.Model.disease;
import com.sun.corba.se.spi.orbutil.fsm.Guard;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.lang.Object;

import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cookie on 2018/1/30.
 */
@RestController
@RequestMapping("disease")
public class TestController {
//    @Autowired
//    private UserPRepository userRepositoy;
//    @Autowired
//    private PlantRespository plantRespository;
//
//    @GetMapping("getuser")
//    public Object getUser(Integer id) {
//
//        disease userEntity = userRepositoy.findById(id);
//        ResultMsg resultmsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntity);
//        return resultmsg;
//    }
//
//    @GetMapping("getSearchList")
//    public Object getSearchList(Integer disease_type) {
//
//        List<disease> uersEntities = userRepositoy.findBydisease_type(disease_type);
//        ResultMsg resultmsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), uersEntities);
//        return resultmsg;
//    }
//
//    @GetMapping("getPlantList")
//    public Object getPlantList(Integer plant_id) {
//
//        List<disease> uersEntities = userRepositoy.findByplant_id(plant_id);
//        ResultMsg resultmsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), uersEntities);
//        return resultmsg;
//    }
//
//    @GetMapping("getDiseaseList")
//    public List<Test> getDiseaseList() {
//        {
//            List<Object[]> plantEntities = plantRespository.findByplant_name();
//            List<Test> list = new ArrayList<>();
//            for (Object[] ob : plantEntities) {
//                Test test = new Test((Integer)ob[0] , ob[1].toString(), (Integer)ob[2], ob[3].toString());
//                list.add(test);
//            }
//
////            ResultMsg resultmsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), plantEntities);
//            return list;
//        }
//    }
//
//    @GetMapping("getDiseaseNameList")
//    public Object getDiseaseNameList(String disease_name) {
//        List<disease> PlantEntities = userRepositoy.findBydisease_name(disease_name);
//        ResultMsg resultmsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), PlantEntities);
//        return resultmsg;
//    }
    //  @Modifying
//    @PostMapping(value = "adduser")
//    public Object addUser(@RequestParam(value = "disease_name") String name,@RequestParam(value = "disease_type") int type) {
//        disease d1 = new disease();
//        d1.setDisease_name("fdf");
//        d1.getDisease_type(1);
//        userRepositoy.save(d1);
//        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), d1);
//        return resultMsg;
//    }
}
