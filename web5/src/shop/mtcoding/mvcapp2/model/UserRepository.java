package shop.mtcoding.mvcapp2.model;

import shop.mtcoding.mvcapp2.config.DB;

import java.util.List;

public class UserRepository {


    private DB db = DB.getInstance();


    public List<User>findAll(){
        return db.selectAll();
    }
    public void save(String userid, String password, String username,String bitth, String gender, String email,String local, String phoneNumber){
        db.create(userid,password,username,bitth,gender,email,local,phoneNumber);
    }
    public void printUserList(){
        db.printAll();
    }
}
