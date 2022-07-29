public class Interfaz {

    public static void LoginUsuario(){
        System.out.println("Bienvenido a Banco Estafa :\npara Cancerlar Oprima 0\nPor favor Ingrese su Contraseñas vergas:"
                );
    }

   public static void IngresoExitoso(String userName){
        System.out.println(" Hola: " + userName);
    }

   public static void IngresoFallido(){
       System.out.println("Contraseña incorrecta Vuelva a intentar");
   }

    public static void menu() {
        System.out.println("Elija una de las siguientes opciones :\n escriba 1 para consultar su saldo\nescriba 2 para ingresar dinero\nescriba 3 para sacar dinero\nescriba 4 para consultar sus ultimos movimientos\nuna vez escrita la opcion, pulse la tecla Enter"
        );
    }


}

