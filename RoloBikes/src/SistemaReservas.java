import java.util.List;
public class SistemaReservas {
    private List<Bicicleta> Bicicletas;
    private List<Usuario> Usuarios;
    private List<Reserva> Reservas;
    private List<Bicicleta> Catalogo;

    public SistemaReservas() {
    }

    public SistemaReservas(List<Bicicleta> bicicletas, List<Usuario> usuarios, List<Reserva> reservas, List<Bicicleta> catalogo) {
        Bicicletas = bicicletas;
        Usuarios = usuarios;
        Reservas = reservas;
        Catalogo = catalogo;
    }

    public List<Bicicleta> getBicicletas() {
        return Bicicletas;
    }

    public void setBicicletas(List<Bicicleta> bicicletas) {
        Bicicletas = bicicletas;
    }

    public List<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        Usuarios = usuarios;
    }

    public List<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        Reservas = reservas;
    }

    public List<Bicicleta> getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(List<Bicicleta> catalogo) {
        Catalogo = catalogo;
    }

    public boolean IniciarSesion(Usuario usuario){
        return true;
    }

    public boolean Registrarse(String Nombre, String Contraseña, String Correo){
        return true;
    }

    public boolean CerrarSesion(){
        return true;
    }

    public void DesplegarCatalogo(){

    }

    public void AgregarBicicleta(Bicicleta bicicleta){

    }

    public void EliminarBicicleta(Bicicleta bicicleta){

    }

    public void CrearCatalogo(List<Bicicleta> Bicicletas){

    }
}
