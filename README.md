# Stopwatch task by Issaree Srisomboon (5910545906)
# Description of Stopwatch
Stopwatch is to compare speed of using differnt data types. In this application, we will compare the elapsed in append large number to `String` and `StringBuilder` and also compare adding 1 billion `double`, `Double` and `BigDecimal` using array.

I ran the task by HP Pavilion 14, and got this result:

|   Task      |     Time
| ----------------------------------------  | ------------: 
| Append  50,000 chars to `String`            |   2.4769 sec 
| Append 100,000 chars to `String`            |   8.4712 sec 
| Append 100,000 chars to `StringBuilder`     |   0.0122 sec 
| Add 1 billion `double` using array          |   4.3033 sec
| Add 1 billion `Double` using array          |  15.0101 sec
| Add 1 billion `BigDecimal` using array      |  27.7140 sec
# Explanation of Results
## String and StringBuilder
In String case, `String` is an immutable class therefore it cannot be changed once finishing creation. In every modification in String it creates a new String object and the older one is discarded automatically no matter which method you are using so it creates lots of temporary garbage in the constant String pool that cause an application performance.
- So when appending 100,000 chars to a String, it certainly take more time than 2X the time to append 50,000 chars. Because it has to create a new String address for every appending. To sum up, the more you add to a String, the slower you get.

Comparatively with `StringBuilder`, `StringBulder` is much more faster than `String` when build a long text by appending a new chars or strings to a String because it can be changed the values of the object everytime instead of creating a new one and the objects are created through `StringBuilder` are stored in the heap. 
## double, Double and BigDecemal
`double` is just a primitive but `Double` is an object that wraps a value of the primitive type double and contains a single field whose type is double. Because of that, the compiled code has to check the `Double` for null before doing anything with it so it takes much time while `double` is not. And the another reason is the values that are wrapped inside an object need allocation, deallocation, memory management and also getters and setters.
And `BigDecemal` is an object which is useful for storing either very big numbers or very small numbers than `double` and `Double` that make the values are more accurate than others but it takes much more longer time than others as well.
- When adding a long values using array, the result is 'double is faster than Double and Double is faster than BigDecimal' (`double` > `Double` > `Bigdecimal`) as can be seen above.
