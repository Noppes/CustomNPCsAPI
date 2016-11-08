package noppes.npcs.api.entity.data.role;

import noppes.npcs.api.entity.data.INPCRole;

public interface IRoleTransporter extends INPCRole {
	
	public ITransportLocation getLocation();

	public static interface ITransportLocation{

		public int getId();

		public int getDimension();

		public int getX();

		public int getY();

		public int getZ();

		public String getName();

		/**
		 * Returns the unlock type
		 * @return 0:discover, 1:from start, 2:from start
		 */
		public int getType();
		
	}
}
