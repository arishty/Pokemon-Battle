
public abstract class Pokemon {
	protected String type;
	protected int level; 
	protected int HP;
	protected Boolean fainted=false;
	
	public Pokemon(String t,int l){
		this.type=t;
		this.level=l;
		setHP(level);
	}
	
	
	public int getLevel(){
		return this.level;
	}
	public String getType(){
		return type;
	}
	public int getHP(){
		return HP;
	}
	public void setHP(int l){
		HP=l*2;
	}
	public abstract void cry();
	
	public void attack(Pokemon opponent){
		
		if(this==opponent) {
			this.HP-=2;
			System.out.printf("%s is confused! It hurt itself in its confusion!\n", this.getName());
			
		}
		if(opponent.HP<=0){
			opponent.fainted=true;
			System.out.printf("%s fainted!\n", opponent.getName());
		}
	}
	
	public void supereffective(Pokemon opponent){
		opponent.HP-=3;
		System.out.printf("%s attacked %s and it was super effective!\n", this.getName(), opponent.getName());
	}
	public void notveryeffective(Pokemon opponent){
		opponent.HP-=1;
		System.out.printf("%s attacked %s but it was not very effective.\n", this.getName(), opponent.getName());
	}
	public String getName()
    {
       
        java.lang.Class cls = this.getClass();
        String className = cls.getName();
        String[] segments = className.split("\\.");
        String name = segments[segments.length - 1];
     
        return name;
    }
	
}
