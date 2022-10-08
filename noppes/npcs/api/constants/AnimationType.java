package noppes.npcs.api.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Animation Types
 */
public class AnimationType {
	public static final int NONE = 0;
	public static final int SIT = 1;
	public static final int SLEEP = 2;
	public static final int HUG = 3;
	public static final int CROUCH = 4;
	public static final int DANCE = 5;
	public static final int AIM = 6;
	public static final int CRAWL = 7;
	public static final int POINT = 8;
	public static final int CRY = 9;
	public static final int WAVE = 10;
	public static final int BOW = 11;
	public static final int NO = 12;
	public static final int YES = 13;
	public static final int DEATH = 14;
	public static final int WALK = 15;
	public static final int IDLE = 16;
	public static final int FLY = 17;
	public static final int FLY_IDLE = 18;
	public static final int STATIC = 19;
	public static final int SWIM = 20;
	public static final int WAG = 21;

	public static Map<String, Integer> ALL = new HashMap<>();

	static {
		ALL.put("NONE", NONE);
		ALL.put("SIT", SIT);
		ALL.put("SLEEP", SLEEP);
		ALL.put("HUG", HUG);
		ALL.put("CROUCH", CROUCH);
		ALL.put("DANCE", DANCE);
		ALL.put("AIM", AIM);
		ALL.put("CRAWL", CRAWL);
		ALL.put("POINT", POINT);
		ALL.put("CRY", CRY);
		ALL.put("WAVE", WAVE);
		ALL.put("BOW", BOW);
		ALL.put("NO", NO);
		ALL.put("YES", YES);
		ALL.put("DEATH", DEATH);
		ALL.put("WALK", WALK);
		ALL.put("IDLE", IDLE);
		ALL.put("FLY", FLY);
		ALL.put("FLY_IDLE", FLY_IDLE);
		ALL.put("STATIC", STATIC);
		ALL.put("SWIM", SWIM);
		ALL.put("WAG", WAG);
	}

	public static int valueOf(String name) {
		if(ALL.containsKey(name.toUpperCase())){
			return ALL.get(name.toUpperCase());
		}
		return NONE;
	}

	public static String nameOf(int animation) {
		for(Map.Entry<String, Integer> en : ALL.entrySet()){
			if(en.getValue() == animation){
				return en.getKey();
			}
		}
		return null;
	}
}
