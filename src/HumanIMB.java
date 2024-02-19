public class HumanIMB {
    private double weight; //Weight Human
    private double height; // Height Human
    private double imb;

    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
        imb = weight / (height * height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        imb = weight / (height * height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        imb = weight / (height * height);
    }

    public double getIMB() {
        return imb;
    }

    public String checkIMB() {
        String  personIMB = null;
        if (imb >= 18.5 && imb < 25) {
            personIMB ="Norm";
        }
        else if (imb >= 25 && imb < 30) {
            personIMB ="Warning! ";
        }
        else if (imb >= 30) {
            personIMB ="Fat";
        }
        else if (imb < 18.5) {
            personIMB ="Deficit";
        }
        return personIMB;
    }
}