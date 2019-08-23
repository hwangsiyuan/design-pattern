package com.hussein.proxy.dynamic.jdk;

/**
 * <p>Title: JdkProxyTest</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/8/23 10:51 AM
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        User user = new UserImpl();
        LogHandler logHandler = new LogHandler(user);
        User proxy = (User) logHandler.getProxy();
        proxy.add("马二先生", 45);
        proxy.update("鲍文卿", 50);
        proxy.delete("鲍文卿");
    }
}
