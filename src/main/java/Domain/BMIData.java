package Domain;

/**
 * Created by Polle on 31-3-2017.
 */
public class BMIData {
    private float lengte;
    private float gewicht;

    public BMIData(float lengte, float gewicht){
        this.setLengte(lengte);
        this.setGewicht(gewicht);
    }

    public float getBMI(){
        return getGewicht() / (getLengte() * getLengte());
    }

    public float getLengte() {
        return lengte;
    }

    public void setLengte(float lengte) {
        this.lengte = lengte;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }
}
