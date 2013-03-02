
package biblioteca;

/**
 *
 * @author alopex
 */

public class Libro {
    private String Autore, Titolo, Codice, Sezione;
    public void Libro(String Autore, String Titolo, String Codice, String Sezione){
        this.Autore=Autore;
        this.Titolo=Titolo;
        this.Codice=Codice;
        this.Sezione=Sezione;
    }
    
    public void setAutore(String Autore){
        this.Autore=Autore;
    }
    
    public String getAutore(){
        return Autore;
    }
    
    public void setTitolo(String Titolo){
        this.Titolo=Titolo;
    }
    
    public String getTitolo(){
        return Titolo;
    }
    
    public void setCodice(String Codice){
        this.Codice=Codice;
    }
    
    public String getCodice(){
        return Codice;
    }
    
    public void setSezione(String Sezione){
        this.Sezione=Sezione;
    }
    
    public String getSezione(){
        return Sezione;
    }    
}
