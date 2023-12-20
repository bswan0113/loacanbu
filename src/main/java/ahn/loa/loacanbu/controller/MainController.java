package ahn.loa.loacanbu.controller;

import ahn.loa.loacanbu.common.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MainController {

    @Autowired
    private final TestService testService;

    @GetMapping("/")
    public ModelAndView main(ModelAndView mv){

        mv.addObject("test",testService.testService());
        mv.setViewName("html/main/main");
        return mv;
    }
}
