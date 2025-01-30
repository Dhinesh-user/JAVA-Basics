package Javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Player{
	private int jerseyno;
	private String nickname;
//	int jerseyno;
//	String nickname;
	
	public Player(int jerseyno, String nickname) {
		this.jerseyno = jerseyno;
		this.nickname = nickname;
	}
	public Player(String nickname) {
	this.nickname = nickname;
}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getNickname() {
		return nickname;
	}	

	
}
public class ConstructorRefEx {

	public static void main(String[] args) {
//		One type of Declaration
//		List<Player> players = new ArrayList<Player>(){{
//		add(new Player(18,"KingKohli"));
//		add(new Player (45,"HitMan"));
//		add(new Player(07,"Captain Cool"));}}
		
//      another type of declaration
//		List<Player> players = new ArrayList<Player>();
//			players.add(new Player(18,"KingKohli"));
//			players.add(new Player(45,"HitMan"));
//			players.add(new Player(07,"Captain Cool"));
//		for(Player p:players)
//		System.out.println(p.getJerseyno()+","+p.getNickname());
		
		
		List<String> players = Arrays.asList("KingKholi","HitMan","Thala");
		List<Player> cricplayers = new ArrayList<Player>();
		
//		 cricplayers =players.stream()
//				 .map(name-> new Player(name)) 
//				 .toList();
		
		 cricplayers =players.stream()
				 .map(Player::new) // .map(Player::new) -- Constructor Reference
				 .toList();
		 
		 for(Player name:cricplayers)
		 System.out.println(name.getNickname());
	}

}
