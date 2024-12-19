def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        smallest = i
        for j in range(i+1, n):
            if arr[j] < arr[smallest]:
                smallest = j
        arr[i], arr[smallest] = arr[smallest], arr[i]

# Obtain marks of 9 students as input
marks = []
for i in range(9):
    marks.append(int(input(f"Enter marks of student {i+1}: ")))

# Sort the marks using either Insertion Sort or Selection Sort
# Uncomment one of the below lines depending on the algorithm to be used
# insertion_sort(marks)
# selection_sort(marks)

# Calculate the median and range of marks
n = len(marks)
median = 0
if n % 2 == 0:
    median = (marks[n//2] + marks[n//2 - 1]) / 2
else:
    median = marks[n//2]

range_of_marks = max(marks) - min(marks)

# Print the results
print(f"Median of marks: {median}")
print(f"Range of marks: {range_of_marks}")
