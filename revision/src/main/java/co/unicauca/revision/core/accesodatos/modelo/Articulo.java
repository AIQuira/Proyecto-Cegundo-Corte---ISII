package co.unicauca.revision.core.accesodatos.modelo;

public class Articulo {
   private int idArticulo;
   private String titulo;
   private String descripcion;
   private String resumen;
   private String keyword;
   private String estado;
   
   private Conferencia objConferencia;

   public Articulo()
   {
       
   }

    public Articulo(int idArticulo, String titulo, String descripcion, String resumen, String keyword, String estado, Conferencia objConferencia) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.keyword = keyword;
        this.estado = estado;
        this.objConferencia = objConferencia;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

}
