import java.util.Scanner;

public class Metodos {
    static Usuario usuario = new Usuario();

    public static int tecladoint() {
        Scanner sc = new Scanner(System.in);
        //int opcion = sc.nextInt();
        return sc.nextInt();
    }

    public static void Swich(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println(usuario.getSaldo());
                Interfaz.question();
                Answer(tecladoint());
                break;
            case 2:
                int validador;
                int saldo;
                do {
                    Interfaz.RequestMoney();
                    saldo=tecladoint();
                    validador=validarNuevoSaldo(saldo);
                }while (validador==1);
                Interfaz.accionExitosa();
                usuario.setSaldo(saldo);
                Interfaz.question();
                Answer(tecladoint());
                break;
            default:
                break;
        }
    }

    public static int Login(int Contraseña) {
        int acceso;

        if (Contraseña == usuario.getContraseña()) {
            Interfaz.IngresoExitoso(usuario.getNombre());
            acceso = 1;
        } else if (Contraseña != usuario.getContraseña() && Contraseña != 0) {
            Interfaz.IngresoFallido();
//            Interfaz.LoginUsuario();
            acceso = 2;
        } else {
            acceso = 0;
            Interfaz.Despedida();
        }
        return acceso;
    }
    public static void MainMenu() {
        Interfaz.menu();
        Metodos.Swich(Metodos.tecladoint());
    }

    public static void Answer(int opcion) {
        if (opcion != 0) {
            MainMenu();
        }else{
            Interfaz.Despedida();
        }
    }

    public static int validarNuevoSaldo(int Saldo) {
        int mensaje=0;
        if (Saldo > 5000) {
            Interfaz.LimiteDeposito();
            mensaje = 1;
        }
        return mensaje;
    }

    public static void cajero() {
        int opcion;
        do {
            Interfaz.LoginUsuario();
            opcion = Metodos.Login(Metodos.tecladoint());
        } while (opcion == 2);
        if (opcion != 0) {
            MainMenu();
        }
    }
}
