### questions

#### join
1. inner join: would contain only the data where the criteria match.
2. outer join
    1. left join:contain all the data from left table,the miss field from right table will be null
    2. right join:contain all the data from right table;
    3. full join:combine the result both from left,right table.
#### denormalization
denormalization is a database optimization technique in which we add redundant data to on or more table

|con of denormalization| pros of denormalization| 
|----|---|
|update and insert more complex|retrieving data is more fast:less join|
|make update and insert code hard to write|queries to retrieving will be simple|
|data may be inconsistent ||
|redundant data require more storage||
