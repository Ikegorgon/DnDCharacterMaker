package charactermaker.model.features.feats.racialfeat;

public class AbyssalArcana extends RacialFeats{
	public AbyssalArcana() {
		super("Abyssal Arcana", "Abyssal Tiefling");
		this.setDescription("Each time you finish a long rest, you gain the ability to cast cantrips and spells randomly determined from a short list. At 1st level, you can cast a cantrip. When you reach 3rd level, you can also cast a 1st-level spell. At 5th level, you can cast a 2nd-level spell.\n" + 
				"\n" + 
				"You can cast a spell gained from this trait only once until you complete your next long rest. You can cast a cantrip gained from this trait at will, as normal. For 1st-level spells whose effect changes if cast using a spell slot of 2nd level or higher, you cast the spell as if using a 2nd-level slot. Spells of 2nd level are cast as if using a 2nd-level slot.\n" + 
				"\n" + 
				"At the end of each long rest, you lose the cantrips and spells previously granted by this feature, even if you did not cast them. You replace those cantrips and spells by rolling for new ones on the Abyssal Arcana Spells table. Roll separately for each cantrip and spell. If you roll the same spell or cantrip you gained at the end of your previous long rest, roll again until you get a different result.\n" + 
				"\n" + 
				"d6	1st Level	3rd Level	5th Level\n" + 
				"1	Dancing Lights	Burning Hands	Alter Self\n" + 
				"2	True Strike	Charm Person	Darkness\n" + 
				"3	Light	Magic Missile	Invisibility\n" + 
				"4	Message	Cure Wounds	Levitate\n" + 
				"5	Spare the Dying	Tasha's Hideous Laughter	Mirror Image\n" + 
				"6	Prestidigitation	Thunderwave	Spider Climb");
	}
}
