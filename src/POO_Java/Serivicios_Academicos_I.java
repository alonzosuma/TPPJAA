package POO_Java;

import java.util.List;

public interface Serivicios_Academicos_I {
    void  Matricular_Estudiante (Estudiante estudiante);
    void Agregar_Curso (Curso curso);
    void Inscribir_Estudiante_Curso (Estudiante estudiante, int ID_Curso) throws Estudiante_Ya_Inscrito_Exception;
    void Desincribir_Estudiante_Curso (int ID_Estudiante, int ID_Curso) throws Estudiante_No_Inscrito_En_Curso_Exception;
}
