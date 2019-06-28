/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import observer.WaterLevelObserver;
import view.Display;

/**
 *
 * @author Aki
 */


public class DisplayObserverImpl extends UnicastRemoteObject implements WaterLevelObserver{
 private Display display;
    public DisplayObserverImpl(Display display) throws RemoteException{
        this.display=display;
    }

  
    @Override
    public void update(int waterLevel) throws RemoteException {
        display.setWaterLevel(waterLevel);
    }
    
}
