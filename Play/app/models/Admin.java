package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Admin extends Model {
	protected int _id;
	public String _name;
	public String _age;
	private String _username;
	private String _password;

	public void create() {
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}
}