package POO_Java;

public class Estudiante extends Persona{
    public enum  Estado {
        MATRICULADO, INACTIVO, GRADUADO
    }

    private Estado estado;

    public Estudiante (int ID, String Nombre, String Apellido, String Fecha_Nacimiento, Estado estado){
        super(ID, Nombre, Apellido, Fecha_Nacimiento);
        this.estado = estado;
    }

    public Estado getEstado() { return estado; }
    public void setEstado (Estado estado) { this.estado = estado; }

    @Override
    public String toString() {
        return  super.toString() + " - Estado: " + estado;
    }
}
