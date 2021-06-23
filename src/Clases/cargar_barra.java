
package Clases;

import javax.swing.JProgressBar;

public class cargar_barra extends Thread{
    JProgressBar progreso;
    
    public cargar_barra (JProgressBar progreso) {
        
        super();
        this.progreso = progreso;
        
    }
    @Override
    public void run(){
        
        for(int a = 1; a<=100; a++)
        {
            progreso.setValue(a);
            pausa(80);
        }
    }
    
    public void pausa(int mlseg){
        try {
            Thread.sleep(mlseg);
        } catch (Exception e) {
        }
    }
}
