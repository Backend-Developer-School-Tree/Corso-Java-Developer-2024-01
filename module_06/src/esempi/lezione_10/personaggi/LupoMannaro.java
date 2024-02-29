package esempi.lezione_10.personaggi;

public class LupoMannaro implements Umano, Mostro {
    int forzaUmano, forzaMostro;
    boolean isUomo;

    public LupoMannaro(boolean luna){
        //IF LUNA = TRUE --> isUomo = FALSE
        isUomo = !luna;
        if(luna){
            forzaMostro = 45;
            forzaUmano = 0;
        }else{
            forzaMostro = 0;
            forzaUmano = 30;
        }
    }
    @Override
    public void combatti() {
        if(isUomo){
            forzaUmano = forzaUmano -3;
        }else{
            //Nothing
            System.out.println("Non posso combattere!");
        }
    }
    @Override
    public void addenta(){
        if(!isUomo){
            forzaMostro = forzaMostro - 2;
        }else{
            System.out.println("Non posso addentare");
        }
    }
    @Override
    public String getForza() {
        return "Forza umana="+ forzaUmano + ", forzaMostro="+forzaMostro;
    }
}
