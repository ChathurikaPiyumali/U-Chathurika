
#comments

# %% - modulus 5%%2 = 1
# %/% - Integer division 5%/%2 = 2

# & - and , | - or , ! - not

#variables

x <- 5
x <- 5.5
x <- "Chathu"
x <- TRUE

#vector

#to store the numericc integer 
vec <- c(2,5,6,7,8)  #like an array - but the R language index begining with the "1" not the 0
vec #see the result
class(vec) # data type
vec[1]
vec[5]

#to stor the character 
vec <- c( "Chathurika" , "Piyumali" , "Unagalle")
class(vec)
vec[2]
vec  

#to store the logical value
vec<- c(TRUE , FALSE, FALSE , TRUE)
vec
vec[3]
class(vec) 

#to store complex numbers b: use the letter i 
vec<-c(3+5i,2i-7)
vec<-c(3+5i, -9+6i, -6i, 5)

vec
class(vec) #complex



# to store all data types : Characters

vec <- c(12, 12.5 ,"12.5" , TRUE , 3i+2)
vec
class(vec) #character



#list

#If wanna get the order of the vector
#vector isn't in ordered manner
#list can do ordered manner
list(vec)


#Factor

gender <- c("female","male" ,"female", "male" , "female")
factor(gender , c("female" , "male") , c(0,1))    # male =1, female =0

#why is it important?
#When creating an AI model, hv to identify the students marks. hv to give some large information. Most of the 
#informations are in string format. To pass the string values to numarical values. Call as pre-processing.



#matrix

#byrow=FALSE means, give priority for the cols first
#byrow=TRUE means, print the given numbers exactly the same order

#2 x 2 matrix

matrix (c(2,4,6,8) , nrow = 2, ncol = 2 ,byrow = "TRUE")  
#2 4
#6 8

matrix (c(2,4,6,8) , nrow = 2, ncol = 2 ,byrow = "FALSE") 
# 2 6
# 4 8


#3 x 3 matrix


#3X3 matrix
matrix(c(2,5,6,7,8,9),nrow = 3, ncol = 2, byrow = TRUE)




#data-frames
height<-c(5.5,4.7,6,5.7)
weight<-c(67,50,80,98)
dat<-data.frame(height,weight)
dat

mean(weight) #to get the avg weight































