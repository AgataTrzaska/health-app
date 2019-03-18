package pl.mybrand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mybrand.model.CalculateKcal;

@Controller
public class KcalController {

    CalculateKcal kc = new CalculateKcal();

    @GetMapping("/kcal")
    public String kcal(ModelMap modelMap) {
        modelMap.addAttribute("kcalM","");
        modelMap.addAttribute("kcalW","");
        return "kcal";
    }
    //@RequestMapping(method = RequestMethod.POST)
    @RequestMapping(value="kcal", method= RequestMethod.POST)
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
            modelMap.addAttribute("kcalM",b);
        }
        else {

            modelMap.addAttribute("kcalW", a);
        }
        return "kcal";

    }}