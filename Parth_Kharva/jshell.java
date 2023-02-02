|  Welcome to JShell -- Version 11.0.10
|  For an introduction type: /help intro

jshell> String print(String a){return a+a;}
|  created method print(String)

jshell> print("Parth")
$2 ==> "ParthParth"

jshell> int sum(int x, int y){return x*y;}
|  created method sum(int,int)

jshell> sum(45,21)
$4 ==> 945

jshell> double volume(double radius){ return 4.0/7.6 * 3.14 * 89*45*2 * radius;}
|  created method volume(double)

jshell> volume(8);
$6 ==> 105900.63157894736

jshell> /vars
|    String $2 = "ParthParth"
|    int $4 = 945
|    double $6 = 105900.63157894736

jshell> /methods
|    String print(String)
|    int sum(int,int)
|    double volume(double)

jshell> /list

   1 : String print(String a){return a+a;}
   2 : print("Parth")
   3 : int sum(int x, int y){return x*y;}
   4 : sum(45,21)
   5 : double volume(double radius){ return 4.0/7.6 * 3.14 * 89*45*2 * radius;}
   6 : volume(8);

jshell> /list -all

  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;
   1 : String print(String a){return a+a;}
   2 : print("Parth")
   3 : int sum(int x, int y){return x*y;}
   4 : sum(45,21)
   5 : double volume(double radius){ return 4.0/7.6 * 3.14 * 89*45*2 * radius;}
   6 : volume(8);

jshell> int x = 78;
x ==> 78
        jshell>
jshell>
jshell> String x
x ==> null
