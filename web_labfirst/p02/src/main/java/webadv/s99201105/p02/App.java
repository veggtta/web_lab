package webadv.s99201105.p02;

import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        if (args[0].equals("liluyu"))
            System.out.println("登录成功");
            System.out.println("账号为："+args[0]);
            System.out.println("密码为"+sha256hex(args[1]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
