/**
 * Author:  liguangpu <spectrumleeee@gmail.com>
 * Created: 2017-4-2
 */

package xmu.cs.lgp.app.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xmu.cs.lgp.app.service.MerchantInfoService;

@Service()
public class MerchantInfoManager {
    
    @Resource
    MerchantInfoService merchantInfoService;
    
    public MerchantInfoManager() {
    }
    
    public void curd() {
        merchantInfoService.add();
        merchantInfoService.delete();
        merchantInfoService.query();
        merchantInfoService.update();
    }
}
