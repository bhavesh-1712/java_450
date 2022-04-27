package INS;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class assignment_5_1 {
    public assignment_5_1() {
    }

    public static void main(String args[]) throws NoSuchAlgorithmException, FileNotFoundException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Owner\\OneDrive\\Desktop\\viit\\6th Sem\\INS\\messageDigest2.txt");
        byte[] bytes = new byte[30];
        int i = 0;
        while ((i = fileInputStream.read(bytes)) != -1) {
            messageDigest.update(bytes, 0, i);
        }
        fileInputStream.close();
        byte[] digest = messageDigest.digest();
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Owner\\OneDrive\\Desktop\\viit\\6th Sem\\INS\\messageDigest2.txt");
        fileOutputStream.write(digest);
        fileOutputStream.close();
    }
}
