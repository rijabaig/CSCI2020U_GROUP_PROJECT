package Client;

import animatefx.animation.FadeIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;


public class Controller {



    @FXML
    public Pane pnSignIn;
    @FXML
    public Pane pnSignUp;
    @FXML
    public Button btnSignUp;
    @FXML
    public Button getStarted;
    @FXML
    public ImageView btnBack;
    @FXML
    public TextField regName;
    @FXML
    public TextField regPass;
    @FXML
    public TextField regEmail;
    @FXML
    public TextField regFirstName;
    @FXML
    public TextField regPhoneNo;
    @FXML
    public RadioButton male;
    @FXML
    public RadioButton female;
    @FXML
    public Label controlRegLabel;
    @FXML
    public Label success;
    @FXML
    public Label goBack;
    @FXML
    public TextField userName;
    @FXML
    public TextField passWord;
    @FXML
    public Label loginNotifier;
    @FXML
    public Label nameExists;
    @FXML
    public Label checkEmail;
    public static String username, password, gender;
    public static ArrayList<User> loggedInUser = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<User>();
// registration method
     //we will check if the fields are empty or not
    public void registration() {
        if (!regName.getText().equalsIgnoreCase("")
                && !regPass.getText().equalsIgnoreCase("")
                && !regEmail.getText().equalsIgnoreCase("")
                && !regFirstName.getText().equalsIgnoreCase("")
                && !regPhoneNo.getText().equalsIgnoreCase("")
                && (male.isSelected() || female.isSelected())) {
            //if its not empty, get all text entered
            if(checkUser(regName.getText())) {
                if(checkEmail(regEmail.getText())) {
                    User newUser = new User(); //now we will create a new user
                    newUser.name = regName.getText(); //adding all the details to the new user (name)
                    newUser.password = regPass.getText(); // saving pass to new user
                    newUser.email = regEmail.getText(); //email
                    newUser.fullName = regFirstName.getText(); //name
                    newUser.phoneNo = regPhoneNo.getText(); //phone number
                    if (male.isSelected()) {
                        newUser.gender = "Male"; //if male was selected then saves gender as male
                    } else {
                        newUser.gender = "Female";
                    }
                    users.add(newUser); //now we are adding this information to users
                    goBack.setOpacity(1); //setting opacities
                    success.setOpacity(1);
                    makeDefault(); //setting default opacity
                    if (controlRegLabel.getOpacity() == 1) {
                        controlRegLabel.setOpacity(0);
                    }
                    if (nameExists.getOpacity() == 1) {
                        nameExists.setOpacity(0);
                    }
                } else {
                    checkEmail.setOpacity(1);
                    setOpacity(nameExists, goBack, controlRegLabel, success);
                }
            } else {
                nameExists.setOpacity(1);
                setOpacity(success, goBack, controlRegLabel, checkEmail);
            }
        } else {
            controlRegLabel.setOpacity(1);
            setOpacity(success, goBack, nameExists, checkEmail);
        }
    }
//setting opacity
    private void setOpacity(Label a, Label b, Label c, Label d) {
        if(a.getOpacity() == 1 || b.getOpacity() == 1 || c.getOpacity() == 1 || d.getOpacity() == 1) {
            a.setOpacity(0);
            b.setOpacity(0);
            c.setOpacity(0);
            d.setOpacity(0);
        }
    }


    private void setOpacity(Label controlRegLabel, Label checkEmail, Label nameExists) {
        controlRegLabel.setOpacity(0);
        checkEmail.setOpacity(0);
        nameExists.setOpacity(0);
    }
//this will check if a user exists
    private boolean checkUser(String username) {
        for(User user : users) {
            if(user.name.equalsIgnoreCase(username)) {
                return false;
            }
        }
        return true;
    }
//checks if email exists 
    private boolean checkEmail(String email) {
        for(User user : users) {
            if(user.email.equalsIgnoreCase(email)) {
                return false;
            }
        }
        return true;
    }
//sets default back to blank fields
    private void makeDefault() {
        regName.setText("");
        regPass.setText("");
        regEmail.setText("");
        regFirstName.setText("");
        regPhoneNo.setText("");
        male.setSelected(true);
        setOpacity(controlRegLabel, checkEmail, nameExists);
    }

//login page
    public void login() {
        username = userName.getText();
        password = passWord.getText();
        boolean login = false; //setting to false as default
        for (User x : users) { //if username and password are correct, prints name and allows for login
            if (x.name.equalsIgnoreCase(username) && x.password.equalsIgnoreCase(password)) {
                login = true; //will be true only when correct information is entered
                loggedInUser.add(x);
                System.out.println(x.name); //prints logged in users name
                gender = x.gender;
                break;
            }
        }
        //here the window will change if the username and password entered are correct
        if (login) {
            changeWindow();
        } else {
            loginNotifier.setOpacity(1);
        }
    }
    //method to change current window
    public void changeWindow() {
        try {
            Stage stage = (Stage) userName.getScene().getWindow();
            Parent root = FXMLLoader.load(this.getClass().getResource("Room.fxml")); //calls fxml  file to create chat room
            stage.setScene(new Scene(root, 330, 560)); //setting scene
            stage.setTitle(username + "");
            stage.setOnCloseRequest(event -> {
                System.exit(0); //exits system if selected exit
            });
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource().equals(btnSignUp)) {
            new FadeIn(pnSignUp).play();
            pnSignUp.toFront();
        }
        if (event.getSource().equals(getStarted)) {
            new FadeIn(pnSignIn).play();
            pnSignIn.toFront();
        }
        loginNotifier.setOpacity(0);
        userName.setText("");
        passWord.setText("");
    }

    @FXML
    private void handleMouseEvent(MouseEvent event) {
        if (event.getSource() == btnBack) {
            new FadeIn(pnSignIn).play();
            pnSignIn.toFront();
        }
        regName.setText("");
        regPass.setText("");
        regEmail.setText("");
    }
}
