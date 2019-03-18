package pl.mybrand.model;

public class OperationBmi {
    float height;
    float weight;

    public OperationBmi() {
    }

    public OperationBmi(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
