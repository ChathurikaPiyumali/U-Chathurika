
#-------------------------------------------------------------------------------------------------
#Identify the variables and import the given data set into R

#change or set current working directory
setwd("C:\\Users\\Nirmal Chathura\\Desktop\\LAB 03")  #put double forwad slash
getwd()

#import the dataset - CSV File 
data <- read.csv("Copy of DATA 3.csv",header = TRUE)
data

#get data in the editor mode
fix(data)
#after make sure to close editor mode

#rename columns - use name function
names(data) <- c("Age","Gender","Accomodation")
fix(data)  
 
#rename cateogrycol data
data$Gender<-factor(data$Gender,c(1,2),c("Male" , "Female"))
fix(data)

#rename Accomodation data
data$Accomodation<-factor(data$Accomodation, c(1,2,3),c(" home"," student","Lodging"))
fix(data)


#attach command - add modification in to the important data set
#run twice attach command

attach(data)

#----------------------------------------------------------------------------------------------------



#2. Analyze the data in a single variable at a time (univariate analysis)
#frequency table
gender.freq<-table(Gender)
acc.freq<-table(Acccomodation)
gender.freq
acc.freq


#pie chart
pie(gender.freq,"Pie chart for the gender")
pie(acc.freq,"Pie chart for the accomodation")


#barplot
barplot(gender.freq,main = "Bar plot for Gender" , ylab = "Frequency")
abline(h=0)

barplot(acc.freq,main = "Bar plot for Accomodation" , ylab = "Frequency")
abline(h=0)


#boxplots
boxplot(Age,main="Boxplot for Age",ylab="Age",outpch=8)

#--------------------------------------------------------------------------------------



#3. Describe gender and accommodation together (bivariate analysis). 
#analysize 2 variables at a time

gender_acc.freq<-table(Gender,Accomodation)
gender_acc.freq


#stack bar chart
barplot(gender_acc.freq,main = "Gender & accomodation",legend=rownames(gender_acc.freq))
# start x axis 0
abline(h=0)


#clustered bar charts
barplot(gender_acc.freq,beside = TRUE,main = "Gender & accomodation",legend=rownames(gender_acc.freq))
abline(h=0)

#-------------------------------------------------------------------------------------------------------------

#4. Describe age with gender/accommodation. 
#side by side boxplot
boxplot(Age~Gender,main="Boxplot for Age by Gender",xlab = "Gender" , ylab= "Age")
boxplot(Age~Accomodation,main="Boxplot for Age by Accomodation",xlab = "Accomodation" , ylab= "Age")


#-----------------------------------------------------------------------------------------------------------

#5. Find the mean age for all the combinations of gender and accommodation. 


xtabs(Age~Gender+Accomodation)/gender_acc.freq






































 