### questions
1. objects
2. relations/operations
3. result

#### stock data
image you are building some sort of service that will be called by 1000-client to 
get end-of-day information of stock price.
you may assume you already have the data and you can store it in any format as you wish.
how would you build client-face service for client to get information.you responsible for development,
rollout, ongoing monitor and maintain feed.

* how we distribute information to the client
* easy for client and us to use
* flexible and scalable
* 1:text file;2:database;3:xml

#### social network
how would you design a data structure for a very large social network like facebook or linkedin, 
describe how you will design an algorithm to show the shortest path between two people.

first we should scope the problem,it's too obvious so left it,
the we should simplify this problem,
in one machine,
we can construct a graph by treating each people a node and let the edge between two people as they are friends

then in massive machine

1 reduce machine jump
2 smart division of people and machine
3 limit search

#### web crawler
if you design a web crawler ,how would you avoid infinite loop.

to prevent infinite loop, we detect cycles;
1 based on url
2 based on content
3 based on both of them and low priority, 'never end' and prevent loop
strategy
we have a database store a list of items we need to crawl, on each loop we select the highest priority from the database
1. open up the page and create a signature based on the specific subsection of the page and its url
2. query the database to check if it have been crawled recently
3. if something with this signature has been crawled recently, insert back the database with lower prooroty
4. if not, crawler it and put the links inside into databases 


#### duplicated url
you have 10-billion url. how do you detect duplicate documents.
in this case, duplicate means every url are identical.

1 one machine, every unique url will be hash module and store in one chunk of file
2 multiply machine, instead of store in file ,it will store in memory in different machine

#### cache
image a web server for a simply search engine. this server has 100 machine to response search queues.
which may then call out using process searching to another cluster,

#### sales rank
a large e-commercial company wish a list of best-selling product,overall and by category,

1 scope the problem. what's required for the sales rank, what data range, is it should be up-to date
2 

#### financial manager
explain how you will design a personal financial manager, this system will connect you bank account, 
analysis your spend habit, and make financial recommendation.
1 scope the problem, a synchronize , analysis  
 
