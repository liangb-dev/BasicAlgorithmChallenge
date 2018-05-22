# BasicAlgorithmChallenge


These algorithm challenges come from freeCodeCamp.com, and were originally
intended for javascript I believe. Here I have solved them using Java for
practice. 

Each algorithm is implemented as a separate Class, but which inherits a
single method from Abstract Class 'BasicAlgorithm' - the selector method
called method(). Each Class implements this selector method, which is 
essentially a switch statement, that allows choosing between any method 
implemented by any Class. I used this method because it allows some unity 
across the different 'BasicAlgorithms' that implement a common method - 
the selector method(). Now their interfaces are largely the same. 
All other methods they implement (as well as fields) are private, so as to
hide from the user interface. 

e.g.
BasicAlgorithm object = new *ClassType*(*arguments*);
object.method(1);


The different algorithms (.java) include: 
(by alphabetic order, not order completed)

CaesarsCipher
CheckPalindrome
ChunkyMonkey
ConfirmEnding
Factorialize
FalsyBouncer (N/A)
Mutations
RepeatAString
ReturnLargestNumbers
ReverseString
SeekDestroy
SlasherFlick
StringsLongestWord
TitleCaser
TruncateString
WhereDoIBelong

other files:
BasicAlgotirhm.java
Main.java
template.java

