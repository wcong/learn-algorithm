### Summary
You should know the primitive types very intimately, e.g., sizes, ranges, signedness properties, and operators.

bit|byte|short|int|long|float|double|char
---|---|---|---|---|---|---|---|

### Bitwise and Bit Shift Operators
* ~:Unary bitwise complement
* *<<*:Signed left shift
* *>>*:Signed right shift
* *>>>*:Unsigned right shift
* \& Bitwise AND
* *^*:Bitwise exclusive OR
* *|*:Bitwise inclusive OR

### key points
* be very comfortable with bitwise operation, especially xor ^
* Understand how to use masks and create them in an machine independent way eg *0b1* *0b0* *0b1000*
    * *org.wcong.algorithm.epi.primitive.ComputeDivide*
* Know fast ways to clear the lowermost set bit (and by extension, set the lowermost 0, get its index, etc.)
    * *org.wcong.algorithm.epi.primitive.ParityOfWord*
* Understand signedness and its implications to shifting.
    * ** 

