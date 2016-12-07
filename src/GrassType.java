
public abstract class GrassType extends Pokemon {
	
	public GrassType(int l ){
		super("grass", l);
	}
	
	public void attack(Pokemon opponent){
		
		if (opponent.getType().equals("water"))
			super.supereffective(opponent);
		
		if (opponent.getType().equals("fire"))
			super.notveryeffective(opponent);
		
		if (opponent.getType().equals("grass") && this!=opponent)
			super.notveryeffective(opponent);
		super.attack(opponent);	
	}
}
