package eric.acosta.dao.impl;

import eric.acosta.dao.IDaoConexion;

public class HibernateDao implements IDaoConexion{
	public String getConexion() {
		String info = "se conecto a Hibernate";
		System.out.println(info);
		return info;
	}

}
