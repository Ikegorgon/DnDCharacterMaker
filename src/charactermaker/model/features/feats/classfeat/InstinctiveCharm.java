package charactermaker.model.features.feats.classfeat;

public class InstinctiveCharm extends ClassFeats{
	public InstinctiveCharm() {
		super("Instinctive Charm", "Wizard", "Level 6, School of Enchantment");
		this.setDescription("Beginning at 6th level, when a creature you can see within 10 metres of you makes an attack roll against you, you can use your reaction to divert the attack, provided that another creature is within the attack’s range. The attacker must make a Wisdom saving throw against your wizard spell save DC. On a failed save, the attacker must target the creature that is closest to it, not including you or itself. If multiple creatures are closest, the attacker chooses which one to target. On a successful save, you can't use this feature on the attacker again until you finish a long rest.\n" + 
				"\n" + 
				"You must choose to use this feature before knowing whether the attack hits or misses. Creatures that can't be charmed are immune to this effect.");
	}
}
