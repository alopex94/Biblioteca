
package biblioteca;

/**
 *
 * @author alopex && Fabiojunior337
 * @version 1.0
 */

public class Libro {
    private String Autore, Titolo, Codice, Sezione;
    public void Libro(){
        this.Autore="";
        this.Titolo="";
        this.Codice="";
        this.Sezione="";
    }
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
    
    public int ricercaPerAutore(Libro vet[], String daRicercare){
         for (int i=0; i<vet.length; i++)
          if (vet[i].Autore.equalsIgnoreCase(daRicercare)==true)
              return i;
     return -1; //restituisce -1 se non trova l'elemento da cercare
    }
    
    public int ricercaPerTitolo(Libro vet[], String daRicercare){
         for (int i=0; i<vet.length; i++)
          if (vet[i].Titolo.equalsIgnoreCase(daRicercare)==true)
              return i;
     return -1; //restituisce -1 se non trova l'elemento da cercare
    }
    
    public int ricercaPerCodice(Libro vet[], String daRicercare){
         for (int i=0; i<vet.length; i++)
          if (vet[i].Codice.equalsIgnoreCase(daRicercare)==true)
              return i;
     return -1; //restituisce -1 se non trova l'elemento da cercare
    }
}
