package gitHub;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test1 extends Application{
	private String text="";
	public void start(Stage primaryStage){
		StackPane pane=new StackPane();
		Label lalText=new Label("Programming");
		pane.getChildren().add(lalText);
		new Thread(new Runnable(){
			
			public void run(){
				try{
					while(true){
						if(lalText.getText().trim().length()==0)
							text="Hello";
						else
							text="";
						Platform.runLater(new Runnable(){
						public void run(){
							lalText.setText(text);
						}
						});
						Thread.sleep(1000);
					}
				}catch(InterruptedException ex){
					
				}
			}
		}).start();
		
		Scene scene=new Scene(pane,500,500);
		primaryStage.setTitle("·¢ÅÆ");
		primaryStage.setScene(scene);
		primaryStage.show();
		 
	      
		
	}public static void main(String[] args) {  
	        launch(args);  
	    } 
}
