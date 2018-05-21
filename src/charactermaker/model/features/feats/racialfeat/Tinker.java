package charactermaker.model.features.feats.racialfeat;

public class Tinker extends RacialFeats{
	public Tinker() {
		super("Tinker", "Rock Gnome");
		this.setDescription("You have proficiency with artisan's tools (tinker's tools). Using those tools, you can spend 1\n" + 
				"hour and 10 gp worth of materials to construct a Tiny c1ockwork device (AC 5, 1 hp). The device ceases\n" + 
				"to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when\n" + 
				"you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time. \n" + 
				"When you create a device, choose one of the following options: \n" + 
				"Clockwork Toy. This toy is a c1ockwork animal, monster, or person, such as a frog, mouse, bird, dragon, or soldier. When placed on the ground, the toy moves\n" + 
				"5 feet across the ground on each of your turns in a random direction. It makes noises as appropriate to the creature it represents.\n" + 
				"\n" + 
				"Fire Starter. The device produces a miniature flame, which you can use to light a candle, torch, or campfire. Using the device requires your action. \n" + 
				"Music Sox. When opened, this music box plays a single song at a moderate volume. The box stops playing when it\n" + 
				"reaches the song's end or when it is c1osed.");
	}
}
