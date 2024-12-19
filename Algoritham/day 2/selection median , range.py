A=[]
for v in range (9):
    A.append(int(input("Enter a number : ")))
print(A)

#define the selection sort
def selectionSort(A):
    n=len(A)
    for j in range (0,n):
        smallest = j
        for i in range (j+1,n):
            if (A[i] < A[smallest]):
                smallest = i
        A[j],A[smallest]=A[smallest],A[j]
selectionSort(A)
print('Sorted array : ',A)
