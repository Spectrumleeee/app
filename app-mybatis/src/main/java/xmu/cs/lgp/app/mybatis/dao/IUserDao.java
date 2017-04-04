package xmu.cs.lgp.app.mybatis.dao;

import java.io.Serializable;
import xmu.cs.lgp.app.mybatis.domain.User;

public interface IUserDao extends Serializable {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}