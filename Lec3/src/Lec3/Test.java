package Lec3;

class Test{
	
	int a,b;
	
	
	Test(int i, int j)
	{
		a = i;
		b = j;
		
	}
	
	boolean equalTo(Test o) {
		
		if(o.a == a && o.b == b) 
			return true;
			else
				return false;
		}
	
	//*******************************************returning an Object ***************************************
	class Test2{
	int c  ; 
	Test2 (int k)
	{
		c = k;
	}
	
	Test2 incrByTen()
	{
		Test2 temp = new Test2(c + 10);
		return temp;
	}
	
	}
	
}









