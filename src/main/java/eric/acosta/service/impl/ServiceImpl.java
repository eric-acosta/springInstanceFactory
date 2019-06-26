package eric.acosta.service.impl;

import eric.acosta.dao.IDaoConexion;
import eric.acosta.service.IService;

public class ServiceImpl implements IService {

private IDaoConexion daoConexion;
	
	public void setDaoConexion(IDaoConexion daoConexion) {
		this.daoConexion=daoConexion;
	}

	public void execute() {
		System.out.println("Ejecuta servicio");
		daoConexion.getConexion();
		
	}

}
