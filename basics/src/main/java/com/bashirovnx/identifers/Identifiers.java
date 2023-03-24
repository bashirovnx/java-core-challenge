package com.bashirovnx.identifers;

public class Identifiers {

//Valid
    int age;
    String firstName;
    double hourlyRate;
    boolean isEmployed;

//    Example of Not Valid Identifier Names:

//    int 123age; // identifier cannot start with a number
//    String full name; // identifier cannot have spaces
//    double 2hourlyRate; // identifier cannot start with a number
//    boolean is_Employed!; // identifier cannot contain special characters (except underscore)

//    Example of Not Recommended Identifier Names:

    int a; // identifier should be more descriptive than a single letter
    String str; // identifier should be more descriptive than a shortened word
    double hr; // identifier should be more descriptive than an abbreviation
    boolean emp; // identifier should be more descriptive than an abbreviation

}
