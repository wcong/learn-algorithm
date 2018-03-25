### preparation grid

key concept,SAR situation,action result.

|questions|start up|current|
|---|---|---|
|challenges|||
|mistake/failures|||
|enjoyed|||
|leadership|||
|conflicts|||
|what you do differently|||

#### tqmall
##### challenges
i build the search system from zero to one, first i use solr in one node for search service,
but during the iteration of our website, we found some problem
* it's a single node service, we store all our data and provide service in one machine, if it's fall down, the whole system won't work
* it's can't change data immediately, every time somethings change, we should do a full-data synchronous.
so we start to search for solution, and we find elasticsearch, and solr cooperate zookeeper 
after some comparison is convenient for distribute deployment, and for real-time index problem, we found a binlog subscribe tool ie canal,
through it we will receive change of data immediately, 

##### mistake
Integer.maxLength

##### enjoyed
i have the freedom to decide what technology i can use, 
the search system is mostly built by me, afterwords, someone join me and do some extra work  

### what are you weaknesses
sometimes i don't have a good attention to detail. 
While that's good because it lets me execute quickly, it also means that i sometimes make careless mistakes.
Because of that, I make sure to always have someone else double check my work.

### what questions should you ask the interviews
#### project plan for the company 
#### radio of tester and developer
#### most challenge for company
#### I'm very interesting in scalability and i'd like to learn more about it, what opportunity i can get in you company
#### i'm nor familiar with technology X, but i'm very interesting in it, can you tell me more about it
 

