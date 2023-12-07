package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Patient extends Admin {
	public String _category;
	public Transaction _unnamed_Transaction_;
	public Physician _unnamed_Physician_;

	protected void enableUser() {
		throw new UnsupportedOperationException();
	}

	protected void disableUser() {
		throw new UnsupportedOperationException();
	}
}