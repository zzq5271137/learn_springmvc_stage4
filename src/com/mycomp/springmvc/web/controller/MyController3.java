package com.mycomp.springmvc.web.controller;

import com.mycomp.springmvc.domain.Goods;
import com.mycomp.springmvc.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController3 {

    /*
     * 在控制器方法参数中以模型的方式接收参数, 会自动地把模型(goods)存放到Model对象中,
     * 所以可以直接在结果页取出(在方法内你什么都不用做);
     *
     * 它存到Model对象的方式是, 以此参数的类型的名称作为key值(首字母变为小写);
     */
    @RequestMapping("testModelAttr1")
    public String testModelAttr1(Goods goods) {
        return "/modelAttrResult.jsp";
    }

    /*
     * @ModelAttribute修饰参数:
     * 如果不想让它自动地以类型的名称作为key值, 可以使用@ModelAttribute注解
     */
    @RequestMapping("testModelAttr2")
    public String testModelAttr2(@ModelAttribute("myStu") Student student) {
        return "/modelAttrResult.jsp";
    }

    /*
     * @ModelAttribute修饰方法:
     * 此方法就会在对应的@RequestMapping映射方法执行之前自动调用;
     * 所谓对应的映射方法是指, 与此方法名相同的url请求, 也就是@RequestMapping的值;
     *
     * 并且它会先把Model对象传到这里来, 并且你可以在这里提前往Model对象中传入一些值;
     */
    @ModelAttribute
    public void testModelAttrSp(Model model) {
        System.out.println("收到了/testModelAttrSp请求");
        model.addAttribute("timeout", "false");
        System.out.println("往model中传入: timeout=false");
        System.out.println("去往映射方法中...");
    }

    @RequestMapping("testModelAttrSp")
    public String testModelAttr3(Student student, Model model) {
        System.out.println("来到映射方法, 参数为: " + model.asMap());
        return "/modelAttrResult.jsp";
    }

}
