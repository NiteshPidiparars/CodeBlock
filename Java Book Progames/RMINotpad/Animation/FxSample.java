import java.rmi.RemoteException;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
public class FxSample extends Application implements Hello{

    @Override
    public void start(Stage stage) throws Exception {
        Box box = new Box();
        box.setWidth(150.0);//setting the properties of box
        box.setHeight(150.0);
        box.setDepth(100.0);
        box.setTranslateX(350);//setting the Position of box
        box.setTranslateY(150);
        box.setTranslateZ(50);//setting the Text
        Text text = new Text("Type any letter to rotate the box, and click on the box to stop the rotation.");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.CRIMSON);
        text.setX(20);//Setting the text position
        text.setY(50);
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.DARKSLATEBLUE);//setting the material of the box
        box.setMaterial(material);//setting the diffuse color material of box
        RotateTransition rotateTransition = new RotateTransition();//Setting the rotation to the box
        rotateTransition.setDuration(Duration.millis(1000));//setting the duration for the transition
        rotateTransition.setNode(box);//setting the node for the transition
        rotateTransition.setAxis(Rotate.Y_AXIS);//Setting the axis of the rotation
        rotateTransition.setByAngle(360);//Setting the angle of the rotation
        rotateTransition.setCycleCount(50);//Setting the cycle count of the rotation
        rotateTransition.setAutoReverse(true);//Setting the auto reverse value to false
        TextField textField = new TextField();//create the text filled
        textField.setLayoutX(50);//Setting the position of the TextFiled
        textField.setLayoutY(100);
        EventHandler<KeyEvent> eventHandler = new EventHandler<KeyEvent>() {
            @Override//Handling the key typed event
            public void handle(KeyEvent t) {
                //playing the animation
                rotateTransition.play();
            }
        };
        textField.addEventHandler(KeyEvent.KEY_TYPED, eventHandler);//Adding an event handler to the text field
        EventHandler<javafx.scene.input.MouseEvent> eventHandlerBox = new EventHandler<javafx.scene.input.MouseEvent>(){
            @Override//Handling the mouse clicked event(on box)
            public void handle(javafx.scene.input.MouseEvent t) {
                rotateTransition.stop();
            }
        };
        //Adding the event handler to the box
        box.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBox);
        //creating group effect
        Group root = new Group(box, textField, text);
        //creating scan object
        Scene scene = new Scene(root, 600, 300);
        //Setting the camera
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(0);
        scene.setCamera(camera);
        //Setting title to the stage
        stage.setTitle("Event Handler Example");
        //Adding scene to the stage
        stage.setScene(scene);
        //Displaying the contents of the stage
        stage.show();
    }

    @Override
    public void animation() throws RemoteException {
        launch();
    }

}
