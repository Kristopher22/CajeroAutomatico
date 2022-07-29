
public class Main {
    public static void main(String[] args) {
        Interfaz.LoginUsuario();

        if(Metodos.Login(Metodos.tecladoint())){
            Interfaz.menu();
            Metodos.Swich(Metodos.tecladoint());
        }

    }
}
