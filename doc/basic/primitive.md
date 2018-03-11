### Summary
You should know the primitive types very intimately
* sizes
* ranges
* signedness properties: positive and non-positive
* operators.

bit|byte|short|int|long|float|double|char
---|---|---|---|---|---|---|---|

### Bitwise and Bit Shift Operators
* ~:Unary bitwise complement
* *<<*:Signed left shift
* *>>*:Signed right shift
* *>>>*:Unsigned right shift
* *&* Bitwise AND
* *^*:Bitwise exclusive OR
* *|*:Bitwise inclusive OR

### key Points
* be very comfortable with bitwise operation, especially xor ^
    * *org.wcong.algorithm.epi.primitive.SwapBits*
    * x & (x - 1) clears the lowest set bit in x
    * x & ~(x - 1) extracts the lowest set bit of x
    * x^x=0 x^x^x=x  x^0=x  x^1=~x
* Understand how to use masks and create them in an machine independent way eg *0b1* *0b0* *0b1000*
    * *org.wcong.algorithm.epi.primitive.ComputeDivide*
* Know fast ways to clear the lowermost set bit (and by extension, set the lowermost 0, get its index, etc.)
    * *org.wcong.algorithm.epi.primitive.ParityOfWord*
* Understand signedness and its implications to shifting.
    * *org.wcong.algorithm.epi.primitive.Multiplication*
* Consider using a cache to accelerate operations by using it to brute-force small inputs.
    * ** 
    
### practice
* Be very familiar with the bit-wise operators such as 6&4,1 1 2, 8»1, -16»>2, 1«18, “8, 15'x.


