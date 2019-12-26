package com.bjsxt.springbootthymeleaf.controller;

import com.bjsxt.springbootthymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author hanyueqian
 * @date 2019/12/22 0022-下午 15:11
 */
@Controller
public class PageController
{
    @GetMapping("/show")
    public String showPage(Model model, HttpServletRequest request)
    {
        model.addAttribute("msg","HelloThymeleaf");
        model.addAttribute("date",new Date());
        model.addAttribute("sex",'女');
        model.addAttribute("id","23");
        List<User> list =new ArrayList();
        list.add(new User(1,"smith",22));
        list.add(new User(2,"john",23));
        list.add(new User(3,"marry",24));
        model.addAttribute("list",list);
        Map<String,User> map =new HashMap<>();
        map.put("user1",new User(1,"smith",22));
        map.put("user2",new User(2,"John",23));
        map.put("user3",new User(3,"marry",24));
        model.addAttribute("map",map);
        request.setAttribute("request","HttpServletRequest");
        request.getSession().setAttribute("session","HttpSession");
        request.getSession().getServletContext().setAttribute("app","application");
        model.addAttribute("id",100);
        model.addAttribute("name","王五");
        return "index";
    }

    /*超链接都是Get方法*/
    @GetMapping("/show2")
    public String show2(int id,String name)
    {
        System.out.println(id+"\t"+name);
        return "index2";
    }

    @GetMapping("/show3/{id}")
    public String show3(@PathVariable int id,String name)
    {
        System.out.println(id+"\t"+name);
        return "index2";
    }
}
