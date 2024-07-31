package POO_Java;

public class Main {
    public static void main (String[] args) {
        Gestor_Academico gestor = new Gestor_Academico();

        Estudiante N1 = new Estudiante(1, "Willy", "Alvarez", "2000-06-10", Estudiante.Estado.MATRICULADO);
        Estudiante N2 = new Estudiante(2, "Mari", "Gomez", "1999-01.-23", Estudiante.Estado.INACTIVO);

        Curso C1 = new Curso(212, "Fisica", "Curso de fisica fundamental avanzado", 2, "v5.0");
        Curso C2 = new Curso(132, "Programacion", "Curso de programador junior", 3, "v1.0");

        gestor.Matricular_Estudiante(N1);
        gestor.Matricular_Estudiante(N2);
        gestor.Agregar_Curso(C1);
        gestor.Agregar_Curso(C2);

        try {
            gestor.Inscribir_Estudiante_Curso(N1,212);
            gestor.Desincribir_Estudiante_Curso(1, 212);
        } catch (Estudiante_Ya_Inscrito_Exception | Estudiante_No_Inscrito_En_Curso_Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Estudiante: ");
        gestor.estudiantes.forEach(System.out::println);
        System.out.println("Cusos: ");
        gestor.cursos.forEach(System.out::println);
    }
}
