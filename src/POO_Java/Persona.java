package POO_Java;

public class Persona {
    private int ID;
    private String Nombre;
    private String Apellido;
    private String Fecha_Nacimiento;

    public Persona (){

    }

    public Persona (int ID, String Nombre, String Apellido, String Fecha_Nacimiento){
        this.ID = ID;
        this.Nombre =  Nombre;
        this.Apellido = Apellido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public int getID() { return ID; }
    public void setID (int ID) {this.ID = ID; }

    public String getNombre() { return Nombre; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }

    public String getApellido() { return Apellido; }
    public void setApellido(String Apellido) { this.Apellido = Apellido; }

    public String getFecha_Nacimiento() { return  Fecha_Nacimiento; }
    public void  setFecha_Nacimiento (String Fecha_Nacimiento) { this.Fecha_Nacimiento = Fecha_Nacimiento; }

    @Override
        public String toString() {
        return Nombre + " " + Apellido;
    }
}
