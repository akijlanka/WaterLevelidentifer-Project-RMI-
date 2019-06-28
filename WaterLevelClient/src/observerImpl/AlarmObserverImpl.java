/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import observer.WaterLevelObserver;
import view.Alarm;

/**
 *
 * @author Aki
 */
public class AlarmObserverImpl extends UnicastRemoteObject implements WaterLevelObserver{
    private Alarm alarm;
    public AlarmObserverImpl(Alarm alarm) throws RemoteException{
        this.alarm=alarm;
    }
    @Override
    public void update(int waterLevel) throws RemoteException {
        if (waterLevel>=50) {
            alarm.setAlarm(true);
        }else{
            alarm.setAlarm(false);
        }
    }
}
