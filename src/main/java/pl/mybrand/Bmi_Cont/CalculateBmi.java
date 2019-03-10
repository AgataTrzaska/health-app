package pl.mybrand.Bmi_Cont;

import java.net.URL;

public class CalculateBmi {

    public String calcBmi(float bmi) {

        if (bmi<16.00){
            URL url = new URL("http://brzuchobrzucho.pl/wp-content/uploads/2017/08/wychudzenie-dolegliwosci-mogace-sie-pojawic-kazdym-wieku-678x381.jpg");
            return "Wygłodzenie";
        }else if (bmi>16.00 && bmi < 16.99) {
            return "Wychudzenie";
        }else if (bmi>17.00 && bmi<18.49){
            return"niedowaga";
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            return "Gratulacje! Waga prawidłowa";
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
    float bmi = weight / ((height / 100f) * (height / 100f));
    return bmi;
}catch (NullPointerException e){
    return 0;
}

    }

}