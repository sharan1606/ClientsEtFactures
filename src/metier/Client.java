package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
    private String nom;
    private List<Facture> factures= new ArrayList<>();
    /** 
     * Crée un client.
     * @param nom le nom du client. 
     */

    public Client(String nom)
    {
        this.nom = nom; 
    }

    /**
     * Retourne le nom du client.
     * @return le nom du client.
     */

    public String getNom()
    {
        return nom;
    }

    /**
     * Modifie le nom du client.
     * @param nom le nom du client.
     */

    public void setNom(String nom)
    {
        this.nom= nom;
    }

    /**
     * Créé une facture.
     * @param montant Le montant de la facture.
     * @return la facture créée.
     */

    public Facture createFacture(int montant)
    {
        Facture facture = new Facture(montant,this);
        factures.add(facture);
        return facture;
    }

    /**
     * Retourne une copie de la liste des factures du client. 
     * @return une copie de la liste des factures du client.
     */

    public List<Facture> getFactures()
    {
    	return new ArrayList<Facture>(factures);
    }
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int sum = 0;
		for(int i =0; i < factures.size(); i++)
		{
			sum = sum + factures.get(i).getMontant();
		}
		return sum;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		return null ;
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.a
	 */

	public List<Facture> facturesReglees()
	{
		return null;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return null;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
	}
}
