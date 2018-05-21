public class UsuarioDBanco implements Usuario {
    private int edad;
    private String nombre;
    private long codigo;
    private int telefono;

    @Override
    public long getCodigo() {
        return codigo;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public int getNumeroTelef() {
        return 0;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}
