/**
 * Author:  liguangpu <spectrumleeee@gmail.com>
 * Created: 2017-4-2
 */

package xmu.cs.lgp.app.bootstrap;

import lly.framework.core.bootstrap.Bootstrap;
import xmu.cs.lgp.app.manager.impl.MerchantInfoManager;

public class Main extends Bootstrap {

    public static void main(String[] args) throws Exception {
        start();

        MerchantInfoManager merchantInfoManager = (MerchantInfoManager) context.getBean("merchantInfoManager");
        merchantInfoManager.curd();

        stop(2);
    }

}