package customexceptions;

// We have created the user defined class for exception 
// instead of using the java default exceptions
// Since its a user defined exception we are extending it to a base exception defined by java

public class TestExceptionDemouserSample2 extends Exception {
    // is the name of the exception
    TestExceptionDemouserSample2(String s) {
        // super will invoke the item from parent whichis nothing but from Exception Class
        super(s);
    }
}