import java.util.Date;

public class Reserva {
    private String Codigo;
    private Usuario usuario;
    private Bicicleta bicicleta;
    private Date fechaReserva;
    private int Duracion;

    public Reserva() {
    }

    public Reserva(String codigo, Usuario usuario, Bicicleta bicicleta, Date fechaReserva, int duracion) {
        Codigo = codigo;
        this.usuario = usuario;
        this.bicicleta = bicicleta;
        this.fechaReserva = fechaReserva;
        Duracion = duracion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }


}
