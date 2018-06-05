package org.wcong.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/5/28
 */
public class FriendsInDegree {

    public static class People {
        String name;
        List<People> friends;

    }

    Map<People, Integer> friendsMap = new HashMap<>();


    public List<People> findFriendsInDegree(People people, int degree) {
        for (People friends : people.friends) {
            findFriends(friends, 1, degree);
        }
        return new ArrayList<>(friendsMap.keySet());
    }

    private void findFriends(People people, int degree, int maxDegree) {
        if (degree > maxDegree) {
            return;
        }
        Integer oldDegree = friendsMap.get(people);
        if (oldDegree == null || oldDegree > degree) {
            friendsMap.put(people, degree);
            for (People friends : people.friends) {
                findFriends(friends, degree + 1, maxDegree);
            }
        }
    }

}
