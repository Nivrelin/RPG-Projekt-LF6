package le_RPG.chars;

public class Mage {

	String mag_name;
	int mag_strength;
	int mag_defense;
	int mag_intelligence;
	int mag_mres;
	int mag_agility;
	int mag_level;

	int mag_hp = mag_mres / 2;
	int mag_mp = mag_intelligence * 2;

	int mag_helm;
	int mag_brust;
	int mag_schultern;
	int mag_beine;
	int mag_arme;
	int mag_fuesse;
	int mag_waffe1;
	int mag_waffe2;

	int mag_strength_lvlup = 1;
	int mag_defense_lvlup = 1;
	int mag_intelligence_lvlup = 5;
	int mag_mres_lvlup = 3;
	int mag_agility_lvlup = 2;
}
