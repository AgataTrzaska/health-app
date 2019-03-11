package pl.mybrand.Kcal_Cont;

public class OperationKcal {
    float weight;
    float height;
    int age;
    String sex;

    public OperationKcal(float weight, float height, int age, String sex) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}