package Snack;

import com.sun.javafx.scene.traversal.Direction;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class SnackApp extends Application {
    private static int x=400;
    private static int y=300;




    @Override
    public void start(Stage primaryStage) throws Exception {
        static class MyTimer extends AnimationTimer{
        private long lastTick=0;
        private Canvas canvas;
        private GraphicsContext gc;
        MyTimer(Canvas canvas,GraphicsContext gc){

            this.canvas=canvas;
            this.gc=gc;
        }
        public void handle(long now){
            if(lastTick==0||now-lastTick>1e9){
                lastTick=now;
                gc.setFill((Color.WHITE));
                gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());


                gc.setFill(Color.RED);
                gc.fillOval(x,y,50,50);
                x+=3;
                y+=1;

            }
        }


        Canvas canvas=new Canvas(800,600);  //画布对象
        Pane pane=new Pane();
        pane.getChildren().add(canvas);

        //在画布进行图形绘制
        GraphicsContext gc=canvas.getGraphicsContext2D();



        gc.setFill(Color.RED);
        gc.fillRect(100,60,120,80);

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeRect(400,60,120,80);


        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("贪吃蛇");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
