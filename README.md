# My solutions of the Josephus Problem

## What is in here
Here i solved the famous Josephus Problem. If you are not sure what this is then 
you can read it here https://en.wikipedia.org/wiki/Josephus_problem

## Solutions
The solutions presented are just some algorithms i came up with.
Of course there are many other ways to solve this, a formula which would be the solution
with the least complexity O(1).
If you do not know about O notation (big O notation), you can inform your self here
https://en.wikipedia.org/wiki/Big_O_notation

## How to run
You can run the Runner class after compilation.
NOTE: In order to run with 1.000.000.000 soldiers you will have to use vm arguments to 
increase Heap space and change garbage collector. It needs at least 7 GB of heap space
and a different garbage collector. I used serial garbage collector.  
``-Xmx8g -XX:+UseSerialGC``