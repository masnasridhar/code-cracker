interface Left
{
int m1();
}
interface Right
{
	void m1();
}
/*class test implements Left, Right
{
//normally if we have same methods then it says duplicate method.should overload by changing number of ,type of arguments
	//it is neither overloading nor overriding -- duplicate method
	public void m1() {
		
	}
	public int m1() {
		return 0;
		
	}
}*/