/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerImpl;

import controller.WaterLevelController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import observer.WaterLevelObserver;

/**
 *
 * @author Aki
 */


public class WaterLevelControllerImpl extends UnicastRemoteObject implements WaterLevelController{
private int waterLevel=0;
    
    ArrayList<WaterLevelObserver>observers=new ArrayList<>();
    public WaterLevelControllerImpl() throws RemoteException{
        
    }
    @Override
    public void addObserver(WaterLevelObserver observer) throws RemoteException {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WaterLevelObserver observer) throws RemoteException {
        observers.remove(observer);
    }

    @Override
    public void setWaterLevel(int waterLevel) throws RemoteException {
        if (this.waterLevel!=waterLevel) {
            this.waterLevel=waterLevel;
            notifyObservers();
        }
            }
    
    
      private void notifyObservers() throws RemoteException{
        for (WaterLevelObserver observer : observers) {
            observer.update(waterLevel);
        }
    }
    
    
}
