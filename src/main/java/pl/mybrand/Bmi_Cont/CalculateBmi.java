package pl.mybrand.Bmi_Cont;
import java.text.DecimalFormat;

public class CalculateBmi {

    public String calcBmi(float bmi) {

        if (bmi<16.00){
            return "Wygłodzienie";
        }else if (bmi>16.00 && bmi < 16.99) {
            return "Wychudzenie";
        }else if (bmi>17.00 && bmi<18.49){
            return"niedowaga";
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            return "Waga prawidłowa";
        } else if (bmi >= 25.00 && bmi <= 29.99) {
            return "Nadwaga";
        }else if (bmi >= 30.00 && bmi <= 34.99) {
            return "I stopień otyłości";
        }else if (bmi >= 35.00 && bmi <= 39.99) {
            return "II stopien otyłości (otyłość kliniczna)";
        }
        return "III stopień otyłości (otyłość skrajna)";
    }

    public float calculateBmi(int weight,int height){

        try {
            float height2 = height / 100f;
            return (weight / (height2 * height2));
        }catch (NullPointerException e){
            return 0;
        }


    }

}