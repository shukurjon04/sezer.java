import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class hashfunksiya5topshiriq {
    public static void main(String[] args) {

        String input = "Boqiyev Shukurjon";
        System.out.println(" input : "+input);
        System.out.println("hash : "+ getMD5(input));
    }

    public static String getMD5(String input) {
        try{
            MessageDigest md  = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] hash  = md.digest();
            String result  = new BigInteger(1, hash).toString(16);
            return result;
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return null;
    }
}
