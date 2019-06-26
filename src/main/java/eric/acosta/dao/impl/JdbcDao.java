package eric.acosta.dao.impl;

import eric.acosta.DatabaseInfo;
import eric.acosta.dao.IDaoConexion;

public class JdbcDao implements IDaoConexion {
	private DatabaseInfo databaseInfo;
	public String getConexion() {
		String info = "se conecto a JDbC";
		System.out.println(info);
		return info;
	}
	public void setDatabaseInfo(DatabaseInfo databaseInfo) {
		this.databaseInfo = databaseInfo;
	}
	
}
