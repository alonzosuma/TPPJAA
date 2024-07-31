package POO_Java;

public class Curso {
    private int ID;
    private String Nombre;
    private String Descripcion;
    private int Numero_Creditos;
    private String Version;

    public Curso (){

    }

    public Curso (int ID, String Nombre, String Descripcion, int Numero_Creditos, String Version){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Numero_Creditos = Numero_Creditos;
        this.Version = Version;
    }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public String getNombre()  { return Nombre;}
    public  void setNombre(String Nombre) { this.Nombre = Nombre; }

    public String getDescripcion() { return Descripcion; }
    public void setDescripcion(String Descripcion) { this.Descripcion = Descripcion; }

    public int getNumero_Creditos() { return  Numero_Creditos; }
    public void setNumero_Creditos(int Numero_Creditos) { this.Numero_Creditos = Numero_Creditos; }

    public String getVersion() { return Version; }
    public void setVersion(String Version) { this.Version = Version; }

    @Override
    public String toString() {
        return Nombre + " (" + Version + ")";
    }
}
