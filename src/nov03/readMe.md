what is use of constructor in abs class if we cannot create an object of it ?
abstract class ----- 0 - 100 %
Interface ----> it is a contract which a class must be adhere to.  100% abstraction

- all the methods are by default public and abstract.
- you cannot have a concrete method
- it cannot have a constructor
- all the var inside the interface are by default public, static, final


abs class --- constructor --- initialize the instance var
interface -- no cons --- how to initialize the var ?

final ---- non access modifiers
final variable --- value cannot be changed later. have to be initialized.
final method ----- it cannot be overridden
final class ---- cannot be inherited

class --- class ------ extends
class --- interface ----- implements
interface ----- interface ------ extends

**Why to create abstract class if we can override the methods with inheritance only ?**



**when to use abstract class & when to use interface ?**

- multiple inheritance
- use abs when things are really type of something sharing same code. 
- use interface when unrelated things can do something similar.


1 child with multiple parents --- diamond problem


inheritance vs composition


=============================================================

Exception --- which breaks the normal flow of the execution of program.

exception handling --- it is process of handling the exceptions gracefully to maintain the flow of the code.

Error --- it is irreversible condition like power outage, memory error.




