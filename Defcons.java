class Sample{
		int id;
		float n;
		String s;
		char ch;
		//char c='u0000';
		void display(){
		System.out.println(id+" "+n+" "+s);
		//System.out.println(ch);
		//System.out.println(ch==c);
		}
}
class DefCons{
	public static void main(String args[]){
		Sample a=new Sample();
		a.display();
	}
}