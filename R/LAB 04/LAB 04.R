#1. Identify the variables and enter the given data set into R.

#set current directory
setwd("C:\\Users\\Nirmal Chathura\\Desktop\\LAB 04")

#import text file
data <- read.table("DATA 4.txt",header = TRUE , sep = "")
data
#data editing
fix(data)

#rename coloumns
names(data) <- c( "Team","Attendance " , "Salary" , "Years")
data

#accessing variables or columns  without mentioning the whole data set
attach(data) 

boxplot(`Attendance `) 
boxplot(Salary)
boxplot(Years)
# if we not attach we want to pass whole data set like  ---->    boxplot(data$Attendance)  

#2. Obtain the following for each variable

#a. Box-Plot, Histogram and Stem-Leaf Plot.

#boxplot
boxplot(`Attendance `   ,main="Boxplot for Attendance",outline = TRUE , xlab="Attendance",horizontal = TRUE)
boxplot(Salary ,main="Boxplot for Salary",outline = TRUE , xlab="Salary",horizontal = TRUE)
boxplot(Years   ,main="Boxplot for Year",outline = TRUE , xlab="Years",horizontal = TRUE)

#Histogram 
hist(`Attendance `,main = "Histrogram for attendance" , ylab= "Frequency")
abline(h=0)
hist(Salary,main = "Histrogram for salary" , ylab= "Frequency")
abline(h=0)
hist(Years,main = "Histrogram for years" , ylab= "Frequency")
abline(h=0)

#Stem-Leaf Plot
stem(`Attendance `)
stem(Salary)
stem(Years)

#b. Mean, Median and Standard Deviation.

#Mean
mean(`Attendance `)
mean(Salary)
mean(Years)

#median
median(`Attendance `)
median(Salary)
median(Years)

#Standard Deviation (sd)
sd(`Attendance `)
sd(Salary)
sd(Years)

#c. First and Third Quantile.

# summary of all Quantile values 
summary(`Attendance `) 

#quantile value
quantile(`Attendance `)

#First quantile
quantile(`Attendance `)[2]
#Third quantile
quantile(`Attendance `)[4]

#d. Interquartile Range.
IQR(`Attendance `)
IQR(Salary)
IQR(Years)

#3. Write a function to find the modes of a given set of values. Check the function by finding the mode of the variable “Years”.

get.modes <-function(y){
  counts<-table(y)
  names(counts)[counts==max(counts)]
}

get.modes(Years)

#4. Write a function that would produce the outliers when the values are given. Check the function with the 3 variables in the dataset.

get.outliers<-function(z){
  q1<-quantile(z)[2]
  q3<-quantile(z)[4]
  iqr<-q3-q1
  ub<-q3+1.5*iqr
  lb<-q1+1.5*iqr
  print(paste("Upper Bound " , ub))
  print(paste("Lower Bound " , lb))
  print("Outliers",paste(sort(z[z<lb|z>ub]),collapse = ","))
}

get.outliers(Years)
get.outliers(`Attendance `)
get.outliers(Salary)























