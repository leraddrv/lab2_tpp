package hello;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class Application {

    @GetMapping("/")
    public String index() {
        // Виводить сторінку з полем введення
        return "index";  
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(@RequestParam("expression") String expression) {
        ModelAndView mav = new ModelAndView("index");  // Має бути файл index.html
        try {
            // Парсинг математичного виразу
            Expression exp = new ExpressionBuilder(expression).build();
            double result = exp.evaluate();
            mav.addObject("result", result);
        } catch (Exception e) {
            mav.addObject("error", "Invalid expression");
        }
        return mav;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
