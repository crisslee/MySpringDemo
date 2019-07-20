package main.java.repo.ljx.java.demo.controller;
//这些import可以在下面编写代码的时候通过alt+enter自动补全
import main.java.repo.ljx.java.demo.controller.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HomeController {
    @Autowired
    private TestService service;//先创建一个service对象，Java语言的最小执行者就是对象

    @RequestMapping(value = "/")
    public ModelAndView index(Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;//当传入的url结尾为"/"时，创建一个名为"home"的页面返还给view做展示。网址会变成"www.xxx.com/home"
    }

    @RequestMapping(value = "/test")
    public ModelAndView test(Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }

}
