package org.wcong.algorithm.epi.array;

/**
 * Array problems often have simple brute-force solutions that use 0(n) space,
 * but subtler solutions that use the array itself to reduce space complexity to 0(1). [Problem 6.1]
 *
 * Filling an array from the front is slow, so see if it's possible to write values from the back. [Problem 6.2]
 *
 * Instead of deleting an entry (which requires moving all entries to its right), consider overwriting it. [Problem 6.5]
 *
 * When dealing with integers encoded by an array consider processing the digits from the back of the array.
 * Alternately, reverse the array so the least-significant digit is the first entry. [Problem 6.3]
 *
 * Be comfortable with writing code that operates on subarrays. [Problem 6.10]
 *
 * It's incredibly easy to make off-by-1 errors when operating on arrays. [Problems 6.4 and 6.17]
 *
 * Don't worry about preserving the integrity of the array (sortedness, keeping equal entries together, etc.) until it is time to return. [Problem 6.5]
 *
 * An array can serve as a good data structure when you know the distribution of the elements in advance.
 * For example, a Boolean array of length W is a good choice for representing a subset of (0,1,..., W- 1].
 * (When using a Boolean array to represent a subset of (1,2,3,...,«}, allocate an array of size n+1 to simplify indexing.) [Problem 6.8].
 *
 * When operating on 2D arrays, use parallel logic for rows and for columns. [Problem 6.17]
 *
 * Sometimes it's easier to simulate the specification, than to analytically solve for the result.
 * For example, rather than writing a formula for the i-th entry in the spiral order for an n X n matrix,
 * just compute the output from the beginning. [Problems 6.17 and 6.19]
 *
 * */
