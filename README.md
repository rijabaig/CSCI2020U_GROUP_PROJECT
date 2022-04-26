# CSCI2020U_GROUP_PROJECT

Welcome! This is our Final Project repo. Here you can find all you need to know about our program and how to run it. We have added screenshots on how to download and run the files, a demonstration video of the program, group member information, and all the source files. 

# Group Members and Contributions: <br />
##### Neel Samirkumar Shah (100789924): <br />
  * Majority of Client and Server Side code <br />
  * Bug Checking and Code Testing <br />
  * Editing and refining code <br />
##### Rija Baig (100746674): <br />
  * CLient-Server Code, and code explanations (comments) <br />
  * README.md and Repository setup <br />
##### Aparnna Hariharan (100751918): <br />
  * Client and Server Side code <br />
##### Dev Rajivkumar Thaker (100808882): <br />
  * Majority of Client and Server Side code <br />
  * Editing and refining code <br />

# Introduction
This program is an interactive messaging software.  It was implemented using a combination of client- server sockets, multithreading, file I/O, and finally, displayed using JavaFX. After running it, chat window is displayed, where you can chat with the server. Additionally, an About us button is featured which displays information about the app. Once they login, they can begin sending messeges to other users, while also viewing their message history on screen. Additionally, a fun button is featured on the client side, which runs an animation when clicked on it. 



# Photo Gallery
* The main server page <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/Screen%20Shot%202022-04-25%20at%208.51.08%20PM.png)
* Client Page <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/Screen%20Shot%202022-04-25%20at%208.51.12%20PM.png)
* About Page <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/Screen%20Shot%202022-04-25%20at%208.51.21%20PM.png)

# Video Demonstration 
[![Watch the video]https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/Screen%20Shot%202022-04-25%20at%208.51.08%20PM.png)](https://www.youtube.com/watch?v=4mplcZy4_Rw&feature=youtu.be)
# How to Run the Project (Step-By-Step)
* First export the files in this repository to a zip file. 
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/downloadzip.png "Zip")
* Extract the folders to the directory of your choice. Then go in that folder and right click to open the MessengerClient folder and MessengerServer folder in the IDE of your choice (preferably IntelliJ). After this, trust the project. Once you open them both, set them up side by side. 
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/clientserverdemo.png)
* Now we have to add run configurations for our project. Click Add Configuration. Now make the ServerMain and ClientMain class as main classes. The configurations should match the photos below:
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/clientmain.png)
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/photos/servermain.png)


* Now you can click OK and start running the program! 
# Libraries Used
* java.io.*;
* java.net.ServerSocket;
* java.net.Socket;
* java.util.ArrayList;
* java.io.BufferedReader;
* java.io.IOException;
* java.io.InputStreamReader;
* java.io.PrintWriter;
* animatefx.animation.FadeIn;
* javafx.event.ActionEvent;
* javafx.fxml.FXML;
* javafx.fxml.FXMLLoader;
* javafx.scene.Parent;
* javafx.scene.Scene;
* javafx.scene.control.Button;
* javafx.scene.control.Label;
* javafx.scene.control.RadioButton;
* javafx.scene.control.TextField;
* javafx.scene.image.ImageView;
* javafx.scene.input.MouseEvent;
* javafx.scene.layout.Pane;
* javafx.stage.Stage;
* java.io.IOException;
* javafx.application.Application;
* javafx.embed.swing.SwingFXUtils;
* javafx.fxml.Initializable;
* javafx.geometry.NodeOrientation;
* javafx.scene.Node;
* javafx.scene.input.KeyEvent;
* javafx.scene.paint.Color;
* javafx.scene.paint.ImagePattern;
* javafx.scene.shape.Circle;
* javafx.stage.FileChooser;
* javax.imageio.ImageIO;
* java.awt.image.BufferedImage;
* java.util.ResourceBundle;


