import java.util.Scanner;

public class Metodos {

    public static int tecladoint (){
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        return opcion;
    }
    public static void Swich (int opcion){
        switch (opcion){
            case 1:
                System.out.println("funco");
            break ;
        }
    }

    public static boolean Login( int Contraseña){
        boolean acceso ;
        Usuario usuario = new Usuario();

        if (Contraseña == usuario.getContraseña()){
           Interfaz.IngresoExitoso(usuario.getNombre());
           acceso = true;
        }else {
            Interfaz.IngresoFallido();
            Interfaz.LoginUsuario();
            acceso = false;
        }

       return acceso;
    }
}
