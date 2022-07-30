public class Interfaz {

    public static void LoginUsuario() {
        System.out.println("Bienvenido a Banco Estafa :\npara Cancerlar Oprima 0\nPor favor Ingrese su Contraseñas vergas:"
        );
    }

    public static void IngresoExitoso(String userName) {
        System.out.println(" Hola: " + userName);
    }

    public static void IngresoFallido() {
        System.out.println("Contraseña incorrecta Vuelva a intentar");
    }

    public static void Despedida() {
        System.out.println("Por favor retire su tarjeta \n \t Hasta luego");
    }
    public static void menu() {
        System.out.println("Elija una de las siguientes opciones :\n escriba 1 para consultar su saldo\nescriba 2 para ingresar dinero\nescriba 3 para sacar dinero\nescriba 4 para consultar sus ultimos movimientos\nuna vez escrita la opcion, pulse la tecla Enter"
        );
    }
    public static void question(){
        System.out.println("¿Desea hacer otra operación? \n Sí = 1 No = 0");
    }
    public static void RequestMoney(){
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
    }
    public static void Sacardinero(){
        System.out.println("Ingrese Monto a Retirar ");
    }
    public static void LimiteRetiro(){
        System.out.println("El retiro máximo es de 1000 billuyos.");
    }
    public static void LimiteDeposito(){
        System.out.println("El depósito máximo es de 5000 billuyos.");
    }
    public static void accionExitosa(){
        System.out.println("\n\n");
        System.out.println("Acción realizada exitosamente");
    }

    public static void Movimientos(){

    }
}

