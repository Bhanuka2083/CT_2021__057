package LW_03.Q3;

class Circle{

    private double r;

    public Circle(double ri){
        this.r = 0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double computeArea(double r){
        return Math.PI*r*r;
    }

    public double computeCircumference(double r){
        return 2 * Math.PI * r;
    }


}
