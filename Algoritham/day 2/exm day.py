#declare the array
A=[]
#input keybord values
for v in range (3):
    A.append(int(input("Enter a number : ")))
print(A)
#declare the insertion sort
def insertionSort(A):
    for j in range (1,len(A)):
        key = A[j]
        i=j-1
        while (i>-1 and A[i]):
            A[i+1] = A[i]
            i=i-1
        A[i+1] = key
insertionSort(A)
print('the sorted array : ' , A)

def findrange(A):
    range= A[-1] - A[0]
    return range
print('range' , findrange(A))

def findmedian(A):
    if(len(A) // 2 == 0):
        median = A[len(A)//2] + A[(len(A)//2)-1] /2
    else:
        median = A[len(A)/2]
    return median
print('median is ',findmedian(A))


print(A[0])
sum = 0
for x in range(len(A)):
    sum=sum+A[x]
print('sum is ', sum)

average = sum / len(A)
print('average is : ', average)

