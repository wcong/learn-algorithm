### questions
* Number Swapper: Write a function to swap a number in place (that is, without temporary variables).
* Word Frequencies: Design a method to find the frequency of occurrences of any given word in a book. What if we were running this algorithm multiple times?
    * We can create a hash map which maps from a word to its frequency,The frequency of any word can be easily looked up in O ( 1) time.
* Intersection: Given two straight line segments (represented as a start point and an end point), compute the point of intersection, if any.
* Tic Tac Win: Design an algorithm to figure out if someone has won a game of tic-tac-toe.
* Factorial Zeros: Write an algorithm which computes the number of trailing zeros in n factorial.
* Smallest Difference: Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.
* English Int: Given any integer, print an English phrase that describes the integer (e.g., "One Thousand,Two Hundred Thirty Four").
* Operations: Write methods to implement the multiply, subtract, and divide operations for integers.The results of all of these are integers. Use only the add operator.
* Living People: Given a list of people with their birth and death years, implement a method to
  compute the year with the most number of people alive. You may assume that all people were born
  between 1900 and 2000 (inclusive). If a person was alive during any portion of that year, they should
  be included in that year's count. For example, Person (birth= 1908, death= 1909) is included in the
  counts for both 1908 and 1909.
  * we go through each year and check how many people are alive in that year, O(R*P)
  * 
* Diving Board: You are building a diving board by placing a bunch of planks of wood end-to-end.
  There are two types of planks, one of length shorter and one of length longer. You must use
  exactly K planks of wood. Write a method to generate all possible lengths for the diving board.
* Bisect Squares: Given two squares on a two-dimensional plane, find a line that would cut these two
  squares in half. Assume that the top and the bottom sides of the square run parallel to the x-axis.
* Best Line: Given a two-dimensional graph with points on it, find a line which passes the most
  number of points.
* Sub Sort: Given an array of integers, write a method to find indices m and n such that if you sorted
  elements m through n, the entire array would be sorted. Minimize n - m (that is, find the smallest
  such sequence).
* Contiguous Sequence: You are given an array of integers (both positive and negative). Find the
  contiguous sequence with the largest sum. Return the sum.
* Pattern Matching: You are given two strings, pattern and value. The pattern string consists of
  just the letters a and b, describing a pattern within a string. For example, the string catcatgocatgo
  matches the pattern aabab (where cat is a and go is b). It also matches patterns like a, ab, and b.
  Write a method to determine if value matches pattern.
* Pond Sizes: You have an integer matrix representing a plot of land, where the value at that location
  represents the height above sea level. A value of zero indicates water. A pond is a region of
  water connected vertically, horizontally, or diagonally. The size of the pond is the total number of
  connected water cells. Write a method to compute the sizes of all ponds in the matrix.
* Sum Swap: Given two arrays of integers, find a pair of values (one value from each array) that you
  can swap to give the two arrays the same sum.
* Rand7 from Rands: Implement a method rand7() given rand5( ). That is, given a method that
  generates a random number between O and 4 (inclusive), write a method that generates a random
  number between O and 6 (inclusive).
* Pairs with Sum: Design an algorithm to find all pairs of integers within an array which sum to a
  specified value.
* LRU Cache: Design and build a "least recently used" cache, which evicts the least recently used
  item. The cache should map from keys to values (allowing you to insert and retrieve a value associated
  with a particular key) and be initialized with a max size. When it is full, it should evict the least
  recently used item.
* Calculator: Given an arithmetic equation consisting of positive integers, +, -, * and / (no parentheses),
  compute the result.
