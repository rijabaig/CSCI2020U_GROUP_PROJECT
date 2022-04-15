# CSCI2020U_GROUP_PROJECT

Welcome! This is our Final Project repo. Here you can find all you need to know about our program and how to run it. We have added screenshots on how to download and run the files, a demonstration video of the program, group member information, and all the source files. 

# Group Members and Contributions: <br />
##### Neel Samirkumar Shah: <br />
  * Majority of Client and Server Side code <br />
  * Bug Checking and Code Testing <br />
  * Editing and refining code <br />
##### Rija Baig (100746674): <br />
  * Code cleansing, and code explanations (comments) <br />
  * README.md and Repository setup <br />
##### Aparnna Hariharan (100751918): <br />
  * Client and Server Side code <br />
##### Dev Rajivkumar Thaker: <br />
  * Majority of Client and Server Side code <br />
  * Editing and refining code <br />

# Introduction
This program is an interactive messaging software.  It was implemented using a combination of client- server sockets, multithreading, file I/O, and finally, displayed using JavaFX. After running it, users are met with a login page where they are asked to put in their username and password. If the user does not currently hold an account, they have the option to sign up. When the sign up button is clicked, a new page opens up where the user can enter all of their information to create an account. It is important to note that if the user is entering information that already exists, there will be an error preventing them from creating the account with that information. Once the user enters the information they can continue and create the account then login. Once they login, they can begin sending messeges to other users, while also viewing their message history on screen. Once they are done, they can logout, ending the whole process.  
# Photo Gallery
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/login.png "Login Page")
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/signup.png "Signup Page")
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/chatpage.png "Chat Page")
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/profileinfo.png "Profile Page")
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/chatexample.png "Chat with User")
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/scenebuilder.png "Scenebuilder")
# Video Demonstration 
[![Watch the video](https://www.youtube.com/watch?v=lSGm8P7wH8I&feature=youtu.be)
# How to Run the Project (Step-By-Step)
* First export the files in this repository to a zip file. 
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/step1.png "Zip File")
* Extract the folders to the directory of your choice. Then go in that folder and right click to open the messenger folder in the IDE of your choice (preferably IntelliJ). After this, trust the project. 
* Once opened. Go to File -> Project Structure -> Modules -> Dependencies. Click the "+" to add Jars or Directories. Then you can select the files from the "JAR files" folder in the group project folder. Then click OK.
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/step2.png "JAR Files")
* Now while stillin modules, go to sources. Select the src folder. Then click sources button above, with the blue folder logo. Now click OK.
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/step3.png "JAR Files")
* Now we have to add run configurations for our project. Click Add Configuration. Now make the Server and Main class as main classes. The configurations should match the photos below:
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/step4.png "JAR Files")
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/part5!.png "JAR Files")
* Now for the Main file run configurations, we need to add VM options. Select Modify Options -> Add VM options. Then type in <br /> --module-path " C:\Users\rijay\java\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml <br /> where the path in the quotes is your path to your javafx jar files.
![Alt text](https://github.com/rijabaig/CSCI2020U_GROUP_PROJECT/blob/main/images/part6.png "JAR Files")
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


