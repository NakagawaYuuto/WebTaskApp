package jp.gihyo.projava.tasklist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HelloController {


    @RequestMapping(value="/hello")
//    @ResponseBody
//    String hello() {
//        return """
//                <html>
//                <head><title>Hello</title></head>
//                <body>
//                <h1>Hello</h1>
//                It works!<br>
//                現在時刻は%sです。
//                </body>
//                </html>
//                """.formatted(LocalDateTime.now());
//    }

    String hello(Model model1) {
        model1.addAttribute("time", LocalDateTime.now());
        return "helle";
    }
}
