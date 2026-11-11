
Exception Family Tree

     Throwable
        |
Error           Exception    
                     |
                RuntimeException


All the exceptions under the Runtime class are unchecked exception.
All the exceptions under the exception class except runtimeException is compile time exceptions.

Type of exception
- Checked Exception ---- CompileTime Exception --- IOException, FileNotFoundException, SQLException, InterruptedException
- Unchecked Exception --- RuntimeException ---   ArithemticException, NullPointerException

Handling exception
- try catch
- finally
- throw
- throws

try {
 //risky code
} catch () {
    // handle exception here
}


WAP to create an array with 5 elements and then try to access 8th element.
Handle the exception which you are getting.

Exception object is being created by java
will check the object for that particular exception in the catch block
if found it will execute else will throw the exception


Always try to add the parent exception at the very bottom as if it will be at top then it will get caught there itself and 
after that all the catch block will remain unreachable and code will not compile.


finally block will get executed not matter what.


Try with resources -- will automatically close all the opened resource.




Throw ---- when you want to throw an exception explicitly.
Throws --- When you want the caller to handle the exception.


WAP to check whether user is able to drive or not.
if age is equals or more than 18 then drive else thrown NotEligibleTodrive Exception.






    