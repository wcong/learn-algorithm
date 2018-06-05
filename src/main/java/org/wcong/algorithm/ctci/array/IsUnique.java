package org.wcong.algorithm.ctci.array;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/4
 */
public class IsUnique {

    public boolean isUnique(String s) {
        long flagLong = 0x0000;
        for (char soloChar : s.toCharArray()) {
            int index = soloChar - 'a';
            long flag = 1 << index;
            if ((flagLong & flag) > 0) {
                return false;
            }
            flagLong |= flag;
        }
        return true;
    }

}
