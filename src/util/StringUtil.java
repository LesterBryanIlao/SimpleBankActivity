package util;

public class StringUtil {
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().equals("");
    }
    
    public static String removeQuotes(String value)  {
        return value.substring(0, value.length());
    }
}
