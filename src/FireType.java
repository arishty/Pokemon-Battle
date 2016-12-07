
public abstract class FireType extends Pokemon {
	
	public FireType(int l){
		super("fire", l);
		
	}
	
	
	public void attack(Pokemon opponent){
		
		if (opponent.getType().equals("grass"))
			super.supereffective(opponent);
		
		if (opponent.getType().equals("water"))
			super.notveryeffective(opponent);
		
		if (opponent.getType().equals("fire") && this!=opponent)
			super.notveryeffective(opponent);
		super.attack(opponent);	
			
	}
}
