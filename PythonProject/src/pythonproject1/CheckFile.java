package pythonproject1;

import java.io.FileInputStream;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class CheckFile
{
    String name;
    String filename;
    
    public CheckFile(final String name, final String filename) {
        this.name = name;
        this.filename = filename;
    }
    
    public static String stringToHash(final String plaintext) {
        String result = "";
        try {
            final byte[] byteplaintext = plaintext.getBytes("UTF-8");
            final MessageDigest md = MessageDigest.getInstance("MD5");
            final byte[] bytehash = md.digest(byteplaintext);
            result = DatatypeConverter.printHexBinary(bytehash);
        }
        catch (Exception e) {
            System.out.println("Hash Error");
            System.exit(0);
        }
        return result;
    }
    
    public static String filetoHash(final String location) {
        String result = "";
        try {
            final MessageDigest md = MessageDigest.getInstance("MD5");
            final FileInputStream fis = new FileInputStream(location);
            final byte[] databytes = new byte[1024];
            for (int nread = 0; nread != -1; nread = fis.read(databytes)) {
                md.update(databytes, 0, nread);
            }
            final byte[] bytehash = md.digest();
            result = DatatypeConverter.printHexBinary(bytehash);
        }
        catch (Exception e) {
            System.out.println("File Hass Error");
            System.exit(0);
        }
        return result;
    }
    
    public String hashMaker() {
        final String namehash = stringToHash(this.name);
        final String namefilehash = filetoHash(this.filename);
        final StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 32; ++i) {
            result.append(namehash.charAt(i));
            result.append(namefilehash.charAt(i));
        }
        return result.toString();
    }
}
