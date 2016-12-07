
public abstract class WaterType extends Pokemon {
	public WaterType(int l){
		super("water", l);
	}
	
	public void attack(Pokemon opponent){
		
		if (opponent.getType().equals("fire"))
			super.supereffective(opponent);
		
		if (opponent.getType().equals("grass"))
			super.notveryeffective(opponent);
		
		if (opponent.getType().equals("water") && this!=opponent)
			super.notveryeffective(opponent);
		super.attack(opponent);	
	}	
}
