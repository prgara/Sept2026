Immutable class ---- it is a class whose value cannot be changed once assigned through constructor.

- make var as private final.
- remove setter methods.
- make class as final to prevent inheritance.

String
Wrapper classes


Collection framework

                              Iterable                                               MAP<K,V>
                                 |                                                      |
                              Collection                                 HashMap, LinkedHashMap, TreeMap
                                 |
            List                Set                    Queue
             |                   |                       |
         ArrayList            HashSet                  Deque
         LinkedList        LinkedHashSet, TreeSet



ArrayList --- ordered collection, can have duplicate, dynamic in nature (can grow), have index
it is backed by real array but can grow.


how arrayList works internally.

List<String> list = new ArrayList<>();
it will create an array of size 10.
once the array is full then on new addition of element, it will create a new array of approx size 1.5X
and copy all the previous element to new one and discard the old array which will be later GC.

Manipulation (adding or remove) is costly in arraylist so avoid doing it.
use arraylist when task is read intensive as you can get the element very fast with help of index.

How to loop over list

- for each
- for loop
- iterator

If you try to add or remove from the list while iterating over it then you will get concurrentModification execption


LinkedList ----- ordered collections, can have duplicates, no index.
java have doubly linked list
stored at random memory location.
nodes

singly LinkedList 
doubly LinkedList
Circular LinkedList


Linked list is used for manipulation (adding and removing in the list)
Dont use linked list when you have to access an element/object by index.

- create a list of employees(name, salary) and find the employee with highest salary.



