/**
 * Author:  liguangpu <spectrumleeee@gmail.com>
 * Created: 2017-4-2
 */

package xmu.cs.lgp.app.service.impl;

import javax.annotation.Resource;

import lly.framework.core.util.PrintUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.cs.lgp.app.handler.HelloWorldHandler;
import xmu.cs.lgp.app.mybatis.dao.IUserDao;
import xmu.cs.lgp.app.mybatis.domain.User;
import xmu.cs.lgp.app.service.MerchantInfoService;

@Service
public class MerchantInfoServiceImpl implements MerchantInfoService {

    @Resource
    HelloWorldHandler helloWorldHandler;
    
    @Autowired
    IUserDao userDao;
    
    @Override
    public void add() {
        PrintUtil.printClassMsg(this.getClass(), "添加一个商户");
        
        helloWorldHandler.saySomething("我爱你", "米吐");
        
        User user = new User();
        user.setUsername("liguangpu");
        user.setUserage(28);
        user.setUniversity("xmu");
        
        userDao.insert(user);
    }

    @Override
    public void update() {
        PrintUtil.printClassMsg(this.getClass(), "修改一个商户");
    }

    @Override
    public void delete() {
        PrintUtil.printClassMsg(this.getClass(), "删除一个商户");
    }

    @Override
    public void query() {
        PrintUtil.printClassMsg(this.getClass(), "查询一个商户");
    }

}
