### questions
1. Number Swapper: Write a function to swap a number in place (that is, without temporary variables).
    * i have two different ways of do that, first is using minus operation,
        1. first i let a be the result of a minus b
        2. then b be the result of b add a
        3. then a be the result of b minus a
    * then other approach is bitwise exclusive or,
        1. first a left a be the result of a exclusive or b
        2. then b be the result of a exclusive or b
        3. then a be the result of b exclusive or a
2. Word Frequencies: Design a method to find the frequency of occurrences of any given word in a book. What if we were running this algorithm multiple times?
    * We can create a hash map which maps from a word to its frequency,The frequency of any word can be easily looked up in O (1) time.
3. Intersection: Given two straight line segments (represented as a start point and an end point), compute the point of intersection, if any.
    * this will be split to two different sub-problems, 
        1. if they have the same slope,then must be the same line
        2. if their slope is not same, they will be intersect
4. Tic Tac Win: Design an algorithm to figure out if someone has won a game of tic-tac-toe.
5. Factorial Zeros: Write an algorithm which computes the number of trailing zeros in n factorial.
    * this problem will be decreased to the number of 5 from 0 to n
6. Smallest Difference: Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.
    * i will sorted the array first, and then from the begin of two array, record the minimum pairs when to through two array
7. Number Max:write a method to find the maximum of two different numbers,you should not use any comparison operations
    * i will use sign bit to do that,
8. English Int: Given any integer, print an English phrase that describes the integer (e.g., "One Thousand,Two Hundred Thirty Four").
    * decreased to every three digit sub-problem   
9. Operations: Write methods to implement the multiply, subtract, and divide operations for integers.The results of all of these are integers. Use only the add operator.
    * multiply is n times of add
    * subtract is unary bitwise complement
    * divide is n times of subtract
10. Living People: Given a list of people with their birth and death years, implement a method to
  compute the year with the most number of people alive. You may assume that all people were born
  between 1900 and 2000 (inclusive). If a person was alive during any portion of that year, they should
  be included in that year's count. For example, Person (birth= 1908, death= 1909) is included in the
  counts for both 1908 and 1909.
  * we go through each year and check how many people are alive in that year, O(R*P)
  * i use a array of integer, the value at index i indict the delta of birth and death,to through the array and calculate the current people ,record the maximum.
