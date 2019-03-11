package pl.mybrand.Kcal_Cont;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class KcalController {

    CalculateKcal kc = new CalculateKcal();

    @GetMapping("/kcal")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("result","");
        modelMap.addAttribute("result2","");
        return "kcal";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String getResult(@RequestParam Integer weight,
                            @RequestParam Integer height,
                            @RequestParam Integer age,
                            @RequestParam String sex,
                            ModelMap modelMap){
        if (weight==null) return "kcalW";
        if (weight==null) return "kcalM";
        if (height==null) return "kcalW";
        if (height==null) return "kcalM";
        if (age==null) return "kcalW";
        if (age==null) return "kcalM";
        CalculateKcal c = new CalculateKcal();
        float a = kc.calculateKcalWomen(weight, height, age);
        float b = kc.calculateKcalMen(weight, height, age);
        if ( sex.equals("Man")){
            modelMap.addAttribute("resultM",b);
        }
        else {

            modelMap.addAttribute("resultW", a);
        }
        return "kcal";

}}