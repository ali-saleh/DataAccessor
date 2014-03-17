package db.billingdb.model.custom;

public class BaseCondition implements Cloneable{
	
	private int entityId = 1;

	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
}
