import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.collections.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;


/**
 *
 * @author Admin
 */

public class MiniPro extends Application {

  int balance=100000;
    
    public void start(Stage primaryStage) {
        
        
        
        GridPane root = new GridPane();
        root.setPadding(new Insets (10,10,10,10));
        root.setVgap(10);
        root.setHgap(10);
        Label head=new Label("------------ATM MACHINE-----------");
        head.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        root.add(head, 1, 0);
        Label num = new Label("ENTER ATM NUMBER : ");
        num.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR,10));
        root.add(num, 0, 1);
        TextField atm=new TextField();
        root.add(atm, 1, 1);
        Label pass=new Label("ENTER PIN : ");
        pass.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR,10));
        root.add(pass, 0, 2);
        PasswordField pd=new PasswordField();
        pd.setPromptText("PIN");
        root.add(pd,1,2);
        Button sub=new Button("SUBMIT");
        root.add(sub,1,3);
        Label l1=new Label();
        Button nxt=new Button ("");
        root.add(l1,1,4);
        root.add(nxt,1,5);
        BackgroundFill background_fill = new BackgroundFill(Color.YELLOW, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        root.setBackground(background);
        Scene scene1= new Scene(root,500,300);
        
        
        
        
        GridPane root1 = new GridPane();
        root1.setPadding(new Insets (10,10,10,10));
        root1.setVgap(10);
        root1.setHgap(10);
        Label wel =new Label("WELCOME! MEGHANA G");
        wel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        root1.add(wel, 1, 2);
        Label l3=new Label();
        l3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
        root1.add(l3,1,3);
        Button btn1 =new Button("WITHDRAW");
        Button btn2 =new Button("DEPOSIT");
        Button btn3 =new Button("CHECK BALANCE");
        root1.add(btn1,1,4);
        root1.add(btn2,1,5);
        root1.add(btn3,1,6);
        MenuBar mb = new MenuBar();
        Menu fileMenu =    new Menu("File");
        MenuItem back = new MenuItem("Back");
        
        MenuItem exit = new MenuItem("Exit");
        fileMenu.getItems().addAll(back,
        new SeparatorMenuItem(), exit);
            mb.getMenus().add(fileMenu);
        Menu helpMenu = new Menu("Help");
        MenuItem about = new MenuItem("About"); 
        helpMenu.getItems().add(about);
        mb.getMenus().add(helpMenu);
        root1.add(mb, 0, 0);
        
        back.setOnAction(e->primaryStage.setScene(scene1));
        exit.setOnAction(e->Platform.exit());
        about.setOnAction(e->l3.setText("This is ATM Machine Application built using JavaFX..."));
        BackgroundFill background_fill1 = new BackgroundFill(Color.PINK, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
        Background background1 = new Background(background_fill1);
        root1.setBackground(background1);
        Scene scene2 =new Scene(root1,500,300);
       
        
        GridPane root2= new GridPane();
        root2.setPadding(new Insets (10,10,10,10));
        root2.setVgap(10);
        root2.setHgap(10);
        Label with =new Label("----------WITHDRAW----------");
        with.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        root2.add(with, 1, 0);
        Label amt =new Label("ENTER AMOUNT : ");
        amt.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
        root2.add(amt, 0, 1);
        TextField amount=new TextField();
        root2.add(amount,1, 1);
        Button enter = new Button("PROCEED");
        root2.add(enter,1,2);
        Label result=new Label();
        result.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
        root2.add(result,1,3);
        Button back1 = new Button("BACK");
        root2.add(back1,1,4);
        enter.setOnAction(e->{
            String am = amount.getText();
            int price = Integer.parseInt(am);
            if (price<balance)
            {
                balance=balance-price;
                result.setText("Please collect your money");
            }
            else
            {
                result.setText("Insufficient balance in your account !!");
            }
        });
        
        back1.setOnAction(e->{
        primaryStage.setScene(scene2);
        amount.setText("");
        result.setText("");
        });
        BackgroundFill background_fill2 = new BackgroundFill(Color.LIGHTBLUE, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
        Background background2 = new Background(background_fill2);
        root2.setBackground(background2);
        Scene scene3 =new Scene(root2,500,300);
        
        
        GridPane root3 = new GridPane();
        root3.setPadding(new Insets (10,10,10,10));
        root3.setVgap(10);
        root3.setHgap(10);
        Label dep=new Label("----------DEPOSIT----------");
        dep.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        root3.add(dep, 1, 0);
        Label a =new Label("ENTER AMOUNT : ");
        a.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
        root3.add(a, 0, 1);
        TextField amoun=new TextField();
        root3.add(amoun,1, 1);
        Button enter1 = new Button("PROCEED");
        root3.add(enter1,1,2);
        Label result1=new Label();
        result1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
        root3.add(result1,1,3);
        Button back2 = new Button("BACK");
        root3.add(back2,1,4);
        enter1.setOnAction(e->{
            String amo = amoun.getText();
            int pric = Integer.parseInt(amo);
            if (balance>0)
            {
                balance=balance+pric;
                result1.setText("Your Money has been successfully deposited");
            }  
        });
        back2.setOnAction(e->{
        primaryStage.setScene(scene2);
        amoun.setText("");
        result1.setText("");
        });
        BackgroundFill background_fill3 = new BackgroundFill(Color.LIGHTGREEN, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
        Background background3 = new Background(background_fill3);
        root3.setBackground(background3);
        Scene scene4 =new Scene(root3,500,300);
        
        
        
        GridPane root4= new GridPane();
        root4.setPadding(new Insets (10,10,10,10));
        root4.setVgap(10);
        root4.setHgap(10);
        Label bal =new Label("----------BALANCE----------");
        bal.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        root4.add(bal, 1, 0);
        Label check =new Label("");
        check.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 13));
        root4.add(check,1,3);
        Button balan = new Button("PRESS");
        root4.add(balan, 1, 2);
        balan.setOnAction(e->check.setText("Current Balance:"+balance));
        Button back3 = new Button("BACK");
        root4.add(back3,1,4);
        back3.setOnAction(e->{
        check.setText("");
        primaryStage.setScene(scene2);
        });
        BackgroundFill background_fill4 = new BackgroundFill(Color.YELLOW, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
        Background background4= new Background(background_fill4);
        root4.setBackground(background4);
        Scene scene5 =new Scene(root4,500,300);        
        
        
        
        
        btn1.setOnAction(e->primaryStage.setScene(scene3));
        btn2.setOnAction(e->primaryStage.setScene(scene4));
        btn3.setOnAction(e->primaryStage.setScene(scene5));
        
        sub.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent event)
            {
                   String atmnum=atm.getText();
                   String pinnum=pd.getText(); 
               if(atmnum.equals("123456789") )
               {
                  if(pinnum.equals("2023"))
                   {
               l1.setText("HELLO CUSTOMER!");
              
               nxt.setText("CLICK TO START");
               nxt.setOnAction(e->primaryStage.setScene(scene2));
                   }
                   else
                      l1.setText("Incorrect Password!");
               }
               else
                   l1.setText("Invalid ATM Number!");
            }
        });
       
        
        primaryStage.setTitle("ATM MACHINE");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    
    
    public static void main(String[] args) {
        launch(args);
    }
}

