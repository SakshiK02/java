public class Split{  
	public static void main(String args[]){
		String myself="The Solar System consists of the Sun Moon and Planets. It also consists of comets, meteoroids and asteroids. The Sun is the largest member of the Solar System. In order of distance from the Sun, the planets are Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune and Pluto; the dwarf planet. The Sun is at the centre of the Solar System and the planets, asteroids, comets and meteoroids revolve around it.";
		String[] words=myself.split("\\s");  
		for(String spl:words){  
		System.out.println(spl);  
	}  
}}