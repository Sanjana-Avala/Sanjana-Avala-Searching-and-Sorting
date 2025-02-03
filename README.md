# PRIMM: Searching and Sorting

In this PRIMM activity, you'll learn about classic searching and sorting algorithms. The methods contained in the SearchSort class are all static and illustrate the classic algorithms, which you should know.

Use this document as a place to document your answers to the questions. You won't turn this document in, but it can help supplement your notes.

## Predict
Answer the following prediction questions.

1. What will the program output when run?
    > The program will output whether the numbers from runner are found in the array using the search methods. 
2. Identify which methods are searching methods.
    >  The first two methods are searching methods. 
3. What is the input and output to a search method?
    > The inputs are the target and the array and the output is an int representing whether the target is found. 
4. Identify which methods are sorting methods.
    >  Mystery 3, 4, 5 are sorting methods. 
5. What is the input and output to a sort method?
    > The array to be sorted is the input to a sort method. There is no output to a sort method. 
6. Which is the most effiecient search method? Explain why.
    > Splitting the array in half when it is sorted and then looking to see whether the target is bigger than the mid or smaller than the mid. 
7. Which is the most efficient sort method? Explain why.
    > 

## Investigate
Complete the JavaDoc for each of the methods. The description is super critical. Make sure that you indicate how the algorithm does its work. If you know the name of the algorithm, give it.

## Modify
In the runner class, add code that will test `mystery2` as well as code that will test `mystery4`,and `mystery5`. How will you make sure that the sorting algorithms get unsorted data?

One of sorting methods is slightly broken. Figure out which it is and fix it.

## Make
Pick one search and one sort method. Overload them to operate on an ArrayList. Add testing code to the runner class.