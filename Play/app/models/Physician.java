package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Physician extends Admin {
	public String _license;
	public Medicine _unnamed_Medicine_;
	public Transaction _unnamed_Transaction_;
	public Patient _unnamed_Patient_;

	public void add() {
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}
}