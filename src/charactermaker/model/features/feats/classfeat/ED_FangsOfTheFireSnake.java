package charactermaker.model.features.feats.classfeat;

public class ED_FangsOfTheFireSnake extends ClassFeats{
	public ED_FangsOfTheFireSnake() {
		super("Elemental Disciplines: Fangs of the Fire Snake", "Monk", "Level 3, Way of the Four Elements");
		this.setDescription("When you use the Attack action on your turn, you can spend 1 ki point to cause tendrils of flame to stretch out from your fists and feel. Your reach with your unarmed strikes increases by \n" + 
				"10 feet for that action, as well as the rest of the turn.\n" + 
				"A hit with such an attack deals fire damage instead of bludgeoning damage, and if you spend I ki point when the attack hits, it also deals an extra 1d10 fire damage.");
	}
}
