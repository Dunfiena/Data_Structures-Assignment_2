# Data Assignement 2 - linklist and merge sort #
## Data Structures    March 15th 2024 ##


Having done the last assignement in Python, I wanted to cut my teeth in to programming in Java again.  With really only using
servlets and spring, I was missing getting to program in console too!


This linklist data structure assignment is comprised of three class
  1) main
  2) Node
  3) linklist
And is very much what we worked on in classes before the break.  There isn't much of interest in the basic setup, so we'll skip over that.

### Functions ###
We have a get and set for index position and data entry, and we have a size function.  There are just the small necessaties to making the thing work.
The next functions we have are the insert ones.  


![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/5c0c673e-5595-4265-af39-6b6c37574086)

![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/d4cb83cb-4962-4c42-9e5c-d34ae880b3f5)

![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/2137a91c-23f5-4923-88d1-7bf630134cd9)


The really, they all do the same thing, it's shuffling nodes around to get the right data at the correct index. The interresting one is insert at index,
in this one we can check if it's either the first or last entry on the list and run the other functions.


Deletion is basically identical in structure so we won't bother going through that


### Split, merge and sort ###
The spli function serves to divide a linklist into two equal linklists.  This is done by getting the size and appending the contents of the first half to a new array.
After this we return a array of linklists so that we have two distinct linklists.  If the number of entries in the list is odd, the extra value is added to the front list.

![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/471149b4-b01f-47f0-9450-e0d61359aa4d)


The idea behind the merge and sort functions, is that, now that we have two distinct lists, we can sort them individually, and then merge it together,
and re-sort the full list.  In the code below, you can see the two functions.

![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/a5dc559f-9e24-46a6-8b3b-9d363c635940)


### Code Output ###
-------------- Insert Output --------------
![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/dc90b92d-2e15-402a-b392-bfcd0da118f4)

-------------- Delete Output --------------
![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/9cb27a5e-801c-424d-b424-147dade88a8b)

-------------- Split and Merge/Sort Output --------------
![image](https://github.com/Dunfiena/Data_Structures-Assignment_2/assets/117761149/45f77d79-a3fc-49b4-b223-ccd4697fdb0d)

