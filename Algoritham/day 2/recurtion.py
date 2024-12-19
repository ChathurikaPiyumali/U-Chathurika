# INPUT = 1,2,3,4 ,5
#OUTPUT = 1,3,6,10,15

# LOGIC = 




def func(num):
    if num == 1: # if number is the base number = 1
        return 1
    else:
        return num+(func(num-1))


#loop

while True:
    num=int(input("Enter number : "))

    if num == -1:
        break
    else:
        print("Output :",func(num))
    
