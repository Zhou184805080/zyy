package dao;
import java.util.HashMap;
import entity.IEntity;;

public interface IDao {
	void insert(IEntity entity);
	void delete(IEntity entity);;
	void update(IEntity entity);
	public HashMap<String, IEntity> getAllEntities(); 
	public IEntity getEntity(String Id);
	void delete(IEntity entity, IEntity entity1);
	
	
}
	
