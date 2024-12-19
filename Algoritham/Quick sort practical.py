arr = []
for v in range (7):
    arr.append(int(input("enter a number : ")))
print(arr)

def partition(arr,low,high) :
    i= low -1
    pivot = arr[high]
    for j in range (low , high):
        if arr[j] <= pivot:
            i=i+1
            arr[i],arr[j] = arr[j],arr[i]


    arr[i+1],arr[high] = arr[high],arr[i+1]
    return i+1

# define the quicksort method

def quickSort(arr,low,high):
    if low<high:
        q= partition(arr,low,high)
        quickSort(arr,low,q-1)
        quickSort(arr,q+1,high)

quickSort(arr,0,len(arr)-1)
print("Sorted Array : ")
print(arr)
            


################################################################


        
arr=[]

#inpute numbers
for v in range (5):
    arr.append(int(input("Enter a number : ")))
print(arr)

def partition(A,p,r):
    pivot = arr[r]
    i= p-1
    for j in range (p,r): # pseudocode wala r-1 liyanne python wala r kiyl 
        if arr[j] <= pivot:
            i=i+1
            arr[i],arr[j] = arr[j],arr[i]
    arr[i+1],arr[r] = arr[r] , arr[i+1]
    return i+1


def quickSort(arr,p,r):
    if p<r:
        q = partition(arr,p,r)
        quickSort(arr,p,q-1)
        quickSort(arr,q+1,r)
quickSort(arr,0,len(arr)-1)
print("Sorted one : " , arr)  
