package asg.dev.demospringboot01.controllers;

import asg.dev.demospringboot01.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {
    @RequestMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> returnVal = new HashMap<>();
        returnVal.put("hello", "world");
        return returnVal;
    }

    @RequestMapping("/user/{id}")
    public Map<String, Object> getUserk(@PathVariable("id") Integer id) {
        User user01 = new User();
        user01.setFirstName("Jack-" + id);
        user01.setLastName("Ma");
        user01.setEmail("jack-" + id + ".ma@aliyun.com");
        Map<String, Object> res = new HashMap<>();
        res.put("new user", user01);
        return res;
    }

    @RequestMapping("/user")
    public Map<String, Object> getUserp(@RequestParam("id") Integer id) {
        User user01 = new User();
        user01.setFirstName("Jack-" + id);
        user01.setLastName("Ma");
        user01.setEmail("jack-" + id + ".ma@aliyun.com");
        Map<String, Object> res = new HashMap<>();
        res.put("new user", user01);
        return res;
    }
    @RequestMapping("/user0")
    public Map<String, Object> getUser() {
        User user01 = new User();
        user01.setFirstName("Jack");
        user01.setLastName("Ma");
        user01.setEmail("jack.ma@aliyun.com");
        Map<String, Object> res = new HashMap<>();
        res.put("new user", user01);
        return res;
    }
}
