package charactermaker.model.backgrounds;

import charactermaker.model.features.feats.backgroundfeat.*;
import java.util.*;

public class Acolyte extends Backgrounds {
	private List<BackgroundFeats> feats;
	private List<String> proficiency;
	public Acolyte() {
		super("Acolyte");
		this.setDescription("You have spent your life in the service of a temple to a specific god or pantheon of gods. You act as an intermediary between the realm of the holy and the mortal world, performing sacred rites and offering sacrifices in order to conduct worshipers into the presence of the divine. You are not necessarily a cleric—performing sacred rites is not the same thing as channeling divine power.\n" + 
				"\n" + 
				"Choose a god, a pantheon of gods, or some other quasi-divine being, and work with your DM to detail the nature of your religious service. The Gods of the Multiverse section contains a sample pantheon, from the Forgotten Realms setting. Were you a lesser functionary in a temple, raised from childhood to assist the priests in the sacred rites? Or were you a high priest who suddenly experienced a call to serve your god in a different way? Perhaps you were the leader of a small cult outside of any established temple structure, or even an occult group that served a fiendish master that you now deny.");
		this.setTrait(setTrait());
		this.setIdeal(setIdeal());
		this.setBond(setBond());
		this.setFlaw(setFlaw());
		this.setBook("PHB");
		feats = new ArrayList<BackgroundFeats>();
		feats.add(new ShelterOfTheFaithful());
		proficiency = new ArrayList<String>();
		proficiency.add("Insight");
		proficiency.add("Religion");
		proficiency.add("(Bonus Language)");
		proficiency.add("(Bonus Language)");
		this.setFeats(feats);
		this.setProficiency(proficiency);
	}
	private String setTrait() {
		String trait = "";
		Random rand = new Random();
		List<String> traits = new ArrayList<String>();
		traits.add("I idolize a particular hero of my faith, and constantly refer to that person’s deeds and example.");
		traits.add("I can find common ground between the fiercest enemies, empathizing with them and always working toward peace.");
		traits.add("I see omens in every event and action. The gods try to speak to us, we just need to listen.");
		traits.add("Nothing can shake my optimistic attitude.");
		traits.add("I quote (or misquote) sacred texts and proverbs in almost every situation.");
		traits.add("I am tolerant (or intolerant) of other faiths and respect (or condemn) the worship of other gods.");
		traits.add("I’ve enjoyed fine food, drink, and high society among my temple’s elite. Rough living grates on me.");
		traits.add("I’ve spent so long in the temple that I have little practical experience dealing with people in the outside world.");
		int num = rand.nextInt(traits.size());
		System.out.println(num);
		trait = traits.get(num);
		return trait;
	}
	private String setIdeal() {
		String ideal = "";
		Random rand = new Random();
		List<String> ideals = new ArrayList<String>();
		ideals.add("Tradition. The ancient traditions of worship and sacrifice must be preserved and upheld. (Lawful)");
		ideals.add("Charity. I always try to help those in need, no matter what the personal cost. (Good)");
		ideals.add("Change. We must help bring about the changes the gods are constantly working in the world. (Chaotic)");
		ideals.add("Power. I hope to one day rise to the top of my faith’s religious hierarchy. (Lawful)");
		ideals.add("Faith. I trust that my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)");
		ideals.add("Aspiration. I seek to prove myself worthy of my god’s favor by matching my actions against his or her teachings. (Any)");
		int num = rand.nextInt(ideals.size());
		System.out.println(num);
		ideal = ideals.get(num);
		return ideal;
	}
	private String setBond() {
		String bond = "";
		Random rand = new Random();
		List<String> bonds = new ArrayList<String>();
		bonds.add("I would die to recover an ancient relic of my faith that was lost long ago.");
		bonds.add("I will someday get revenge on the corrupt temple hierarchy who branded me a heretic.");
		bonds.add("I owe my life to the priest who took me in when my parents died.");
		bonds.add("Everything I do is for the common people.");
		bonds.add("I will do anything to protect the temple where I served.");
		bonds.add("I seek to preserve a sacred text that my enemies consider heretical and seek to destroy.");
		int num = rand.nextInt(bonds.size());
		System.out.println(num);
		bond = bonds.get(num);
		return bond;
	}
	private String setFlaw() {
		String flaw = "";
		Random rand = new Random();
		List<String> flaws = new ArrayList<String>();
		flaws.add("I judge others harshly, and myself even more severely.");
		flaws.add("I put too much trust in those who wield power within my temple’s hierarchy.");
		flaws.add("My piety sometimes leads me to blindly trust those that profess faith in my god.");
		flaws.add("I am inflexible in my thinking.");
		flaws.add("I am suspicious of strangers and expect the worst of them.");
		flaws.add("Once I pick a goal, I become obsessed with it to the detriment of everything else in my life.");
		int num = rand.nextInt(flaws.size());
		System.out.println(num);
		flaw = flaws.get(num);
		return flaw;
	}
}
