import java.util.Date;

public class Web implements Observer{
    @Override
    public void update(String tipo, String titulo, Date dataPublicacao, String linkAcesso, String Autor) {
        System.out.println("Notificação página Web!");
    }
}
