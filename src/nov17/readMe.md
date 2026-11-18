Big O notation

Space Complexity
Time complexity

                 ArrayList       LinkedList        HashSet           LinkedHashSet            TreeSet
Get(Search)        O(1)              O(n)             
Add(Insert)        O(n)              O(n)            O(1)                 O(1)                  O(log n)
contains                                             O(1)                 O(1)                  O(log n)


Stack & queue -- in what order should i process data.

LIFO -- Last in First Out --- Stack 
push to add to stack, peek to look at the top, pop to remove the top element, isEmpty
FIFO -- First In First Out -- Queue
offer to add to queue, peek to look at the front, poll to remove the front element, isEmpty


Deque -- Double ended queue --- it can act as Stack or queue.


PriorityQueue -- natural sorting order

1 2 3 4 5 6
Store user name with no duplicate using List.... 


Set ---- collection of unique elements, no duplicate, unordered collection, no index


HashSet ---  unique elements & unordered

LinkedhashSet ---- unique elements & insertion order

TreeSet --- unique elements & natural sorting order


List of some random nums having duplicates.. remove duplicates
List<Integer> list = Arrays.asList(1, 2, 3, 5, 5, 6, 3, 4, 7, 7, 5, 4);


Create a List of Employee(name, phone num, email) having duplicates also.
Get the unique employees.



List of custom class (var, constructor, getter setters, to string)
Set of a custom
hashSet of custom class
String, Integer


element --- gets converted to a int using hashcode method. based on hashcode bucket index is found in memory and placed there.


Study ---- equals & hashCode contract
https://www.baeldung.com/java-equals-hashcode-contracts



SOLID 
JVM - https://medium.com/java-for-beginners/understanding-java-virtual-machine-jvm-architecture-e68d1c611026
GC - https://medium.com/@rakeshrdy8/garbage-collection-in-java-explained-bbebdc5f75ac






