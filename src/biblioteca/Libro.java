
package biblioteca;

/**
 *
 * @author alopex
 */

public class Libro {
    private String Autore, Titolo, Codice;
    private int Sezione;
    Libro(){
        this.Autore="";
        this.Titolo="";
        this.Codice="";
        this.Sezione=0;
    }

    @Override
    public String toString() {
        return "Libro{" + "Autore=" + Autore + ", Titolo=" + Titolo + ", Codice=" + Codice + ", Sezione=" + Sezione + '}';
    }

   Libro(String Autore, String Titolo, String Codice, int Sezione){
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
    
    public void setSezione(int Sezione){
        this.Sezione=Sezione;
    }
    
    public int getSezione(){
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
