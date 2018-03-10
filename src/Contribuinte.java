
/**
 * Classe para armazenar informações sobre um contribuinte.
 * A classe guarda o NIF, o nome, e-mail, morada e palavra-passe.
 * 
 * @author Daniel Costa
 * @version 25/02/2018
 */
public abstract class Contribuinte
{
    protected int nif;
    protected String nome;
    protected String email;
    protected String morada;
    protected String password; //Isto é muito seguro
    
    /**
     * Construtor para objetos da classe Contribuinte
     */
    public Contribuinte()
    {
        this.nif = 0;
        this.nome = "";
        this.email = "";
        this.morada = "";
        this.password = "";
    }
    
    /**
     * Construtor para objetos da classe Contribuinte recebendo parametros
     * 
     * @param  nif    Número de Identificação Fiscal do contribuinte
     * @param  nome     Nome do contribuinte
     * @param  email    E-mail de contacto do contribuinte
     * @param  morada   Morada do contribuinte
     * @param  password Palavra-passe de acesso do contribuinte
     */
    public Contribuinte(int nif, String nome, String email, String morada, String password)
    {
        this.nif = nif;
        this.nome = nome;
        this.email = email;
        this.morada = morada;
        this.password = password;
    }

    /**
     * Altera o NIF do contribuinte
     * @param  nif    Número de Identificação Fiscal do contribuinte
     */
    public void setnif(int nif)
    {
        this.nif = nif;
    }
    
    /**
     * Obtém o NIF do contribuinte
     * 
     * @return     o NIF do contribuinte
     */
    public int getNif()
    {
        return this.nif;
    }
    
    /**
     * Altera o nome do contribuinte
     * @param  nome     Nome do contribuinte
     */
    public void setnome(String nome)
    {
        this.nome = nome;
    }
    
    /**
     * Obtém o nome do contribuinte
     * 
     * @return     o nome do contribuinte
     */
    public String getnome()
    {
        return this.nome;
    }
    
    /**
     * Altera o e-mail do contribuinte
     * @param  email    E-mail de contacto do contribuinte
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Obtém o e-mail do contribuinte
     * 
     * @return     o e-mail do contribuinte
     */
    public String getEmail()
    {
        return this.email;
    }
    
    /**
     * Altera a morada do contribuinte
     * @param  morada   Morada do contribuinte
     */
    public void setmorada(String morada)
    {
        this.morada = morada;
    }
    
    /**
     * Obtém a morada do contribuinte
     * 
     * @return     a morada do contribuinte
     */
    public String getmorada()
    {
        return this.morada;
    }
    
    /**
     * Altera a palavra-passe do contribuinte
     * @param  password Palavra-passe de acesso do contribuinte
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * Obtém a palavra-passe do contribuinte
     * 
     * @return     a palavra-passe do contribuinte
     */
    public String getPassword()
    {
        return this.password;
    }
    
}