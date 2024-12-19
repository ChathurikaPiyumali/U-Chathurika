def INSERTION_SORT(A):
    for k in range(1, len(A)):
        key = A[k]
        i = k - 1
        while i >= 0 and A[i] > key:
            A[i + 1] = A[i]
            i -= 1
        A[i + 1] = key

# input marks of 10 students
marks = []
for i in range(10):
    marks.append(int(input("Enter marks of student {}: ".format(i+1))))

# sort marks in ascending order
INSERTION_SORT(marks)


# get top 50% scorers
eligible_marks = marks[-5:]
print("Marks of students eligible for scholarship: ", eligible_marks)
