import java.util.ArrayList;
import java.util.List;

public class BancoEnMemoria implements BancoRepo {
    List<Usuario> listaDUsuarios = new ArrayList<>();

    @Override
    public void crearUsuario(Usuario usuario) {
        listaDUsuarios.add(usuario);
    }

    @Override
    public void eleminarUsuario() {

    }

    @Override
    public void modificarUsuario() {

    }
}
