/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;
import business.model.ReservationCatalog;

/**
 *
 * @author pu
 */
public class Network {

    private EnterpriseDirectory enterpriseDirectory;
    private NetworkDirectory networkDirectory;
    private ReservationCatalog reservationCatalog;
    private String networkName;

    public Network(String networkName) {
        this.networkName = networkName;
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.networkDirectory = new NetworkDirectory();
        this.reservationCatalog = new ReservationCatalog();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public ReservationCatalog getReservationCatalog() {
        return reservationCatalog;
    }

    public void setReservationCatalog(ReservationCatalog reservationCatalog) {
        this.reservationCatalog = reservationCatalog;
    }

    @Override
    public String toString() {
        return networkName; //To change body of generated methods, choose Tools | Templates.
    }

}
