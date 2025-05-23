## **sillysorts**

---
### Usage
>Run java implementations:
>```
>make java
>```
>
>Run c++ implementations:
>```
>make cpp
>```

---
### BogoSort
#### Time Complexity O(n!)
>This algorithm is fairly simple, it starts by checking if the list is already sorted,
>if it is, its returned. However if it isn't, the array is shuffled so each number has a
>new spot in the list, this process is repeated until the array happens to be sorted
>
>The time complexity is n! because the number of possible combinations in an array of length n is n!
---
### BogoBogoSort
#### Time Complexity O(n!^n!)
>This algorithm is similar to the BogoSort,
>
>Make a copy of the list of numbers.
>Sort the first n-1 elements of the copy using bogobogosort.
>Check to see if the nth element of the sorted copy is greater than the highest element of the first n-1 elements.
>If so, the copy is now sorted, else randomise the order of the elements of the copy and go to step 2.
>Check to see if the copy is in the same order as the original list.
---
### RoBogoSort
#### Time Complexity O(infinity)
>This algorithm is fairly simple in theory, the first thing it does is sort the list
>using a different sorting algorithm (I used BogoBogo sort for a laugh), we then create
>a new array with the same length as the original and start filling it up with numbers
>from 0 to infinity, this new array is compared to the sorted array and is returned
>if the arrays are the same, this process is repeated until the list happens to be sorted
>
>similar to "if enough moneys are typing for long enough they'll eventually spit
>out the entire works of shakespeare", if enough lists are made for long enough,
>eventually it'll spit out the sorted list
---
### FlipSort
#### O(?)
>TODO
---
### IntelligentDesignSort
#### Time Complexity O(1)
>this algorithm will only accept lists that are already sorted, if sorted,
>it return the list given, otherwise it will show an error message
---
### StalinSort
#### Time Complexity O(n)
>this algorithm will go through the list and delete any numbers that are smaller than the
>number before it, therefore creating a new, sorted, list
---
### BlackBeardSort
#### Time Complexity O(1)
>this algorithm deletes the entire list except for one number at random, keeping it
>alive to "Tell the tale"

