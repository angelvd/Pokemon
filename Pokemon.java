
public class Pokemon {
	private String name;
	private Integer level;
	private Integer hp;
	private Integer exp;
	private Integer att;
	private Integer def;
	private Integer agl;
	private String type;
	
	public Pokemon(String name, Integer level, Integer hp, Integer exp, Integer att, Integer def, Integer agl,
			String type) {
		super();
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.exp = exp;
		this.att = att;
		this.def = def;
		this.agl = agl;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public Integer getAtt() {
		return att;
	}

	public void setAtt(Integer att) {
		this.att = att;
	}

	public Integer getDef() {
		return def;
	}

	public void setDef(Integer def) {
		this.def = def;
	}

	public Integer getAgl() {
		return agl; 
	}

	public void setAgl(Integer agl) {
		this.agl = agl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}