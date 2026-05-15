import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.text.Font;

public class MyApp extends Application {
    @Override
    public void start(Stage stage) {

        Label label = new Label("Login");
        label.setFont(new Font(24));

        Label username = new Label("Username");
        TextField usernametextfield = new TextField();

        Label password = new Label("Password");
        PasswordField passfield = new PasswordField();

        Label message = new Label();



        Button btn = new Button("Sign-In");
        btn.setOnAction(e->{
            String user = usernametextfield.getText();
            String pass = passfield.getText();
            if(user.equals("admin")&&pass.equals("123456"))
                message.setText("Login Successful");
            else
                message.setText("Invalid Username or Password");
        });


        VBox vbox = new VBox(10);
        vbox.getChildren().add(message);


        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.add(label,1,0);
        grid.add(username,0,2);
        grid.add(usernametextfield,1,2);
        grid.add(password,0,3);
        grid.add(passfield,1,3);
        grid.add(vbox,1,6);
        grid.add(btn,1,5);

        Scene scene = new Scene(grid,600,400);
        stage.setScene(scene);
        stage.setTitle("App");
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
