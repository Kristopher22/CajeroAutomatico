import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {
    static Usuario usuario = new Usuario();
    static List<String> Movimientos = new ArrayList<>();
    static String RegistroMov;
    static List<String> MovList = new ArrayList<>();

    public static int tecladoint() {
        Scanner sc = new Scanner(System.in);
        //int opcion = sc.nextInt();
        return sc.nextInt();
    }

    public static void Swich(int opcion) {
        int validador = 0;
        int saldo;
        int contador = 0;
        switch (opcion) {
            case 1 -> {
                System.out.println(usuario.getSaldo());
                RegistroMov = "Mov.............Consulta de saldo";
                MovList = ListaMovimiento(RegistroMov);
                //MovList.add(RegistroMov);
                Interfaz.question();
                Answer(tecladoint());
            }
            case 2 -> {
                do {
                    Interfaz.RequestMoney();
                    saldo = tecladoint();
                    validador = validarNuevoSaldo(saldo);
                } while (validador == 1);
                Interfaz.accionExitosa();
                RegistroMov = "Mov.... Depósito\n Saldo anterior " + usuario.getSaldo() + "... Saldo actual " + saldo;
                MovList = ListaMovimiento(RegistroMov);
                usuario.setSaldo(saldo);
                Interfaz.question();
                Answer(tecladoint());
            }
            case 3 -> {
                do {
                    contador++;
                    if (contador > 1) {
                        Interfaz.question();
                        Answer(tecladoint());
                    } else {
                        Interfaz.Sacardinero();
                        Interfaz.MensajeAnular();
                        saldo = tecladoint();
                        if (saldo == 0) {
                            MainMenu();
                        } else {
                            validador = ValidarRetiroSaldo(saldo);

                        }
                    }

                } while (validador == 1);
                Interfaz.question();
                Answer(tecladoint());
            }
            case 4 -> {
                for (String s : MovList) {
                    System.out.println(s);
                }
                 /* for( int i = 0 ; i < MovList.size() ; i++ ){
                      System.out.println(MovList.get(i).toString());
                  }*/
                Interfaz.question();
                Answer(tecladoint());
            }
            case 0 -> Interfaz.Despedida();
            default -> {
                Interfaz.MensajeError();
                MainMenu();
            }
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
        } else {
            Interfaz.Despedida();
        }
    }

    public static int validarNuevoSaldo(int Saldo) {
        int mensaje = 0;
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

    public static int ValidarRetiroSaldo(int saldo) {
        int mensaje;
        int resta = usuario.getSaldo() - saldo;
        int saldoActual=usuario.getSaldo();

        if (saldo > 1000) {
            Interfaz.LimiteRetiro();
            mensaje = 1;

        } else if (resta > 0) {
            System.out.println("Transaccion exitosa retire su dinero");
            usuario.setSaldo(resta);
            RegistroMov="Mov.... Retiro de dinero\n Cantidad:"+ saldo+"\n Saldo anterior..." +saldoActual+ "\n Saldo actual..."+resta;
            MovList = ListaMovimiento(RegistroMov);
            mensaje = 2;

        } else {
            System.out.println("no tiene dinero Suficiente para realizar la operacion");
            mensaje = 1;

        }
        return mensaje;
    }

    public static List<String> ListaMovimiento(String Movimiento) {
        Movimientos.add(Movimiento);
        return Movimientos;
    }



}
