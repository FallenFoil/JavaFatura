
/**
 * Classe para armazenar informações sobre um contribuinte.
 * A classe guarda o NIF, o nome, e-mail, morada e palavra-passe.
 * 
 * @author Carlos Castro, Daniel Costa, Luís Macedo
 * @version 11/03/2018
 */
import java.util.ArrayList;
import java.time.LocalDate;
import java.io.Serializable;

public abstract class Contribuinte implements Serializable
{

    private int nif;
    private String nome;
    private String email;
    private String morada;
    private String password; 
    private float totalGasto;
    
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
        this.totalGasto = 0.0f;
    }
    
    /**
     * Construtor para objetos da classe Contribuinte recebendo parametros
     * 
     * @param  nif      Número de Identificação Fiscal do contribuinte
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
        this.totalGasto = 0.0f;
    }
    
    /**
     * Construtor para objetos da classe Contribuinte recebendo um Contribuinte
     * 
     * @param  other  Contribuinte
     */
    public Contribuinte(Contribuinte other)
    {
        this.nif = other.getNif();
        this.nome = other.getNome();
        this.email = other.getEmail();
        this.morada = other.getMorada();
        this.password = other.getPassword();
        this.totalGasto = other.getTotalGasto();
    }
    
    /**
     * Altera o NIF do contribuinte
     * 
     * @param  nif    Número de Identificação Fiscal do contribuinte
     */
    public void setNif(int nif)
    {
        this.nif = nif;
    }
    
    /**
     * Obtém o NIF do contribuinte
     * 
     * @return     O NIF do contribuinte
     */
    public int getNif()
    {
        return this.nif;
    }
    
    /**
     * Altera o nome do contribuinte
     * @param  nome     Nome do contribuinte
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    /**
     * Obtém o nome do contribuinte
     * 
     * @return     o nome do contribuinte
     */
    public String getNome()
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
    public void setMorada(String morada)
    {
        this.morada = morada;
    }
    
    /**
     * Obtém a morada do contribuinte
     * 
     * @return     a morada do contribuinte
     */
    public String getMorada()
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
    
    /**
     * Aumenta o total gasto pelo contribuinte
     * @param  valor Valor a adicionar ao total gasto pelo contribuinte;
     */
    public void addTotalGasto(float valor)
    {
        this.totalGasto += valor;
    }
    
    /**
     * Obtém o total gasto pelo contribuinte
     * 
     * @return     o total gasto pelo contribuinte
     */
    public float getTotalGasto()
    {
        return this.totalGasto;
    }
    
    /**
     * Clona um Contribuinte
     * 
     * @return Contribuinte clone
     */
    public abstract Contribuinte clone();
    
    /**
     * Cria e retorna uma String que representa a informaçao, organizada, por objetos que extendo deta classe.
     * 
     * @return  String com as informaçoes
     */
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append("NIF: ").append(nif).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Morada: ").append(morada).append("\n");
        return sb.toString();
    }
}
