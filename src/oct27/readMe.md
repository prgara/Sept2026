
Runtime polymorphism
- when we override the method from the parent class in child class to give specific implementation.


Upcasting --- Referring to a child class object using a parent class reference.
- to write loose coupled and flexible code


object created and then used and not referenced anymore... becomes eligible for GC.

**Exercise-1**

create a base class called payment having pay method and 
child classes credit card, debit card which will override the pay method and will give its own implementation.

**Exercise-2**

create parent class Order with method calculateFinalAmount(double amount)
create child classes
- Regular order -> No discount
- Prime order -> 10% discount
- FestivalOrder -> 20% discount
- Use runtime polymorphism to calculate final amount. 

Object class is the parent class of all the classes in java.


Encapuslation ---- bundling of data and its behaviour in a single unit.
