import java.util.Date;

public interface Observer {
    public void update(String tipo, String titulo, Date dataPublicacao, String linkAcesso, String Autor);

}
