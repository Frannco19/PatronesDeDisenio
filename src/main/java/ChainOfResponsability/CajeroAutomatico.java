package ChainOfResponsability;

import javax.swing.*;

public class CajeroAutomatico implements IManejador{

    private IManejador sucesor;
    @Override
    public void peticion(int monto) {
        if(monto <= 100)
        {
            JOptionPane.showMessageDialog(null, "La petision a sido atendida por el cajero automatico");
        }else
        {
            sucesor.peticion(monto);
        }

    }

    @Override
    public IManejador getSucesor() {
        return sucesor;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor = sucesor;
    }
}
