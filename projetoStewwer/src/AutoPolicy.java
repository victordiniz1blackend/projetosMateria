public class AutoPolicy{
    private int accontnumber;//armazena o numero de contas de polices
    private String makeAndmodel;//armazena o medelo do veiculo
    private String state;//representa o estado
    public AutoPolicy(int accontnumber,String makeAndmodel, String state){
/*nesse construtor estamos validando as variaveis criadas*/
        this.accontnumber = accontnumber;
        this.makeAndmodel = makeAndmodel;
        this.state = state;
    }
        /*aqui criamos os gets and sets das variaveis*/
    public int getAccontnumber() {
        return accontnumber;
    }

    public void setAccontnumber(int accontnumber) {
        this.accontnumber = accontnumber;
    }

    public String getMakeAndmodel() {
        return makeAndmodel;
    }

    public void setMakeAndmodel(String makeAndmodel) {
        this.makeAndmodel = makeAndmodel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    /*aquei criamos nofaltstates para validar uma estrucao boolan para dar verdade ou falso*/
    public boolean isNoFaultState(){
        boolean noFaulState;
        switch (getState()){
            case "sp": case"ma": case"ba":
                noFaulState = true;
                break;
            default:
                noFaulState = false;

        }
        return noFaulState;
    }
}
