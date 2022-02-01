/* 
Zachery Allen
CIS221 
T & Th 2:10pm 
*/

//Create Second Class
class Second{
	public static void main(String[] args){
		//Create obj from class Main as myObj
		Main myObj = new Main();
		//Change the values of myObj.x & .y
		myObj.x = 27;
		myObj.y = 66;
		//Create int z and add myObj.x & .y, printing z
		int z = myObj.x + myObj.y;
		System.out.println(z);	
	}
}