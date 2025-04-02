package LW_03.Q1_02;

class Temperature{

    private double celsius;
    private double fahrenheit;

    public Temperature(double celsius){
        this.celsius = 0;
        this.fahrenheit = 0;
    }



    //Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getCelsius() {
        return celsius;
    }

    public double toFahrenheit(double celsius){
        return  celsius * 9 / 5 + 32;
    }

    //Fahrenheit


    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double toCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

}

