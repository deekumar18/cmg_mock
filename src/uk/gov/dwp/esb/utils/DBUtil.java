package uk.gov.dwp.esb.utils;

import java.util.ResourceBundle;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class DBUtil {
	public static DB getMongoDatabase() {
		ResourceBundle resources = ResourceBundle.getBundle("config");
		Mongo mongo = new Mongo(resources.getString("db.host"), Integer.parseInt(resources.getString("db.port")));
		return mongo.getDB(resources.getString("db.name"));
	}
}
