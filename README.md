Sparse Arrays - Counting word frequencies
This code implements a solution to the HackerRank challenge "Sparse Arrays" https://www.hackerrank.com/challenges/sparse-arrays/problem.

Functionality:

Takes two lists of strings as input:
strings: This list contains a set of strings.
queries: This list contains words (queries) to be searched for in the strings list.
Outputs a list of integers, where each integer represents the frequency (number of occurrences) of the corresponding query string in the original strings list.
How to Use:

Save the code as a Java file (e.g., SparseArrays.java).
Compile the code using a Java compiler (e.g., javac SparseArrays.java).
Run the code from the command line, providing the input data on standard input:
java Solution < input.txt
Replace input.txt with a file containing your test data where each line represents either the number of strings, a string from the original set, the number of queries, or a query word. The format should be:
number_of_strings
string1
string2
...
number_of_queries
query1
query2
...
The output will be printed to the console, showing the frequency of each query word.
Example Input/Output:

4
aba
baba
aba
xzxb
3
aba
xzxb
lmnop

Output:

3
1
0
Libraries Used:

java.io: For input/output operations.
java.util: For data structures like HashMap, ArrayList, etc.
Note:

This code assumes the input data is valid and formatted correctly.
