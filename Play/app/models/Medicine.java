package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Medicine extends Model{
	protected int _id;
	public String _name;
	public String _description;
	public String _price;
	public String _datedue;
	public Prescription _unnamed_Prescription_;
	public Admission _unnamed_Admission_;
	public Physician _unnamed_Physician_;

	public void add() {
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}
}