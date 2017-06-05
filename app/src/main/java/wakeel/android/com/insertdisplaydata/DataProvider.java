package wakeel.android.com.insertdisplaydata;

/**
 * Created by Wakeel on 03/02/2017.
 */
//To implement getter and setter press alt+shift+insert
//This class get the information from the database in the form of object
public class DataProvider {

    private String name;
    private String mob;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public DataProvider(String name, String mob, String email)
    {
        this.name = name;
        this.mob = mob;
        this.email = email;
    }

}
