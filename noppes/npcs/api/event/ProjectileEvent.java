package noppes.npcs.api.event;

import noppes.npcs.api.entity.IEntityProjectile;

public class ProjectileEvent extends CustomNPCsEvent {
	public IEntityProjectile projectile;

	public ProjectileEvent(IEntityProjectile projectile) {
		this.projectile = projectile;
	}

	/**
	 * projectileTick
	 */
	public static class UpdateEvent extends ProjectileEvent {
		public UpdateEvent(IEntityProjectile projectile) {
			super(projectile);
		}
	}

	/**
	 * projectileImpact
	 */
	public static class ImpactEvent extends ProjectileEvent {
		/**
		 * 0:entity, 1:block
		 */
		public final int type;
		public final Object target;

		public ImpactEvent(IEntityProjectile projectile, int type, Object target) {
			super(projectile);
			this.type = type;
			this.target = target;
		}
	}
}
