arr =[]
# get keyboard inputes

for v in range(5):
    arr.append(int(input("Enter a number : ")))
print(arr)

#define insertionSort

def insertionSort(arr):
    for i in range(0,len(arr)):
        key = arr[i]
        j = i-1
        while (j>=0 and arr[j] < key):
            arr[j+1],arr[j] = arr[j],arr[j+1]
            j = j-1
        arr[j+1] = key
insertionSort(arr)
print('The list sorted in descending order : ', arr)
