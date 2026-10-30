public class PruebaMain {
    public static void main (String[] args){
        ConexionBaseDatos c1 = new ConexionBaseDatos("192.168.1.10",3306);
        ConexionBaseDatos c2 = new ConexionBaseDatos("192.168.1.10");
    }
}
