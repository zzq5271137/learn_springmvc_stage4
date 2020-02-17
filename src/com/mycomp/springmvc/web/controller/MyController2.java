package com.mycomp.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(
        value = {"name"}, // 把Model对象当中key为"name"的暂存到session域中, 而且request域中也有这个值
        types = {Integer.class} // 把Model对象中值的类型为Integer的全部暂存到session域中
)
public class MyController2 {

    /*
     * @SessionAttributes注解:
     * 将模型中的某个属性暂存到 HttpSession中, 以便多个请求之间可以共享这个属性;
     * value: 通过指定key将model数据放到session域当中;
     * types: 把指定类型的模型数据放到session域当中;
     *
     * 它是贴在类上的一个注解;
     */
    @RequestMapping("testSessionAttrs")
    public String testSessionAttrs(Model model) {
        /*
         * 使用Model对象, 是把数据存到request域当中的;
         * 但如果在控制器类名上面加上@SessionAttributes("name"), 它就被暂存到了session域中, 而且request域中也有这个值;
         *
         * 注意: 存到session域中的数据, 在下一次访问请求时, 会自动地添加到Model对象中并传入;
         */
        model.addAttribute("name", "zzq");
        model.addAttribute("age", 27);

        return "/sessionResult.jsp";
    }

    /*
     * @SessionAttribute注解:
     * 使用@SessionAttribute来访问预先存在的全局会话属性;
     * 如果没有相应属性, 则会报错;
     *
     * 它是写在控制器方法的参数里的;
     */
    @RequestMapping("testSessionAttr")
    public String testSessionAttr(@SessionAttribute("name") String name) {
        System.out.println("name: " + name);
        return "/sessionResult.jsp";
    }

}
