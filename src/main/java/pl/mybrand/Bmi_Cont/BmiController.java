package pl.mybrand.Bmi_Cont;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class BmiController {

    CalculateBmi cb = new CalculateBmi();

    @GetMapping("/bmi")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("result","");
        return "bmi";
    }

    @RequestMapping (method = RequestMethod.POST)
    public String getResult(@RequestParam Integer weight,
                            @RequestParam Integer height,
                            ModelMap modelMap){
        if (weight==null) return "bmi";
        if (height==null) return "bmi";
        CalculateBmi c = new CalculateBmi();
        float a = cb.calculateBmi(weight,height);
        modelMap.addAttribute("result",a);
        modelMap.addAttribute("result_info",cb.calcBmi(a));
        return "bmi";
}}