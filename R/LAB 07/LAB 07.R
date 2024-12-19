# i. What is the distribution of X?  - binomial

X ~ Bin(44 , 0.92)


# ii. What is the probability that 40 children are cured?
#40 is direct number (whole no)- so use the density binomial - so use dbinom - 
#dbinom(expected amount , full amount ,cured amoun as presentage)


dbinom(40,44,0.92)
?dbinom



#iii. What is the probability that less than or equal to 35 children are cured?
#less than or equal to 35 - use the pbinom
pbinom(35,44,0.92)


#iv. What is the probability that at least 38 children are cured?
#at least->  (P >38)

1 - pbinom(37 , 44, 0.92)


#v. What is the probability that between 40 and 42 (both inclusive) children are cured? 
pbinom(42,44,0.92) - pbinom(39,44,0.92)

#************************************************************************************************************


#What is the probability that 6 babies will be born in this hospital tomorrow?

dpois(6,4.5)
?dpois


#What about the probability of more than 6 babies being born?
ppois(6,4.5,lower.tail = FALSE)


#*************************************************************************************************************
#Find the probability that a repair time takes at most 3 hours.
#dealing with time

pexp(3,rate=1/2)
?pexp


# Find the probability that a repair time exceeds 4 hours.
pexp(4,rate = 1/2 , lower.tail = FALSE) #more than 4





# Find the probability that a repair time takes between 2 to 4 hours

pexp(4, rate = 1/2) - pexp(2,rate=1/2)


#*********************************************************************************************************************
#*4) Assume that human body temperatures are normally distributed with a mean of 36.8 𝐶  0 and a standard deviation of 0.4 𝐶 0

#i. A hospital uses 37.9 𝐶0 as the lowest temperature considered to be a fever. What is theprobability that randomly selected person would have a fever?

1-pnorm(37.9,36.8,0.4)
?pnorm


# ii. What is the probability that a random selected person would have a temperature between 36.4𝐶0and 36.9 𝐶0?
pnorm(36.9,36.8,0.4) - pnorm(36.4,36.8,0.4)




# iii. Physicians want to select a maximum temperature for requiring further medical tests. What should that temperature be, if want only 1.2% of the people to fall below it?
#qnorm = quntile normal distribution - dealing with presenatge value

qnorm(0.012,36.8,0.4)
?qnorm



#  iv. Physicians want to select a minimum temperature for requiring further medical tests. What should that temperature be, if want only 1.0% of the people to fall above it?
  
#1 is infinite value give so use 0.99
qnorm(0.99,36.8,0.4)






































































































