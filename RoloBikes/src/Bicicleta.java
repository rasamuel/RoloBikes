public class Bicicleta {
    private String Id;
    private String Tipo;
    private String Estado;

    public Bicicleta() {
    }

    public Bicicleta(String id, String tipo, String estado) {
        Id = id;
        Tipo = tipo;
        Estado = estado;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
