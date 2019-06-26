package eric.acosta;

import eric.acosta.dao.IDaoConexion;
import eric.acosta.dao.impl.HibernateDao;
import eric.acosta.dao.impl.JdbcDao;

public class DaoFactory {
	public DaoFactory() {}
	public IDaoConexion getDaoConexion(String daoType) {
		IDaoConexion daoConexion = null;
		if("jdbc".equalsIgnoreCase(daoType)) {
			daoConexion = new JdbcDao();
		}
		if("hibernate".equalsIgnoreCase(daoType)) {
			daoConexion = new HibernateDao();
		}
		return daoConexion;
	}

}
