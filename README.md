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
# Photo Gallery
* The login page <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/login.png "Login Page")
* Signup Page <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/signup.png "Signup Page")
* Chat Page <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/chatpage.png "Chat Page")
* Profile page with user info <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/profileinfo.png "Profile Page")
* An example of a typical chat with a user <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/chatexample.png "Chat with User")
* Scenebuilder <br />
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/scenebuilder.png "Scenebuilder")
# Video Demonstration 
[![Watch the video]https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/login.png](https://www.youtube.com/watch?v=lSGm8P7wH8I&feature=youtu.be)
# How to Run the Project (Step-By-Step)
* First export the files in this repository to a zip file. 
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/step1.png "Zip File")
* Extract the folders to the directory of your choice. Then go in that folder and right click to open the MessengerClient folder and MessengerServer folder in the IDE of your choice (preferably IntelliJ). After this, trust the project. 

* Now we have to add run configurations for our project. Click Add Configuration. Now make the Server and Main class as main classes. The configurations should match the photos below:
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/step4.png "JAR Files")
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/part5!.png "JAR Files")


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
# Extra Notes
* It seems that javaFX CSS generally has many bugs and issues that can arise randomly. That being said, there is a javaFX CSS bug when our Main file is run. The program still works, but for now there is no known solution to this bug:

WARNING: Caught 'java.lang.ClassCastException: class javafx.scene.paint.Color cannot be cast to class java.lang.String (javafx.scene.paint.Color is in module javafx.graphics of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')' while converting value for '-fx-focus-traversable' from inline style on TextField[id=userName, styleClass=text-input text-field txtFont]

Here is some more info on this bug: https://bugs.openjdk.java.net/browse/JDK-8268657

