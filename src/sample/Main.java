package sample;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Menu menu = new Menu("my menu");
        MenuItem mi1 = new MenuItem("Happy");
        MenuItem mi2 = new MenuItem("Happy2");
        MenuItem mi3 = new MenuItem("Happy3");
        MenuItem quit = new MenuItem("Quit");
        quit.setOnAction(e-> Platform.exit());

        menu.getItems().add(mi1);
        menu.getItems().add(mi2);
        menu.getItems().add(mi3);
        menu.getItems().add(quit);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        menuBar.setUseSystemMenuBar(true);
        /*BorderPane vroot = new BorderPane();
        vroot.setTop(menuBar);
        Scene scn = new Scene(root,500,300);
        primaryStage.setScene(scn);
        primaryStage.show();*/


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        ((GridPane)root).getChildren().add(menuBar);
    }



    public static void main(String[] args) {
        launch(args);
    }
}
