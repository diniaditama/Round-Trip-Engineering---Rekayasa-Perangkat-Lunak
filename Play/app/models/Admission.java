package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Admission extends Model{
	protected int _id;
	public String _date;
	public String _patient_name;
	public String _findings;
	public Prescription _unnamed_Prescription_;
	public Medicine _unnamed_Medicine_;

	public void update() {
		throw new UnsupportedOperationException();
	}
}