### Summary

### Key Points
* have brute-force solutions use 0(n) space, but subtler solutions use the itself reduce to 0(1)
    * *org.wcong.algorithm.epi.array.onedimension.DutchNationalFlagProblem*
* Filling an array from the front is slow, so see if it's possible to write values from the back. 
* Instead of deleting an entry (which requires moving all entries to its right), consider overwriting it.
* When dealing with integers encoded by an array consider processing the digits from the back of the array. Alternately, reverse the array so the least-significant digit is the first entry
* Be comfortable with writing code that operates on subarrays.
* It's incredibly easy to make off-by-1 errors when operating on arrays.
* Don't worry about preserving the integrity of the array (sortedness, keeping equal entries together, etc.) until it is time to return
* 
