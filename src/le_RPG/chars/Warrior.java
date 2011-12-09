package le_RPG.chars;

public class Warrior {

	String war_name;
	int war_strength;
	int war_defense;
	int war_intelligence;
	int war_agility;
	int war_magicres;
	int war_level;
	
	int war_hp = war_strength / 2;
	int war_mp = (war_strength + war_intelligence) / 4;
	
	int war_helm;
	int war_brust;
	int war_schultern;
	int war_beine;
	int war_arme;
	int war_fuesse;
	int war_waffe1;
	int war_waffe2;
	
	int war_strength_lvlup = 5;
	int war_defense_lvlup = 4;
	int war_intelligence_lvlup = 1;
	int war_agility_lvlup = 2; 
	int war_magicres_lvlup = 1;
	
}
