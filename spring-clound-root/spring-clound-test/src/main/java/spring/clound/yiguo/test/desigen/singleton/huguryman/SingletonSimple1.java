package spring.clound.yiguo.test.desigen.singleton.huguryman;

import spring.clound.yiguo.test.model.UserModel;

public class SingletonSimple1 {

    private static UserModel userModel = new UserModel();
    //私有构造方法
    private SingletonSimple1() {
    }

    public static UserModel getSingleton(){
        return  userModel;
    }
}
