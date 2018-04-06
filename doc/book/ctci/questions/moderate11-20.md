### questions
11. Diving Board: You are building a diving board by placing a bunch of planks of wood end-to-end.
    There are two types of planks, one of length shorter and one of length longer. 
    You must use exactly K planks of wood. Write a method to generate all possible lengths for the diving board.
    * the key point to this is we there are only two type of planks,and we only have k decisions
      so we iterate from 0 to n, and calculate i shorter amd n-i longer, put them in to a hash set  
12. Bisect Squares: Given two squares on a two-dimensional plane, find a line that would cut these two
  squares in half. Assume that the top and the bottom sides of the square run parallel to the x-axis.
13. Best Line: Given a two-dimensional graph with points on it, find a line which passes the most number of points.
    * we just iterate through all the line segment in array , and use a hash table to record the common line
14. Sub Sort: Given an array of integers, write a method to find indices m and n such that if you sorted
  elements m through n, the entire array would be sorted. Minimize n - m (that is, find the smallest
  such sequence).
    * iterate through from start and end to middle, find the first not in ascending way.
15. Contiguous Sequence: You are given an array of integers (both positive and negative). Find the contiguous sequence with the largest sum. Return the sum.
    * iterate through the array, keep the current sum of previous sub-array, if it's less than zero,discard it and sum from current.
16. Pattern Matching: You are given two strings, pattern and value. The pattern string consists of
  just the letters a and b, describing a pattern within a string. For example, the string catcatgocatgo
  matches the pattern aabab (where cat is a and go is b). It also matches patterns like a, ab, and b.
  Write a method to determine if value matches pattern.
17. Pond Sizes: You have an integer matrix representing a plot of land, where the value at that location
  represents the height above sea level. A value of zero indicates water. A pond is a region of
  water connected vertically, horizontally, or diagonally. The size of the pond is the total number of
  connected water cells. Write a method to compute the sizes of all ponds in the matrix.
18. Sum Swap: Given two arrays of integers, find a pair of values (one value from each array) that you
  can swap to give the two arrays the same sum.
19. Rand7 from Rands: Implement a method rand7() given rand5( ). That is, given a method that
  generates a random number between O and 4 (inclusive), write a method that generates a random
  number between O and 6 (inclusive).
20. Pairs with Sum: Design an algorithm to find all pairs of integers within an array which sum to a
  specified value.
21. LRU Cache: Design and build a "least recently used" cache, which evicts the least recently used
  item. The cache should map from keys to values (allowing you to insert and retrieve a value associated
  with a particular key) and be initialized with a max size. When it is full, it should evict the least
  recently used item.
22. Calculator: Given an arithmetic equation consisting of positive integers, +, -, * and / (no parentheses),
  compute the result.
