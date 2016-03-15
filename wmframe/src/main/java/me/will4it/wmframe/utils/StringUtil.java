package me.will4it.wmframe.utils;

/**
 * Created by will on 3/15/16.
 */
public class StringUtil {

    public static boolean isEmpty(CharSequence str) {
        if (str == null || str.equals("")) {
            return true;
        }
        return false;
    }

}
