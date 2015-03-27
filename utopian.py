#Problem Statement

#The Utopian Tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. The second growth cycle occurs during the summer, when its height increases by 1 meter.

#Now, a new Utopian Tree sapling is planted at the onset of spring. Its height is 1 meter. Can you find the height of the tree after N growth cycles?

#Input Format

#The first line contains an integer, T, the number of test cases. 
#T lines follow; each line contains an integer, N, that denotes the number of cycles for that test case.

#Constraints 
#1≤T≤10 
#0≤N≤60
#Output Format
#For each test case, print the height of the Utopian Tree after N cycles. Each line thus has to contain a single integer, only.

#Sample Input

#3
#0
#1
#4
#Sample Output
#1
#2
#7


t=int(raw_input())
n=[]
for i in range(t):
	n.append(int(raw_input()))
for j in n:
	h=1
	switch=0
	for l in range(j):
		if switch==0:
			h*=2
			switch=1
		elif switch==1:
			h+=1
			switch=0
	print h
