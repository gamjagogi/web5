package shop.mtcoding.mvcapp2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String userid;
    private String password;
    private String username;
    private String birth;
    private String gender;
    private String email;

    private String local;
    private String phoneNumber;


    public User(int id,String userid, String password, String username, String birth,String gender, String email,String local, String phoneNumber) {
        this.setId(id);
        this.userid = userid;
        this.password = password;
        this.username = username;
        this.birth = birth;
        this.gender = gender;
        this.email = email;
        this.local = local;
        this.phoneNumber = phoneNumber;
    }

    public User(String year,String month, String day) {
        this.birth = year+month+day;
    }

    public String toString(){
        String i = String.valueOf(this.getId());
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(",").append(this.userid).append(",").append(this.password).append(",").append(this.username).append(",").append(this.birth).append(",").append(this.gender).append(",").append(this.email).append(",").append(this.local).append(",").append(this.phoneNumber);
        return sb.toString();
    }
}
