#INSERTION SORT

#declare the array
A = []
#get keyboard inputs
for v in range (3):
    A.append(int(input("Enter a value : ")))
print(A)
   
#define the insertion sort
def insertionSort(A):
    for j in range (1,len(A)):
        key = A[j]
        i=j-1
        while (i>-1 and A[i] > key):
            A[i+1] = A[i]
            i=i-1
        A[i+1] = key
insertionSort(A)
print('The sorted Array : ' ,A)



#find the sum

#print(A[0])
sum=0
for x in range(len(A)):
    sum=sum+A[x]
print('Sum is : ',sum)

#find the sum
avg=sum/len(A)
print('Average is : ',avg)

#find the range
range = A[-1] - A[0]
print('The range is :' , range)

#find the median
if(len(A) %2 == 0):
    median = (A[len(A) //2] + A[(len(A)//2 )-1]) / 2
else:
    median = A[len(A)//2]
    
print('The median is : ' ,median)







#use function for range
def findRange(A):
    A[-1] - A[0]
    return range

print('range =' , findRange(A))

#use function for median
def findMedian(A):
    if(len(A) %2 == 0):
        median = (A[len(A) //2] + A[(len(A)//2 )-1]) / 2
    else:
        median = A[len(A)//2]
    return median
print('median =' , findMedian(A))
