arr = []

for v in range (5):
    arr.append(float(input("Enter a floating point number :  ")))
print(arr)

#define the partition

def partition(arr,low,high):
    pivot = arr[high]
    i= low -1
    for j in range (low,high):
        if (arr[j]<= pivot):
            i=i+1
            arr[i],arr[j] = arr[j],arr[i]
    arr[i+1],arr[high] = arr[high],arr[i+1]
    return i+1

#define quick sort

def quickSort(arr,low,high):
    if low < high:
        pivot_index = partition(arr,low,high)
        quickSort(arr,low,pivot_index -1)
        quickSort(arr,pivot_index +1,high)
quickSort(arr,0,len(arr)-1)

print('A list of floating-point numbers',arr)
