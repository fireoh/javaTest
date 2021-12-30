import java.util.Random;

/*
随机验证码。
随机生成十组六位字符组成的验证码。
验证码由大小写字母、数字字符组成。
 */
public class Test43 {
    public static void main(String[] args) {
        Random random = new Random();
        int verificationCode = random.nextInt(123);
        System.out.println((char)verificationCode);
    }
}
