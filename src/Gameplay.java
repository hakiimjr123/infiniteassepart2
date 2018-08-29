import java.util.Scanner;

public class Gameplay {
	
	public void running(){
	
	
	Player p1 = new Player(8, 8);
	Treasure t1 = new Treasure(0,0);
	
	int x = p1.getX_axis();
	int y = p1.getY_axis();
	
	
	
	while ( x!=0 && y!=0) {	
		
		if(x> 14 || y>14) {
			System.out.println("YOU LOSER START OVER!!!");
			break;
		}
		Scanner compass = new Scanner(System.in); 
		System.out.println("Where would you like to go?");
		String direction = compass.nextLine(); 
		
		if( direction.equals("north")) {
			x=x+1;
			y=y;
			System.out.println("you are getting further, you at position " + x + "," + y);
			
		}
		else if (direction.equals("east")) {
			y=y+1;
			x=x;
			System.out.println("you are getting further, you are at position " + x + "," + y);
		}
		else if (direction.equals("south")) {
			x=x-1;
			y=y;
			System.out.println("you are close, keep looking!!! you are at  at position " + x + "," + y);
		}
		else if (direction.equals("west")) {
			y=y-1;
			x=x;
			System.out.println("you are close, keep looking!!! you are  at position " + x + "," + y);
		}
		else{
			System.out.println("incorrect direction");
		}
		
	}
	if(x==0 & y==0) {
		System.out.println("YOU HAVE FOUND THE TREASURE AT" + x + "," + y + "HOPE YOU ENJOYED MY WASTE OF YOUR TIME :D");
	}
	
	
	

}
}