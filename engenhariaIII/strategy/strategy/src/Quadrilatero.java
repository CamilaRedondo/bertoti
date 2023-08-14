public class Quadrilatero {

    private Area area;

    public void setArea(Area area){
        this.area = area;
    }

    public void fazerCalculo(){
        this.area.calcular();
    }
}
