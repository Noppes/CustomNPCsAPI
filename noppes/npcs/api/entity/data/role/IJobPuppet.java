package noppes.npcs.api.entity.data.role;

import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.data.INPCJob;
import noppes.npcs.api.entity.data.role.IJobPuppet.IJobPuppetPart;
import noppes.npcs.api.event.NpcEvent;

public interface IJobPuppet extends INPCJob{

	/**
	 * @param part 0:head, 1:left arm, 2:right arm, 3:body, 4:left leg, 5:right leg
	 * @return returns the part
	 */
	public IJobPuppetPart getPart(int part);

	public static interface IJobPuppetPart{
		public int getRotationX();
		public int getRotationY();
		public int getRotationZ();
		
		public void setRotation(int x, int y, int z);
	}
}
