package xmu.cs.lgp.app.handler;

import lly.framework.core.util.PrintUtil;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldHandler {

    public HelloWorldHandler() {
        PrintUtil.printClassMsg(this.getClass(), "初始化成功");
    }

    public void init() {
        PrintUtil.printClassMsg(this.getClass(), "你好呀，好好学习，天天上当！");
    }

    public void destroy() {
        PrintUtil.printClassMsg(this.getClass(), "释放成功");
    }

    public void saySomething(String youSay, String iSay) {
        PrintUtil.printClassMsg(this.getClass(), "你说：" + youSay);
        PrintUtil.printClassMsg(this.getClass(), "我说：" + iSay);
    }

}
