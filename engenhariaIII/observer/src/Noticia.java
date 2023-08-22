import java.util.Date;

public class Noticia {
    private String titulo;
    private String tipo;
    private Date dataPublicacao;
    private String linkAcesso;
    private String autor;

    public Noticia (String titulo, String tipo, Date dataPublicacao, String linkAcesso, String autor){
        this.titulo = titulo;
        this.tipo = tipo;
        this.dataPublicacao = dataPublicacao;
        this.linkAcesso = linkAcesso;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
