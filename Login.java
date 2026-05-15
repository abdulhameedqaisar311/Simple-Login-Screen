import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Login extends Application {
    @Override
    public void start(Stage stage) {

        Label login = new Label("Login");
        login.setFont(new Font(24));
        Label username = new Label("Username");
        TextField usernametextfield = new TextField();
        Label password = new Label("Password");
        PasswordField passfield = new PasswordField();
        Label message = new Label();
        message.setTextFill(Color.RED);
        Button btn = new Button("Login");



        GridPane grid1 = new GridPane();
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.setAlignment(Pos.CENTER);
        grid1.add(login,1,0);
        grid1.add(username,0,2);
        grid1.add(usernametextfield,1,2);
        grid1.add(password,0,3);
        grid1.add(passfield,1,3);
        grid1.add(btn,1,4);
        grid1.add(message,1,5);

        Scene scene1 = new Scene(grid1,400,300);

        Label welcome = new Label("Welcome! Admin");
        welcome.setFont(new Font(24));
        Button backbtn = new Button("Log Out");
        backbtn.setOnAction(e->{
            stage.setScene(scene1);
        });


        GridPane grid = new GridPane();
        grid.add(welcome,0,2);
        grid.add(backbtn,2,4);


        Scene scene2 = new Scene(grid,400,300);

        btn.setOnAction(e->{
            String user = usernametextfield.getText();
            String pass = passfield.getText();

            if(user.equals("admin")&&pass.equals("123456"))
                stage.setScene(scene2);
            else
                message.setText("Invalid Username or Password");
        });

        stage.setScene(scene1);
        stage.setTitle("App");
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
