package spring.clound.yiguo.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.clound.yiguo.test.dao.UserMapper;
import spring.clound.yiguo.test.model.UserModel;
import spring.clound.yiguo.test.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserModel> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void deletUser(Integer id) {
        userMapper.deletUser(id);
    }
}
