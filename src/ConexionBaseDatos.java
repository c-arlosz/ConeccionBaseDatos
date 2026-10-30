public class ConexionBaseDatos {
    private String host;
    private int puerto;
    public ConexionBaseDatos(String host, int puerto){
        if (puerto < 1024){
            throw new IllegalArgumentException("puerto invalido, debe ser mayor a 1024");
        }
        this.host = host;
        this.puerto = puerto;
        System.out.println("Objeo creado: " + this.host + " ---> " + this.puerto);
    }
    public ConexionBaseDatos(String host){
        this(host,5432);
    }
}