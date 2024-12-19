#declaring the array
arr = []

#input the keyboard values
print('Input the numbers including negative numbers')
for v in range(6):
    arr.append(int(input("Enter a number : ")))
print(arr)

#define the insertion sort

def insertionSort(arr):
    for i in range (1,len(arr)):
        key = arr[i]
        j = i - 1
        while (j >= 0 and arr[j] > key):
            arr[j + 1],arr[j] = arr[j],arr[j + 1]
            j = j - 1
        arr[j + 1] = key

insertionSort(arr)
print('A list of integers including negatives :' , arr)
            


        
