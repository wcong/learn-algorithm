### questions
* Add Without Plus: Write a function that adds two numbers. You should not use or any arithmetic operators.
* Shuffle: Write a method to shuffle a deck of cards. It must be a perfect shuffle-in other words, each
  of the 52! permutations of the deck has to be equally likely. Assume that you are given a random
  number generator which is perfect.
* Random Set: Write a method to randomly generate a set of m integers from an array of size n. Each
  element must have equal probability of being chosen.
* Missing Number: An array A contains all the integers from Oto n, except for one number which
  is missing. In this problem, we cannot access an entire integer in A with a single operation. The
  elements of A are represented in binary, and the only operation we can use to access them is "fetch
  the jth bit of A[ i ],"which takes constant time. Write code to find the missing integer. Can you do
  it inO(n) time?
    * Just go through all subarrays, count the number of As and Bs (or letters
      and numbers), and find the longest one that is equal
* Letters and Numbers: Given an array filled with letters and numbers, find the longest subarray with
  an equal number of letters and numbers.
* Count of 2s: Write a method to count the number of 2s that appear in all the numbers between O
  and n (inclusive).
* Circus Tower: A circus is designing a tower routine consisting of people standing atop one another's
  shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter
  than the person below him or her. Given the heights and weights of each person in the circus, write
  a method to compute the largest possible number of people in such a tower.
* Kth Multiple: Design an algorithm to find the kth number such that the only prime factors are 3, 5,
  and 7. Note that 3, 5, and 7 do not have to be factors, but it should not have any other prime factors.
  For example, the first several multiples would be (in order) 1, 3, 5, 7, 9, 15, 21.
* Majority Element: A majority element is an element that makes up more than half of the items in
  an array. Given a positive integers array, find the majority element. If there is no majority element,
  return-1. Do this inO(N) time and 0(1) space.
* Word Distance: You have a large text file containing words. Given any two words, find the shortest
  distance (in terms of number of words) between them in the file. If the operation will be repeated
  many times for the same file (but different pairs of words), can you optimize your solution?
* BiNode: Consider a simple data structure called BiNode, which has pointers to two other nodes.
  public class BiNode {
  }
  public BiNode nodel, node2;
  public int data;
  The data structure BiNode could be used to represent both a binary tree (where nodel is the left
  node and node2 is the right node) or a doubly linked list (where nodel is the previous node and
  node2 is the next node). Implement a method to convert a binary search tree (implemented with
  BiNode) into a doubly linked list. The values should be kept in order and the operation should be
  performed in place (that is, on the original data structure).
* Re-Space: Oh, no! You have accidentally removed all spaces, punctuation, and capitalization in a
  lengthy document. A sentence like "I reset the computer. It still didn't boot!"
  became "iresetthecomputeri tstilldidntboot''. You'll deal with the punctuation and capitalization
  later; right now you need to re-insert the spaces. Most of the words are in a dictionary but
  a few are not. Given a dictionary (a list of strings) and the document (a string), design an algorithm
  to unconcatenate the document in a way that minimizes the number of unrecognized characters.
  EXAMPLE:
  Input: jesslookedjustliketimherbrother
  Output: jess looked just like tim her brother (7 unrecognized characters)
* Smallest K: Design an algorithm to find the smallest K numbers in an array
* Longest Word: Given a list of words, write a program to find the longest word made of other words
  in the list.
* The Masseuse: A popular masseuse receives a sequence of back-to-back appointment requests
  and is debating which ones to accept. She needs a 15-minute break between appointments and
  therefore she cannot accept any adjacent requests. Given a sequence of back-to-back appointment
  requests (all multiples of 15 minutes, none overlap, and none can be moved), find the optimal
  (highest total booked minutes) set the masseuse can honor. Return the number of minutes.
* Multi Search: Given a string band an array of smaller strings T, design a method to search b for
  each small string in T.
* Shortest Supersequence: You are given two arrays, one shorter (with all distinct elements) and one
  longer. Find the shortest subarray in the longer array that contains all the elements in the shorter
  array. The items can appear in any order.
* Missing Two: You are given an array with all the numbers from 1 to N appearing exactly once,
  except for one number that is missing. How can you find the missing number in O(N) time and
  0(1) space? What if there were two numbers missing?
* Continuous Median: Numbers are randomly generated and passed to a method. Write a program
  to find and maintain the median value as new values are generated.
* Volume of Histogram: Imagine a histogram (bar graph). Design an algorithm to compute the
  volume of water it could hold if someone poured water across the top. You can assume that each
  histogram bar has width 1.
* Word Transformer: Given two words of equal length that are in a dictionary, write a method to
  transform one word into another word by changing only one letter at a time. The new word you get
  in each step must be in the dictionary.
* Max Black Square: Imagine you have a square matrix, where each cell (pixel) is either black or white
  Design an algorithm to find the maximum subsquare such that all four borders are filled with black
  pixels.
* Max Submatrix: Given an NxN matrix of positive and negative integers, write code to find the
  submatrix with the largest possible sum.
* Word Rectangle: Given a list of millions of words, design an algorithm to create the largest possible
  rectangle of letters such that every row forms a word (reading left to right) and every column forms
  a word (reading top to bottom). The words need not be chosen consecutively from the list but all
  rows must be the same length and all columns must be the same height.
*  