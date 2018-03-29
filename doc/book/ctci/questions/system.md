### questions

#### stock data
image you are building some sort of service that will be called by 1000-client to 
get end-of-day information of stock price.
you may assume you already have the data and you can store it in any format as you wish.
how would you build client-face service for client to get information.you responsible for development,
rollout, ongoing monitor and maintain feed.

1 what kind of client it that

#### social network
how would you design a data structure for a very large social network like facebook or linkedin, 
describe how you will design an algorithm to show the shortest path between two people.

first we should scope the problem,it's too obvious so left it,
the we should simplify this problem,
in one machine,
we can construct a graph by treating each people a node and let the edge between two people as they are friends

then in massive machine

1 io
2 data split
3 limit search

#### web crawler
if you design a web crawler ,how would you avoid infinite loop.

to prevent infinite loop, we detect cycles;
1 based on url
2 based on content
3 based on both of them and low priority, 'never end' and prevent loop

#### duplicated url
you have 10-billion url. how do you detect duplicate documents.
in this case, duplicate means every url are identical. 

1 one machine, every unique url will be hash module and store in one chunk of file
2 multiply machine, instead of store in file ,it will store in memory in different machine

#### cache

image a web server for a simply search engine. 
this server has 100 machine to response search queues

#### sales rank
a large e-commercial company wish a list of best-selling product,overall and by category,

1 scope the problem. what's required for the sales rank, what data range, is it should be up-to date
2 

#### financial manager
explain how you will design a personal financial manager, this system will connect you bank account, 
analysis your spend habit, and make financial recommendation.
1 scope the problem, a synchronize , analysis  
 
