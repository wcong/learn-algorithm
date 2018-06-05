package org.wcong.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/5/28
 */
public class StringCancat {


    List<String> output = new ArrayList<>();


    public List<String> concatString(List<String> inputStringList) {
        StringBuilder path = new StringBuilder(inputStringList.size());
        pathConcatString(inputStringList, 0, path);
        return output;
    }


    private void pathConcatString(List<String> inputStringList, int index, StringBuilder path) {
        if (index == inputStringList.size()) {
            output.add(path.toString());
            return;
        }
        String currentString = inputStringList.get(index);
        for (char character : currentString.toCharArray()) {
            path.setCharAt(index, character);
            pathConcatString(inputStringList, index + 1, path);
        }
    }


}
