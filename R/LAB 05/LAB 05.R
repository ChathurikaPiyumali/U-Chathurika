getwd()
setwd("C:\\Users\\Nirmal Chathura\\Desktop\\LAB 05")
data <- read.table("Data.txt" , header = TRUE , sep =",")
data
fix(data)

#rename header
names(data) <- c("x1" , "x2")
fix(data)

attach(data)


# 1) Draw a histogram for the above data.

hist(x2, main= "histogram for number of shareholders" )




# 2) Draw a histogram using seven classes where the lower limit is 130 and an upper limit of 270.
#lower limit = 130
#upper limit = 270
# no of classes = 7
# length = no.of classes + 1 = 7+1 = 8

#use breaks commands
#set limites : use sequence -> its set the lower and the upper limits 
# seq(lower limit , upper limit , length =  no of classes + 1 )


histogram <-hist(x2, main= "histogram for number of shareholders" ,  breaks = seq(130,270,length = 8),right = FALSE )






# 3) Construct the frequency distribution for the above specification.

 #1-step - Identify break points
  breaks <- round(histogram$breaks)
  breaks

  #2 step - identify frequency of each class
  freq<-histogram$count
  freq
  
  #3 - identify mid points of each class
  mid<-histogram$mids
  mid
  

  #create empty vector
  classes <- c()
  
  for(i in 1:length(breaks)-1){
    classes[i]<-paste0("[",breaks[i],",",breaks[i+1],"]")
  }
  
  cbind(Classes=classes,Frequency=freq)



# 4) Portray the distribution in the form of a frequency polygon.

#draw in the same plot
  lines(histogram$mids,freq)

#draw in new plot
  plot(mid,freq,type="l" ,main = "Frequency polygon for number of shareholders",xlab ="Shareholders",ylab ="Frequency",ylim =c(0,max(freq)))

  plot(mid,freq,type="o" ,main = "Frequency polygon for number of shareholders",xlab ="Shareholders",ylab ="Frequency",ylim =c(0,max(freq)))

  plot(mid,freq,type="p" ,main = "Frequency polygon for number of shareholders",xlab ="Shareholders",ylab ="Frequency",ylim =c(0,max(freq)))

  
  
# 5) Portray the distribution in a less-than cumulative frequency polygon.
#add previous frequency value each row 

cum.freq<-cusum(freq)
cum.freq

 new <-c()

for(i in 1: length(breaks)){
  if(i==1){
    new[i]=0
  }else{
    new[i]=cum.freq[i-1]
  }
}


 plot(mid,freq,type="o" ,main = "Frequency polygon for number of shareholders",xlab ="Shareholders",ylab ="Cumulative Frequency",ylim =c(0,max(freq)))

cbind(Upper =breaks,CumFreq=new)

# 6) Based on the polygon, three out of four (75%) of the companies have how many shareholders or less?























