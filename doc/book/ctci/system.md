### System Design

#### Key Concept

* horizontal/vertical scaling 
    * Vertical scaling means increasing the resources of a specific node.add additional memory to a server to improve its ability to handle load changes.
    * Horizontal scaling means increasing the number of nodes.add additional servers, thus decreasing the load on any one server. 
* Load Balance   load balancer allows a system to distribute the load evenly
* Database Denormalization and NoSQL 
    * avoid join 
    * redundant 
* Database Partitioning (Sharding) Sharding means splitting the data across multiple machines 
    * Vertical Partitioning based on feature
    * Key-Based (or Hash-Based) Partitioning: 
        * This uses some part of the data (for example an ID) to partition it
        * modulus
        * number of servers you have is effectively fixed. Adding additional servers means reallocating all the database very expensive task
    * Directory-Based Partitioning: 
        * maintain a lookup table for where the data can be found
        * the lookup table can be a single point of failure
        * constantly accessing this table impacts performance
* Caching
* Asynchronous Processing & Queues 
* Networking Metrics 
    * bandwidth
    * throughput
    * latency              
* MapReduce

#### Considerations

* Failures
* Availability and Reliability
* Read-heavy vs. Write-heavy
* Security
