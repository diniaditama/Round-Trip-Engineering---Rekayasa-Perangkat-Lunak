package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Prescription extends Model{
	protected int _id;
	public String _name;
	public String _detail;
	public String _date;
	public Medicine _unnamed_Medicine_;
	public Admission _unnamed_Admission_;

	public void add() {
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}
}