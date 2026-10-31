can we override constructor ? No 
can we override static methods ?  No..... method hiding

Encapsulation 
bundling of data and methods in a single unit.
data hiding 
1. Control
2. Security
3. Validation

access modifiers
- default ----- only accessible within the package.
- public --- accessed everywhere
- private ---- only accessible within the same class
- protected --- accessible in same package and other package for sub classes.

How to do encapsulation
- all the data members as private
- provide getter setter method to access them.

Non-Access modifiers
- static


**Exercise**

create a library class with data members (bookName, currentCount, totalCount)
create 2 methods --- depositBook, borrowBook
Design this class by keeping encapsulation in mind.



**Abstraction**
Showing only what is necessary to the user and hiding the complexity.

abstract method is one which does not have a body.
abstract method can only exist in abstract class or interface.


- using abstract class
by using abstract keyword we can make abstract class.
may or may not have abstract method.
cannot create an object of it.
can have constructor



**Exercise**


create a abstract class Notification with abstract method sendNotification.
create 3 concrete class to send different kind of notification.