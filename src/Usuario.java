public class Usuario {
    final private String Nombre = "Krizzito";
    final private int Contraseña = 1234;

    private int Saldo = 0;


    public String getNombre() {
        return Nombre;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public void setSaldo(int Saldo){this.Saldo = Saldo;}
    public int getSaldo() {return Saldo;}
}
