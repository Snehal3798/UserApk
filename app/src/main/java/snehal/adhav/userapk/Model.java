package snehal.adhav.userapk;


/**
 * Created by Kamere on 8/31/2018.
 */

public class Model {


    private String user_name;
    private String user_email;
    private String password;

    private int isSuccess;
    private String message;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Model(String username, String email, String password, int isSuccess, String message) {
        this.user_name = username;
        this.user_email = email;
        this.password = password;
        this.isSuccess = isSuccess;
        this.message = message;
    }


}


