package es.upm.dit.apsv.gatashop.dao;

import java.util.List;

import es.upm.dit.apsv.gatashop.model.Client;

public interface ClientDAO {

	public Client create (Client client) throws Exception;
	public Client read (String clientID) throws Exception;
	public Client update (Client client) throws Exception;
	public Client delete (Client client) throws Exception;

	public List<Client> readAll();
	public Client readByEmail(String email);
	public Client readByUser(String user);
}
