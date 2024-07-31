package POO_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestor_Academico implements Serivicios_Academicos_I{
    public List<Estudiante> estudiantes;
    public List<Curso> cursos;
    public  Map<Integer, List<Estudiante>> inscripciones;

    public Gestor_Academico() {
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        inscripciones = new HashMap<>();
    }

    @Override
    public void Matricular_Estudiante (Estudiante estudiante){
        if (!estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
        }
    }

    @Override
    public void Agregar_Curso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            inscripciones.put(curso.getID(), new ArrayList<>());
        }
    }

    @Override
    public void Inscribir_Estudiante_Curso(Estudiante estudiante, int ID_Curso) throws Estudiante_Ya_Inscrito_Exception {
        Curso curso = cursos.stream().filter(c -> c.getID() == ID_Curso).findFirst().orElse(null);
        if (curso == null) {
            throw new IllegalArgumentException("Curso no encontrado");
        }
        if (inscripciones.get(ID_Curso).contains(estudiante)) {
            throw new Estudiante_Ya_Inscrito_Exception("El estudiante ya esta inscrito en este curso.");
        }
        inscripciones.get(ID_Curso).add(estudiante);
    }

    @Override
    public void Desincribir_Estudiante_Curso(int ID_Estudiante, int ID_Curso) throws Estudiante_No_Inscrito_En_Curso_Exception {
     Curso curso = cursos.stream().filter(c -> c.getID() == ID_Curso).findFirst().orElse(null);
     if (curso == null){
         throw new IllegalArgumentException("Curso no encontrado");
     }
     Estudiante estudiante = estudiantes.stream().filter(e -> e.getID() == ID_Estudiante).findFirst().orElse(null);
     if (estudiante == null) {
         throw new IllegalArgumentException("Estudiante no encontrado");
     }
     if (!inscripciones.get(ID_Curso).contains(estudiante)) {
         throw new Estudiante_No_Inscrito_En_Curso_Exception("El estudiante no esta inscrito en este curso.");
     }
     inscripciones.get(ID_Curso).remove(estudiante);
    }


}
