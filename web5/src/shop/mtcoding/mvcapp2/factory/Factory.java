package shop.mtcoding.mvcapp2.factory;

import shop.mtcoding.mvcapp2.controller.BoardController;
import shop.mtcoding.mvcapp2.controller.UserController;
import shop.mtcoding.mvcapp2.model.BoardRepository;
import shop.mtcoding.mvcapp2.model.UserRepository;

public class Factory {
    private static Factory instance = new Factory();

    Factory(){}
    public static Factory getInstance(){
        if(instance==null){
            instance=new Factory();
        }
        return instance;
    }
    public static UserController userController(){
        return new UserController();
    }
    public static BoardController boardController(){
        return new BoardController();
    }

    public static UserRepository getUserRepositroy(){
        UserRepository userRepository = new UserRepository();
        return userRepository;
    }
    public static BoardRepository getBoardRepositroy(){
        BoardRepository boardRepository = new BoardRepository();
        return boardRepository;
    }
}
