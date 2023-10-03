public class Galinha {
    private static Galinha galinha;
    private Galinha(){};
    public static Galinha botarOvo(){
        if(galinha == null){
            galinha = new Galinha();
        }
        return galinha;
    }
}
