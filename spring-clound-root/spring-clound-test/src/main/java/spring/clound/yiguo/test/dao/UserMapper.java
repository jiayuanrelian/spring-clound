package spring.clound.yiguo.test.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import spring.clound.yiguo.test.model.UserModel;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from tb_user")
    List<UserModel> getAllUser();

    @Delete("delete from tb_user where id=#{id}")
    void deletUser(Integer id);
}
