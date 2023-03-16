1. This principle applies to inheritance hierarchies and is just an extension of the Open Close Principle.
2. It means that we must make sure that new derived classes are extending the base classes without changing 
their original behavior. Basically, derived classes should never do less than their base class.
3. If a subtype of the supertype does something that the client of the supertype does not expect, then this 
is in violation of LSP. Imagine a derived class throwing an exception that the superclass does not throw, or if a derived class has some unexpected side effects. One has to consider that how the client programs are using the class hierarchy. Sometimes code refactoring is required to fix identified LSP violations.

Ref : https://www.javaguides.net/2018/02/liskov-substitution-principle.html?utm_source=pocket_saves
