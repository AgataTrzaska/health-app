package pl.mybrand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.mybrand.model.CalculateBmi;


@Controller
public class BmiController {

    CalculateBmi cb = new CalculateBmi();

    @GetMapping("/")
    public String bmi(ModelMap modelMap) {
        modelMap.addAttribute("result","");
        return "bmi";
    }

    @RequestMapping (value="/bmii", method = RequestMethod.POST)
    //@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
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
    }
}