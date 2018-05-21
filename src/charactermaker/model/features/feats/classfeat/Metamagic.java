package charactermaker.model.features.feats.classfeat;

public class Metamagic extends ClassFeats{
	public Metamagic() {
		super("Metamagic", "Sorcerer", "Level 3 (+1 Level 10, +1 Level 17)");
		this.setDescription("At 3rd level, you gain the ability to twist your spells to suit your needs. You gain two of the following Metamagic options of your choice. You gain another one at 10th and 17th level.\n" + 
				"\n" + 
				"You can use only one Metamagic option on a spell when you cast it, unless otherwise noted.\n" + 
				"\n" + 
				"Careful Spell\n" + 
				"When you cast a spell that forces other creatures to make a saving throw, you can protect some of those creatures from the spell's full force. To do so, you spend 1 sorcery point and choose a number of those creatures up to your Charisma modifier (minimum of one creature). A chosen creature automatically succeeds on its saving throw against the spell.\n" + 
				"\n" + 
				"Distant Spell\n" + 
				"When you cast a spell that has a range of 5 feet or greater, you can spend 1 sorcery point to double the range of the spell.\n" + 
				"\n" + 
				"When you cast a spell that has a range of touch, you can spend 1 sorcery point to make the range of the spell 30 feet.\n" + 
				"\n" + 
				"Empowered Spell\n" + 
				"When you roll damage for a spell, you can spend 1 sorcery point to reroll a number of the damage dice up to your Charisma modifier (minimum of one). You must use the new rolls.\n" + 
				"\n" + 
				"You can use Empowered Spell even if you have already used a different Metamagic option during the casting of the spell.\n" + 
				"\n" + 
				"Extended Spell\n" + 
				"When you cast a spell that has a duration of 1 minute or longer, you can spend 1 sorcery point to double its duration, to a maximum duration of 24 hours.\n" + 
				"\n" + 
				"Heightened Spell\n" + 
				"When you cast a spell that forces a creature to make a saving throw to resist its effects, you can spend 3 sorcery points to give one target of the spell disadvantage on its first saving throw made against the spell.\n" + 
				"\n" + 
				"Quickened Spell\n" + 
				"When you cast a spell that has a casting time of 1 action, you can spend 2 sorcery points to change the casting time to 1 bonus action for this casting.\n" + 
				"\n" + 
				"Subtle Spell\n" + 
				"When you cast a spell, you can spend 1 sorcery point to cast it without any somatic or verbal components.\n" + 
				"\n" + 
				"Twinned Spell\n" + 
				"When you cast a spell that targets only one creature and doesn't have a range of self, you can spend a number of sorcery points equal to the spell's level to target a second creature in range with the same spell (1 sorcery point if the spell is a cantrip).\n" + 
				"\n" + 
				"To be eligible, a spell must be incapable of targeting more than one creature at the spell's current level. For example, magic missile and scorching ray aren't eligible, but ray of frost is.");
	}
}
