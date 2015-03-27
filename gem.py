#Problem Statement

#John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lowercase latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a 'gem-element' if it occurs at least once in each of the rocks.

#Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.

#Input Format 
#The first line consists of N, the number of rocks. 
#Each of the next N lines contain rocks' composition. Each composition consists of lowercase letters of English alphabet.

#Output Format 
#Print the number of gem-elements that are common in these rocks. If there are none, print 0.

#Constraints 
#1 ≤ N ≤ 100 
#Each composition consists of only lowercase latin letters ('a'-'z'). 
#1 ≤ Length of each composition ≤ 100

#Sample Input

#3
#abcdde
#baccd
#eeabg
#Sample Output
#2


n=int(raw_input())
rock=[]
for i in range(n):
	temp=str(raw_input()).lower()
	rock.append(temp)
setss=[]
for r in rock:
	setss.append(set(r))
temp=""
for i,s in enumerate(setss):
	a=str(i)
	temp+="%s &"%("setss["+a+"]")
temp=temp.strip()[:len(temp)-1]
print len(eval(temp))
