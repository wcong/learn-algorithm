### questions
1. Add Without Plus: Write a function that adds two numbers. You should not use or any arithmetic operators.
2. Shuffle: Write a method to shuffle a deck of cards. It must be a perfect shuffle-in other words, each
  of the 52! permutations of the deck has to be equally likely. Assume that you are given a random number generator which is perfect.
    * Base Case and Build approach
    * shuffle the first n - 1 elements and take the nth element and randomly swap it with an element in the array
3. Random Set: Write a method to randomly generate a set of m integers from an array of size n. Each element must have equal probability of being chosen.
    * Base Case and Build approach
    1. first pull a random set of size m from the first n - 1 elements
    2. we just need to decide if array [n] should be inserted into our subset
    3. pick a random number k from 0 through n
    4. If k < m, then insert array[ n] into subset [ k]
       
4. Missing Number: An array A contains all the integers from Oto n, except for one number which
  is missing. In this problem, we cannot access an entire integer in A with a single operation. The
  elements of A are represented in binary, and the only operation we can use to access them is "fetch
  the jth bit of A[ i ],"which takes constant time. Write code to find the missing integer. Can you do
  it inO(n) time?
5. Letters and Numbers: Given an array filled with letters and numbers, find the longest subarray with an equal number of letters and numbers.
  * use dynamic programming
  1. create an array of integers, value at index i indicate counts of letters and number from 0 to i
  2. create an hash map ,to map the counts to index arrays
  3. iterate from 0 to n, find the pair of index with the same count, and find the longest distance of pair
  * brute force: Just go through all subarrays, count the number of As and Bs, and find the longest one that is equal
6. Count of 2s: Write a method to count the number of 2s that appear in all the numbers between O and n (inclusive).
7. Baby Names: Each year, the government releases a list of the 10,000 most common baby names
   and their frequencies (the number of babies with that name). The only problem with this is that
   some names have multiple spellings. For example, "John" and ''Jon" are essentially the same name
   but would be listed separately in the list. Given two lists, one of names/frequencies and the other
   of pairs of equivalent names, write an algorithm to print a new list of the true frequency of each
   name. Note that if John and Jon are synonyms, and Jon and Johnny are synonyms, then John and
   Johnny are synonyms. (It is both transitive and symmetric.) In the final list, any name can be used
   as the "real" name.
   EXAMPLE
   Input:
   Names: John (15), Jon (12), Chris (13), Kris (4), Christopher (19)
   Synonyms: (Jon, John), (John, Johnny), (Chris, Kris), (Chris, Christopher)
   Output: John (27), Kris (36)
   * use a graph to represent the relationship of each people
8. Circus Tower: A circus is designing a tower routine consisting of people standing atop one another's
  shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter
  than the person below him or her. Given the heights and weights of each person in the circus, write
  a method to compute the largest possible number of people in such a tower.
  * sort by height
  * find the longest sub-sequence in weight
9. Kth Multiple: Design an algorithm to find the kth number such that the only prime factors are 3, 5,
  and 7. Note that 3, 5, and 7 do not have to be factors, but it should not have any other prime factors.
  For example, the first several multiples would be (in order) 1, 3, 5, 7, 9, 15, 21.
  * have three stack
  * brute force : We have nested for loops
10. Majority Element: A majority element is an element that makes up more than half of the items in
  an array. Given a positive integers array, find the majority element. If there is no majority element,
  return-1. Do this inO(N) time and 0(1) space.
  * have a variable k represent frequency of current number
  * iterate from 0 to n 
