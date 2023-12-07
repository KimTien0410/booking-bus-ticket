package src.servlet.model.dao;

import org.mindrot.jbcrypt.BCrypt;

public class handlePassword {
    public static String hashPassword(String password) {
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        return hash;
    }
    public static boolean confirmPassword(String password, String hashPassword) {
        boolean valuate = BCrypt.checkpw(password,hashPassword);
        return valuate;
    }
}
