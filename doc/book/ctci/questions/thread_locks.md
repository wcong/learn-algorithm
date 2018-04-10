### questions

#### context switch
1. p2 blocks awaiting data from p1
2. p1 mark the start time
3. p1 send token to p2
4. p1 attempt to read a response token from p2, this induces a context switch
5. p2 is scheduled and received the token
6. p2 send a response token to p1
7. p2 attempt to read a response token from p1, this induces a context switch
8. p1 is scheduled and received the token
9. p1 mark the end time

#### dining philosophers
a bunch of philosophers setting around a circular table with one chopstick between.
philosophers need both chopsticks to eat, and always pick the left before right.
a dead lock could potentially occur if all the philosophers reached for left chopstick at the same time.
using thread and locks, implements a simulations of dining philosophers that prevent deadlock. 

#### dead lock free
require a process to declare upfront what locks it will need, 

#### call in order
