#InsertionSort Algorithm

#declare an array / creating an empty list
A = []

#number of elements as input
n = 9

for i in range(0,n):
    number = int(input("Enter a number : "))
    if (number > 10 and number < 20):
        A.append(number)
    else:
        print("Invalid Number!")
        i=i-1
     
print(A)

def INSERTIONSORT(A):

    for i in range(1,len(A)): #traverse the length of the array
        key = A[i]
        j = i - 1
        while j >= 0 and key < A[j]:
            A[j+1] = A[j]
            j = j-1
        A[j+1] = key

INSERTIONSORT(A)
print("Sorted Array :")
print(A)
