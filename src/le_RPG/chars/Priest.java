package le_RPG.chars;

public class Priest {

	String pri_name;
	int pri_strength;
	int pri_defense;
	int pri_intelligence;
	int pri_mres;
	int pri_agility;
	int pri_level;
	
	int pri_hp = pri_defense + pri_strength / 2;
	int pri_mp = pri_intelligence * 2;
	
	int pri_helm;
	int pri_brust;
	int pri_schultern;
	int pri_beine;
	int pri_arme;
	int pri_fuesse;
	int pri_waffe1;
	int pri_waffe2;
	
	int pri_strength_lvlup = 1;
	int pri_defense_lvlup = 2;
	int pri_intelligence_lvlup = 4;
	int pri_mres_lvlup = 3;
	int pri_agility_lvlup = 2;
}
