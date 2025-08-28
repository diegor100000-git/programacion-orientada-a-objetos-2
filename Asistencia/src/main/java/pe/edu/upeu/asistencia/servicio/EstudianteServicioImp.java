package pe.edu.upeu.asistencia.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.asistencia.modelo.Estudiante;
import pe.edu.upeu.asistencia.repositorio.EstudianteRepositorio;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteServicioImp extends EstudianteRepositorio implements EstudianteServicio {

    @Override
    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);

    }

    @Override
    public List <Estudiante>findAllEstudiantes(){
        if(estudiantes.size()==1){
            return super.findAllEstudiantes();
        }
        return estudiantes;
    }

    @Override
    public Estudiante updateEstudiante(Estudiante estudiante, int index) {
        return estudiantes.set(index,estudiante);
    }

    @Override
    public void delete(int index) {
         estudiantes.remove(index);
    }

    @Override
    public Estudiante findEstudianteById(int index) {
        return estudiantes.get(index);
    }
}

