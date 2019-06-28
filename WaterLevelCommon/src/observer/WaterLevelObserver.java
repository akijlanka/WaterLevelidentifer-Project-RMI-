/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Aki
 */
public interface WaterLevelObserver extends Remote{
        public void update(int waterLevel)throws RemoteException;

}
