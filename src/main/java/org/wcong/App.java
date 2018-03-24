package org.wcong;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Arrays.asList("das  sdas".split("\\s+"));
        System.out.println(Arrays.asList("das  sdas".split("\b")));

    }

    static class HotelCount {
        public HotelCount(int id, int count) {
            this.id = id;
            this.count = count;
        }

        int id;
        int count;
    }

    static int[] sort_hotels(String keywords, int[] hotel_ids, String[] reviews) {
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords.split("\\s+")));
        Map<Integer, HotelCount> countMap = new HashMap<>(hotel_ids.length);
        for (int id : hotel_ids) {
            if (countMap.containsKey(id)) {
                continue;
            }
            HotelCount hotelCount = new HotelCount(id, 0);
            countMap.put(id, hotelCount);
        }
        for (int i = 0; i < reviews.length; i++) {
            String review = reviews[i];
            int count = 0;
            for (String word : review.split("\\s+")) {
                if (keywordSet.contains(word)) {
                    count += 1;
                }
            }
            HotelCount hotelCount = countMap.get(hotel_ids[i]);
            hotelCount.count += count;
        }
        List<HotelCount> hotelCountList = new ArrayList<>(countMap.values());
        Collections.sort(hotelCountList, new Comparator<HotelCount>() {
            @Override
            public int compare(HotelCount o1, HotelCount o2) {
                int countDifference = o2.count - o1.count;
                if (countDifference == 0) {
                    return o1.id - o2.id;
                }
                return countDifference;
            }
        });
        int[] sortedIds = new int[hotelCountList.size()];
        for (int i = 0; i < sortedIds.length; i++) {
            sortedIds[i] = hotelCountList.get(i).id;
        }
        return sortedIds;
    }

    static int stringConstruction(String s) {
        int cost = 0;
        int[] appear = new int['z' - 'a' + 1];
        for (char solo : s.toCharArray()) {
            if (appear[solo - 'a'] == 0) {
                cost += 1;
                appear[solo - 'a'] += 1;
            }
        }
        return cost;
    }
}
