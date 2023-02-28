package shop.mtcoding.mvcapp2.config;

import shop.mtcoding.mvcapp2.model.Board;
import shop.mtcoding.mvcapp2.model.User;

import java.util.ArrayList;
import java.util.List;

// Fake DataAccessObject (데이터베이스에 접근하는 클래스)
public class DB {

    private static DB instance;
    public DB(){}

    private static List<User>userList = new ArrayList<>();

    private static List<Board>boardList = new ArrayList<>();

    static {
        userList.add(new User(1,"gudwns252","123567","kimhyung","19950406","man","gusdus@naver.ocm","kor","01023241234"));

        boardList.add(new Board(1,"chainSawMan","denji"));
    }
    public static DB getInstance(){
        if(instance==null){
            instance = new DB();
        }
        return instance;
    }

    public static List<User>selectAll(){
        return userList;
    }
    public static List<Board>boardSelectAll(){
        return boardList;
    }

    public static void create(String userid, String password, String username,String birth, String gender, String email,String local, String phoneNumber){
        int id = userList.size()+1;
        userList.add(new User(id,userid,password,username,birth,gender,email,local,phoneNumber));
    }

    public static void create(String title,String content){
        int id = boardList.size()+1;
        boardList.add(new Board(id,title,content));
    }
    public static void printAll(){
        for(User u:userList){
            System.out.println(u.toString());
        }
    }
}
