Inheritance
polymorphism
Encapsulation
Abstraction

IS A relationship

**Type**

Single -- one parent, one child
Multiple --- one child, multiple parents
Multilevel -- 
Hierarchical --- one parent, multiple child



Java does not support multiple inheritance.

Diamond problem


code reusability -DRY principle
Centralized maintenance
Extensibility without modification -- Open closed principle

**Exercise - 1**

- create a vehicle class having few properties and behaviors.
- create 3 child classes inheriting vehicle class
- create child class objects and then call the methods and properties.


**Exercise - 2**

create a person class with name and displayInfo
create subclass student having studentId and displayStudent method
create object of subclass and assign values respectively and call methods.

this keyword ---- this refers to current object.
super ---- refers to parent class


tight coupling

loose coupling


Composition ---- HAS A relationship

================================================

Polymorphism

same method behave differently when context changes. .... many forms

**Types**

- Compile time/ static binding/ Overloading  ---- happens at compile time....... same method name with diff parameters
- Runtime/ dynamic binding/ overriding


create a class Shape having method calculateArea and calculate area for below shapes using overloading
- square -- side*side
- rectangle ---- l*w


create a class Printer which have overloaded method print 
String, int & double

printer.print("String)
printer.print(123)
printer.print(123.99)





