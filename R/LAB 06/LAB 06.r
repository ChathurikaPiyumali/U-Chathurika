#setwd
setwd("C:\\Users\\Nirmal Chathura\\Desktop\\LAB 06")
#getwd
getwd()

#import the data set
data1<-read.table("Forest.txt",header = TRUE , sep = ",")
data1
fix(data1)
attach(data1)


#2 Get the summary of the data set 
str(data1)

#3) How many observations are there? 
#517 observation


#4) What is the maximum and minimum wind speed of this data set?
max(wind)
min(wind)

#5) Get five number summary of temperature 
summary(temp)

#6) How many outliers are there in the wind variable? 

boxplot(wind,horizontal = TRUE,outline = TRUE,pch=16)

#7) According to the boxplot of wind what kind of a distribution it has?
#negative distribution

#8) What is the median of temperature? 
median(temp)

#9) What is the mean and standard variation of wind variable? 
mean(wind)
sd(wind)
#10) What is the interquartile range of wind variable?
IQR(wind)
#11) How many observations have measured during Friday in August?
table(day,month)
table<-table(day,month)
freq
#21 observation

#12) What is the average temperature, during September?

mean(temp)
mean(temp[month=="sep"])

#13) On which day have they measured most observations during month of July?
count<-table(day[month=="jul"])
names(count[count==max(count)])








