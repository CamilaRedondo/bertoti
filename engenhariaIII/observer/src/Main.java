import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Portal portal = new Portal();
        portal.addObserver(new Web());
        portal.addObserver(new App());
        Noticia noticia01 = new Noticia("Baleia Baleia Baleia", "Assinato", new Date(), "www.balei.com.br", "Henrique");
        portal.addNoticia(noticia01);

    }
}
