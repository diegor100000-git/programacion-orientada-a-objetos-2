package pe.edu.upeu.asistencia.control;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.modelo.Estudiante;
import pe.edu.upeu.asistencia.servicio.EstudianteServicio;

@Controller
public class AsistenciaController {

    @Autowired
    private EstudianteServicio estudianteServicio;

    @FXML private Label idMsg;
    @FXML TextField txtDato;


    @FXML
    void enviar(){
        System.out.println("Enviando asistencia");
        idMsg.setText(txtDato.getText());
    }


    @FXML
    void regEstudiante(){

        Estudiante estudiante=new Estudiante();
        estudiante.setNombre(new SimpleStringProperty("David"));
        estudiante.setEstado(new SimpleBooleanProperty(true));

        estudianteServicio.saveEntidad(estudiante);
        listarEstudiantes();
    }

    void listarEstudiantes(){
        for (Estudiante e: estudianteServicio.findAllEntidades()){
            System.out.println(e.getNombre());
        }
    }
}
