public class Triangle {

    private double kat1;
    private double kat2;
    private double kat3;

    public Triangle(double kat1, double kat2, double kat3) {
        this.kat1 = kat1;
        this.kat2 = kat2;
        this.kat3 = kat3;
    }

    public void setKat1(double kat1) {
        this.kat1 = kat1;
    }

    public void setKat2(double kat2) {
        this.kat2 = kat2;
    }
    public void setKat3(double kat3) { this.kat2 = kat3;
    }

    public double getKat1() {
        return kat1;
    }

    public double getKat2() {
        return kat2;
    }
    public double getKat3() { return kat3; }

    public boolean isRightTriangle(Triangle triangle){
        if(kat1 ==90 && kat1+kat2+kat3==180){
            return true;
        }
        else{
            return false;
        }
    }
}
