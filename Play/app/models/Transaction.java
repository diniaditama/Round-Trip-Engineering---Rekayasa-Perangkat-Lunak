package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Transaction extends Model{
	protected int _id;
	public String _details;
	public String _date;
	public Physician _unnamed_Physician_;
	public Patient _unnamed_Patient_;

	public void update() {
		throw new UnsupportedOperationException();
	}
}