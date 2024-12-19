getwd()
setwd("C:\\Users\\Nirmal Chathura\\Desktop\\LAB 08")
getwd()
nicotine <-  read.table("Data - Lab 8.txt",header=TRUE)
fix(nicotine)

nicotine # verticaly display values

nicotine <-nicotine[[1]] #horizontal way save values
nicotine

attach(nicotine)

#1. Calculate population mean and variance of the dataset.
mean(nicotine)
var(nicotine)
sd(nicotine)


#2. Get 30 random samples of size 5, with replacement and calculate sample mean and sample variance for each sample.

s<-sample(nicotine,5)
s
sample<-c()
n<-c()

for (i in 1:30){
  s<-sample(nicotine,5)
  sample<-cbind(sample,s)
  n<-c(n,paste('S',i))
}

colnames(sample)<-n
sample



#3. Calculate mean and variance of the Sample Means.

#colMeans - mean of the sample

s.means<-colMeans(sample)
s.means

#variance sample

# use samples

s.vars<-apply(sample,2,var)
s.vars

#sample mean
mean(s.means)
var(s.means)


#4. Compare and state relationship (if any) Population Mean and the Mean of Sample Means.

mean(nicotine)
mean(s.means) #values are approximatly equal in above



#5. Compare and state relationship (if any) Population Variance and the Variance of Sample Means.

var(nicotine)
var(s.means)

#2 values are not equal - sample size is too small





















