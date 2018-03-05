### Exercises week 10
***
### Assignment 6.4-4 
***
Show that the running time for HeapSort is Omega(n log n)


### `Answer`


### Assignment 8.2-1
***
Illustrate the operation of _COUNTING-SORT_ on the array A= [6, 0, 2, 0, 1, 3, 4, 6, 1, 3, 2]

### `Answer`
![](/images/ass1.png)

### Assignment 8.2-3
***
for j ← 1 to length[A] Show that the algorithm still works properly. Is the modified algorithm stable?

### `Answer`
The order in which the elements are picked from the initial array is reversed, however since the order in which they are picked has no meaning to the actual sorting as it is done based on indexes the algorithm is still correct and stable.


C-arrayet fra _Counting-Sort_ kan besvare dette, eftersom at talende mellem er C[b]-C[a-1]

### Exercises 8.3-1
***
Using Figure 8.3 as a model, illustrate the operation of RADIX-SORT on the following list of English words: COW, DOG, SEA, RUG, ROW, MOB, BOX, TAB, BAR, EAR, TAR, DIG, BIG, TEA, NOW, FOX.

### `Answer`
 1| 2 |3 | 4 
:----:|:----:|:----:|:----:
COW | SE**A** | T**A**B | **B**AR
DOG | TE**A** | B**A**R | **B**IG
SEA | MO**B** | E**A**R | **B**OX
RUG | TA**B** | T**A**R | **C**OW
ROW | DO**G** | S**E**A | **D**IG
MOB | RU**G** | T**E**A | **D**OG
BOX | DI**G** | D**I**G | **E**AR
TAB | BI**G** | B**I**G | **F**OX
BAR | BA**R** | M**O**B | **M**OB
EAR | EA**R** | D**O**G | **N**OW
TAR | TA**R** | C**O**W | **R**OW
DIG | CO**W** | R**O**W | **R**OG
BIG | RO**W** | N**O**W | **S**EA
TEA | NO**W** | B**O**X | **T**AB
NOW | BO**X** | F**O**X | **T**AR
FOX | FO**X** | R**O**G | **T**EA


### Exercise Eksamen juni 2008, opgave 1a
***
Udfør radix sort med radix 10 på tallene [747, 765, 544, 754, 431, 231, 222
]

### `Answer`
1 | 2 | 3 | 4
:----:|:----:|:----:|:----:
747 | 43**1** | 2**2**2 | **2**22
765 | 23**1** | 4**3**1 | **2**31
544 | 22**2** | 2**3**1 | **4**31
754 | 54**4** | 5**4**4 | **5**44
431 | 75**4** | 7**4**4 | **7**44
231 | 76**5** | 7**5**4 | **7**54
222 | 74**7** | 7**6**5 | **7**65

### Assignment 8.3-2
Which of the following sorting algorithms are stable: insertion sort, merge sort, heapsort, and quicksort? Give a simple scheme that makes any sorting algorithm stable. How much additional time and space does your scheme entail?

### `Answer`
- Stable: InsertionSort, MergeSort
- Not Stable: HeapSort, QuickSort

En stable algoritme betyder at algoritmen ikke vil ændre rækkefælgen af elementer med samme checket værdi, eks hvis der forekommer integer sortering på parisne (4, 'First') og (4, 'Second') hvil deres rækkefølge altid bibeholdes.