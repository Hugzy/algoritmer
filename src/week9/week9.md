# Exercise 7.1-1
## Using figure 7.1 as a model, illustrate the operation of _PARTITION_ on the array A = {13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11}
![alt_text](\images\assignment7_1-1.jpg)

# Exercise 7.1-2
## What value of q does _PARTITION_ return when all elements in the array A[p ..r] have the same value
The value q which is returned is equal to the number of elements -1 since the _PARTITION_ algorithm compares elements with
less then or equal to, thus making all elements pass the check if they are all equal.

## Modify _PARTITION_ so that q = floor((p+r)/2) when all elements in the array A[p..r] have the same value.
Efter min menings hvis alle elementer har samme værdi kan man blot returnere q = floor((p+r)/2)

# Exercise 7.2-2
## What is the running time of _QUICKSORT_ when all elements of the array have the same value
I'd say O(n^2), is related to exercise 7.1-2

# Exercise 7.2-3
## Show that the running time of _QUICKSORT_ is Theta(n^2) when the array is sorted and in decreasing order.
Spørgesmålet siger basically, vis at _QUICKSORT_ altid vil bruge n^2 køretid til at sortere et bestemt input. 
her ville man kigge på asymptotisk analyse for mindre end eller ligmed, og større end eller ligmed og hvis de begge holdte
kun ligmed faktisk være en reel mulighed.

# Exercise 7.1-b side 186

#Exercise 6.1-5
## Is an array that is in sorted order a min-heap?
Yes because, the min-heap property states that a parent cannot have a value that exceeds its children.

# Exercise 6.1-6
## Is the array with values [23,17,14,6,13,10,1,5,7,12] a max heap?
Yes because 7>6

# Exercise 6.1-4
## Where in a max-heap might the smallest element reside, assuming that all elements are distinct?
In the leafs located at _h_ depth.

# Exercise Eksamen januar 2006, opgave 1 b
## Bemærk at der er tale om en minheap.
To sættes ind på den først ledig plads, hvilket er til højre for 17 og under 10,men fordi at denne heap følger min-heap princippet ved man at ethvert 'blad' ikke må have en værdi der er mindre end det af dets 'gren' derfor byttes 10 og 2 om. Igen tjekkes om 2 er mindre end sin rod som er 3, hvilket den er, derfor ombyttes 2 og 3. 2 sammenlignes med 1 og her ses at 1 er den mindste så derfor bliver der ikke byttet om på noget, og 2 er nu successfuldt blevet indsat i heapen.

# Illustrate the Max-Heapify(A,3) on the following array
## A = [27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0]
![alt-text]()




