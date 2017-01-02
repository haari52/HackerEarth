# HackerEarth
Hacker Earth Problem Solvers

Problem : Little Shino and the coins (ShinoCoinTry1.java)
Explanation :

Input: First line contains one integer, K
Second line contains a string, S consist of lowercase letters only.

Output: Print one integer, for the number of pairs(i,j) where i≤j the number of distinct coins in sequence Si,Si+1,Si+2,...,Sj−1,Sj
is exactly equal to K.

Sample Input :
3 
abcaa

Sample Output :
5  (as the distinct coins formed with the substring from the given string are abc, abca, abcaa, bca, bcaa )

Problem: Cricket Rating (Cricket Rating.java)

Explanation : Find out the maximum consistent sum of cricket rating of a batsman or a bowler only if his overall rating is positive over that period.

Algorithm Used : Kadane's algorithm consists of a scan through the array values, computing at each position the maximum (positive sum) subarray ending at that position. This subarray is either empty (in which case its sum is zero) or consists of one more element than the maximum subarray ending at the previous position. The algorithm only needs to keep track of the ending position because the implied starting position is just after the last position at which the sum went negative; a higher sum can always be found by dropping any negative-sum prefix. 

Input :  The first line contain number of matches "N". The second line contains those ratings of a batsman/bowler in those N matches.

Sample input : 8
-1 -4  4 -2 0 1 4 -5

Sample Output : 7
