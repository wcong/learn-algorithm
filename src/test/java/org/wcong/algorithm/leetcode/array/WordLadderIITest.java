package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @author wcong<wc19920415@gmail.com>
 *         "qa"
 *         "sq"
 *         ["si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"]
 * @since 27/06/2017
 */
public class WordLadderIITest {

    @Test
    public void testFindLadders() {
        WordLadderII solution = new WordLadderII();
        List<List<String>> answer = solution.findLaddersBruteForce("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        List<List<String>> compare = Arrays.asList(Arrays.asList("hit", "hot", "dot", "dog", "cog"), Arrays.asList("hit", "hot", "lot", "log", "cog"));
        Assert.assertTrue(isArrayEqual(answer, compare));
        Assert.assertTrue(isArrayEqual(solution.findLaddersBruteForce("a", "c", new ArrayList<>(Arrays.asList("a", "b", "c"))), Collections.singletonList(Arrays.asList("a", "c"))));

    }

    private boolean isArrayEqual(List<List<String>> list1, List<List<String>> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        Set<String> compare = new HashSet<>();
        for (List<String> transfer : list2) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : transfer) {
                stringBuilder.append(word);
            }
            compare.add(stringBuilder.toString());
        }
        Iterator<List<String>> stringIterator = list1.iterator();
        while (stringIterator.hasNext()) {
            List<String> transfer = stringIterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : transfer) {
                stringBuilder.append(word);
            }
            if (compare.contains(stringBuilder.toString())) {
                stringIterator.remove();
            }
        }
        return list1.isEmpty();
    }

}
