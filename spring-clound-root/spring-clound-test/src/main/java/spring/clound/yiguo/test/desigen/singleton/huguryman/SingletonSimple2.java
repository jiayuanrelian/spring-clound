package spring.clound.yiguo.test.desigen.singleton.huguryman;

import spring.clound.yiguo.test.model.UserModel;

public class SingletonSimple2 {
    private SingletonSimple2() { }

    private static  class SingletonInstens{
        private static final UserModel USER_MODEL = new UserModel();
    }
    public static UserModel getSingleton(){
        return SingletonInstens.USER_MODEL;
    }
}
