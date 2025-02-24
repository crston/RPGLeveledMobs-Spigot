package iomatix.spigot.rpgleveledmobs.tools;

public enum Language {

	ENGLISH("English"), POLISH("Polish");
	// JAPANESE("Japanese");

	String lang;

	private Language(final String name) {
		this.lang = name;
	}

	@Override
	public String toString() {
		return this.lang;
	}

	public String getName() {
		return this.lang;
	}
}
