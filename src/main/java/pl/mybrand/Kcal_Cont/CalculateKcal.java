package pl.mybrand.Kcal_Cont;

public class CalculateKcal {

    public String calcKcal(String sex) {
        if(sex == "Woman") {
            return "kcalW";
        }else{
         return"kcalM";
            }}

    public float calculateKcalWomen(int weight,int height, int age){
        try {
            float kcalW = (9.99f*weight)+(6.25f*height)-(4.92f*age)-161f;
            return kcalW;
        }catch (NullPointerException e){
            return 0;
        }}
        public float calculateKcalMen(int weight,int height, int age){
            try {
                float kcalM = (9.99f*weight)+(6.25f*height)-(4.92f*age)+5f;
                return kcalM;
            }catch (NullPointerException e){
                return 0;
            }
        }}