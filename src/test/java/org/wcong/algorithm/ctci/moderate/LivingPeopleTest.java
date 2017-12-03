package org.wcong.algorithm.ctci.moderate;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.LivingPeople;

import java.util.Arrays;
import java.util.List;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class LivingPeopleTest {

    @Test
    public void testMostLivePeople() {
        LivingPeople livingPeople = new LivingPeople();
        List<LivingPeople.People> peopleList = Arrays.asList(
                new LivingPeople.People(1981, 2001),
                new LivingPeople.People(1961, 2006),
                new LivingPeople.People(1941, 1990),
                new LivingPeople.People(1951, 1988)
        );
        assert livingPeople.mostPeopleYear(peopleList) == 1981;
    }

}
