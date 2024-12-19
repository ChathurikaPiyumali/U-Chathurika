arr = []
print("Enter numbers between 10 to 20")
for v in range (10):
    arr.append(int(input("Enter a number :")))
print(arr)

def insertionSort(arr):
    for j in range (1,len(arr)):
        key = arr[j]
        i = j-1
        while (i>0 and arr[i]>key):
            arr[i+1] = arr[i]
            i=i-1
        arr[i+1] = key 

insertionSort(arr)
print("Sorted in ascending order : " , arr)

for k in range (len(A)):
    print(A[k])

#####################################################################





