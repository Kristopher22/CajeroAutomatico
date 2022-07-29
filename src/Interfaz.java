public class Interfaz {

    public static void LoginUsuario(){
        System.out.println("Bienvenido a Banco Estafa :" + "\n"+
                "para Cancerlar Oprima 0"+"\t"+"\n"+

                "Por favor Ingrese su Contraseñas vergas:"
                );
    }

   public static void IngresoExitoso(String userName){
        System.out.println(" Hola: " + userName);
    }

   public static void IngresoFallido(){
       System.out.println("Contraseña incorrecta Vuelva a intentar");
   }

    public static void menu() {
        System.out.println("Elija una de las siguientes opciones :" + "\n" +
                "escriba 1 para consultar su saldo" + "\n" +
                "escriba 2 para ingresar dinero" + "\n" +
                "escriba 3 para sacar dinero" + "\n" +
                "escriba 4 para consultar sus ultimos movimientos" + "\n" +
                "una vez escrita la opcion, pulse la tecla Enter"
        );
    }


}

