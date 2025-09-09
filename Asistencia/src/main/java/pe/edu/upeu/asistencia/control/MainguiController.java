package pe.edu.upeu.asistencia.control;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Map;

@Controller
public class MainguiController {

    @FXML
    private BorderPane borderPane;
    @FXML
    private MenuBar menuBar;
    @FXML
    private TabPane tabPane;
    @FXML
    private Menu menu1;
    @FXML
    private MenuItem menuItem1, menuItem2, menuItem3, menuItem4;

    @Autowired
    protected ApplicationContext context;

    @FXML
    public void initialize() {
        MenuItemListener mil = new MenuItemListener();
        menuItem1.setOnAction(mil::handle);
        menuItem2.setOnAction(mil::handle);
        menuItem3.setOnAction(mil::handle);
        menuItem4.setOnAction(mil::handle);
    }

    class MenuItemListener {
        Map<String, String[]> menuConfig=Map.of(
                "menuItem1",new String[]{"/fxml/main_participante.fxml","Participantes","T"},
                "menuItem2",new String[]{"/fxml/login.fxml","Salir","C"},
                "menuItem3",new String[]{"/fxml/main_asistencia.fxml","Asistencia","T"},
                "menuItem4",new String[]{"/fxml/main_asistencia.fxml","Asistencia","T"}
        );

        public void handle(ActionEvent e){
            String id = ((MenuItem) e.getSource()).getId();
            if (menuConfig.containsKey(id)) {
                String[] mi = menuConfig.get(id);
                if (mi[2].equals("C")){
                    Platform.exit();
                    System.exit(0);
                }else
                 abrirArchivoFXML(mi[0], mi[1]);
            }
        }
    }

    public void abrirArchivoFXML(String rutaArchivo, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaArchivo));
            loader.setControllerFactory(context::getBean);
            Parent root = loader.load();

            ScrollPane scrollPane = new ScrollPane(root);
            scrollPane.setFitToWidth(true);
            scrollPane.setFitToHeight(true);

            Tab newTab = new Tab(titulo, scrollPane);
            tabPane.getTabs().clear();
            tabPane.getTabs().add(newTab);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    class MenuListener {
        public void handle(Event e) {

        }
    }
}

