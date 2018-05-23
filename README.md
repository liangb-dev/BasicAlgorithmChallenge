# BasicAlgorithmChallenge


These algorithm challenges come from freeCodeCamp.com, and were originally
intended for javascript I believe. Here I have solved them using Java for
practice. 
\
Abstract Inheritance\
Each algorithm is implemented as a separate Class, but which inherits a
single method from Abstract Class 'BasicAlgorithm' - the selector method
called method(). Each Class inherits this selector method, which is 
essentially a switch statement, that allows choosing between any method 
implemented by any Class. I used this method because it allows some unity 
across the different 'BasicAlgorithms' that implement a common method - 
the selector method(). Now their interfaces are largely the same. Occasionally
a Class have more than one 'Switch-Choices' and thus overrides the inherited
parent Class which only provides for one single 'Switch-Choice' (and the 
default one). The Scope of each 'Choice Method' was made protected, since 
'private' methods don't work in the parent class 'BasicAlgorithm'. 
\
All other methods they implement (as well as fields) are private, so as to
hide from the user interface. 
\
e.g.\
BasicAlgorithm object = new *ClassType*(*arguments*);\
object.method(1);\
\
Generics\
Another thing worth mentioning is the use of generics, since the 'Choice Method'
inmplemented by each Class may each return a different Type. Generics was 
used here to let each class choose what Type to return, despite inheriting
the rest of the method from the parent class. As a result, primitive Types
are not allowed, and I had to use the auto-boxed types. 
This is because Generics happens during compile-time, and converts each generic
into an Object to be casted to the right type. Primitive types which stores
primitive values, are not convertible to an Object. 
Type-Erasure for backward compatility (Java 1.4 and below). 
\
The different algorithms (.java) include: \
(by alphabetic order, not order completed)
\
CaesarsCipher\
CheckPalindrome\
ChunkyMonkey\
ConfirmEnding\
Factorialize\
FalsyBouncer (N/A)\
Mutations\
RepeatAString\
ReturnLargestNumbers\
ReverseString\
SeekDestroy\
SlasherFlick\
StringsLongestWord\
TitleCaser\
TruncateString\
WhereDoIBelong

other files:\
BasicAlgotirhm.java\
Main.java\
template.java

