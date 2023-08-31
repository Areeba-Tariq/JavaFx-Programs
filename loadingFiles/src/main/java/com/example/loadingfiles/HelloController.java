package com.example.loadingfiles;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController  implements Initializable {
    FileChooser fileChooser=new FileChooser();

    @FXML
    private TextArea Text;

    @FXML
    //Scanner scanner = new Scanner(file);: This line creates a new Scanner object named scanner and initializes it with the file object. The Scanner class is used to read input from various sources, such as files, strings, or input streams. In this case, it will read from the specified file.
        //
        //while (scanner.hasNextLine()) { ... }: This line starts a while loop that continues as long as there is another line available to be read from the Scanner. The hasNextLine() method checks if there is another line in the input.
        //
        //Text.appendText(scanner.nextLine() + "\n");: This line reads the next line from the input using the nextLine() method of the Scanner class. It retrieves the entire line as a string. The retrieved line is then appended to the Text object (assuming Text is an instance of a JavaFX Text control) using the appendText() method. The + "\n" adds a newline character to separate each line in the Text control.
    void getText(MouseEvent event){
        File file = fileChooser.showOpenDialog(new Stage()); //file object will hold a reference to the selected file,
        try {
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine())
            {
                Text.appendText(scanner.nextLine()+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void save(MouseEvent event) {
        File file= fileChooser.showSaveDialog(new Stage());
        if(file!=null)
        {
            saveSystem(file,Text.getText());
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File("D:\\javaFxCodes\\loadingFiles\\src"));
    }
    public void saveSystem(File file,String content)
    {
        try{
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.write(content);
            printWriter.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
