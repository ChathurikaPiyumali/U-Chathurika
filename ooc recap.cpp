class Student
{
    private :
        int studentNo;
        int marks1;
        int marks2;
        int marks3;
        
    public :
        void setStudentNo(int n);
        void assignMarks(int mrk1,mrk2,mrk3);
        float calcAvg();
}


//impleentation
void Student::setStudentNo(int n){
    studentNo = n;
    
}

void Student::assignMarks(int mrk1,mrk2,mrk3){
    marks1 =mrk1
    marks2=mrk2
    marks3=mrk3
}

float Student::calcAvg(){
    float average = (marks1+ marks2+marks3) / 3.0;
    return average;
}


//accessing public methods

//creating objects
Student s1,s2;

//set values to the objects

s1.setStudentNo(22555144);
s1.assignMarks(80,90,100);

s2.setStudentNo(22555145);
s2.assignMarks(80,90,100);

//get output

System.out.println("Student1 average : "+ s1.calcAvg);
System.out.println("Student1 average : "+ s2.calcAvg);

return0;

//*******************************************Activity 3 ooc lec 6***********************************************

class Date{
    private:
        int day;
        int month;
        int year;
        
    public:
        void setDay(int d);
        void setMonth(int m);
        void setYear(int y);
        int getDay();
        int getMonth();
        int getYear();
        
}

//implementation

void Date::setDay(int d){
    day = d;
    
    
}
void Date::setMonth(int m){
    month = m;
    
}

void Date::setYear(int y){
    year=y;
    
}


int Date::getDay(){
    return  day;
    
}
int Date::getMonth(){
    return month;
    
}
int Date::getYear(){
    return year;
}

//client program
//create objects

Date dte1;

int d_day,d_month,d_year;

//inputs value 





//set values to the objects 
dte1.setDay(15);
dte1.setMonth(9);
dte1.setYear(2001);


//get outputs




//**************************************************************************************************

//constructorss : doesnt return value , no return type (not even void)  ** when object declared appropriate constructor is executed. 
//default constructor : initialized attributes
//overloaded constructor : assign values



//*****************ooc lec 7 exercise 1 **********************************

class Rectangle{
    private:
        int length;
        int width;
        
    public:
        
        //default constructor
        Rectangle();
        //overloaded constructor 
        Rectangle(int l, int w);
        
        void setWidth(int width);
        int getWidth();
        void setLength(int length);
        int getLength();
        float calcArea(float Area);
        
        //destructor   : create clss and implement only
        
        ~Rectangle();
        
        
};

//implementation 

//default constructor
Rectangle::Rectangle(){
    length = 0;
    width = 0;
}

//overloaded constructor
Rectangle::Rectangle(intl , int w){
    length = l;
    width= w;
}

void Rectangle::setWidth(int width){
    width = width;
    
}

int getWidth(){
    return width;
    
}

void Rectangle::setLength(int length){
    length = length;
    
}

int Rectangle::getLength(){
    return length;
    
}

float Rectangle::calcArea(float Area){
    float Area = width * length;
    return Area;
    
}

//destructor
Rectangle::~Rectangle(){
    desructor run;
    
}


//main methods

//create objects

Rectangle r1;   // using default constructor
//static objects
r1.setLength(5);
r1.setWidth(44);


Rectangle r2(10 ,50);   // using overloaded constructor

**************************************
//dyanamic objects

Rectangle *r;

r = new Rectangle();










































