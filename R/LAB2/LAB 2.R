#control statements

#****************************************************************************
#if

x <- 6

if(x>0){
  print("positive number")
}

#if else -  remember after the if closing bracket must begin the else 

x <-  -5
if(x>0){
  print("positive number")
}else{
  print("negative number")
}


#nested if else - remember after the if closing bracket must begin the else if....

x <- 0

if(x >0){
  print("positive number")
}else if(x <0)
{
  print("negative number")
}else{
  print("Zero")
}

#***********************************************************************************


#while loop 


i <- 1
while(i<6){
  print(i)
  i= i+1
}

#*************************************************************************************

# FOR loop

1 : 10 # without loop

for(i in 1:10){
  print(i)
}

#**********************************************************************************




# Importing and Exporting
#----------------------------------------------------------------------------------

#importing


#get working directory
getwd()

#set working directory
setwd(C://Users//Nirmal Chathura//Desktop//Statics prc//LAB2 )# give path inside the brackets

# file name data_1

data_1 <- read.table("data1.txt" , header = TRUE , sep = ",") #sep means the seperate
data_1


#CSV file - dowload file

data_2 <- read.csv("DATA 2.csv" , header = TRUE)
data_2

fix(data_2) #display data


#----------------------------------------------------------------------------------------

#exporting

#1) create data set

Name <- c("Chathu" , "Janith" , "Nirmal")
Marks <- c(23,67,94)

marksOfMaths <- data.frame(Name,Marks)

# write this data set into the text file
write.table(marksofMaths, file = "StudentMarks.txt")

# write this data set into the csv file
write.csv(marksofMaths, file = "StudentMarks.csv")


#-------------------------------------------------------------------------------------------------



#functions


function_01 <- function(a,b){
  y <- a + b
  y
}

function_01(10,5)


#--------------------------------------------------------------------------------

#sqyare root - sqrt

sqrt(4) #2

#
#a=>5 , b=>10, c=> -2


quardRoot <- function(a,b,c){
  x1 <- (-b + sqrt(b^2 - 4*a*c)) / (2*a)
  x1
  x2 <- (-b - sqrt(b^2 - 4*a*c)) / (2*a)
  x2
  
}

quardRoot(5,10,-2)
















#------------------------------------------------------------------------------


#1. Compute the real roots of the quadratic equation in the form of 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0.


quardRoot <- function(a,b,c){
  x1 <- (-b + sqrt(b^2 - 4*a*c)) / (2*a)
  x1
  x2 <- (-b - sqrt(b^2 - 4*a*c)) / (2*a)
  x2
  
}

quardRoot(5,10,-2)


#2. Without using R, determine the result of the following computation
#x <- c(1,2,3)
#x[1]/x[2]^3-1+2*x[3]-x[2-1]















#3. Construct separate plots of log(𝑥), exp(𝑥), by using appropriate values.












#4. Consider the vector 1:K, where K is a positive integer. Write an R command that determines
#how many elements in the vector are exactly divisible by 3.


xvect <- c(1:20)

sum(xvect %% 3 == 0)


#5. Write an R expression to determine if two sets, A and B, represented as integer vectors are
#disjoint. If not disjoint, print the common elements.













#6. Write a loop structure to scan through an integer vector to determine the index of the maximum
#value.

y <- c(1,2,3,4,5,6,7,8,9)
max <- 0 

for (i in y){
  if(y[i] > max){
    max <- y[i]
  }
}
print(max)



#7. Do the same without using a loop.

which.max(y)


#8. Compound interest can be computed using the formula,

#where is the original money lent, A is what it amounts to in years at percent per year
#interest. Write a function to calculate the amount of money owed after n years where n changes
#from 1 to 15 in yearly increments, if the money lent originally is 5000 rupees and the interest
#rate remains constant throughout the period at 11.5%.



A <- 0

moneyOwed <- function(p,R,n){
  
  for(i in 1:n){
    A = p * ((1 + (R/100)) ^i)
    print(A)
  }
}

moneyOwed(5000 , 11, 5)


#9. Import the file "Death Row.csv" into R and identify the variables1. Compute the real roots of the quadratic equation in the form of 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0.







