#define array
A=[]

#get input values
for v in range(10):
    A.append(int(input("Enter a number :")))
print(A)

#define the insertion sort
def insertionSort(A):
    for k in range(1,len(A)):
        key = A[k]
        i=k-1
        while (i>-1 and A[i]>key):
            A[i+1] = A[i]
            i = i-1
        A[i+1] = key
insertionSort(A)
print('Sorted array in ascending order :' , A)

#get top 50% scores
topMarks = A[-5:]
print("Marks of students eligible for the scholarships :" , topMarks)

