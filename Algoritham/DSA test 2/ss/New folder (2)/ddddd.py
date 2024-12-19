def selection_sort(arr):
    for i in range(len(arr)):
        min_idx = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j >= 0 and key < arr[j] :
                arr[j+1] = arr[j]
                j -= 1
        arr[j+1] = key

# obtain marks as keyboard input
marks = []
for i in range(9):
    marks.append(int(input("Enter marks for student {}: ".format(i+1))))

# sort the marks using selection sort algorithm
selection_sort_marks = marks.copy()
selection_sort(selection_sort_marks)

# sort the marks using insertion sort algorithm
insertion_sort_marks = marks.copy()
insertion_sort(insertion_sort_marks)

# calculate median and range for both sorted marks
median_selection_sort = 0
median_insertion_sort = 0

if len(selection_sort_marks) % 2 == 0:
    median_selection_sort = (selection_sort_marks[len(selection_sort_marks)//2] + selection_sort_marks[len(selection_sort_marks)//2-1]) / 2
else:
    median_selection_sort = selection_sort_marks[len(selection_sort_marks)//2]

if len(insertion_sort_marks) % 2 == 0:
    median_insertion_sort = (insertion_sort_marks[len(insertion_sort_marks)//2] + insertion_sort_marks[len(insertion_sort_marks)//2-1]) / 2
else:
    median_insertion_sort = insertion_sort_marks[len(insertion_sort_marks)//2]

range_selection_sort = max(selection_sort_marks) - min(selection_sort_marks)
range_insertion_sort = max(insertion_sort_marks) - min(insertion_sort_marks)

# print the results
print("Median of marks (Selection Sort):", median_selection_sort)
print("Range of marks (Selection Sort):", range_selection_sort)

print("Median of marks (Insertion Sort):", median_insertion_sort)
print("Range of marks (Insertion Sort):", range_insertion_sort)
