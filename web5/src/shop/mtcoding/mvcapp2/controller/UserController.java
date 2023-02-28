package shop.mtcoding.mvcapp2.controller;

import shop.mtcoding.mvcapp2.config.ViewResolver;
import shop.mtcoding.mvcapp2.factory.Factory;
import shop.mtcoding.mvcapp2.model.Board;
import shop.mtcoding.mvcapp2.model.BoardRepository;
import shop.mtcoding.mvcapp2.model.User;
import shop.mtcoding.mvcapp2.model.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class UserController {

    BoardRepository boardRepository = Factory.getBoardRepositroy();
    UserRepository userRepository = Factory.getUserRepositroy();

    public UserController(){}
    public UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    private String rand = random();

    public void Delete(){}

    public String admin(HttpServletRequest request) {
        // C - V
        HttpSession session = request.getSession();
        session.setAttribute("rand",rand);
        request.setAttribute("postPinNumber",rand);
        return ViewResolver.resolve("/board/admin");
    }

    public String join(HttpServletRequest request,String userid,String password,String password2,String username,String birth,String gender,String email,String local,String phoneNumber,String checkPin){
        List<User> list = userRepository.findAll();
        HttpSession session = request.getSession();
        for(User u:list){
            if(u.getUserid().equals(userid)){
                session.setAttribute("rand",rand);
                request.setAttribute("postPinNumber",rand);
                request.setAttribute("error","이미 존재하는 id입니다.");
                return ViewResolver.resolve("/board/admin");
            }
        }
        if(!password.equals(password2)){
            session.setAttribute("rand",rand);
            request.setAttribute("postPinNumber",rand);
            request.setAttribute("error","password가 같지않습니다");
            return ViewResolver.resolve("/board/admin");
        }
        String postPin = (String) session.getAttribute("rand");
        if(!postPin.equals(checkPin)){
            session.setAttribute("rand",rand);
            request.setAttribute("postPinNumber",rand);
            request.setAttribute("error","인증번호가 틀렸습니다.");
            return ViewResolver.resolve("/board/admin");
        }
        //UserRepository.save();

        userRepository.save(userid,password,username,birth,gender,email,local,phoneNumber);
        userRepository.printUserList();
        HttpSession s = request.getSession();

        System.out.println("계정생성 성공");

        //mainPage
        List<Board> boardList = boardRepository.findAll();
        List<User> userList = userRepository.findAll();
        s.setAttribute("userList",userList);      //세션에 db저장.
        request.setAttribute("boardList",boardList);
        return ViewResolver.resolve("/board/mainPage");
    }
    private static String random(){
        String rand ="";
        StringBuilder ss = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<5;i++){
            ss.append((int)(Math.random()*10));
        }

        return ss.toString();
    }
}
