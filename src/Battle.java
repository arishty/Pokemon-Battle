
class Battle {

	public static void main(String[] args) {
		Pokemon[] pokemonArr = {
				new Bulbasaur (5),
				new Charmander(5),
				new Squirtle (5)
			
		};
		
		for (int i = 0; i < pokemonArr.length; i++) {
            System.out.printf("The %s of level %d: ", pokemonArr[i].getName(), pokemonArr[i].getLevel());
        	pokemonArr[i].cry();
        }
		

        for(int k=1; k<=pokemonArr.length; k++){
        while(pokemonArr[k].fainted==false && pokemonArr[k+1].fainted==false){
        	for (int i = 0; i < pokemonArr.length; i++) {
        		if(pokemonArr[i].fainted==false){
        			System.out.printf("\nThe %s of level %d and of HP %d:\n", pokemonArr[i].getName(), pokemonArr[i].getLevel(), pokemonArr[i].getHP());
        		for (int j = 0; j < pokemonArr.length; j++) 
        			pokemonArr[i].attack(pokemonArr[j]);
        		
        		}

        	}
        	
        	
        }
        
        for (int i = 0; i < pokemonArr.length; i++) {
    		if(pokemonArr[i].fainted==false){
    			System.out.printf("\n%s won!", pokemonArr[i].getName());
    		}
        }
        }
        
        
	}
	
}
