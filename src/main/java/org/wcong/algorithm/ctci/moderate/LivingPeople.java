package org.wcong.algorithm.ctci.moderate;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * give a list of people with their birth and death years, implement a method
 * to compute the year with most people alive
 * all people are born between 1900 and 2000(inclusive)
 * birth 1990 death 2010 both inclusive
 * <p>
 * tips
 * think about stack
 * birth push one
 * dead pop one
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class LivingPeople {

    @Data
    @AllArgsConstructor
    public static class People {
        private int born;
        private int dead;
    }

    public int mostPeopleYear(List<People> peopleList) {
        int[] yearEvent = new int[201];
        for (People people : peopleList) {
            yearEvent[people.born - 1900] += 1;
            yearEvent[people.dead - 1900 + 1] -= 1;
        }
        int maxYear = 0;
        int max = yearEvent[0];
        int current = max;
        for (int i = 1; i < yearEvent.length; i++) {
            current += yearEvent[i];
            if (current > max) {
                max = current;
                maxYear = i;
            }
        }
        return 1900 + maxYear;
    }

}
