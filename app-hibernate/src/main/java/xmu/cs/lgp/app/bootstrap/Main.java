package xmu.cs.lgp.app.bootstrap;

import lly.framework.core.bootstrap.Bootstrap;
import lly.framework.core.util.PrintUtil;

/**
 * Hello world!
 * 
 */
public class Main extends Bootstrap {
    
    public static void main(String[] args) throws Exception {
        PrintUtil.printClassMsg(Main.class, "app-hibernate项目");
        
        start();
        
        stop(2);
    }
}
