# Hw1Draft

Questions and problems. Input, output, method (algorithm) and data structure (storage of input/output and intermediate data). 

Arrays: how are they represented in the memory of the computer (low level).  What is needed to access the element at a given position i? Answer: address of the first element of the array (a) and the index (i) of the desired element. Low level operation executed: a+i. Constant time (one operation). O(1).

----------------------------------------------------------------------------------------------------------------------

Application 1: under the hood of a grade-management system (say, moodle or gradescope). Simplest version: single homework. More realistic (later): 10 homeworks, 2 exams, 1 project.

Input data: an integer ("grade") for each student, identified by an "id" number. Data structure: vector (one-dimensional array). Static allocation: yes, under the assumption that the number of ids (students) is staying constant throughout the lifetime (usage) of the system (say, one semester). Operations on the data structure, i.e.  questions that can be asked: 

what is my grade? Input: student id. Output: integer (grade). Direct access to the student's grade via its position (i.e. index of id) in the array. Direct access to the data via its index/location. Constant time operation. O(1) time.
what was the highest grade for this homework? Finding the maximum of an array.
what was the lowest grade? Finding the minimum of an array.
what is my ranking for this homework? Finding the rank of an element in the array.
what is the second? third? median grade? Selection of an element from an array, by rank.
what is the average grade? Summation of all elements (divided by the total number).
(for the professor) sort the student ids in decreasing order of the grades they received.

----------------------------------------------------------------------------------------------------------------------

Application 2: the "friendship" relation/graph and its representation as a 0-1 matrix (double array). Data structure: 0-1 matrix (two-dimensional array). Static allocation: yes, under the assumption that the number of ids (students) is staying constant throughout the lifetime (usage) of the system (say, this semester). Operations on the data structure, i.e.  questions that can be asked: 

is student with id I a friend of student with id j? Input: two student ids, i and j . Output: true/false or 1/0 (boolean). Direct access to the students friendship information via the two indices in the two-dimensional array: a(I,j). Direct access to the data via the two indices. Constant time operation. O(1) time. How is it done at the low level (hardware/memory) of a computer? Double-arrays are stored in memory row-by-row (typically). Answer: we use the address of the first element of the array (a), the number of elements on each row (n)  and the indices (i,j) of the desired element. Low level operation executed: a+(i-1)*n + j. Constant time (four operations of addition and multiplication). O(1).

who are the friends of a student with given id? 
who has the most friends?
is any student isolated (has no friends) in this class?
is there a group of students who are all friends with each other (and perhaps can work together on a project)?
is there a way to pair up the students (for pair programming) so that each student  works with a friend?
is there a way of making distinct pairs each time the students have to work together (each lab) so that all students get to work with a different partner each time? only with their friends? with all their friends?
etc.


Static memory allocation.  Introduction to running time analysis: constant time algorithms. Introduction to the Big Oh notation. Basic examples and applications with O(1), O(n) and O(n^2).
 
