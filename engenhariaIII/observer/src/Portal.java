import java.util.ArrayList;
import java.util.List;

public class Portal {
    private List<Noticia> noticias;
    private List<Observer> observers;

    public Portal (){
        noticias = new ArrayList<Noticia>();
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o){
        observers.add(o);
    }
    public void _notify(Noticia noticia){
        for (Observer o:observers) {
            o.update(noticia.getTitulo(), noticia.getTipo(), noticia.getDataPublicacao(), noticia.getLinkAcesso(), noticia.getAutor());
        }
    }
    public void addNoticia(Noticia noticia){
        noticias.add(noticia);
        this._notify(noticia);
    }
}
