# BasicAlgorithmChallenge


These algorithm challenges come from freeCodeCamp.com, and were originally
intended for javascript I believe. Here I have solved them using Java for
practice. 
<br>
<br>
<br>
<h2>Abstract Inheritance</h2>
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
<br>
All other methods they implement (as well as fields) are private, so as to
hide from the user interface. 
<br>
e.g.<br>
BasicAlgorithm object = new *ClassType*(*arguments*);<br>
object.method(1);<br>
<br>
<h2>Generics</h2>
Another thing worth mentioning is the use of generics, since the 'Choice Method'
inmplemented by each Class may each return a different Type. Generics was 
used here to let each class choose what Type to return, despite inheriting
the rest of the method from the parent class. As a result, primitive Types
are not allowed, and I had to use the auto-boxed types. 
This is because Generics happens during compile-time, and converts each generic
into an Object to be casted to the right type. Primitive types which stores
primitive values, are not convertible to an Object. 
Type-Erasure for backward compatility (Java 1.4 and below). 
<br>
<br>
<br>
<h2>Content: </h2>
(by alphabetic order, not order completed)
<br>
1 <a href="https://github.com/liangb-dev/BasicAlgorithmChallenge/blob/master/src/CaesarsCipher.java">CaesarsCipher</a><br>
2 <a href=https://github.com/liangb-dev/BasicAlgorithmChallenge/blob/master/src/CheckPalindrome.java>CheckPalindrome</a><br>
3 <a href=https://github.com/liangb-dev/BasicAlgorithmChallenge/blob/master/src/ChunkyMonkey.java>ChunkyMonkey</a><br>
4 <a href=./blob/master/src/ConfirmEnding.java>ConfirmEnding</a><br>
5 <a href=>Factorialize</a><br>
6 FalsyBouncer<br>
7 <a href=>Mutations</a><br>
8 <a href=>RepeatAString</a><br>
9 <a href=>ReturnLargestNumbers</a><br>
10 <a href=>ReverseString</a><br>
11 <a href=>SeekDestroy</a><br>
12 <a href=>SlasherFlick</a><br>
13 <a href=>StringsLongestWord</a><br>
14 <a href=>TitleCaser</a><br>
15 <a href=>TruncateString</a><br>
16 <a href=>WhereDoIBelong</a><br>

<h3>Other files:</h3>
BasicAlgotirhm.java<br>
Main.java<br>
template.java<br>

