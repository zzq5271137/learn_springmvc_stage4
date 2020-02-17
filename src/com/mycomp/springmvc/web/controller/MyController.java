package com.mycomp.springmvc.web.controller;

import com.mycomp.springmvc.domain.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {

    /*
     * 通过ModelAndView传值;
     * 使用addObject()传值, 是写到request域中的;
     */
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView();

        // 这里的数据是写到request域中的
        modelAndView.addObject("testModelAndView", "zzq");

        modelAndView.setViewName("/modelResult.jsp");
        return modelAndView;
    }

    /*
     * 通过Model传值;
     * 会自动传一个Model对象进来;
     * 通过Model对象的addAttribute()进行传值, 也是写到request域中的;
     */
    @RequestMapping("testModel")
    public String testModel(Model model) {
        // 这里的值, 也是写到request域中的
        model.addAttribute("testModel", "zzq");

        // 也可以直接传入一个对象
        Goods myGoods = new Goods();
        myGoods.setName("switch");
        myGoods.setPrice(2100d);
        model.addAttribute(myGoods);

        // 所有的值都是以key-value的形式加入到Model对象中的Map里
        // 如果是对象, 它的key值为此对象所对应的类名(开头换成小写)

        // asMap()方法会将Model对象转换成一个Map
        System.out.println(model.asMap());

        return "/modelResult.jsp";
    }

    /*
     * 通过Model的addAllAttributes()传值;
     *
     * addAllAttributes(Map<String, ?> attributes):
     * 将attributes中的内容复制到当前的model中, 如果当前model存在相同内容，会被覆盖;
     *
     * addAllAttributes(Collection<?> attributeValues):
     * 以集合中数据的类型做为key(开头改为小写), 将所提供的Collection中的所有属性复制到这个Map中, 如果有同类型会存在覆盖现象
     */
    @RequestMapping("testModelAddAll")
    public String testModelAddAll(Model model) {

        // addAllAttributes(Map<String, ?> attributes)
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zzq233");
        map.put("age", 1000);
        model.addAllAttributes(map);

        // addAllAttributes(Collection<?> attributeValues)
        List<Object> list = new ArrayList<>();
        list.add("zzqGo");
        list.add(235);
        list.add(127); // 这一个就会把上一个覆盖了, 因为是同类型的(类型相同, 也就是key值相同, 在Map中key值相同当然会覆盖)
        model.addAllAttributes(list);

        System.out.println(model.asMap());
        // 判断是否有这个参数, 传入key值
        System.out.println(model.containsAttribute("name"));

        return "/modelResult.jsp";
    }

    /*
     * 通过Map传值;
     * 也是存到request域中的
     */
    @RequestMapping("testMap")
    public String testMap(Map map) {
        map.put("mapKey1", "value1");
        map.put("mapKey2", 14.5);
        return "/modelResult.jsp";
    }

}
