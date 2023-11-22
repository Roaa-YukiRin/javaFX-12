/*
1-Creating an Empty Window

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.pkg0;
 //Creating an Empty Window
/*
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
*/
/*
//Text (Creating a Text Node)
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
*/

/*
//Text (Position, Font, Stroke, Color and decoration of the the Text
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
*/

/*
//JavaFX Shapes – Line (Creating a Line Node)
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
*/

/*
//JavaFX Shapes – Rectangle (Creating a Rectangle Node)
import javafx.application.Application;
//import javafx.scene.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
*/

/*
//JavaFX Shapes – Circle (Creating a Circle Node)
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
*/

/*
//JavaFX Image
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
*/

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class JavaFXApplication10 extends Application {
    
     //Creating an Empty Window
       /*
   public void start(Stage primaryStage) throws Exception {
      
Group group = new Group(); //creating a Group object 
Scene scene = new Scene(group ,600, 300); //Creating a Scene by passing the group object, height and width 

scene.setFill(Color.BLUE); //setting color to the scene 
primaryStage.setTitle("Sample Application"); //Setting the title to Stage. 
primaryStage.setScene(scene); //Adding the scene to Stage 
primaryStage.show(); //Displaying the contents of the stage     
       
}
     */
    
    /*
    //Text (Creating a Text Node)
     public void start(Stage stage)  {
    
Text text = new Text(); //Creating a Text object
text.setText("lits begain"); //Setting the text to be added. 
text.setX(50); //setting the position of the text 
text.setY(50); //setting the position of the text 

Group root = new Group(text); //Creating a Group object 
Scene scene = new Scene(root, 600, 300); //Creating a scene object 
stage.setTitle("Sample Application"); //Setting title to the Stage 
stage.setScene(scene); //Adding scene to the stage 
stage.show(); //Displaying the contents of the stage 
     
     }
     */
    /*
    //Text (Position, Font, Stroke, Color and decoration of the the Text
    public void start(Stage stage)  {
    Text text = new Text(); //Creating a Text object
    text.setText("lits begain"); //Setting the text to be added. 
    text.setX(50); //setting the position of the text 
    text.setY(50); //setting the position of the text 

    //setting the font
    text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
    text.setFill(Color.BROWN);//Setting the color
    text.setStrokeWidth(1);//setting the Stork
    text.setStroke(Color.BLUE);//Setting the stroke color
    text.setUnderline(true);//underlining the text
    text.setStrikethrough(true);//Striking through the text
    
    Group root = new Group(text); //Creating a Group object 
    Scene scene = new Scene(root, 600, 300); //Creating a scene object 
    stage.setTitle("Sample Application"); //Setting title to the Stage 
    stage.setScene(scene); //Adding scene to the stage 
    stage.show(); //Displaying the contents of the stage 
    }
     */
    /*
    //JavaFX Shapes – Line (Creating a Line Node)
     public void start(Stage primaryStage) {
        Line line = new Line(); 
        //ponit 1 from coolom and row
        line.setStartX(100.0f); //Setting the Properties of the Line
        line.setStartY(140.0f);//that way it is+
        //point 2
        line.setEndX(300.0f);
        line.setEndY(140.0f);
        
        /*_  _  _ 
           |_|_|_|
           |_|_|_|
           |_|_|_|
        */
    /*
        Group root = new Group(line);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Drawing Line"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    */
    
    /*
    //JavaFX Shapes – Rectangle (Creating a Rectangle Node)
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(); 
        rectangle.setX(100); //Setting the Properties of the Rectangle
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        
        Group root = new Group(rectangle);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Drawing Rectangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
     }
   */
    /*
    //JavaFX Shapes – Circle (Creating a Circle Node)
    public void start(Stage primaryStage) {
        Circle circle = new Circle(); 
        circle.setCenterX(200); //Setting the Properties of the Circle
        circle.setCenterY(150);
        circle.setRadius(100);

        Group root = new Group(circle);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Drawing Rectangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
       }
    */
    /*
    //JavaFX Image
    public void start(Stage stage){
   
    Image image = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQs1XBoCplUS1v2gkTinxGVh20QnCy-DWy8lyQDTvt-ldf0WINZ");
   
    ImageView imageView = new ImageView(image);//Setting the image view 
    imageView.setX(50); //Setting the image position
    imageView.setY(25);
    imageView.setFitHeight(200); //setting the fit height and width of the image view
    imageView.setFitWidth(200);
    imageView.setPreserveRatio(true); //Setting the preserve ratio of the image view 
    
    Group root = new Group(imageView); //Creating a Group object 
    Scene scene = new Scene(root, 250, 250);//Creating a scene object 
    stage.setTitle("Image Example"); //Setting title to the Stage
    stage.setScene(scene); //Adding scene to the stage
    stage.show();//Displaying the contents of the stage
    }
    */
    
    public void start(Stage stage) {
        
    Circle circle = new Circle();//Drawing a Circle
    circle.setCenterX(300.0f); //Setting the properties of the circle
    circle.setCenterY(150.0f);
    circle.setRadius(90.0f);
    circle.setFill(Color.DARKRED);//Setting color to the circle
    circle.setStrokeWidth(3); //Setting the stroke width
    circle.setStroke(Color.DARKSLATEBLUE); //Setting color to the stroke
    
    Text text = new Text("This is a colored circle");//Drawing a text
    text.setFont(Font.font("Edwardian Script ITC", 50));//Setting the font of the text
    text.setX(40);//Setting the position of the text
    text.setY(50);
    text.setFill(Color.BEIGE);//Setting color to the text
    text.setStrokeWidth(2);
    text.setStroke(Color.DARKSLATEBLUE);
    
    Group root = new Group(circle, text); //Creating a Group object  !!!!!!
    Scene scene = new Scene(root, 600, 300); //Creating a scene object
    stage.setTitle("Color Example"); //Setting title to the Stage
    stage.setScene(scene); //Adding scene to the stage
    stage.show();//Displaying the contents of the stag
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
