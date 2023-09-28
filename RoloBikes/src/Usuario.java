import java.util.List;

public class Usuario {
    private String Id;
    private String Nombre;
    private String Correo;
    private List<Reserva> Reservas;
    private MetodoPago MetodoPago;

    public Usuario() {
    }

    public Usuario(String id, String nombre, String correo, List<Reserva> reservas, MetodoPago metodoPago) {
        Id = id;
        Nombre = nombre;
        Correo = correo;
        Reservas = reservas;
        MetodoPago = metodoPago;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public List<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        Reservas = reservas;
    }

    public MetodoPago getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        MetodoPago = metodoPago;
    }
}

