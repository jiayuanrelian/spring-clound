package spring.clound.yiguo.test.service;

import spring.clound.yiguo.test.model.UserModel;

import java.util.List;

public interface IUserService {

    List<UserModel> getAllUser();

    void deletUser(Integer id);
}
