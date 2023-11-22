/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_441004834_roaa_kalantan;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.ImageView;
/**
 *
 * @author HP
 */
public class Lab1_441004834_roaa_kalantan extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       //Rectangle()
            Rectangle rectangle = new Rectangle(); 
        rectangle.setX(100); //Setting the Properties of the Rectangle
        rectangle.setY(100);
        rectangle.setWidth(400);
        rectangle.setHeight(400);
        rectangle.setFill(Color.WHITE);
        rectangle.setStrokeWidth(3);
        rectangle.setStroke(Color.ORANGE);
        
        //text
            Text text = new Text("Congratulations ");//Drawing a text
        text.setFont(Font.font("Edwardian Script ITC", 50));//Setting the font of the text
        text.setX(120);//Setting the position of the text
        text.setY(160); 
        text.setFill(Color.BEIGE);//Setting color to the text
        text.setStrokeWidth(2);
        text.setStroke(Color.DARKSLATEBLUE);

        Text text1= new Text("YOU W0N THE ");//Drawing a text
        text1.setFont(Font.font("Edwardian Script ITC", 50));//Setting the font of the text
        text1.setX(140);//Setting the position of the text
        text1.setY(230);
        text1.setFill(Color.BEIGE);//Setting color to the text
        text1.setStrokeWidth(2);
        text1.setStroke(Color.DARKSLATEBLUE);
        
        Text text2= new Text("championship ");//Drawing a text
        text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));//Setting the font of the text
        text2.setX(140);//Setting the position of the text
        text2.setY(350);
        text2.setFill(Color.BLUE);//Setting color to the text
        text2.setStrokeWidth(2);
        text2.setStroke(Color.DARKSLATEBLUE);
        
        /*
         Rectangle rectangle1 = new Rectangle(); 
        rectangle1.setX(250); //Setting the Properties of the Rectangle
        rectangle1.setY(400);
        rectangle1.setWidth(80);
        rectangle1.setHeight(80);
        rectangle1.setFill(Color.WHITE);
        rectangle1.setStrokeWidth(3);
        rectangle1.setStroke(Color.ORANGE);
    
         String link=" lab1_441004834_roaa_kalantan/yay.jpg";
         Image image = new Image(link);
         ImagePattern pattern = new ImagePattern(image,20,20,40,40,false);
          rectangle1.setFill(pattern);
         */
            Image image = new Image("lab1_441004834_roaa_kalantan/yay.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(250);
        imageView.setY(400);
        imageView.setFitHeight(80);
        imageView.setFitWidth(80);
        imageView.setPreserveRatio(true); 
        
        
            Group group = new Group(rectangle,text,text1,text2,imageView); //creating a Group object 
        Scene scene = new Scene(group ,600, 600); //Creating a Scene by passing the group object, height and width 
        scene.setFill(Color.rgb(255,127,127)); //setting color to the scene 
        primaryStage.setTitle("LAB1_CONGRATULATION _CARD"); //Setting the title to Stage. 
        primaryStage.setScene(scene); //Adding the scene to Stage 
        primaryStage.show(); //Displaying the contents of the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
